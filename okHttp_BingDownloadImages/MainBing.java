package okHttp_BingDownloadImages;

import com.google.gson.Gson;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.*;

public class MainBing {
    static long startTime;
    static long endTime;

    public static void main(String[] args) {

        startTime = System.nanoTime();
        String link = "http://www.bing.com/HPImageArchive.aspx?format=js&idx=0&n=10&mkt=en-US";
        OkHttpClient client = logInConsole();
        Request request = new Request.Builder()
                .url(link)
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody responseBody = response.body()) {
                    String json = responseBody.string();
                    Gson gson = new Gson();
                    Bing bing = gson.fromJson(json, Bing.class);
                    for (BingImage string : bing.images) {
                        downloadFile(client, "http://www.bing.com" + string.url, string.hsh + ".jpg");
                    }
                }
            }
            @Override
            public void onFailure(Call call, IOException e) {
            }
        });
    }

    public static OkHttpClient logInConsole() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor(message -> System.out.println(String.format(
                "[%d]: %s", Thread.currentThread().getId(), message)));
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        return new OkHttpClient.Builder()
                .addInterceptor(logging)
                .build();
    }

    public static void downloadFile(OkHttpClient client, String url, String fileName) {
        Request request = new Request.Builder()
                .url(url)
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("good");
                try (ResponseBody responseBody = response.body()) {
                    InputStream inputStream = responseBody.byteStream();
                    try (OutputStream outputStream = new FileOutputStream(fileName)) {
                        copyStreams(inputStream, outputStream);
                    }
                }
                endTime = System.nanoTime();
                System.out.println("--------------------" + (endTime - startTime));
            }
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("Fail");
            }
        });
    }

    public static void copyStreams(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] buffer = new byte[1000];
        int readCount = inputStream.read(buffer);
        while (readCount > 0) {
            outputStream.write(buffer, 0, readCount);
            readCount = inputStream.read(buffer);
        }
    }
}

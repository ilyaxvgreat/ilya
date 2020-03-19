package okHttp_BingDownloadImages;

import okhttp3.*;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://google.com")
                .build();
        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onResponse(Call call, Response response) throws IOException {
                try (ResponseBody responseBody = response.body();
                     FileWriter fileWriter = new FileWriter("okhttp.html")) {
                    fileWriter.write(responseBody.string());
                }
            }

            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("Error");
            }
        });

        //TODO парсим


    }
}

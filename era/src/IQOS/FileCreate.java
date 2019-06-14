package IQOS;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FileCreate {
    public void fileCreate() {
        try {
            File file = new File("IQOSusers.txt");
            if (file.exists()){
                file.createNewFile();
                JOptionPane.showMessageDialog(null,"File already exists");
            }

            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Ha-ha");
            printWriter.close();
            JOptionPane.showMessageDialog(null,"Well done");
        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }
    }
}

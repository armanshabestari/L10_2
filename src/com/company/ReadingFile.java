package com.company;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile implements Runnable {
    @Override
    public void run() {
        File file = new File("D:\\text.txt");
        try {
            FileReader fileReader = new FileReader(file);
            int ascii = fileReader.read();
            String content = "";
            while (ascii != -1)// not EoF: End of File
            {
                content += (char) ascii;
                ascii = fileReader.read();
            }
            fileReader.close();
            System.out.println(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
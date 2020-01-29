package com.company;

public class Main {

    public static void main(String[] args) {

        Database database = new Database();
        Thread thread1 = new Thread(database);
        ReadingFile readingFile = new ReadingFile();
        Thread thread2 = new Thread(readingFile);
        thread1.start();
        thread2.start();
    }
}

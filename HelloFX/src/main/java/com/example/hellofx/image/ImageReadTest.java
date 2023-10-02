package com.example.hellofx.image;

import java.io.IOException;
import java.io.InputStream;

public class ImageReadTest {
    public static void main(String[] args) {
        ImageReadTest imageReadTest = new ImageReadTest();
        imageReadTest.readImage();
    }

    private void readImage() {
        InputStream resourceAsStream = getClass().getResourceAsStream("/image/mikasa.png");
        try {
            System.out.println(resourceAsStream.available());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

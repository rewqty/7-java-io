package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        int ch1 = System.in.read();
        while(ch1 != -1) {
            int ch2 = System.in.read();
            if(ch1 != 13 || ch2 != 10) {
                System.out.write(ch1);
            }
            ch1 = ch2;
        }
        System.out.flush();
    }
}

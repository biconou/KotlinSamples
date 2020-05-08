package com.github.biconou;

public class Test {

    public static void main(String[] args) {


        int i = 0;
        while (i < 10) {
            if (i%2 == 0) {
                System.out.println("Bonjour pair");
            } else {
                System.out.println("Bonjour impair");
            }
            i++;
        }

    }
}

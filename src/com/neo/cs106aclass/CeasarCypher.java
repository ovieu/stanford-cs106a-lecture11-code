package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import java.io.Console;

public class CeasarCypher extends ConsoleProgram{

    public static void main(String args[]) {
        new CeasarCypher().start(args);
    }

    public void run() {
        println("This program uses a caesar's cypher for encryption");
        int key = readInt("Enter encryption key: ");
        String plainText = readLine("Enter plaintext: ");
        String cypherText = encrypt(plainText, key);
        println("cypherText: " + cypherText);
    }

    private String encrypt(String plainText, int key) {
        String result = "";
        for (int i = 0; i < plainText.length(); i++) {
            char ch = plainText.charAt(i);
            result += encryptChar(ch, key);
        }
        return result;
    }

    private char encryptChar(char ch, int key) {
        if (Character.isUpperCase(ch)) {
            return (char) ('A' + (ch - 'A' + key) % 26);
        }return ch;
    }
}

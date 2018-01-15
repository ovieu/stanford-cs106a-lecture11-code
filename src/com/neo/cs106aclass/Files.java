package com.neo.cs106aclass;

import acm.program.ConsoleProgram;
import acm.util.ErrorException;

import java.io.*;
import java.util.ArrayList;

public class Files extends ConsoleProgram {

    public static void main(String[] args) {
        new Files().start(args);
    }

    public void run() {
        BufferedReader bufferedReader = openFile("Please enter file name: ");

        try {
            PrintWriter writer = new PrintWriter("obamaCopy.txt", "UTF-8");
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) break;
                println("Copying line: " + line);
                writer.println(line);
            }
            writer.close();
            bufferedReader.close();
        } catch (IOException ex) {
            throw new ErrorException(ex);
        }
    }

    /**
     * returns a buffered reader linked to a file
     */
    private BufferedReader openFile(String prompt) {
        BufferedReader bufferedReader = null;

        while (bufferedReader == null) {

            try {
                String fileName = readLine(prompt);
                //create the full path
                String fullPath = "/home/neo/Desktop/cs106aIntellijTest/src/com/neo/cs106aclass/";
                fileName = fullPath + fileName;
                bufferedReader = new BufferedReader(new FileReader(fileName));
            } catch (IOException ex) {
                println("File does not exist...try again: ");
                ex.printStackTrace();
            }

        }
        //  delete this
        ArrayList<String> myStringArr = new ArrayList<>();
        return bufferedReader;
    }


}

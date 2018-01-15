package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import java.util.ArrayList;

public class ArrayListExample extends ConsoleProgram{

    public static void main(String args[]) {
        new ArrayListExample().start(args);
    }

    public void run() {

        ArrayList<String> list = new ArrayList<>();

        readList(list);
        printList(list);

        readList(list);
        printList(list);
    }

    /**
     * prints all the items in the list
     */
    private void printList(ArrayList list) {
        println("list contains: " + list.size() + " elements");
        for (int i = 0; i < list.size(); i++) {
            println(list.get(i));
        }
    }

    /*
     *  continues to read items items from the keyboard
     *  into the list untill the user enters a sentinel
     */
    private void readList(ArrayList list) {
        while (true) {
            String line = readLine("Enter items in the list: ");
            if (line.equals("")) break;
            list.add(line);
        }
    }
}

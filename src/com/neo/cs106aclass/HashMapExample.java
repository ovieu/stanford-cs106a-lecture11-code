package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample extends ConsoleProgram {
    public static void main(String[] args) {
        new HashMapExample().start(args);
    }

    public void run() {

        println("Reading in phone numbers: ");
        readPhoneNumbers();

        println("Looking up phone numbers: ");
        lookUpNumbers();

        println("Displaying phone numbers: ");
        displayAllNumbers();

        println("Displaying phone numbers using entry set: ");
        displayAllNumbersEntrySet();
    }

    /** reads a name and phone number and stores the
     *  info in a hashmap collection
     */
    private void readPhoneNumbers() {
        while(true) {
            String name = readLine("Enter name: ");
            if (name.equals("")) break;
            int number = readInt("Phone number as ints: ");
            phonebook.put(name, number);
        }
    }

    /** dislays a name and phone number if it exists
     *  otherwise do nothing */
    private void lookUpNumbers() {
        while(true) {
            String name = readLine("Enter a name to lookup: ");
            if (name.equals("")) break;
            Integer number = phonebook.get(name);
            if (number == null) {
                println("Name not in the phonebook");
            } else {
                println(number);
            }
        }
    }

    /** display all numbers presently in the
     *  phonebook hashmap collection */
    private void displayAllNumbers() {
        for (String name : phonebook.keySet()) {
            Integer number = phonebook.get(name);
            println(name + ": " + number);
        }
    }

    /** display all numbers presently in the
     *  phonebook hashmap collection using the entry set*/
    private void displayAllNumbersEntrySet() {
        for (Map.Entry<String, Integer> name : phonebook.entrySet()) {
            println(name.getKey() + ": " + name.getValue());
        }
    }

    /** the private instance var representing the phonebook */
    private Map<String, Integer> phonebook = new HashMap<>();


}

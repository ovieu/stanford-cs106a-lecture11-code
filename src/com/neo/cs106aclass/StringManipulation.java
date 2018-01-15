package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

public class StringManipulation extends ConsoleProgram{

    public void run() {
        while(true) {
            String str = readLine("Enter an upper character: ");
            char toLowerChar = str.charAt(0);
            if (toLowerChar == '0') { break; }
            println("the upper version is: " + toLower(toLowerChar));

            String str2 = "hello";
        }
    }

    public static void main(String[] args) {
        new StringManipulation().start(args);
    }

    public char toLower(char ch) {
        //  first check if its upper char
        if (ch >= 'A' && ch <='Z') {
            //  identify the char
            return (char)((ch - 'A') + 'a');
        }
        return ch;
    }

    private String replaceOccurence(String str, String orig, String repl) {
        //  first check if the string exist in the original
        //  and store the location
        int index = str.indexOf(repl);

        //  check for the failure
        if (index != -1) {
            str = str.substring(0, index) + repl + str.substring(index + orig.length());
            return str;
        }
        return str;
    }

    private String replaceOccur(String str, String orig, String repl) {
        int index = str.indexOf(repl);
        if ( index != -1 ) {
            str = str.substring(0, index) + repl + str.substring(index, orig.length());
        }
        return str;
    }

}


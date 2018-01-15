package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

public class StanfordizeExample extends ConsoleProgram{

    public static void main(String[] args) {
        new StanfordizeExample().start(args);
    }

    public void run() {
        while (true) {
            String line = readLine("Enter line to \"Stanfordize\": ");
            if (line.equals("")) break;
            println("At stanford, we say: " + stanfordize(line));
        }
    }

    private String replaceFirstOccurence(String str, String orig, String repl) {
        int index = str.indexOf(orig);
        if (index != -1) {
            str = str.substring(0, index) + repl
                    + str.substring(orig.length() + index);
            return str;
        } return str;
    }

    private String stanfordize(String str) {
        str = replaceFirstOccurence(str, "florence moore", "flomo");
        str = replaceFirstOccurence(str, "memorial church", "mumchu");
        str = replaceFirstOccurence(str, "computer science", "cs");
        str = replaceFirstOccurence(str, "psychology", "psych");
        str = replaceFirstOccurence(str, "economics", "econs");
        str = replaceFirstOccurence(str, "my most fun class", "cs106a");
        return str;
    }
}

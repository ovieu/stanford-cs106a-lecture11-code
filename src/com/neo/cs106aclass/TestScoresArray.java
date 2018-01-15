package com.neo.cs106aclass;

import acm.program.ConsoleProgram;

public class TestScoresArray extends ConsoleProgram{
    public static void main(String args[]){
        new TestScoresArray().start();
    }

    public void run() {

        int numScores = readInt("Number of Scores: ");
        scores = new int[2][numScores];

        initScores(scores);
        println("Scores[0] before increment");
        printList(scores[0]);

        //incrementScoreList();
        println("Scores after the increment: ");
        //printList(scores);

    }

    /** prints all the element of the arrays */
    private void printList(int[] score) {
        for (int i = 0; i < score.length; i++) {
            println(score[i]);
        }
    }

    /** sets all the element of the array to be zero    */
    private void initScores(int[][] scores) {
        for (int i = 0; i < scores.length; i++ ) {
            for (int j = 0; j < scores[i].length; j++) {
                scores[i][j] = 0;
            }
        }
    }

    private static int[][] scores;
}

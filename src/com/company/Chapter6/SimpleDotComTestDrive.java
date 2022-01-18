package com.company.Chapter6;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess1 = "2";
        String userGuess2 = "3";
        String userGuess3 = "4";
        String result1 = dot.checkYourself(userGuess1);
        String result2 = dot.checkYourself(userGuess2);
        String result3 = dot.checkYourself(userGuess3);
    }
}

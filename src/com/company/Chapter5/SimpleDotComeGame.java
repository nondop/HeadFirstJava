package com.company.Chapter5;

public class SimpleDotComeGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCome = new SimpleDotCom();
        int random = (int) (Math.random()*5);
        int [] locations = {random, random++, random+2};
        theDotCome.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive == true){
            String guess = helper.getUserInput("enter a number");
            String result = theDotCome.checkYourself(guess);
            numOfGuesses++;
            if(result.equals("kill")){
                isAlive = false;
                System.out.println("You took " + numOfGuesses + "guesses" );
            }
        }
    }
}

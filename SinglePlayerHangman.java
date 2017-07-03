package hangman_final;

import java.util.concurrent.TimeUnit;
import java.io.*;
import java.util.Scanner;


public class SinglePlayerHangman implements Hangman {
    
    private static int MAX_LENGTH = 8;
    private static int word_length; 
    private static int numberOfTries;
    private static int randomWordNumberOne;
    private static int randomWordNumberTwo;
    private static int randomWordNumberThree;
    private static int randomWordNumberFour;
    private static int randomWordNumberFive;
    private static char choice;
 
   
    
    public void process() {     
        //Set up variables 
        
        String playerName;
        char levelChoiceOrAssign;
        int levelChoice = 0;
        int guesses = 0;
        Scanner scan = new Scanner (System.in);
        
        //Create one String array for each level. These arrays will hold all the words.
        String[] wordListLevelOne = {"hello", "name", "super", "home", "life", "easy", "hard", "smart", "today", "sad"};
        
        String [] wordListLevelTwo = {"incredible", "fantastic", "problem", "eraser", "critical", "pleasure", "chocolate", "appreciate", "although", "random"};
        
        String [] wordListLevelThree = {"unlikely", "stationary", "abundant", "encounter", "anticipate", "anxious", "continuous", "desperate", "vibrant", "unique"};
        
        String [] wordListLevelFour = {"contaminate", "controversy", "tangible", "treacherous", "manipulate", "inevitable", "adversity", "complacent", "dissension", "overwhelmed"};
        
        String [] wordListLevelFive = {"meticulous", "predicament", "amalgamate", "fastidious", "ebullient", "denigrate", "acquiesce", "harangue", "insubordinate", "contingent"};

        // Create an array to store already entered letters
                 
        char[] enteredLettersOne = new char[wordListLevelOne[randomWordNumberOne].length()]; //creates an array for the word
        char[] enteredLettersTwo = new char [wordListLevelTwo[randomWordNumberTwo].length()];
        char[] enteredLettersThree = new char [wordListLevelThree[randomWordNumberThree].length()];
        char[] enteredLettersFour = new char [wordListLevelFour[randomWordNumberFour].length()];
        char[] enteredLettersFive = new char [wordListLevelFive[randomWordNumberFive].length()];
       
        
        System.out.println("Hello! This is the single player section of Hangman, where you can expand your vocabulary!");
        System.out.println(" ");
        System.out.println("This game is only suitable for one player, who will be playing against the computer. Please enter your name.");
        playerName = scan.nextLine();
        
        int playerScore = 200;
        int levelPenalty;
        int levelOnePenalty = 5;
        int levelTwoPenalty = 4;
        int levelThreePenalty = 3;
        int levelFourPenalty = 2;
        int levelFivePenalty = 1;
            
        System.out.println("Welcome, " + playerName + "! This game will generate random words depending on your degree of fluency in the English language.");
        System.out.println(" ");
        
        //Assess level of fluency
        
        System.out.println("There are going to be 5 levels, where 1 is the easiest, and 5 is the hardest. Would you like to choose a level, or let the computer assign one to you?");
        System.out.println("If you would like to choose, type 'C'. If you would like to be assigned to a random level, type 'A'.");
        levelChoiceOrAssign = scan.next().charAt(0); // Gets the next character you input
        
        // Pick random index of words array
        // The random method should be multiplied by the number of elements (the array length)
        
        while (levelChoiceOrAssign > 'C' || levelChoiceOrAssign == 'B') {
            System.out.println("Sorry! Please enter either 'C' or 'A', where 'C' will allow you to choose your level and 'A' will assign you a level.");
            levelChoiceOrAssign = scan.next().charAt(0); //charAt picks up the first element, so even if the user enters eg: 'cat', the computer will pick up 'C'
        }
        
        if (levelChoiceOrAssign == 'C') {
            System.out.println("Please choose a level between 1 and 5, where 1 is the easiest and 5 is the hardest. Type either '1', '2', '3', '4', or '5' to continue.");
            levelChoice = scan.nextInt();
        }
        else {
            System.out.println("The computer will assign you to a level. You will now be redirected.");
            levelChoice = 1 + (int)(Math.random() * 5); //Add ceiling since it will never reach 5, so now it can be 1-5 instead of 0-4
        }
        
        while (levelChoice < 1 || levelChoice > 5) {
            System.out.println("The number you have entered does not correspond to a level. Please choose a level between 1 and 5, where 1 is the easiest and 5 is the hardest.");
            levelChoice = scan.nextInt();
        }
     
        String userWord; //Creating a string array for the user's choice of level
        char[] enteredLetters; //Size of this array should be size of the random word
        
        
        if (levelChoice == 1) {
            System.out.println("Welcome, " + playerName + ". You have chosen Level 1! The game will begin. Enjoy and good luck!");
            levelPenalty = levelOnePenalty;
            int randomSelection = //returns a random number from 0-10 b/c array length is 9
            userWord = <Complete>; //get a word
            enteredLetters = <Complete>[userWord.length() -1]; //Subtract by one because array values start from 0, not 1
        }
        else if (levelChoice == 2) {
            
        } else if (levelChoice == 3) {
           
        } else if (levelChoice == 4) {
           
        } else {
            
        }   

        int triesCount = 0;
        boolean wordIsGuessed = false;
        
        do {
        // As long as enterLetter returns true, this cycle should be gone through
        // If enterLetter returns false, the player/student has successfully guessed all the letters in the word
            switch (enterLetter(userWord, enteredLetters)) {
                case 0:
                    triesCount++;
                    playerScore -= levelPenalty; //playerScore = playerScore - levelPenalty
                    break;
                case 1:
                    triesCount++;
                    break;
                case 2:
                    triesCount++;
                    playerScore -= levelPenalty;
                    break;
                case 3:
                    wordIsGuessed = true;
                    break;
            }
        } while (! wordIsGuessed);

        System.out.println("\nThe word is " + userWord +
            " You missed " + (triesCount - findEmptyPosition(enteredLetters)) +
            " time(s)");
            
            if (playerScore == 100) {
                playerScore +=100;
            }
        
        System.out.println("Your current score is " + playerScore);
            
            System.out.println("Would you like to play again? (Y/N)");
            
            Scanner s = new Scanner (System.in);
            choice = s.nextLine().charAt(0);
            choice = Character.toUpperCase(choice); //user might input small y, so computer must convert it to become upper case so it can compare to loop
            
        } while(choice == 'Y');
        
        System.out.println("Thank you for playing. See you next time!");

        try{
            TimeUnit.SECONDS.sleep(3);
            System.out.print('\u000C');
        }catch(Exception e){
        
        }
    }



    /* -------------------------     HELPER METHODS FROM HERE       ---------------------- */



    /* Hint user to enter a guess letter,
    return 0 if letter entered is not in the word (counts as try),
    return 1 if letter were entered 1st time (counts as try),
    return 2 if already guessed letter was REentered,
    return 3 if all letters were guessed */
    public static int enterLetter(String word, char[] enteredLetters) {
        char userInput = '\u0000'; //blank space, default value, considering the fact that the user did not press any letter but only 'enter' - no null value so game won't crash
        try {
            System.out.print("(Guess) Enter a letter in word ");

             /*  Add logic   */



        } catch (StringIndexOutOfBoundsException str) {
            System.out.println(userInput + " is not in the word");
            return 0; //Exception handling - handle errors, the user may not know how to use the program even though you do.
        } 
    }   

    /* Print word with asterisks for hidden letters, returns true if
    asterisks were printed, otherwise return false */
    public static boolean printWord(String word, char[] enteredLetters) {
       
        boolean asteriskPrinted = false;
     
        /*  Add logic   */

        return asteriskPrinted;
    }

    /* Check if letter is in enteredLetters array */
    public static boolean inEnteredLetters(char letter, char[] enteredLetters) {

     /*  Add logic   */
       
    }

    /* Find first empty position in array of entered letters (one with code \u0000) */
    public static int findEmptyPosition(char[] enteredLetters) {

      /*  Add logic   */
        
    }
 
}
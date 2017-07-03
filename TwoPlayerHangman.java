package hangman_final;

import java.util.*;
import java.io.*;

public class TwoPlayerHangman implements Hangman{
   
  private static int MAX_LENGTH = 8;
  private static int MAX_INCORRECT_GUESSES = 10;
  private static int word_length; 
  private static int numberOfTries;
  private static String wordToGuess;
  private static boolean wordIsGuessed;
  private static String playerOneName; 
   
    
  public void process() {

    Scanner scan = new Scanner (System.in);
    char guessedCharacter;

    System.out.println("Hello! Welcome to the multiplayer section of Hangman, where you learn new words with your friends!");
    System.out.println("This game is only suitable for two players (Player One and Player Two), and Player One goes first.");
    System.out.println("Player One, Please enter your name.");
    playerOneName = scan.nextLine();
    System.out.println("Welcome, " + playerOneName + "! Please enter the word you wish to be guessed.");
    
    wordToGuess = scan.next(); // Player One inputs the word
    word_length =  // The game retrieves the length of the word and puts each letter into an array
    System.out.println("Please enter the number of guesses you will allow Player 2 to have. (minimum of " + word_length + " guesses!)");
    numberOfTries = scan.nextInt(); // Player One inputs the number of guesses allowed.
    
    while (numberOfTries == 0 || numberOfTries < word_length) {
        System.out.println("Sorry! You must give a minimum of " + word_length + " guesses!");
        numberOfTries = scan.nextInt();
    }
    
    System.out.print('\u000C');
      

    // This part is for Player 2.
      
    int numberGuessedFalse = 0; // Number of incorrect letter guesses
    int numberGuessedTrue = 0; // Number of correct letter guesses
    char[] revealedLetters = // convert to char array

    for (int rli = 0; rli<revealedLetters.length; rli++) //revealed letter index
      revealedLetters[rli] = '_';
    
    System.out.println("Player Two, guess your letters! (" + numberOfTries + " wrong guesses, then you lose!)");
    boolean wordIsGuessed = false;
    String originalWord = new String(revealedLetters); // converts the char array revealedLetters to String type to make use of .contains method
    
    // Main code starts here 
    while(x.contains("_") && numberGuessedFalse<5){      // while x stills contains _
      
      
      // fill logic

    } 

   System.out.println("The word was " +wordToGuess);
  
  } 

}





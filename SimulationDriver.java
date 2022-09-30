/* Andrew Kim
 * 
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class SimulationDriver
{
    public static void main(String[] args)
    {

        int single1Answer ;
	    int multi2Answer;
        int secondChoice;


        
	    int right = 0;
	    int wrong = 0;

        int right2 = 0;
	    int wrong2 = 0;

	    //int correctAnswer;

	    int x, y;

        Random rand = new Random();
        int guessing = rand.nextInt(4)+1; // to automate the process we will be using random numbers between 1-4
	    Scanner keyboard = new Scanner(System.in);

	    Question[] SingleAnswer = new Question[2];
	    SingleAnswer[0]= new Question("What is the shortcut for the copy function on most computers? ", "1) ctrl v ", "2) ctrl z ", "3) ctrl c ", "4) ctrl x ", 3);
	    SingleAnswer[1]= new Question("What is often seen as the smallest unit of memory? ", "1) Byte ", "2) Kilobyte ", "3) Gigabyte ", "4) Terabyte ", 1);

        //even numbers holds the single choice answers 
	    for (int j=0; j < SingleAnswer.length; j ++)
	    {
	      
	      System.out.println(SingleAnswer[j].getQuestions());
	      System.out.println(SingleAnswer[j].getAnswering1());
	      System.out.println(SingleAnswer[j].getAnswering2());
	      System.out.println(SingleAnswer[j].getAnswering3());
	      System.out.println(SingleAnswer[j].getAnswering4());      

	      x = SingleAnswer[j].getCorrect();


	      System.out.println("Select 1, 2, 3, or 4 as your answer.");
	      single1Answer = keyboard.nextInt();
	      
	     if(single1Answer == x)
	     {
            right++;
	     }
         else
         {
            wrong++;
         }
	      
	    }  

        Question[] MultiAnswer = new Question[2];
	    MultiAnswer[0]= new Question("What are the numbers Kobe Bryant wore? ", "1) 8 ", "2) 23 ", "3) 24 ", "4) 21 ", 1,3);
        MultiAnswer[1]= new Question("What colors does the Flag of Greece include? ", "1) Blue ", "2) White ", "3) Red ", "4) Yellow ", 1, 2);

	    
	    //odd numbers hold the multi answer
	    for (int i = 0; i < MultiAnswer.length; i++)
	    {
	      
	      System.out.println(MultiAnswer[i].getQuestions());
	      System.out.println(MultiAnswer[i].getAnswering1());
	      System.out.println(MultiAnswer[i].getAnswering2());
	      System.out.println(MultiAnswer[i].getAnswering3());
	      System.out.println(MultiAnswer[i].getAnswering4());      

	      y = MultiAnswer[i].getCorrect();
	      System.out.println("Select 1, 2, 3, or 4 as your answer.");
	      multi2Answer = keyboard.nextInt();
	      secondChoice = keyboard.nextInt();

	     if(multi2Answer == y && secondChoice ==y)
	     {
            right2++;
	     }
         else
         {
           wrong2++;
         }
	      

	    } 
	    
	    
	    System.out.println("Number of single answer: " + right + " correct and " +wrong+" were incorrect");  
	    System.out.println("Number of multi answer:  " + right2 + " correct and"+wrong+" were incorrect");

	        



    }
}



/*
 *    
 * 
 * 
        int single1Answer ;
	    int multi2Answer;
        int secondChoice;

	    int right = 0;
	    int wrong = 0;

        int right2 = 0;
	    int wrong2 = 0;
	    //int correctAnswer;

	    int x, y;

        Random rand = new Random();
        int guessing = rand.nextInt(4)+1; // to automate the process we will be using random numbers between 1-4
	    Scanner keyboard = new Scanner(System.in);


        SingleAnswer[] singleQuestions = new SingleAnswer[2]; //generating 2 questions with single choice answers
        singleQuestions[0]= new SingleAnswer("What is the shortcut for the copy function on most computers? ", "1) ctrl v ", "2) ctrl z ", "3) ctrl c ", "4) ctrl x ", 3);
        singleQuestions[1]= new SingleAnswer("What is often seen as the smallest unit of memory? ", "1) Byte ", "2) Kilobyte ", "3) Gigabyte ", "4) Terabyte ", 1);


        MultiAnswer[] multiQuestions = new MultiAnswer[2];
        multiQuestions[0]= new MultiAnswer("What are the numbers Kobe Bryant wore? ", "1) 8 ", "2) 23 ", "3) 24 ", "4) 21 ", 1,3);
        multiQuestions[1]= new MultiAnswer("What colors does the Flag of Greece include? ", "1) Blue ", "2) White ", "3) Red ", "4) Yellow ", 1, 2);



        //even numbers holds the single choice answers 
	    for (int j=0; j < singleQuestions.length; j ++)
	    {
	      
	      System.out.println(singleQuestions[j].getQuestions());
	      System.out.println(singleQuestions[j].getAnswering1());  
          System.out.println(singleQuestions[j].getAnswering2());
          System.out.println(singleQuestions[j].getAnswering3());
          System.out.println(singleQuestions[j].getAnswering4());  
	      x = singleQuestions[j].getCorrect();


	      System.out.println("Select 1, 2, 3, or 4 as your answer.");
	      single1Answer = keyboard.nextInt();
	      
	     if(single1Answer == x)
	     {
	       right++;
	     }
	    else 
        {
            wrong++;
        }

        System.out.println(x);
	    }  
	    
	    //holds the multi answer
	    for (int i = 0; i < multiQuestions.length; i++)
	    {
	      
	      System.out.println(multiQuestions[i].getQuestions());
          System.out.println(multiQuestions[i].getAnswering1());  
          System.out.println(multiQuestions[i].getAnswering2());
          System.out.println(multiQuestions[i].getAnswering3());
          System.out.println(multiQuestions[i].getAnswering4()); 
	
	      y = multiQuestions[i].getCorrect();
	      System.out.println("Select 1, 2, 3, or 4 as your answer.");
	      multi2Answer = keyboard.nextInt();
	      secondChoice = keyboard.nextInt();
	     if(multi2Answer == y)
	     {
	       if(secondChoice ==y)
           {
             right2++;
           }
	     }
         else
         {
            wrong2++;
         }
	      

	    } 
	    
	    
	    System.out.println("Player 1 got " + right + " correct and "+ wrong+ "wrong.");  
	    System.out.println("Player 2 got " + right2 + " correct and "+ wrong2+ "wrong.");

	        


 * 
 */
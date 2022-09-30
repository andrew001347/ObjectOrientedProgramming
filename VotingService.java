import java.util.Random;


public class VotingService
{

        Random rand = new Random();
        int ran = rand.nextInt(9)+1 ;//Number of students: 1-10
        int guessing = rand.nextInt(4)+1; // to automate the process we will be using random numbers between 1-4


        int right = 0;
        int wrong = 0;

        int right2 = 0;
        int wrong2 = 0;



/*
        static void Printing()
        {
            System.out.println("Number of Right and Wrong (single answer): ");
            System.out.println("Correct: "+ right);
            System.out.println("Incorrect: "+ wrong);
    
    
            System.out.println();
    
            System.out.println("Number of Right and Wrong (multiple answers): ");
            System.out.println("Correct: "+ right2);
            System.out.println("Incorrect: "+ wrong2);
        } */
      
}

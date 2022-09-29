import java.util.Random;


public class VotingService
{

        Random rand = new Random();
        int ran = rand.nextInt(9)+1 ;//Number of students: 1-10

    

    public static void main(String[] args)     
    {

        Random rand = new Random();
        int ran = rand.nextInt(9)+1 ;//Number of students: 1-10

        Student numofStudent = new Student();

    
        System.out.println("Testing "+numofStudent+" student(s)" + ran);

        int right = 0;
        int wrong = 0;

        int right2 = 0;
        int wrong2 = 0;

/* while() // keeps it going until there are no more questions 
        if( == )
        {
            right++;
        }

        if( && == )
        {
            wrong++;
        }

    if( == )
        {
            right2++;
        }

        if( && == )
        {
            wrong2++;
        }


*/

        System.out.println("Number of Right and Wrong (single answer): ");
        System.out.println("Correct: "+ right);
        System.out.println("Incorrect: "+ wrong);


        System.out.println();

        System.out.println("Number of Right and Wrong (multiple answers): ");
        System.out.println("Correct: "+ right2);
        System.out.println("Incorrect: "+ wrong2);

    }   
}

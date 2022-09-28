import java.util.Random;


public class SimulationDriver
{
    public static void main(String[] args)
    {
      Random randAns = new Random();
      Student numofStudent = new Student();

      System.out.println("Testing "+numofStudent.getID()+" student(s)");

      SingleAnswer[] SingleAnswer = new SingleAnswer[5];
      SingleAnswer[0]= new SingleAnswer("What is the shortcut for the copy function on most computers? ", "1) ctrl v ", "2) ctrl z ", "3) ctrl c ", "4) ctrl x ", 3);
      SingleAnswer[1]= new SingleAnswer("What is often seen as the smallest unit of memory? ", "1) Byte ", "2) Kilobyte ", "3) Gigabyte ", "4) Terabyte ", 1);
      SingleAnswer[2]= new SingleAnswer("What does HTTP stand for? ", "1) HyperText Transfer Protocol ", "2) HyperText Transmit Protocol ", "3) HyperTest Transmit Project ", "4) HyperTest Transfer Protocol ", 1) ;
      SingleAnswer[3]= new SingleAnswer("Which country invented tea? ", "1) United Kingdom ", "2) France ", "3) Japan ", "4) China ", 4);
      SingleAnswer[4]= new SingleAnswer("When was the company Nike founded? ", "1) 1965 ", "2) 1982 ", "3) 1971 ","4) 1990 ", 3);
  
      System.out.println("These next questions will have multiple answers.");
    }
}


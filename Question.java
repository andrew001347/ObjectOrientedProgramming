abstract class Question
{

  String inputQuestion;

    public abstract String toString();
 
    // abstract class can have the constructor
    public Question(String inputQuestion)
    {
        //System.out.println("Shape constructor called");
        this.inputQuestion = inputQuestion;
    }
 
    // this is a concrete method
    public String getinputQuestion() 
    { 
      return inputQuestion; 
    }
}




























/*



























abstract class Question //extends 
{


    private String triviaQuestion;
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;

    public int correctAnswer; // we need these public to let user know the answers afterward
    public int correctAnswer2;
    
    public Question(String inputQ, String inputPossible1, String inputPossible2, String inputPossible3, String inputPossible4, int inputAnswer , int inputAnswer2)
    {
      triviaQuestion = inputQ;
      possibleAnswer1 = inputPossible1;
      possibleAnswer2 = inputPossible2;
      possibleAnswer3 = inputPossible3;
      possibleAnswer4 = inputPossible4;
      
      correctAnswer = inputAnswer;
      correctAnswer2 = inputAnswer2;
    }
    
    public void setQuestioning(String inputQ)
  {
    triviaQuestion = inputQ;
  }
  
  public void setAnswering1(String inputPossible1)
  {
    possibleAnswer1 = inputPossible1;
  }
  
   public void setAnswering2(String inputPossible2)
  {
    possibleAnswer2 = inputPossible2;
  }
  
   public void setAnswering3(String inputPossible3)
  {
    possibleAnswer3 = inputPossible3;
  }
  
   public void setAnswering4(String inputPossible4)
  {
    possibleAnswer4 = inputPossible4;
  }
  
  public void setCorrect(int inputAnswer)
  {
  correctAnswer = inputAnswer;
  }

  public void setCorrect2(int inputAnswer2)
  {
  correctAnswer2 = inputAnswer2;
  }
  
  
  
  
  
  public String getQuestioning()
  {
    return triviaQuestion;
  }
  
  public String getAnswering1()
  {
    return possibleAnswer1;
  }
  
  public String getAnswering2()
  {
    return possibleAnswer2;
  }
  
  public String getAnswering3()
  {
    return possibleAnswer3;
  }
  
  public String getAnswering4()
  {
    return possibleAnswer4;
  }
  
  public int getCorrect()
  {
    return correctAnswer;
  }

  public int getCorrect2()
  {
    return correctAnswer;
  }
  
}











import java.util.Scanner;

public class TriviaGame 
{
  public static void main(String[] args)
  {
    int player1Score = 0;
    int player2Score = 0;

    int player1Answer;
    int player2Answer;
    int correctAnswer;

    int x;

    

    Scanner keyboard = new Scanner(System.in);



    Question[] allQuestions = new Question[10];
    allQuestions[0]= new Question("What is the shortcut for the copy function on most computers? ", "1) ctrl v ", "2) ctrl z ", "3) ctrl c ", "4) ctrl x ", 3);
    allQuestions[1]= new Question("What is often seen as the smallest unit of memory? ", "1) Byte ", "2) Kilobyte ", "3) Gigabyte ", "4) Terabyte ", 1);
    allQuestions[2]= new Question("What does HTTP stand for? ", "1) HyperText Transfer Protocol ", "2) HyperText Transmit Protocol ", "3) HyperTest Transmit Project ", "4) HyperTest Transfer Protocol ", 1 ;
    allQuestions[3]= new Question("Which country invented tea? ", "1) United Kingdom ", "2) France ", "3) Japan ", "4) China ", 4);
    allQuestions[4]= new Question("When was the company Nike founded? ", "1) 1965 ", "2) 1982 ", "3) 1971 ","4) 1990 ", 3);

    allQuestions[5]= new Question("What animal is on Levi’s logo? ", "1) Alligator  ", "2) Horse ", "3) Crocodile ","4) Puma ", 2);
    allQuestions[6]= new Question("What two numbers did Kobe Bryant have? ", "1) 8 and 6 ", "2) 6 and 23 ", "3) 8 and 23 ","4) 8 and 24 ", 4);
    allQuestions[7]= new Question("What is the name of the world’s longest river? ", "1) The Mississippi ", "2) The Nile ", "3) The Alluvial ","4) The Colorado ", 2);
    allQuestions[8]= new Question("Which city in India would you find the Taj Mahal in? ", "1) Mumbai ", "2) Hyderabad ", "3) Bengaluru ","4) Agra ", 4);
    allQuestions[9]= new Question("Which American state is the largest by area? ", "1) Alaska ", "2) California ", "3) Texas ","4) Oregon ", 1);
    
    for (int j=0; j < allQuestions.length; j +=2)
    {
      
      System.out.println(allQuestions[j].getQuestions());
      System.out.println(allQuestions[j].getAnswering1());
      System.out.println(allQuestions[j].getAnswering2());
      System.out.println(allQuestions[j].getAnswering3());
      System.out.println(allQuestions[j].getAnswering4());      

      x = allQuestions[j].getCorrect();


      System.out.println("Select 1, 2, 3, or 4 as your answer.");
      player1Answer = keyboard.nextInt();
      
     if(player1Answer == x)
     {
       player1Score++;
     }
      
    }  
    
    
    for (int i=1; i < allQuestions.length; i+=2);
    {
      
      
      System.out.println(allQuestions[i].getQuestions());
      System.out.println(allQuestions[i].getAnswering1());
      System.out.println(allQuestions[i].getAnswering2());
      System.out.println(allQuestions[i].getAnswering3());
      System.out.println(allQuestions[i].getAnswering4());      

      x = allQuestions[i].getCorrect();
      System.out.println("Select 1, 2, 3, or 4 as your answer.");
      player2Answer = keyboard.nextInt();
      
     if(player2Answer == x)
     {
       player1Score++;
     }
      

    } 
    
    
    System.out.println("Player 1 got " + player1Score + " correct");  
    System.out.println("Player 2 got " + player2Score + " correct");

        
        
  }
}
 */
public class MultiAnswer extends Question
{
    public int inputAnswer2;
    public int inputAnswer3;

    public MultiAnswer(String inputQ, String inputPossible1, String inputPossible2, String inputPossible3, String inputPossible4, int inputAnswer, int inputAnswer2, int inputAnswer3) 
            
    {
        super(inputQ, inputPossible1, inputPossible2, inputPossible3, inputPossible4, inputAnswer);
        
    }
    
}


/*
 * 
 *  Question[] allQuestions = new Question[10];
    allQuestions[0]= new Question("What year was the very first model of the iPhone released? ", "1) 1990 ", "2) 2001 ", "3) 2007 ", "4) 2000 ", 3);
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

 * 
 * 
 * 
 */
public class Question
{
    private String triviaQuestion;
    private String possibleAnswer1;
    private String possibleAnswer2;
    private String possibleAnswer3;
    private String possibleAnswer4;
    public int correctAnswer;
    

    public Question(String inputQ, String inputPossible1, String inputPossible2, String inputPossible3, String inputPossible4, int inputAnswer)
    {
      
      triviaQuestion = inputQ;
      possibleAnswer1 = inputPossible1;
      possibleAnswer2 = inputPossible2;
      possibleAnswer3 = inputPossible3;
      possibleAnswer4 = inputPossible4;
      
      correctAnswer = inputAnswer;
      
      
    }
    
    public Question(String string, String string2, String string3, String string4, String string5, int i, int j) {
    }

    public void setQuestions(String inputQ)
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
    
    
    
    
    
    public String getQuestions()
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
  }





/*
 *   String inputQuestion;

    public abstract String toString();

    public Question(String inputQuestion)
    {
  
        this.inputQuestion = inputQuestion;
    }


    public String getinputQuestion() 
    { 
      return inputQuestion; 
    }
 */
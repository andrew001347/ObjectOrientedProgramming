class MultiAnswer extends Question
 {

  public int inputAnswer2;
  public int correctAnswer2;

  public MultiAnswer(String inputQ, String inputPossible1, String inputPossible2, String inputPossible3, String inputPossible4, int inputAnswer, int inputAnswer2) 
      
  {
    super(inputQ, inputPossible1, inputPossible2, inputPossible3, inputPossible4, inputAnswer, inputAnswer2);

    correctAnswer2 = inputAnswer2;
  }

  public void setCorrect(int inputAnswer2)
  {
  correctAnswer2 = inputAnswer2;
  }
    
  public int getCorrect()
  {
    return correctAnswer2;
  }

}

/*
 *  Testing
  int answer1;
  int answer2;

  public MultiAnswer(String inputQuestion, int answer1,int answer2)
  {
      // calling Shape constructor
      super(inputQuestion);
      
      this.answer1 = answer1;
      this.answer2 = answer2;
  }


  @Override public String toString()
  {
      return "This is a multi answer question, select 2 integers.\n " + super.getinputQuestion();
  }
 * 
 * 
 */
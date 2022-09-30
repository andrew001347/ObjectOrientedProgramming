class MultiAnswer extends Question
 {

  int inputAnswer2;

  public MultiAnswer(String inputQ, String inputPossible1, String inputPossible2, String inputPossible3, String inputPossible4, int inputAnswer, int inputAnswer2) 
      
  {
    super(inputQ, inputPossible1, inputPossible2, inputPossible3, inputPossible4, inputAnswer);

    Question[] allQuestions = new Question[2];// generating 2 questions
    allQuestions[0]= new Question("What are the numbers Kobe Bryant wore? ", "1) 8 ", "2) 23 ", "3) 24 ", "4) 21 ", 1,3);
    allQuestions[1]= new Question("What colors does the Flag of Greece include? ", "1) Blue ", "2) White ", "3) Red ", "4) Yellow ", 1, 2);

  }

}

/*
 *  
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
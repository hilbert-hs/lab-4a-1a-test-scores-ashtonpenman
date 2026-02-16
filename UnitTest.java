public class UnitTest {

  // instance variables
  private final String[] answerKey = {"B", "D", "C", "A", "E", "A", "B", "A", "E", "B", "B", "E", "E", "D", "D", "A", "C", "C", "A", "E"};
  private String[] studentAns;
  
  // constructor
  public UnitTest(String[] arr){
    studentAns = new String[arr.length];
    for(int i = 0; i < arr.length ; i++){
      studentAns[i] = arr[i];
    }
  }

  
  // instance methods
  public String[] getStudentAns(){
    return studentAns;
  }
  
  public int totalCorrect(){
    int totalCorrect = 0;
    for(int i = 0; i < studentAns.length; i++){
      if(answerKey[i].equals(studentAns[i])) totalCorrect++;
    }
    return totalCorrect;
  }

  public int totalMistakes(){
    int totalMistakes = 0;
    for(int i = 0; i < studentAns.length; i++){
      if(answerKey[i] != studentAns[i]) totalMistakes++;
    }
    return totalMistakes;
  }

  public boolean isPassing(){
    int totalCorrect = 0;
    for(int i = 0; i < studentAns.length; i++){
      if(answerKey[i].equals(studentAns[i])) totalCorrect++;
    }
    return totalCorrect >= 14;
  }

  public String toString(){
    String column = "";

    for(int i = 0; i < answerKey.length; i++){
      column +=(i+1) + "." + answerKey[i] + "\t" + (i+1) + "." + studentAns[i] + "\n";
      
    }
    return column;
  }

}

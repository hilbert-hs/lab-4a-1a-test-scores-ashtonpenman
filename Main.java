import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    String[] answerArr = new String[20];
    Scanner scan = new Scanner(System.in);

    for(int i = 0; i < 20; i++){
      System.out.println((i+1) + ".");
      answerArr[i] = scan.nextLine().toUpperCase();
    }

    UnitTest test = new UnitTest(answerArr);
    System.out.println(test.toString());
    System.out.println("Number of Correct Answers: " + test.totalCorrect());
    System.out.println("Number of Incorrect Answers: " + test.totalMistakes());
    System.out.println("Did the Student Pass? " + test.isPassing());
  
  }

}

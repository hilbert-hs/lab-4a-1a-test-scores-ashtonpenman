[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=22655640)
# Lab_4A_1a_Test_Scores

Write a program that will grade a multiple choice test. Leave the Main class alone for now and start coding in the UnitTest.java file.


### Begin by writing the `UnitTest` class
**Class Name:** UnitTest

**Instance Variables:** 

`String[] answerKey` -- to represent a test answer key. Initialize it according to the following key (it should contain the letters only)

|Answer| Key  |      |      |      |
|------|------|------|------|------|
| 1.B  | 2.D  | 3.C  | 4.A  | 5.E  |
| 6.A  | 7.B  | 8.A  | 9.E  | 10.B |
| 11.B | 12.E | 13.E | 14.D | 15.D |
| 16.A | 17.C | 18.C | 19.A | 20.E |

`String[] studentAns`

**Instance Methods:**

- A **constructor** that accepts one argument for `studenAns`. Have the constructor initialize the array with the same length as the parameter. Copy each element from the parameter into the `studentAns` array using a for loop and making sure each answer gets changed to uppercase.
- **Accessor** method for `studentAns`.
- **`totalCorrect()`** that will return the number of correctly answered questions.
- **`totalMistakes()`** method that will return the number of incorrect answers.
- **`isPassing()`** method that will return true if the student passed the exam, or false if the student failed.  A student must correctly answer 14 out of 20 questions in order to pass the test.
- **`toString()`** a method to display the correct answers and the student answers.  It must be in a side by side, 2 column format, with item numbers as follows:

| ANSWER KEY | Student’s Answers |
|------------|-------------------|
| 1) B       | 1) A              |
| 2) D       | 2) A              |
| 3) C       | 3) C              |

Hint:  Create a String and initialize it to the first line of the output using a tab between the phrases instead of spaces (\t).  Create another String for the rest of your output, initializing it to the empty String.  Use a for loop to concatenate onto that string the problem number (which should be one more than the index number) and the String from each array at that index with tabs between the correct answer and the student’s answer (two tabs should do it - \t\t).  Return the first String, followed by a new line (\n), followed by the second String. 

### Complete the `Main` class to test your `UnitTest` class

In the main method:
- Create a String array called answerArray of size 20.
- Create a Scanner object.
- Use a for loop to allow the user to enter their answers one at a time until they have entered all 20 answers.  Store these into the answerArray as they enter them.  It should not matter if they enter upper or lower case letters.
- Create a UnitTest object using the array of answers as the parameter.
- Display the following information:
  - The correct answers and student’s answers using the toString method.
  - Number of Correct Answers: ___ (the blank should be filled in with the appropriate value returned from the appropriate method).
  - Number of Mistakes: ___ (the blank should be filled in with the appropriate value returned from the appropriate method).
  - Display either “The student PASSED” or “The student FAILED” as determined by the appropriate method.




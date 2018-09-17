import java.util.Scanner;
import java.util.Arrays;
/**
 * Class for question.
 */
class Question {
    /**
     * { var_description }.
     */
    private String questiontext;
    /**
     * { var_description }.
     */
    private String[] choices;
    /**
     * { var_description }.
     */
    private int correctAnswer;
    /**
     * { var_description }.
     */
    private int maxMarks;
    /**
     * { var_description }.
     */
    private int penalty;
    /**
     * { var_description }.
     */
    private String response;
    /**
     * Constructs the object.
     */
    Question() {

    }
    /**
     * Constructs the object.
     *
     * @param      question1       The question 1
     * @param      choices1        The choices 1
     * @param      correctAnswer1  The correct answer 1
     * @param      maxMarks1       The maximum marks 1
     * @param      penalty1        The penalty 1
     */
    Question(final String question1, final String[] choices1,
        final int correctAnswer1, final int maxMarks1, final int penalty1) {
        this.questiontext = question1;
        this.choices = choices1;
        this.correctAnswer = correctAnswer1;
        this.maxMarks = maxMarks1;
        this.penalty = penalty1;
    }
    /**
     * { function_description }.
     *
     * @param      choice  The choice
     *
     * @return     { description_of_the_return_value }
     */
    public boolean evaluateResponse(final String choice) {
        if (choice.equals(choices[correctAnswer - 1])) {
            return true;
        }
        return false;
    }
    /**
     * Gets the correct answer.
     *
     * @return     The correct answer.
     */
    public String getCorrectAnswer() {
        return choices[correctAnswer - 1];
    }
    /**
     * Gets the question text.
     *
     * @return     The question text.
     */
    public String getQuestionText() {
        return this.questiontext;
    }
    /**
     * Gets the choice.
     *
     * @return     The choice.
     */
    public String[] getChoice() {
        return this.choices;
    }
    /**
     * Gets the maximum marks.
     *
     * @return     The maximum marks.
     */
    public int getMaxMarks() {
        return this.maxMarks;
    }
    /**
     * Gets the penalty.
     *
     * @return     The penalty.
     */
    public int getPenalty() {
        return this.penalty;
    }
    /**
     * Sets the response.
     *
     * @param      answer  The answer
     */
    public void setResponse(final String answer) {
        this.response = answer;
    }
    /**
     * Gets the response.
     *
     * @return     The response.
     */
    public String getResponse() {
        return this.response;
    }
    /**
     * Returns a string representation of the object.
     *
     * @return     String representation of the object.
     */
   public String toString() {
        String s = "";
        for (int i = 0; i < choices.length - 1; i++) {
                s += choices[i] + "\t";
            } s += choices[choices.length - 1];
        return s;
    }
}
/**
 * Class for quiz.
 */
class Quiz {
    /**
     * { var_description }.
     */
    private final int onehundred = 100;
    /**
     * { var_description }.
     */
    private Question[] questions;
    /**
     * { var_description }.
     */
    private int size;
    /**
     * Constructs the object.
     */
    Quiz() {
        questions = new Question[onehundred];
        size = 0;

    }
    /**
     * funtion for size.
     *
     * @return     size.
     */
    public int size() {
        return size;
    }
    /**
     * rezizing the questions array.
     */
    public void resize() {
        questions = Arrays.copyOf(questions, size + 2);
    }
    /**
     * Adds a question.
     *
     * @param      q     The question
     */
    public void addQuestion(final Question q) {
        if (size == questions.length) {
            resize();
        }
            questions[size++] = q;
    }
    /**
     * Gets the question.
     *
     * @param      index  The index
     *
     * @return     The question.
     */
    public Question getQuestion(final int index) {
        return questions[index];
    }
    /**
     * Shows the report.
     *
     * @return     { description_of_the_return_value }
     */
    public String showReport() {
        String s = "";
        int score = 0;
        if (size != 0) {
        for (int i = 0; i < size; i++) {
            System.out.println(questions[i].getQuestionText());
            if (questions[i].evaluateResponse(questions[i].getResponse())) {
                System.out.println(" Correct Answer! - Marks Awarded: "
                    + questions[i].getMaxMarks());
                score = score + questions[i].getMaxMarks();
            } else {
                System.out.println(" Wrong Answer! - Penalty: "
                    + questions[i].getPenalty());
                score = score + questions[i].getPenalty();
            }
        }
        return "Total Score: " + score;
        } else {
            return s;
        }
    }

}
/**
 * Solution class for code-eval.
 */
public final class Solution {
     /**
     * Constructs the object.
     */
    private Solution() {
        // leave this blank
    }
    /**
     * main function to execute test cases.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
         // instantiate this Quiz
        Quiz q = new Quiz();
         // code to read the test cases input file
        Scanner s = new Scanner(System.in);
        // check if there is one more line to process
        while (s.hasNext()) {
            // read the line
            String line = s.nextLine();
             // split the line using space
            String[] tokens = line.split(" ");
              // based on the list operation invoke the corresponding method
            switch (tokens[0]) {
                case "LOAD_QUESTIONS":
                System.out.println("|----------------|");
                System.out.println("| Load Questions |");
                System.out.println("|----------------|");
                loadQuestions(s, q, Integer.parseInt(tokens[1]));
                break;
                case "START_QUIZ":
                System.out.println("|------------|");
                System.out.println("| Start Quiz |");
                System.out.println("|------------|");
                startQuiz(s, q, Integer.parseInt(tokens[1]));
                break;
                case "SCORE_REPORT":
                System.out.println("|--------------|");
                System.out.println("| Score Report |");
                System.out.println("|--------------|");
                displayScore(q);
                break;
                default:
                break;
            }
        }
    }
    /**
     * Loads questions.
     *
     * @param      scan       The scan
     * @param      quiz       The quiz
     * @param      q          The question count
     *
     */
    public static void loadQuestions(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        final int five = 5;
        final int four = 4;
        final int two = 2;
        final int three = 3;
        if (q == 0) {
            System.out.println("Quiz does not have questions");
            return;
        } else {
        for (int i = 0; i < q; i++) {
            String[] tokens = scan.nextLine().split(":");
            String[] choices = tokens[1].split(",");
            if (tokens.length != five  || tokens[0].length() == 0) {
                System.out.println("Error! Malformed question");
                return;
            } else if (choices.length < two) {
                System.out.println(tokens[0]
                    + " does not have enough answer choices");
                return;
            } else if (Integer.parseInt(tokens[two]) > choices.length) {
                System.out.println(
                    "Error! Correct answer choice number is out of range for "
                    + tokens[0]);
                return;
            } else if (!(Integer.parseInt(tokens[three]) > 0)) {
                System.out.println("Invalid max marks for " + tokens[0]);
                return;
            } else if (!(Integer.parseInt(tokens[four]) <= 0)) {
                System.out.println("Invalid penalty for " + tokens[0]);
                return;
            } else {
                Question ques = new Question(tokens[0], choices,
                Integer.parseInt(tokens[two]), Integer.parseInt(tokens[three]),
                Integer.parseInt(tokens[four]));
                quiz.addQuestion(ques);
            }
        }
        }
        System.out.println(q + " are added to the quiz");
    }
    /**
     * Starts a quiz.
     *
     * @param      scan  The scan
     * @param      quiz  The quiz
     * @param      q     The answer count
     */
    public static void startQuiz(final Scanner scan,
        final Quiz quiz, final int q) {
        // write your code here to display the quiz questions on the console.
        // read the user responses from the console using scanner object.
        // store the user respone in the question object
        try {
            String result;
            for (int i = 0; i < q; i++) {
                Question quesNum = quiz.getQuestion(i);
                System.out.println(quesNum.getQuestionText()
                    + "(" + quesNum.getMaxMarks() + ")");
                System.out.println(quesNum.toString());
                System.out.println("");
                result = scan.nextLine();
                quesNum.setResponse(result);
            }
        } catch (Exception e) {
            return;
        }
    }
    /**
     * Displays the score report.
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report using quiz object.
        System.out.println(quiz.showReport());
    }
}
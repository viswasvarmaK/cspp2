import java.util.Scanner;
import java.util.ArrayList;
/**
 * Class for Quiz.
 */
class Quiz {
    public String questiontxt;
    public String[] choices;
    public String correctoption;
    public String scorereport;
    public String penality;
    /**
     * Constructs the object.
     *
     * @param      questiontxt    The questiontxt
     * @param      choices        The choices
     * @param      correctoption  The correctoption
     * @param      scorereport    The scorereport
     * @param      penality       The penality
     */
    Quiz(final String questiontxt, final String[] choices,
     final String correctoption,
     final String scorereport, final String penality) {
        this.questiontxt = questiontxt;
        this.choices = choices;
        this.correctoption = correctoption;
        this.scorereport = scorereport;
        this.penality = penality;
    }
    /**
     * Gets the question.
     *
     * @return     The question.
     */
    String getQuestion() {
        return this.questiontxt;
    }
    /**
     * Gets the answers.
     *
     * @return     The answers.
     */
    String[] getAnswers() {
        return this.choices;
    }
    /**
     * Gets the correct option.
     *
     * @return     The correct option.
     */
    String getCorrectOption() {
        return this.correctoption;
    }
    /**
     * Gets the score report.
     *
     * @return     The score report.
     */
    String getScoreReport() {
        return this.scorereport;
    }
    /**
     * Gets the penality.
     *
     * @return     The penality.
     */
    String getPenality() {
        return this.penality;
    }
    /**
     * Constructs the obj.
     */
    public Quiz() {

    }
    
}
/**
 * Solution class for code-eval.
 */
public final class Solution {
    static ArrayList<Quiz> quizes = new ArrayList<Quiz>();
    static ArrayList<String> answers = new ArrayList<String>();
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
                //System.out.println(tokens[1]);
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
     * @param      s              The scanner object for user input
     * @param      quiz           The quiz object
     * @param      questionCount  The question count
     */
    public static void loadQuestions(final Scanner s, final Quiz quiz, int questionCount) {
        // write your code here to read the questions from the console
        // tokenize the question line and create the question object
        // add the question objects to the quiz class
        try {
            while (questionCount > 0) {
                String line = s.nextLine();
                String[] tokens = line.split(":");
                String[] choices = tokens[1].split(",");
                if (tokens[0].equals("")) {
                    System.out.println("Error! Malformed question");
                    return;
                }
                if (choices.length <= 1) {
                    System.out.println
                    ("trick question  does not have enough answer choices");
                    return;
                }
                if (Integer.parseInt(tokens[3]) < 0) {
                    System.out.println
                    ("Invalid max marks for question about sony");
                    return;
                }
                if (Integer.parseInt(tokens[4]) > 0) {
                    System.out.println
                    ("Invalid penalty for question about sony");
                    return;
                }
                if (!tokens[2].equals("1") && !tokens[2].equals("2")
                 && !tokens[2].equals("3") && !tokens[2].equals("4")) {
                    System.out.println
                ("Error! Correct answer choice number is out of range for question text 1");
                    return;
                }
                Quiz q = new Quiz(tokens[0], choices, tokens[2], tokens[3], tokens[4]);
                quizes.add(q);
                questionCount--;
            }
            if (quizes.size() != 0) {
                System.out.println(quizes.size() + " are added to the quiz");
            } else {
                System.out.println("Quiz does not have questions");
            }
        } catch (Exception e) {
            System.out.println("Error! Malformed question");
        }
    }

    /**
     * Starts a quiz.
     *
     * @param      s            The scanner object for user input
     * @param      quiz         The quiz object
     * @param      answerCount  The answer count
     */
    public static void startQuiz(final Scanner s,
     final Quiz quiz, int answerCount) {
        // write your code here to display the quiz questions
        // read the user responses from the console
        // store the user respones in the quiz object
        for (int i = 0; i < quizes.size(); i++) {
            System.out.println(quizes.get(i).questiontxt
             + "(" + quizes.get(i).scorereport + ")");
            for (int j = 0; j < quizes.get(i).choices.length; j++) {
                System.out.print(quizes.get(i).choices[j] + "   ");
            }
            System.out.println();
            System.out.println();
        }
        while (answerCount > 0) {
            //System.out.println(answerCount + " counttt");
            String line = s.nextLine();
            String[] tok = line.split(" ");
            //System.out.println(line + " lineeeee");
            if (tok[1].equals("a")) {
                tok[1] = "1";
            } else if (tok[1].equals("b")) {
                tok[1] = "2";
            } else if (tok[1].equals("c")) {
                tok[1] = "3";
            } else if (tok[1].equals("d")) {
                tok[1] = "4";
            }
            answers.add(tok[1]);
            answerCount--;

        }


    }

    /**.
     * Displays the score report
     *
     * @param      quiz     The quiz object
     */
    public static void displayScore(final Quiz quiz) {
        // write your code here to display the score report
        int finalScore = 0;
        for (int i = 0; i < quizes.size(); i++) {
            System.out.println(quizes.get(i).questiontxt);
                if (answers.get(i).equals(quizes.get(i).correctoption)) {
                    System.out.println(" Correct Answer! - Marks Awarded: "
                     + quizes.get(i).scorereport);
                    finalScore += Integer.parseInt(quizes.get(i).scorereport);
                } else {
                    System.out.println(" Wrong Answer! - Penalty: "
                     + quizes.get(i).penality);
                    finalScore += Integer.parseInt(quizes.get(i).penality);
                }
    }
    if (quizes.size() != 0) {
        System.out.println("Total Score: " + finalScore);
    }
}
}
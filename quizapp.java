
import java.util.Scanner;

public class QuizApplicationOnline {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        runMCQQuiz();
    }

    // -------------------- MCQ QUIZ ----------------------
    static void runMCQQuiz() {
        int correct = 0, wrong = 0;
        int answer;

        System.out.println("===== MCQs Quiz (10 Questions) =====");

        // -------------------- MATH (2 Questions) ----------------------
        System.out.println("\n1. What is 12 + 8?");
        System.out.println("1) 15  2) 20  3) 22  4) 18");
        answer = input.nextInt();
        if (answer == 2) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println("\n2. Square root of 81?");
        System.out.println("1) 7  2) 8  3) 9  4) 6");
        answer = input.nextInt();
        if (answer == 3) {
            correct++;
        } else {
            wrong++;
        }

        // -------------------- PHYSICS (2 Questions) ----------------------
        System.out.println("\n3. What is the speed of light?");
        System.out.println("1) 3 × 10^8 m/s  2) 5 × 10^6 m/s  3) 1 × 10^7 m/s  4) 3 × 10^5 m/s");
        answer = input.nextInt();
        if (answer == 1) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println("\n4. Who discovered gravity?");
        System.out.println("1) Einstein  2) Newton  3) Galileo  4) Maxwell");
        answer = input.nextInt();
        if (answer == 2) {
            correct++;
        } else {
            wrong++;
        }

        // -------------------- ENGLISH (2 Questions) ----------------------
        System.out.println("\n5. Choose the correct spelling:");
        System.out.println("1) Accomodate  2) Acommodate  3) Accommodate  4) Acomodete");
        answer = input.nextInt();
        if (answer == 3) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println("\n6. Select the noun:");
        System.out.println("1) Quickly  2) Happiness  3) Running  4) Blue");
        answer = input.nextInt();
        if (answer == 2) {
            correct++;
        } else {
            wrong++;
        }

        // -------------------- CHEMISTRY (2 Questions) ----------------------
        System.out.println("\n7. What is the chemical symbol of Gold?");
        System.out.println("1) Ag  2) Au  3) Gd  4) Go");
        answer = input.nextInt();
        if (answer == 2) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println("\n8. pH value of pure water?");
        System.out.println("1) 5  2) 10  3) 7  4) 9");
        answer = input.nextInt();
        if (answer == 3) {
            correct++;
        } else {
            wrong++;
        }

        // -------------------- GENERAL KNOWLEDGE (2 Questions) ----------------------
        System.out.println("\n9. How many continents are there?");
        System.out.println("1) 5  2) 6  3) 7  4) 8");
        answer = input.nextInt();
        if (answer == 3) {
            correct++;
        } else {
            wrong++;
        }

        System.out.println("\n10. Which is the largest planet?");
        System.out.println("1) Earth  2) Mars  3) Jupiter  4) Venus");
        answer = input.nextInt();
        if (answer == 3) {
            correct++;
        } else {
            wrong++;
        }

        // -------------------- RESULT ----------------------
        int score = correct * 10;
        System.out.println("\n===== RESULT =====");
        System.out.println("Correct Answers: " + correct);
        System.out.println("Wrong Answers: " + wrong);
        System.out.println("Your Score: " + score + "%");

        if (score >= 50) {
            System.out.println("Congratulations! You are PASSED.");
        } else {
            System.out.println("You are FAILED. Better luck next time!");
        }

        input.close();
    }
}

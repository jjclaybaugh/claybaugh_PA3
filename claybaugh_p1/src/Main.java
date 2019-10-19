import java.util.*;

public class Main {

    private static int problemType(){
        Scanner user = new Scanner(System.in);
        System.out.println("What type of problem would you like to study");
        System.out.println("1: Addition\n2: Multiplication\n3: Subtraction\n4: Division\n5: Mixed");

        int response = user.nextInt();

        return response;
    }

    private static int determineDifficulty(){
        Scanner user = new Scanner(System.in);
        System.out.println("What level would you like to try? (Levels 1-4)");
        int difficulty = user.nextInt();

        return difficulty;
    }

    private static void generateResponse(int correct){
        Random nums = new Random();

        int remark = nums.nextInt(4) + 1;

        if (correct == 1){
            switch (remark){
                case 1:
                    System.out.println("Very Good!");
                    break;
                case 2:
                    System.out.println("Excellent!");
                    break;
                case 3:
                    System.out.println("Nice work!");
                    break;
                case 4:
                    System.out.println("Keep up the good work!");
                    break;
            }
        }
        else{
            switch (remark){
                case 1:
                    System.out.println("No. Please try again.");
                    break;
                case 2:
                    System.out.println("Wrong. Try once more.");
                    break;
                case 3:
                    System.out.println("Don't give up!");
                    break;
                case 4:
                    System.out.println("No. Keep trying.");
                    break;
            }
        }
    }

    private static int SecureRandom(int difficulty){
        Random nums = new Random();
        int num1 = 1;

        switch(difficulty){
            case 1:
                num1 = nums.nextInt(9) + 1;
                break;
            case 2:
                num1 = nums.nextInt(99) + 1;
                break;
            case 3:
                num1 = nums.nextInt(999) + 1;
                break;
            case 4:
                num1 = nums.nextInt(9999) + 1;
                break;
        }

        return num1;
    }

    private static int newQuestions(int difficulty, int response){
        int num1 = SecureRandom(difficulty);
        int num2 = SecureRandom(difficulty);
        int math = 0;

        switch (response){
            case 1:
                System.out.println("How much is " + num1 + " plus " + num2 + "?");
                break;
            case 2:
                System.out.println("How much is " + num1 + " times " + num2 + "?");
                break;
            case 3:
                System.out.println("How much is " + num1 + " minus " + num2 + "?");
                break;
            case 4:
                System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                break;
            case 5:
                Random ran = new Random();
                math = ran.nextInt(4) + 1;
                switch (math){
                    case 1:
                        System.out.println("How much is " + num1 + " plus " + num2 + "?");
                        break;
                    case 2:
                        System.out.println("How much is " + num1 + " times " + num2 + "?");
                        break;
                    case 3:
                        System.out.println("How much is " + num1 + " minus " + num2 + "?");
                        break;
                    case 4:
                        System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                        break;
                }
        }

        Scanner user = new Scanner(System.in);
        int answer = 0;
        double divanswer = 0.00;
        if (response == 4){
            divanswer = user.nextDouble();
        }
        else if (response == 5 && math == 4){
            divanswer = user.nextDouble();
        }
        else{
            answer =user.nextInt();
        }

        int correct = 0;

        switch(response){
            case 1:
                if (answer == (num1 + num2)){
                    generateResponse(1);
                    correct = 1;
                }
                else{
                    generateResponse(0);
                }
                break;
            case 2:
                if (answer == (num1 * num2)){
                    generateResponse(1);
                    correct = 1;
                }
                else{
                    generateResponse(0);
                }
                break;
            case 3:
                if (answer == (num1 - num2)){
                    generateResponse(1);
                    correct = 1;
                }
                else{
                    generateResponse(0);
                }
                break;
            case 4:
                if (Math.abs(divanswer - ((double) num1 / num2)) < .01){
                    generateResponse(1);
                    correct = 1;
                }
                else{
                    generateResponse(0);
                }
                break;
            case 5:
                switch(math){
                    case 1:
                        if (answer == (num1 + num2)){
                            generateResponse(1);
                            correct = 1;
                        }
                        else{
                            generateResponse(0);
                        }
                        break;
                    case 2:
                        if (answer == (num1 * num2)){
                            generateResponse(1);
                            correct = 1;
                        }
                        else{
                            generateResponse(0);
                        }
                        break;
                    case 3:
                        if (answer == (num1 - num2)){
                            generateResponse(1);
                            correct = 1;
                        }
                        else{
                            generateResponse(0);
                        }
                        break;
                    case 4:
                        if (Math.abs(divanswer - ((double) num1 / num2)) < .01){
                            generateResponse(1);
                            correct = 1;
                        }
                        else{
                            generateResponse(0);
                        }
                        break;
                }
                break;
        }
        return correct;
    }

    public static void main(String[] args) {
        int reset = 0;
        int math = 0;
        Scanner user = new Scanner(System.in);

        while (reset == 0) {
            int difficulty = determineDifficulty();
            int num1 = SecureRandom(difficulty);
            int num2 = SecureRandom(difficulty);

            int response = problemType();

            switch (response){
                case 1:
                    System.out.println("How much is " + num1 + " plus " + num2 + "?");
                    break;
                case 2:
                    System.out.println("How much is " + num1 + " times " + num2 + "?");
                    break;
                case 3:
                    System.out.println("How much is " + num1 + " minus " + num2 + "?");
                    break;
                case 4:
                    System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                    break;
                case 5:
                    Random ran = new Random();
                    math = ran.nextInt(4) + 1;
                    switch (math){
                        case 1:
                            System.out.println("How much is " + num1 + " plus " + num2 + "?");
                            break;
                        case 2:
                            System.out.println("How much is " + num1 + " times " + num2 + "?");
                            break;
                        case 3:
                            System.out.println("How much is " + num1 + " minus " + num2 + "?");
                            break;
                        case 4:
                            System.out.println("How much is " + num1 + " divided by " + num2 + "?");
                            break;
                    }
            }

            double divanswer = 0.00;
            int answer = 0;

            if (response == 4){
                divanswer = user.nextDouble();
            }
            else if (response == 5 && math == 4){
                divanswer = user.nextDouble();
            }
            else {
                answer = user.nextInt();
            }

            int correct = 0;
            int i;

            switch (response){
                case 1:
                    if (answer == (num1 + num2)) {
                        generateResponse(1);
                        correct = correct + 1;
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    else {
                        generateResponse(0);
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    break;
                case 2:
                    if (answer == (num1 * num2)) {
                        generateResponse(1);
                        correct = correct + 1;
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    else {
                        generateResponse(0);
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    break;
                case 3:
                    if (answer == (num1 - num2)) {
                        generateResponse(1);
                        correct = correct + 1;
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    else {
                        generateResponse(0);
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    break;
                case 4:
                    if (Math.abs(divanswer - ((double) num1 / num2)) < .01) {
                        generateResponse(1);
                        correct = correct + 1;
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    else {
                        generateResponse(0);
                        for (i = 0; i < 9; i++) {
                            correct = correct + newQuestions(difficulty, response);
                        }
                    }
                    break;
                case 5:
                    switch (math) {
                        case 1:
                            if (answer == (num1 + num2)) {
                                generateResponse(1);
                                correct = correct + 1;
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            else {
                                generateResponse(0);
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            break;
                        case 2:
                            if (answer == (num1 * num2)) {
                                generateResponse(1);
                                correct = correct + 1;
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            else {
                                generateResponse(0);
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            break;
                        case 3:
                            if (answer == (num1 - num2)) {
                                generateResponse(1);
                                correct = correct + 1;
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            else {
                                generateResponse(0);
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            break;
                        case 4:
                            if (Math.abs(divanswer - ((double) num1 / num2)) < .01) {
                                generateResponse(1);
                                correct = correct + 1;
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            else {
                                generateResponse(0);
                                for (i = 0; i < 9; i++) {
                                    correct = correct + newQuestions(difficulty, response);
                                }
                            }
                            break;
                    }
                    break;
            }


            double percent = (correct / 10.00) * 100.00;
            System.out.println("Percent correct: " + percent);

            if (percent < 75.00) {
                System.out.println("Please ask your teacher for extra help.");
            } else {
                System.out.println("Congratulations, you are ready to go to the next level!");
            }

            System.out.println("Would you like to continue? (0 for yes, 1 to quit)");
            reset = user.nextInt();
        }
    }
}
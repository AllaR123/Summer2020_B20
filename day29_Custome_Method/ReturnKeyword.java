package day29_Custome_Method;

public class ReturnKeyword {
    public static void main(String[] args) {

        calculateGrade(-3);

    }

    // calculate grade

    public static void calculateGrade(int score) {

        if(score < 0 || score > 100) {
            System.out.println("Invalid score");
            return;
        }

            char grade = (score >= 90) ? 'A' : (score >= 80) ? 'B' : (score >= 70) ? 'C' : (score >= 60) ? 'D' : 'F';
            System.out.println(grade);

        }
    }


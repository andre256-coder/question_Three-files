
package andre.gradesummary;

import java.util.Scanner;

public class GradeSummary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] gradeCount = new int[10]; // Index 1–9 used

        int student = 1;
        while (student <= 5) {
            System.out.print("Enter score for student " + student + ": ");
            int score = input.nextInt();
            int grade;
            String remark;

            if (score >= 80 && score <= 100) {
                grade = 1; remark = "Distinction";
            } else if (score >= 75) {
                grade = 2; remark = "Distinction";
            } else if (score >= 66) {
                grade = 3; remark = "Credit";
            } else if (score >= 60) {
                grade = 4; remark = "Credit";
            } else if (score >= 50) {
                grade = 5; remark = "Credit";
            } else if (score >= 45) {
                grade = 6; remark = "Credit";
            } else if (score >= 35) {
                grade = 7; remark = "Pass";
            } else if (score >= 30) {
                grade = 8; remark = "Pass";
            } else {
                grade = 9; remark = "Fail";
            }

            gradeCount[grade]++;
            System.out.println("Score: " + score + ", Grade: " + grade + ", Remark: " + remark);
            student++;
        }

        System.out.println("\nGrade Summary:");
        for (int i = 1; i <= 9; i++) {
            System.out.println("Grade " + i + ": " + gradeCount[i] + " student(s)");
        }
    }
}
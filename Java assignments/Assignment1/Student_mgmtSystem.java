import java.util.*;
import java.util.Scanner;
public class Student_mgmtSystem {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);


        //Accept dataof studemts

        System.out.println("Enter your name");
        String name = sc.nextLine();
        System.out.println("Enter roll number");
        int rollno = sc.nextInt();

        int marks[] =new int[5];
        int total =0;

        // input of marks for 5 subject

        for (int i=0;i<5;i++){
            System.out.println("Enter marks for subject"+":");//

            marks[i] = sc.nextInt();
            total += marks[i];

        }
        // calculate avg and percentage

        double avg = total/5.0;
        double percentage = (total/500.0)*100;

        //calculate grade

        String grade;
        if(percentage >=90){
            grade="A";
        } else if (percentage>=75) {
            grade ="B";
            
        } else if (percentage >=60) {
            grade="C";
            
        } else if (percentage >=40) {
            grade="D";
            
        }
        else {grade="Fail";
    }
        //pramotion status
        String pramotion;
        if (grade.equals("Fail")) {
            pramotion="NOt pramoted";
        }
        else{ pramotion = "Pramoted";
        }

        //Display result

       System.out.println("Student result");
        System.out.println("Student name"+name);
        System.out.println("Student roll number"+rollno);
        System.out.println("total marks"+total);
        System.out.println("Avarage marks"+avg);
        System.out.println("Percentage"+percentage+"%");
        System.out.println("Grade"+grade);
        System.out.println("Pramotion status"+pramotion);

}}

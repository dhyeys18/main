import java.util.Scanner;

public class percentagecalculator {
    public static void main(String[] args) {
        System.out.println("Welcome to Percentage Calculator");
        System.out.println("Enter marks of 5 Subjects respectively");
        Scanner s= new Scanner(System.in);
        int sub1=s.nextInt();
        int sub2=s.nextInt();
        int sub3=s.nextInt();
        int sub4=s.nextInt();
        int sub5=s.nextInt();
        float percentage= (sub1+sub2+sub3+sub4+sub5)/5.0f;
        System.out.println("Percentage= "+ percentage);
    }
}

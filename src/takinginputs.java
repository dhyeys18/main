
import java.util.Scanner;

public class takinginputs {
    public static void main(String[] args) {
        System.out.println("Taking input from user");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a= s.nextInt();
        System.out.println("Enter second number");
        int b =s.nextInt();
        System.out.println("The sum of" + a + "and"+ b +"is"+ (a+b));
    }
}

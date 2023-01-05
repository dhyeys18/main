import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //Problem 1
        Scanner sc= new Scanner(System.in);
        int i,j;
        for (i=5;i>=1;i--)
        {
            for (j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Problem 2

        int n;
        System.out.println("Enter the number till you want sum of even numbers");
        n= sc.nextInt();

        long sum=0;
        for (i=0;i<=n;i++)
        {
            if(i%2==0)
            {
                sum+=i;
            }
        }

        System.out.println("The Sum is "+ sum);

        //Problem 3/4

        int a;
        System.out.println("Enter the number of which you want Table");
        a= sc.nextInt();
        for (i=10;i>=1;i--)
        {
            System.out.println(a+"X"+i+"="+a*i);
        }

        //Problem 5

        int t;
        System.out.println("Enter the number of which you want Factorial");
        t= sc.nextInt();

        long fact=1;
        int k=t;

        while(k!=0)
        {
            fact=fact*k;
            k--;
        }
        System.out.println("Factorial="+ fact);


        //1 Using while loop
        System.out.println("Pattern using while loop");
        i=5;
        j=0;
        while(i>=1)
        {
            j=0;
            while(j<i)
            {

                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}

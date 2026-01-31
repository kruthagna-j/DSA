import java.util.Scanner;
public class SumOfLastDigits{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1=sc.nextInt();
        System.out.println("Enter second number:");
        int num2=sc.nextInt();
        int digit1=num1%10;
        int digit2=num2%10;
        int sum=digit1+digit2;
        System.out.println("The sum of last digits of given two numbers is:"+ sum);
    }
}
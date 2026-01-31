import java.util.Scanner;
public class SecondLastDigit{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int num=sc.nextInt();
        int dig=(num%100)/10;
        System.out.println("The second last digit of given number is:"+dig);
    }
}
import java.util.Scanner;
public class CombineStrings{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first string:");
        String str1=sc.nextLine();
        System.out.println("Enter second string:");
        String str2=sc.nextLine();
        String result;
        if(str1.length()<str2.length()){
            result=str1+str2+str1;
        }else{
            result=str2+str1+str2;
        }
        System.out.println("Combined strings :"+ result);
    }
}
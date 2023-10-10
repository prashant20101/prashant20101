import java.util.*;

public class Main {




    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for factorial :");
        int value=sc.nextInt();
        System.out.println("Enter the string for checking Palindrome :");
        String str=sc.next();

        Factorial fl=new Factorial();
        Palindrome pe=new Palindrome();
        int factorialValue=fl.FactorialVal(value);
        boolean isPalen= pe.isPallindrome(str);

        if(isPalen){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("No pallindrome");
        }
        System.out.println("The factorial of "+value+" is :"+factorialValue);
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        int num1,num2;
        try{System.out.println("Enter first number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("enter second number");
        num2 = sc.nextInt();
        System.out.println(num1/num2);
    }
    catch(InputMismatchException e){
        System.out.println("num and num2 should be integer");
    }
    catch(ArithmeticException e){
        System.out.println("num2 should not be zero");
    }
      int array [] ={10,20,30};
      try{System.out.println("array element"+array[1]);
}
catch(ArrayIndexOutOfBoundsException e){
System.out.println("array index outof bound");
}
 String s =("abc");
 try{System.out.println(s.length());
 }
 catch(NullPointerException e){
    System.out.println("string shouls not be null");
 }
    }    
    
}

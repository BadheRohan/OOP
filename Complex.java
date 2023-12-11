import java.util.*;
class Complex {
    int real,img;
     Complex (){
        this.real=0;
        this.img=0;
     }
     Complex (int real, int img){
        this.real= real;
        this.img=img;

     }
     static void Addition(Complex complex1,Complex complex2){
            Complex complex3 = new Complex(0,0);
            complex3.real = complex1.real+complex2.real;
            complex3.img = complex1.img+complex2.img;
            System.out.println(complex3.real+"+"+complex3.img+"i");
     }
     static void subtraction(Complex complex1,Complex complex2){
       Complex complex3 = new Complex(0,0);
       complex3.real = complex1.real-complex2.real;
       complex3.img = complex1.img-complex2.img;
       System.out.println(complex3.real+"+"+complex3.img+"i");
     }
     static void multiplication(Complex complex1,Complex complex2){
       Complex complex3 = new Complex(0,0);
       complex3.real = (complex1.real*complex2.real)-(complex1.img*complex2.img);
       complex3.img = (complex1.img*complex2.real)+(complex2.img*complex1.real);
       System.out.println(complex3.real+"+"+complex3.img+"i");
    }
    static void division(Complex complex1,Complex complex2){
       Complex complex3 = new Complex(0,0);
       complex3.real = (complex1.real*complex2.real+complex1.img*complex2.img)/(complex2.real*complex1.real+complex2.img*complex2.img );
       complex3.img = (complex1.real*complex2.img-complex1.img*complex2.real)/(complex2.real*complex1.real+complex2.img*complex2.img );
       System.out.println(complex3.real+"+"+complex3.img+"i");
}
     

     
     
     
     
    public static void main(String[] args) {
        int choice;
        Complex complex1 = new Complex(10,20);
         Complex complex2  = new Complex(5,10);  
         System.out.println("enter your choice");
         System.out.println("1.addition 2.subtraction 3.multipication 4.division");
         Scanner sc = new Scanner(System.in);
         choice =sc.nextInt();
         switch (choice) {
          case 1 : Addition (complex1,complex2);
               break;

          case 2: subtraction(complex1,complex2);
          break;     

          case 3: multiplication(complex1,complex2);
          break;

          case 4: division(complex1,complex2);
          break;
          
         }
    }
}
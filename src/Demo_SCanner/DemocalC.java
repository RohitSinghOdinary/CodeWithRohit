package Demo_SCanner;

import java.util.Scanner;

public class DemocalC {
      public int add ( int a , int b){

          return a+b;
      }

      public int Subtraction ( int a,int b){

          return a-b;

      }
      public int multy ( int a, int b){

          return a*b;
      }
       public int divide(int a , int b){
          return a/b;
       }

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);
        System.out.println("enter value of a : ");
        int a = Scanner.nextInt();
        System.out.println("ypu enter : ");
        System.out.println("enter value of b :");
        int b = Scanner.nextInt();


        System.out.println(" please enter your choice : , 1 addition , 2 subtraction , 3 multiply , 4 divide");
        int choice = Scanner.nextInt();

        DemocalC obj = new DemocalC();

        if (choice==1){
            int result = obj.add(a,b);
            System.out.println("Sum Of :"+result);
        }
        else if (choice==2){int result = obj.Subtraction(a,b);
            System.out.println("sub Of :"+result);
        }
        if (choice==3){
            int result = obj.multy(a,b);
            System.out.println("multiply Of :"+result);
        }
        else if (choice==4){
            int result = obj.divide(a,b);
            System.out.println("divide Of :"+result);
        }
    }
}

import java.util.Scanner;

public class Product
 {
    public static void main( String[] args )
    {
        Scanner input = new Scanner( System.in );
   
       int number1;
       int number2;
       int Product;
   
       System.out.print( "Enter first integer: " );
       number1 = input.nextInt();
   
       System.out.print( "Enter second integer: " );
       number2 = input.nextInt();
   
       Product = number1 * number2;
   
       System.out.printf( "Product is %d\n", Product );

    }
    
}


package exception3;
import java.util.Scanner;

public class Exception3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integers: ");                                         
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {
            System.out.println(number1+"/"+number2+" is "+(number1/number2));
            }
        catch (ArithmeticException e1){
            System.out.println("Exception: Divisor cannot be zero ");
            }
        }
    }
        


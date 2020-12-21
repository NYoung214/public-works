package calculator.operations;
import java.util.Scanner;

final public class DivideOperation {
    
    private int a = 0;
    private int b = 0;
    private static int c = 0;
    
    public static int divByZero() {
        c = 0;
        while(c == 0){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a non-zero number.");
            c = scanner.nextInt();           
        }
        return c;
    }
    
    public void setA(int input){
        this.a = input;
    }
    
    public void setB(int input){
           this.b = input; 
    }
    
    public double getResult(){
        return (double)this.a/(double)this.b;
    }
}

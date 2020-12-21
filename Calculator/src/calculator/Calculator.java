package calculator;
import calculator.operations.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        int result = 0;
        double doubleResult = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me an operation:");
        System.out.println("add - subtract - multiply - divide");
        String operation = scanner.nextLine();        
        System.out.println("Give me first number:");
        int numA = scanner.nextInt();
        System.out.println("Give me second number:");
        int numB = scanner.nextInt();
        if(operation.equals("divide") && numB == 0){
            numB = DivideOperation.divByZero();
        }
        
        
        switch (operation) {
            case "add":
                AddOperation add = new AddOperation();
                add.setA(numA);
                add.setB(numB);
                result = add.getResult();
                break;
            case "subtract":
                SubtractOperation sub = new SubtractOperation();
                sub.setA(numA);
                sub.setB(numB);
                result = sub.getResult();
                break;
            case "multiply":
                MultiplyOperation multi = new MultiplyOperation();
                multi.setA(numA);
                multi.setB(numB);
                result = multi.getResult();
                break;
            case "divide":
                DivideOperation div = new DivideOperation();
                div.setA(numA);
                div.setB(numB);
                doubleResult = div.getResult();
                break;
            default:
                System.out.println("did not understand operation");
                break;
        }
        System.out.println("The result is: ");
        switch(operation){
            case "divide":
                System.out.println(doubleResult);
                break;
            case "add":
            case "subtract":
            case "multiply":
                System.out.println(result);
                break;
        }
    }
}

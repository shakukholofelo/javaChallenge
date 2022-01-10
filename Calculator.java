import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {

    char operator;
    Double num1, num2, res;
    Scanner sfk = new Scanner(System.in);

    System.out.println("Please choose an operator: /,* , +, or -");
    operator = sfk.next().charAt(0);
    System.out.println("Enter first number");
    num1 = sfk.nextDouble();
    System.out.println("Enter second number");
    num2 = sfk.nextDouble();

    switch (operator) {
        case '/':
        res = num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + res);
        break;
        case '*':
        res = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + res);
        break;
         case '+':
        res = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + res);
        break;
        case '-':
        res = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + res);
        break;
    
       default:
        System.out.println("Please select a valid operator!");
        break;
    }
  }
}


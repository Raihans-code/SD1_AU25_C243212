import java.util.*;
public class Ex_5{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter numbers for Operation :");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("Operations - -");
        System.out.println("1. Add Numbers.");
        System.out.println("2. Subtract Numbers.");
        System.out.println("3. Multiply Numbers.");
        System.out.println("4. Divide Numbers.");
        System.out.println("Enter Your Choice :");
        int choice = input.nextInt();
        double result;
        switch(choice)
        {
            case 1:
                result = num1 + num2;
                System.out.println("Ans = "+ result);
                break;
            case 2:
                result = num1 -  num2;
                System.out.println("Ans = " + result);
                break;
            case 3:
                result = num1*num2;
                System.out.println("Ans = " + result);
                break;
            case 4:
                double ans = num1/(double)num2;
                System.out.println("Ans = " + ans);
                break;
            default:
                System.out.println("Choice out of bound!");
                break;
        }
        input.close();
    }
} 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.ex_5;
import java.util.Scanner;
/**
 *
 * @author raihan-islam
 */
public class Ex_5` {

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
                if(num1>num2) result = num1 - num2;
                else if(num1<num2) result = num2 - num1;
                else result = 0;
                System.out.println("Ans = " + result);
                break;
            case 3:
                result = num1*num2;
                System.out.println("Ans = " + result);
                break;
            case 4:
                double ans = 0;
                if(num1>num2) ans = num1 / num2;
                else if(num1<num2) ans = num2 / num1;
                else ans = 1;
                System.out.println("Ans = " + ans);
                break;
            default:
                System.out.println("Choice out of bound!");
                break;
        }
    }
} 


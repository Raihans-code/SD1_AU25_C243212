/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.ex_6;
import java.util.Scanner;
/**
 *
 * @author raihan-islam
 */
public class Ex_6 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number :");
        num = input.nextInt();
        int i = 1;
        while(i<=num)
        {
            System.out.println(i);
            ++i;
        }
    }
} 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.Ex_8;
import java.util.Scanner;
/**
 *
 * @author raihan-islam
 */
public class Ex_8{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number :");
        num = input.nextInt();
        int i = num;
        int sum = 1;
        while(i>0)
        {
            sum = sum*i;
            --i;
        }
        System.out.println(sum);
    }
} 


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject1.Ex_7;
import java.util.Scanner;
/**
 *
 * @author raihan-islam
 */
public class Ex_7{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number :");
        num = input.nextInt();
        int i = 1;
        while(i<=10)
        {
            System.out.println(i*num);
            ++i;
        }
    }
} 


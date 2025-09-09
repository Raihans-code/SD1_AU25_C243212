import java.util.*;
public class Ex_4 {

    public static void main(String[] args) {        
        Scanner number = new Scanner(System.in);
        
        System.out.println("Give Three Numbers:");
        System.out.println("Enter first NUmber :");
        int num1 = number.nextInt();
        System.out.println("Enter Second NUmber :");
        int num2 =  number.nextInt();
        System.out.println("Enter Third NUmber :");
        int num3 = number.nextInt();
        System.out.println("The largest Number is");
        if(num1>num2 && num1 > num3) System.out.println(num1);
        else if(num2>num1 && num2>num3) System.out.println(num2);
        else if(num3>num1 && num3>num2) System.out.println(num3);
        
        number.close();
    }
}

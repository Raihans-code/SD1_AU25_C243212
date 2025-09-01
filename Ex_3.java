import java.util.*;
public class Ex_3 {

    public static void main(String[] args) {
     
        Scanner number = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n1 = number.nextInt();
        System.out.println("The Number is "+n1);
        if(n1%2==0) System.out.println("The Number is Even!");
        else System.out.println("The Number is Odd");
        
        number.close();
        
    }
}

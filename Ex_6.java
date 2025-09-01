import java.util.*;
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
        input.close();
    }
} 

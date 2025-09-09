import java.util.*;
public class Ex_9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = 0;
        System.out.print("Enter number :");
        num = input.nextInt();
        int i = 0;
        int sum = 0;
        while(i<=num)
        {
            sum += i;
            ++i;
        }
        System.out.println(sum);
        input.close();
    }
} 


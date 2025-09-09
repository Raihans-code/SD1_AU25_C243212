import java.util.*;
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
        input.close();
    }
} 


import java.util.*;
public class Problem_Find_Strict_Average {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter A :");
        int a = input.nextInt();
        System.out.print("Enter B :");
        int b = input.nextInt();
        System.out.print("Enter C :");
        double c = input.nextDouble();
        double avg = (a+b)/2;
        if(avg>c) System.out.printf("Yes, Average of %d and %d is strictly greater than %lf",a,b,c);
        else System.out.printf("No, Average of %d and %d is not strictly greater than %d\n",a,b,(int)c);
        input.close();
    }
}

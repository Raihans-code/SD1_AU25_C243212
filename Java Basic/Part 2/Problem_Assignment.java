import java.util.*;
public class Problem_Assignment {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Starting time :");
        float start_time = input.nextFloat();

        if(start_time+3>=10) System.out.println("He couldn't submit on time.");
        else System.out.println("He submitted the assignment on time.");
        input.close();
    }
}

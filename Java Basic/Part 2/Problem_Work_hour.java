import java.util.*;
public class Problem_Work_hour {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Work hour of a Day : ");
        float X = input.nextFloat();
        System.out.print("Enter Chill day Work hour : ");
        float Y = input.nextFloat();
        float total_W_hour = (5*X);
        float real_W_hour = total_W_hour - (X-Y);
        System.out.println("Total Work hour of a Week : "+total_W_hour+" hr");
        System.out.println("Real Work hour of a  Week : "+real_W_hour+" hr");
        
        input.close();
    }
}

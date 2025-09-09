import java.util.*;
public class Problem_Exam {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input Sections in the Semester :");
        float X = input.nextInt();
        System.out.print("Input Students in a Section :");
        float Y = input.nextInt();
        System.out.print("Total Students Passed :");
        float Z = input.nextInt();
        float total_Student = X*Y;
        double pass_ratio = (Z/total_Student)*100;
        System.out.printf("Percentage of Students passed : %.2f",pass_ratio);
        System.out.print("%\n");
        if(pass_ratio>50.00) System.out.println("Strictly Greater than 50 %");
        else System.out.println("less than 50 %");
        input.close();
    }
    
}

import java.util.*;
public class Problem_Make_Avg
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter A : ");
        int A = input.nextInt();
        System.out.print("Enter C : ");
        int C = input.nextInt();
        int start = Math.min(A,C);
        int end = Math.max(A,C);
        double B = (A+C)/2.0;
        int ans = -1;
        for(int i=start;i<=end;++i)
        {
            if(B==i)
            {
                ans = i;
                break;
            }
        }
        
        System.out.println(ans);

        input.close();
    }
}
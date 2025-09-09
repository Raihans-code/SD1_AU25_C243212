import java.util.*;
public class Problem_Fill_Water {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int[] Bottles = new int[3];
        int cnt = 0;
        for(int i=0;i<3;++i)
        {
            System.out.print("Enter Status of Bottle "+(i+1)+" : ");
            Bottles[i]= input.nextInt();
            if(Bottles[i]==1) cnt++;
        }
        if(cnt>=2) System.out.println("Water filling time!");
        else System.out.println("Not now.");
        
        input.close();
    }
}

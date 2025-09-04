import java.util.*;
public class Problem_Find_the_odd_one {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int a,b,c;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if(a==b) System.out.println(c);
        else if (b==c) System.out.println(a);
        else System.out.println(b);

        input.close();
    }
}

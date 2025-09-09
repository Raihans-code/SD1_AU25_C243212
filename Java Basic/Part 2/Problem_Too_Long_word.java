import java.util.*;
public class Problem_Too_Long_word {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String s = input.nextLine();
        int len = s.length();
        if(len>6)
        {
            String ans = s.charAt(0)+String.valueOf(len-2)+s.charAt(len-1);
            System.out.println(ans);
        }else System.out.println(s);
        input.close();
    }
    
}

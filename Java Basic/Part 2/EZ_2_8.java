import java.util.*;
public class EZ_2_8{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String word = input.nextLine();
        int len = word.length();
        int left = 0, right = len - 1;
        Boolean palindrome = true;
        while(left<right)
        {
            char l1 = word.charAt(left);
            char l2 = word.charAt(right);
            if(l1!=l2)
            {
                palindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome) System.out.println("PALINDROME");
        else System.out.println("NOT PALINDROME!"); 
        input.close();
    }
}

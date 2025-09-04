import java.util.*;
public class EZ_2_9 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String :");
        String word = input.nextLine();
        int len = word.length();
        int v_count = 0,c_count =  0;
        for(int i=0;i<len ;++i)
        {
            char letter = word.charAt(i);
            if(letter>=65 && letter<=90)
            {
                if(letter =='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U') v_count++;
                else c_count++;
            }
            else if(letter>=97 && letter<=122)
            {
                if(letter =='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u') v_count++;
                else c_count++;
            }
        }
        System.out.println("Number of Vowels : "+v_count);
        System.out.println("Number of Consonant : "+c_count);
        input.close();
    }
}

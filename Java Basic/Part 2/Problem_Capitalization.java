import java.util.*;
public class Problem_Capitalization {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String  string = input.nextLine();
        int len = string.length();
        String cap ="";
        cap+= string.substring(0,1).toUpperCase()+string.substring(1,len);

        System.out.println(cap);
        input.close();
    }

}

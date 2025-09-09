import java.util.*;
public class Ez_2_10 {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter String : ");
        String string = input.nextLine();
        System.out.println(string.toUpperCase());
        System.out.println(string.toLowerCase());
        input.close();
    }
}

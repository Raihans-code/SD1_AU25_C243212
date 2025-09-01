import java.util.*;
public class Ex_2 {

    public static void main(String[] args) {
        System.out.println("Hello Java!");
        Scanner name = new Scanner(System.in);
        System.out.println("Enter YOur Name :");
        String n =  name.nextLine();
        System.out.println("Hi!"+n);
        name.close();
    }
}

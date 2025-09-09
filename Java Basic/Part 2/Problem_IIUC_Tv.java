import java.util.*;
public class Problem_IIUC_Tv {
    public static void main(String [] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Input number of friends :");
    int n = input.nextInt();
    System.out.print("Input Taka for one Subscription :");
    int x = input.nextInt();

    double s = Math.ceil(n/6.0);
    
    System.out.printf("Total Taka for %.0f subscription = %.2f tk.\n",s,s*x);
    System.out.printf("Each friend has to pay : %.2f tk.\n",(s*x)/6);
    input.close();
    }
}

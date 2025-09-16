import java.util.*;

public class Q1_Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String s = input.nextLine();
        int len = s.length();
        String ans = "";
        String tmp = "";
        for (int i = 0; i < len; ++i) {
            char ch = s.charAt(i);
            if (ch != ' ') tmp += ch;
            else {
                int sz = tmp.length();
                for (int j = sz - 1; j >= 0; --j) ans += tmp.charAt(j);
                ans += " ";
                tmp = "";
            }
        }
        for (int j = tmp.length() - 1; j >= 0; --j) ans += tmp.charAt(j);
            
        System.out.println(ans);

        input.close();
    }
}
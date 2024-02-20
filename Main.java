import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count = 1;
        String t = "";
        for (int i = 0; i < num; i++) {
            int n = scanner.nextInt();
            t += String.valueOf(n);
        }
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if (t.charAt(i) == t.charAt(j)) {
                    StringBuilder sb = new StringBuilder(t);
                    sb.deleteCharAt(j);
                    sb.deleteCharAt(i);
                    t = sb.toString();
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
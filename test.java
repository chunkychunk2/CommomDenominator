import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int i = Math.max(a, b);
        while (true) {
            if (b % i == 0 && a % i == 0) break;
            else i = i - 1;
        }
        System.out.println(i);
    }
}

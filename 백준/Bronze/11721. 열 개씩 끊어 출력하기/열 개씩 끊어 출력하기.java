import java.util.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if((i-9)%10 == 0) {
                System.out.println();
            }
        }
        sc.close();
    }
}

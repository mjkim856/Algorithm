import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int second = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == 'A' || c == 'B' || c == 'C') second += 3;
            else if(c == 'D' || c == 'E' || c == 'F') second += 4;
            else if(c == 'G' || c == 'H' || c == 'I') second += 5;
            else if(c == 'J' || c == 'K' || c == 'L') second += 6;
            else if(c == 'M' || c == 'N' || c == 'O') second += 7;
            else if(c == 'P' || c == 'Q' || c == 'R' || c == 'S') second += 8;
            else if(c == 'T' || c == 'U' || c == 'V') second += 9;
            else if(c == 'W' || c == 'X' || c == 'Y' || c == 'Z') second += 10;
        }
        System.out.println(second);
    }
}
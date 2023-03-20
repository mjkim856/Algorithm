import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str=br.readLine()) != null) {
            System.out.println(str);
        }
        
        // Scanner의 nextLine()을 사용해서 푸는 방법
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextLine()) {
            str = sc.nextLine();
            System.out.println(str);
        }

    }
}

// 방법 1. Scanner 사용하기
// while, hasNext(), nextLine()
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str=br.readLine()) != null) {
            System.out.println(str);
        }
    }
}

// 방법 2. BufferedReader 사용하기
// while, readLine() != null
import java.util.*;

class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            String str = sc.nextLine();
            System.out.println(str);
        }
        sc.close();
    }
}

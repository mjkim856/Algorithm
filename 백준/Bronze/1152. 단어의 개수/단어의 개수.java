import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());

    }
}

-
    
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        if(str.equals(" ")) {
            System.out.println("0");
        } else {
            String[] arr = str.trim().split(" ");
            System.out.println(arr.length);
        }
    }
}

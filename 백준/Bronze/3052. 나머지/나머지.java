import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            hs.add(num%42);
        }
        System.out.println(hs.size());
    }
}

_____________________________________________________________________________________


import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> arr = new ArrayList<>();
        
        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            if(arr.indexOf(num%42) == -1) {
                arr.add(num%42);
            }   
        }
        System.out.println(arr.size());
    }
}

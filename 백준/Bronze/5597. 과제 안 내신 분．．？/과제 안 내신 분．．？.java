import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 특이점 1. Boolean 형식으로 하면 맨 밑 for문에서 오류 발생. 아마 wrapper 된 거라 null이 가능해서 그런 건가 싶기도 하고.
        boolean[] arr = new boolean[31];

        // 특이점 2. 28명이 과제를 냈으므로 28번 돌려야 함
        for(int i = 1; i <= 28; i++) {
            arr[Integer.parseInt(br.readLine())] = true;
        }

        // 특이점 3. boolean에서만 가능한 건진 모르겠는데, 배열이 없다면 !arr[i]와 같은 형식으로 t/f  가능.
        // 아마 boolean에서만 가능한 듯! 
        for(int i = 1; i <= 30; i++) {
            if(!arr[i])
                System.out.println(i);
        }
    }
}

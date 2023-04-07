https://harutocoding.tistory.com/320

-
    
1. while, 커서(?) 사용

import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        int[] arr = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int c1 = 0;
        int c2 = 1;
        int c3 = 2;
        int max = -1;
        int l = arr.length;
        
        while(true) {
            int sum = arr[c1] + arr[c2] + arr[c3];
            if(sum > max && sum <= m) {
                max = sum;
            }
            
            c3++;
            
            if(c3 == l) {
                c2 += 1;
                c3 = c2 + 1;
                if(c2 == (l-1)) {
                    c1 += 1;
                    c2 = c1 + 1;
                    c3 = c2 + 1;
                }
            }

            if(c1 == (l-2)) {
                break;
            }
        }
        
        sb.append(max);
        System.out.print(sb);
    }
}


-------------------------------------------------------------------------------------
    

2. 삼중 for문 사용

import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = search(arr, n, m);
        System.out.print(max);
    }
    
    static int search(int[] arr, int n, int m) {
        int max = -1;
        for(int i = 0; i < n-2; i++) {
            for(int j = i+1; j < n-1; j++) {
                for(int k = j+1; k < n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp == m) return temp;
                    if(temp < m && temp > max) max = temp;
                }
            }
        }
        return max;
    }
}


-------------------------------------------------------------------------------------
    
    
3. 삼중 for문 + 조건문 사용

import java.util.*;
import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] nm = br.readLine().split(" ");
        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max = search(arr, n, m);
        System.out.print(max);
    }

    static int search(int[] arr, int n, int m) {
        int max = -1;
        for(int i = 0; i < n-2; i++) {
            if(arr[i] > m) continue;
            for(int j = i+1; j < n-1; j++) {
                if(arr[i] + arr[j] > m) continue;
                for(int k = j+1; k < n; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if(temp == m) return temp;
                    if(temp < m && temp > max) max = temp;
                }
            }
        }
        return max;
    }
}



// 첫째 줄은 정수 갯수(N), 둘째 줄은 공백으로 구분된 정수, 셋째 줄은 찾으려는 정수(v)가 주어진다.
// v의 갯수를 찾기 위해 cnt 변수를 정의하여 사용한다.
import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());
        int cnt = 0;
   
        for(int i = 0; i < n; i++) {
            if(Integer.parseInt(st.nextToken()) == v) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}

-
    
import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int v = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) > v)
                break;
            if(list.get(i) == v)
                cnt++;
        }
        System.out.print(cnt);
    }
}

-
    
import java.util.*;
import java.io.*;

class Main{
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String v = br.readLine();
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(str, " ");
        
        while(st.hasMoreTokens()) {
            if(st.nextToken().equals(v)) {
                cnt++;
            }
        }
        
        System.out.print(cnt);
    }
}

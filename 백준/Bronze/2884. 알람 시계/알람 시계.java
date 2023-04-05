import java.util.*;

public class Main{
	public static void main(String args[]){
	    Scanner sc = new Scanner(System.in);
	    int h = sc.nextInt();
        int m = sc.nextInt();
        
        // m - 45를 하는데, 만약 -값이 나온다면 h - 1을 한다. 
        if(m - 45 < 0) {
            h = h-1 < 0 ? 23 : h-1;
            m = m + 15;
        } else {
            m -= 45;
        }
	    System.out.println(h + " " + m);
	}
}
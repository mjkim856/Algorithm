import java.util.*;

public class Main{
	public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        a += (b+c)/60;
        b = (b+c)%60;

        if(a > 23) a -= 24;

        System.out.println(a  + " " + b);
	}
}

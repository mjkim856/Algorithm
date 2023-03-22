import java.util.Scanner;
import java.io.FileInputStream;

class Solution
{
	public static void main(String args[]) throws Exception
	{
        Scanner sc = new Scanner(System.in);
        int P, K;
        P=sc.nextInt();
        K=sc.nextInt();
        int count = 0;

        for(int test_case = K; test_case <= P; test_case++)
        {
            count++;
        }

        System.out.println(count);
	}
}
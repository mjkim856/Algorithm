import java.util.*;
import java.io.*;

class Solution {
    public int[] solution(long n) {
        StringBuilder sb = new StringBuilder();
        String nn = String.valueOf(n);
        int arr[] = new int[nn.length()];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = nn.charAt(nn.length()-i-1)-48;
        }
        return arr;
    }
}
import java.io.*;
import java.lang.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public int dist(int a[], int n){
        
        HashMap<Integer,Integer> map = new HashMap<>();
        int min = -1;
        for(int i=0;i<n;i++){
            
            if(map.containsKey(a[i])){
                
				int temp = map.get(a[i]);
                if(min == -1)
				    min = Math.abs(temp-i);
                else
                    min = Math.min(Math.abs(temp-i),min);
            }
            map.put(a[i],i);
        }
        return min;
    }
    public static void main(String[] args) {
		
		try{
			
			Scanner in = new Scanner(new File("input.txt"));
			int n = in.nextInt();
			int A[] = new int[n];
			for(int A_i=0; A_i < n; A_i++){
				A[A_i] = in.nextInt();
			}
			Solution s = new Solution();
			System.out.println(s.dist(A,n));
			
		}catch(Exception e){
			
			e.printStackTrace();
		}	
    }
}

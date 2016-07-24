/*
	https://www.hackerrank.com/challenges/dynamic-array
	
	Sample Input
	2 5
	1 0 5
	1 1 7
	1 0 3
	2 1 0
	2 1 1
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DynamicArray {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int Q = in.nextInt();
        int lastAns = 0;
        LinkedList seq[] = new LinkedList[N];
        for(int i=0;i<Q;i++){
            
            int n = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            if(n == 1){
                
                int s = (x ^ lastAns)%N;
                if(seq[s] == null)
                    seq[s] = new LinkedList<Integer>();
                seq[s].add(y);
            }
            if(n == 2){
                
                int s = (x ^ lastAns)%N;
                int index = (y % seq[s].size());
                lastAns = (int)seq[s].get(index);
                System.out.println(lastAns);
            }
        }    
    }
}
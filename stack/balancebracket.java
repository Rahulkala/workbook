import java.util.*;
import java.io.*;

class balancebracket{
	
	public static void main(String arg[]){
		
		Scanner in = new Scanner(System.in);
		boolean flag;
        int t = in.nextInt();
        for(int i = 0; i < t; i++){

            String s = in.next();
			flag = true;
			Stack<Character> stack = new Stack<Character>();
			for(int j=0;j<s.length();j++){
				
				if(s.charAt(j) == '{' || s.charAt(j) == '(' || s.charAt(j) == '['){
					
					stack.push(s.charAt(j));
				}
				else{
					
					if(stack.isEmpty()){
						
						flag = false;
						break;
					}
					else if(s.charAt(j) == ')' && stack.peek() == '('){
						
						stack.pop();
					}
					else if(s.charAt(j) == '}' && stack.peek() == '{'){
						
						stack.pop();
					}
					else if(s.charAt(j) == ']' && stack.peek() == '['){
						
						stack.pop();
					}
					else{
						
						flag = false;
						break;
					}
				}
			}
			if(!stack.isEmpty())
				flag = false;
			if(flag)
				System.out.println("YES");
			else
				System.out.println("NO");			
        }	
	}
}
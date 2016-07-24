import java.util.*;

class maxelement{
	
	public static void main(String arg[]){
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> max = new Stack<>();
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			
			int q = in.nextInt();
			if(q == 1){
				
				int num = in.nextInt();
				stack.push(num);
				if(max.isEmpty())
					max.push(num);
				else{
					
					int temp = max.peek();
					if(num >= temp)
						max.push(num);
				}
			}
			else if(q == 2){
				
				int num = stack.pop();
				if(num == max.peek())
					max.pop();
			}
			else{
				
				System.out.println(max.peek());
			}
		}
	}
}
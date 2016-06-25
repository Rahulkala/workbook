import java.util.*;

public class checkUnique{
	// Without unique data structure
	public boolean check1(String s){
		
		int i=0;
		int arr[] = new int[255];
		if(s==null)
			return false;
		if(s=="")
			return true;
		for(i=0;i<s.length();i++){
			
			int j = (int)s.charAt(i);
			if(arr[j]==0)
				arr[j]=1;
			else
				return false;
		}
		return true;
	}
	//With Any extra data structure
	public boolean check(String s){
		
		if(s==null)
			return false;
		if(s=="")
			return true;
		HashSet<Character> set = new HashSet<>();
		int i=0;
		for(;i<s.length();i++){
			
			if(set.add(s.charAt(i)))
				continue;
			break;
		}
		if(i==s.length())
			return true;
		else
			return false;
	}
	public static void main(String arg[]){
		
		checkUnique cu = new checkUnique();
		System.out.println(cu.check1("Rahul"));
	}
}
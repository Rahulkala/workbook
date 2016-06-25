import java.util.*;

public class palinPermu{

	public boolean check(String s){
		
		if(s==null)
			return false;
		if(s=="")
			return true;
		int flag=0;
		HashMap<Character,Integer> map = new HashMap<>();
		for(int i=0;i<s.length();i++){
			
			if(s.charAt(i)==' ')
				continue;
			if(!map.containsKey(s.charAt(i))){
				
				map.put(s.charAt(i),1);
				flag++;
			}
			else{
				
				int val = map.get(s.charAt(i));
				val++;
				if(val%2==0)
					flag--;
				else 
					flag++;
				map.put(s.charAt(i),val);
			}
		}
		if(flag==1 || (map.size()%2==0 && flag==0))
			return true;
		else
			return false;
	}
	public static void main(String arg[]){
		
		palinPermu pp =new palinPermu();
		System.out.println(pp.check("tact coao "));
	}
}
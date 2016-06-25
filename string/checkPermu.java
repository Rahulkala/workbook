import java.util.*;

public class checkPermu{

	public boolean check(String s1,String s2){
		
		if(s1==null || s2==null || s1.length()!=s2.length())
			return false;
		HashMap<Character,Integer> map = new HashMap<>();
		
		// Filling character of s1 in the map with count
		for(int i=0;i<s1.length();i++){
			
			if(!map.containsKey(s1.charAt(i))){
				
				map.put(s1.charAt(i),1);
			}
			else
				map.put(s1.charAt(i),map.get(s1.charAt(i))+1);
		}
		
		//Checking character of s2
		for(int i=0;i<s2.length();i++){
			
			if(map.containsKey(s2.charAt(i))){
				
				int temp = map.get(s2.charAt(i));
				temp--;
				if(temp==0)
					map.remove(s2.charAt(i));
				else
					map.put(s2.charAt(i),temp);
			}
			else
				return false;
		}
		return true;
	}
	public static void main(String arg[]){
		
		checkPermu cp = new checkPermu();
		System.out.println(cp.check("ababbba cddc","babaabbccdd "));
	}
}
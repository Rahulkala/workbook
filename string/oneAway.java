import java.util.*;
public class oneAway{

	public boolean check(String str1, String str2){
		
		if(str1==null || str2==null)
			return false;
		String s1,s2;
		if(str1.length()>=str2.length()){
			
			s1 = str1;
			s2 = str2;
		}
		else{
			
			s2 = str1;
			s1 = str2;
		}
			
		int l = s1.length()-s2.length();
		int flag = 0;
		if(l<2 || l>-2){
			
			HashMap<Character,Integer> map = new HashMap<>();
			for(int i=0;i<s1.length();i++){
				
				if(!map.containsKey(s1.charAt(i)))
					map.put(s1.charAt(i),1);
				else{
					
					int val = map.get(s1.charAt(i));
					map.put(s1.charAt(i),val+1);
				}
			}
			for(int i=0;i<s2.length();i++){
				
				if(map.containsKey(s2.charAt(i))){
					
					int val = map.get(s2.charAt(i));
					if(val-1==0)
						map.remove(s2.charAt(i));
					else
						map.put(s2.charAt(i),val-1);
				}
				else{
					
					flag++;
				}
			}
			if(l==0 && flag==1){
				
				return true;
			}
			if((l==-1 || l==1)&&map.size()==1){
				
				return true;
			}
		}
		return false;
	}
	public static void main(String arg[]){
		
		oneAway oa = new oneAway();
		System.out.println(oa.check("","aa"));
	}
}
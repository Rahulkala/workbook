public class replaceSpace{

	public String change(String s, int len){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<len;i++){
			
			if(s.charAt(i)==' ')
				sb.append("%20");
			else
				sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	public static void main(String arg[]){
		
		replaceSpace rs = new replaceSpace();
		String s = "Hello World, My name is Rahul Kala";
		System.out.println(rs.change(s,s.length()));
	}
}
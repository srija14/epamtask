package epam;


import java.util.*;
import java.util.stream.Collectors;

public class FindString {
	public static List<String> search(List<String> list) {
		return list.stream().filter(s -> s.startsWith("a") && s.length()==3).collect(Collectors.toList());
		}
		public static void main(String[] args) {
			List<String> al = new ArrayList<String>();
			 al.add("abc"); 
		     al.add("abcd"); 
		     al.add("kluniversity");
		     al.add("air");
		     al.add("App");
		     al.add("satya");
		     al.add("act");
		     List<String> str = search(al); 
		     System.out.println("Three letter string that starts with character 'a' : "+str);

		}

}

package snowgame;

import java.util.HashSet;
import java.util.Map;


public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashSet<String> hashSet=new HashSet<String>();
		
		hashSet.add("Shanghai");
		hashSet.add("Beijing");
		hashSet.add("Shenzhen");
		java.util.Map map= (Map) hashSet.stream().map(String::toUpperCase);
		
		System.out.println(hashSet.toString());
		

	}

}

package snowgame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class DCApplication {

	@RequestMapping("/snowgame")
	String home() {
		
	      List<String> names1 = new ArrayList<String>();
	      names1.add("Google ");
	      names1.add("Runoob ");
	      names1.add("Taobao ");
	      names1.add("Baidu ");
	      names1.add("Sina ");
	        
		Collections.sort(names1, new Comparator<String>() {
	         @Override
	         public int compare(String s1, String s2) {
	            return s1.compareTo(s2);
	         }
	      });
		final String  namesStr="";
		 String  namesStr2="";
		names1.forEach(p -> {
			System.out.println(p + namesStr);
		});
		return "Welcome to Snow Game!"+namesStr;
	}

	public static void main(String[] args) {
		SpringApplication.run(DCApplication.class, args);

	}
}

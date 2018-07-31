package pl.techstyle.Controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	Set<String> fruit= new HashSet<>();
	String someText="WItaj świecie w Spring Boot";
	@GetMapping("/")
	public ModelAndView getMain() {
		ModelAndView m = new ModelAndView();
		m.setViewName("index");
		m.addObject("someText",someText);
		initFruit();
		m.addObject("fruits",fruit);
		return m;
	}
	public void initFruit() {
		for(int i=0;i<=10;i++) {
			fruit.add("owoc"+i);
		}
	}
}

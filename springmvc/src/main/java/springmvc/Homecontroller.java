package springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller 
{
	public Homecontroller()
	{
		System.out.println("hello");
	}
	
	@RequestMapping("/")
	public String welcome()
	{
		return "Welcome.jsp";
	}
}

package mvcpractice;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

	@Controller
	  @RequestMapping("/hello")
	public class HelloController {
		
	   @RequestMapping("/hello")
	   ModelAndView hello(){	   
		   return new ModelAndView("hello", "msg", "Hello Spring MVC ..");
	   }
	   
	   @RequestMapping(method=RequestMethod.GET)
	   ModelAndView hello1(){	   
		   return new ModelAndView("saad", "msg", "Hello Spring MVC ..");
		   
	   }
	   @RequestMapping("/example")
	   String hello2()
	   {
		   return "example";
	   }
	   
	   
	   
	   
	}

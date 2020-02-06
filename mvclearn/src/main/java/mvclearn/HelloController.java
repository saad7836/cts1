package mvclearn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/hello")
public class HelloController {
	   @RequestMapping(method = RequestMethod.GET)
  // @RequestMapping("/hello")
   ModelAndView hello(){	   
	   return new ModelAndView("hello", "saad", "Hello Spring MVC ..");
   }
    
   //@RequestMapping("/add")
	//public String hello2() {
		//return "add";
	//}
   
	 //  @RequestMapping("/add")
  // public ModelAndView hello2(){    	
  // 	return new ModelAndView("add");  
//}
	   
	   @RequestMapping(value="add", method = RequestMethod.GET)
		public String firstReqVal1(Model model) {
			model.addAttribute("msg", "please run");
			return "add";
	  
}
}
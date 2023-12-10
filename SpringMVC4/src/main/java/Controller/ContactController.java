package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ContactController {

	@ModelAttribute
   public void commonDataForModel(Model model) {
	   model.addAttribute("header1","Learn code with Kiran");
	   model.addAttribute("desc","Home for programmers");
	   System.out.println("adding common data");
   }
	
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
		
	}
	
	//by path variable 
	@RequestMapping(path ="/processform",method = RequestMethod.POST)
	
	//by the help of modelAttribue we should not use much of request param
	//we can create an class like user and directly store data on it
	public String handleForm(@ModelAttribute User user,Model model)
			 {
		//we save much lines by using modelAttribute
		//it will work of 3 methods
		//request param //object creation //and then put it on model
		//it will do all the work
		//Modelattribute fetch the data from front end(processform) and put it on User user(object)
		
		
		System.out.println(user);
		return "success";
	}
}

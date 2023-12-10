package Controller;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class ContactController {

	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
		
	}
	
	//by path variable 
	@RequestMapping(path = "/processform",method = RequestMethod.POST)
	public String handleForm(
			//by requestparam the data is stored in this variable email
			
			//if you want some variables should be optioned then use
			//this required
			@RequestParam(name = "email",required=false) String email,
			@RequestParam("username") String name,
			@RequestParam("password") String pass,Model model) {
		
		//this data we see in out backend through this system.out.println
		System.out.println("user email :" +email);
		System.out.println("user name :" +name);
		System.out.println("user password :" +pass);

		
		//process
		//by the help of the model we can transfer this data in other pages
		model.addAttribute("email",email);
		model.addAttribute("username",name);
		model.addAttribute("password",pass);
		return "success";
	}
}

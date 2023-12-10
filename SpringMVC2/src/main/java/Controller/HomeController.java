package Controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class HomeController {
	  //this annotation will make this class controller

		@RequestMapping("/home")   //if we put this api request then this class will fire
		public String home(Model model) {
			System.out.println("this is home Url");
			
			//we are use attributes my model.ui
			model.addAttribute("name", "Kiran");  //we can add values by using model object
			model.addAttribute("ID",1421);
			
			//by collection
			List<String> friends=new LinkedList<>();
			friends.add("Neel");

			friends.add("Nitin");
			friends.add("Mukesh");
			
			model.addAttribute("f",friends);
			
			return "index";   //it will return the index.jsp page
		}
		
		@RequestMapping("/about")   //if we put this api request then this class will fire
		public String about() {
			System.out.println("this is about Url");
			return "about";   //it will retrun the index.jsp page
		}
	
		@RequestMapping("/help")
		public ModelAndView help() {
			System.out.println("this is help controller");

			//creating model and view object
			ModelAndView modelAndView=new ModelAndView();
			
			//setting the data
			modelAndView.addObject("name","Kiran");
			modelAndView.addObject("rollno",123456);
			
			//setting LocalDateTime
		    LocalDateTime now=LocalDateTime.now();	  //first create LocalDateTime.now(); then put it on object
			modelAndView.addObject("now" ,now);

		   LocalDate date=LocalDate.now();
		   modelAndView.addObject("date",date);
		   
		   LocalTime time=LocalTime.now();
		   modelAndView.addObject("time",time);
		   
			//marks
            
		     List<Integer> li=new ArrayList<Integer>();
		     li.add(12);
		     li.add(58);
		     li.add(45);
		     li.add(47);
		     
		     modelAndView.addObject("marks",li);
			//setting the view name
			modelAndView.setViewName("help");  //by this setView name method help page will load 
			return modelAndView;
		}
		
		
		
		
}

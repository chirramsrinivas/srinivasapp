package com.srini;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/welcome")
public class HelloWorldController {
	private static int count=1;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView helloWorld(){
			 Date d = new Date();
			 ModelAndView model = new ModelAndView("HelloWorldPage");
				model.addObject("msg", d);
				model.addObject("msg1", count++);
				
       
		return model;
	}
}
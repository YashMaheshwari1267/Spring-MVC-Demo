package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InfoController {

	@RequestMapping("/showForm")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("student-form");
		return mv;
	}

	@RequestMapping("/submitForm")
	public ModelAndView submitForm(@RequestParam(value = "name") String studentName) {
		ModelAndView mv = new ModelAndView("student-info");
		mv.addObject("studentName", studentName);
		return mv;
	}

}

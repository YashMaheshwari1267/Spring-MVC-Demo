package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public ModelAndView showPage() {
		ModelAndView mv= new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/submitInfo")
	public ModelAndView submitFormHandler(@ModelAttribute("student") Student student) {
		Student stud=new Student();
		stud.setFirstname(student.getFirstname());
		stud.setLastname(student.getLastname());
		stud.setEmail(student.getEmail());
		stud.setMobile(student.getMobile());
		stud.setCourse(student.getCourse());
		ModelAndView mv = new ModelAndView("student-info");
		mv.addObject("student", stud);
		return mv;
	}
}

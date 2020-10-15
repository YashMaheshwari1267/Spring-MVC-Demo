package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Student;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String showPage() {
		return "index";
	}
	
	@RequestMapping(value="/viewList")
	public String viewStudentList() {
		return "student-list";
	}
	
	@RequestMapping(value="/addStudent")
	public String addNewStudent(Model model) {
		model.addAttribute("student", new Student());
		return "add-student";
	}
	
	@RequestMapping(value="/submitForm", method = RequestMethod.POST)
	public String submitFormHandler(@ModelAttribute("student") Student student) {
		return "output-data";
	}
	
	
	
}

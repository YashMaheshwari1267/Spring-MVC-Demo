package model;

import java.util.LinkedHashMap;

public class Student {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String course;
	
	private LinkedHashMap<String,String> courseOption;
	
	public Student() {
		courseOption = new LinkedHashMap<String, String>();
		
		courseOption.put("BE", "BE");
		courseOption.put("BTech", "BTech");
		courseOption.put("BPharma", "BPharma");
		courseOption.put("MBA", "MBA");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}

	public LinkedHashMap<String, String> getCourseOption() {
		return courseOption;
	}
	
	
	
}

package beans;

import java.util.Set;

public class Faculty {
	private int facultyid;
	private String facultyname;
	private int yrsexp;
	private Set<Course> courses;
	public int getFacultyid() {
		return facultyid;
	}
	public void setFacultyid(int facultyid) {
		this.facultyid = facultyid;
	}
	public String getFacultyname() {
		return facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public int getYrsexp() {
		return yrsexp;
	}
	public void setYrsexp(int yrsexp) {
		this.yrsexp = yrsexp;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}
	
}

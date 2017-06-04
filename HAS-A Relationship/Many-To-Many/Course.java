package beans;

import java.util.Set;

public class Course {
	private int courseid;
	private String coursename;
	private int fee;
	private Set<Faculty> faculties;
	
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCoursename() {
		return coursename;
	}
	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public Set<Faculty> getFaculties() {
		return faculties;
	}
	public void setFaculties(Set<Faculty> faculties) {
		this.faculties = faculties;
	}
	
}

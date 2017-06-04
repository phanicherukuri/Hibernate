package beans;

import java.util.Set;

public class Authors {
	private int authid;
	private String name;
	private Set publishedBooks;
	public Authors()
	{
		
	}
	public Authors(int authid, String name, Set publishedBooks) {
		super();
		this.authid = authid;
		this.name = name;
		this.publishedBooks = publishedBooks;
	}
	
	public int getAuthid() {
		return authid;
	}
	public void setAuthid(int authid) {
		this.authid = authid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set getPublishedBooks() {
		return publishedBooks;
	}
	public void setPublishedBooks(Set publishedBooks) {
		this.publishedBooks = publishedBooks;
	}
}

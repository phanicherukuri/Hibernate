package beans;
	
public class Books {
	private int bookid;
	private String bookname;
	private int authorid; //foreign key - mapping to authid from Authors
	public Books()
	{
		
	}
	public Books(int bookid, String bookname, int authorid) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.authorid = authorid;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public int getAuthorid() {
		return authorid;
	}
	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}
}
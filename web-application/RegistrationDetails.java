package beans;

public class RegistrationDetails {
	private int rid;
	private String rname;
	private String remail;
	private int rmarks;
	
	public RegistrationDetails()
	{
		
	}

	public RegistrationDetails(int rid, String rname, String remail, int rmarks) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.remail = remail;
		this.rmarks = rmarks;
	}

	public int getRid() {
		return rid;
	}

	public void setRid(int rid) {
		this.rid = rid;
	}

	public String getRname() {
		return rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public String getRemail() {
		return remail;
	}

	public void setRemail(String remail) {
		this.remail = remail;
	}

	public int getRmarks() {
		return rmarks;
	}

	public void setRmarks(int rmarks) {
		this.rmarks = rmarks;
	}
	
}

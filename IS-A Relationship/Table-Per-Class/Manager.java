package beans;

public class Manager extends Employee {
	private int teamsLead;
	public Manager()
	{
		
	}
	public Manager(int id, String name, String email, int salary, int teamsLead) {
		super(id, name, email, salary);
		this.teamsLead = teamsLead;
	}
	public int getTeamsLead() {
		return teamsLead;
	}
	public void setTeamsLead(int teamsLead) {
		this.teamsLead = teamsLead;
	}
	
}

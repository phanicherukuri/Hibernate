package beans;

public class Select {
	private int id;
	private String name;
	private String hq;
	private int turnover;
	public Select()
	{
		
	}
	public Select(int id, String name, String hq, int turnover) {
		super();
		this.id = id;
		this.name = name;
		this.hq = hq;
		this.turnover = turnover;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHq() {
		return hq;
	}
	public void setHq(String hq) {
		this.hq = hq;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
		
}

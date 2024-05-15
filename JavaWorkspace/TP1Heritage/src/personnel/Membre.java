package personnel;

public class Membre {
	private String name;
	private int hiringYear;
	private double salary;

	public Membre(String name, int hiringYear, double salary) {
		this.name = name;
		this.hiringYear = hiringYear;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHiringYear() {
		return hiringYear;
	}
	
	public double getSalary() {
		return salary;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setHiringYear(int hiringYear) {
		this.hiringYear = hiringYear;
	}
	
	public void setSalary(float salary) {
		this.salary = salary;
	}
}

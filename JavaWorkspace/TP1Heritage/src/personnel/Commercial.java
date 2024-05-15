package personnel;

public class Commercial extends Membre {
	private int clientsCounter;
	private double salesAverage;
	
	public Commercial(String name, int hiringYear, float salary, int clientsCounter, double salesAverage) {
		super(name, hiringYear, salary);
		this.clientsCounter = clientsCounter;
		this.salesAverage = salesAverage;
	}
	
	public int getClientsCounter() {
		return clientsCounter;
	}
	
	public double getSalesAverage() {
		return salesAverage;
	}
	
	public void setClientsCounter(int clientsCounter) {
		this.clientsCounter = clientsCounter;
	}
	
	public void setSalesAverage(float salesAverage) {
		this.salesAverage = salesAverage;
	}
	
}

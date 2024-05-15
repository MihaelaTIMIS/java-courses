package personnel;

public class Developper extends Membre {
	private int projectsCount;
	private int qualityScore;
	
	public Developper(String nom, int hiringYear, double salary,int projectsCount, int qualityScore) {
		super(nom, hiringYear, salary);
		this.projectsCount = projectsCount;
		this.qualityScore = qualityScore;
	}
	
	public int getProjectsCount() {
		return projectsCount;
	}
	
	public int getQualityScore() {
		return qualityScore;
	}
	
	public void setProjectsCount(int projectsCount) {
		this.projectsCount = projectsCount;
	}
	
	public void setQualityScore(int qualityScore) {
		this.qualityScore = qualityScore;
	}
}

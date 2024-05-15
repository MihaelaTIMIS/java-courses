package bibliotheque;

public final class Teacher extends Member{

	String topic;
	
	public Teacher(String name, int memberId, String topic) {
		super(name, memberId);
		this.topic=topic;
	}
	
}

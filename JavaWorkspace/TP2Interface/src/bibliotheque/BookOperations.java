package bibliotheque;

public interface BookOperations {
	void addBook(String title);
	Book findBookByTitle(String title);
}

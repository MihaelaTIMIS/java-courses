package bibliotheque;

public class Library implements BookOperations, MemberOperations{

	private Book[] books = new Book[300];
	private Member[] members = new Member[300];
	private int bookCounter = 0;
	private int memberCounter = 0;
	
	@Override
	public void addBook(String title) {
		if(bookCounter<books.length) {			
			books[bookCounter].title = "Book Title 1";
			books[bookCounter].author = "Book Author 1";
			bookCounter ++ ;
		}
		else System.out.println("Le stock des livre est complet.");
	}
	
	@Override
	public Book findBookByTitle(String title) {
		for(int counter=0; counter<books.length; counter++) {
			if(books[counter].getTitle().equals(title)) {
				return books[counter];
			}}
		return null;		
	}
	
	
	@Override
	public void signUpMember() {
		if(memberCounter<members.length) {
			members[memberCounter].setMemberId(memberCounter);
			members[memberCounter].setName("Member Name");
			memberCounter++;			
		}
		else System.out.println("Le maximum des membres est atteint.");
	}
	
	@Override
	public Member findMemberById(int memberId) {
		for(int counter=0;counter<members.length;counter++) {
			if(members[counter].getMemberId()==memberId) return members[counter];
		}
		return null;
	}
	
}

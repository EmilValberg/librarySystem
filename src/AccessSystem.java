
public class AccessSystem {
	
	private boolean adminAccess;
	private int[] users;
	
	AccessSystem(){
		
	}
	
	public void CheckCredibility(int userID) {
		
	}
	
}

class VisitorUser extends AccessSystem{
	
	private int userID;
	
	VisitorUser(){
		
	}
	
	VisitorUser(int userID){
		this.userID = userID;
	}
	
	public void SetUserID(int userID) {
		
	}
	
	public int GetUserID() {
		return this.userID;
	}
}

class LibrarianUser extends AccessSystem{
	
	private int userID;
	
	LibrarianUser(){
		
	}
	
	LibrarianUser(int userID){
		this.userID = userID;
	}
	
	public void SetUserID(int userID) {
		
	}
	
	public int GetUserID() {
		return this.userID;
	}
	
}

package Abstract;

public abstract class Phone {
	Contact[] contacts;
	
	public abstract void insertContact( String name, String phone );
	public abstract void searchContact(String name);
	
}

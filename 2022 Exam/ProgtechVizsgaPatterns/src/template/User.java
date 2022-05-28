package template;

public class User extends Record{
	String username;
	
	public User(String name) {
		this.username = name;
	}

	@Override
	public void BeforeSave() {
		System.out.println("hooked back to user before save");
	}
	
}

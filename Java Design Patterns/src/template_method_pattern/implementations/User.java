package template_method_pattern.implementations;

import template_method_pattern.abstractions.Record;

public class User extends Record{
	String username;
	
	public User(String name) {
		this.username = name;
	}

	@Override
	public void BeforeSave() {
		System.out.println("hooked back to user before save");
	}
	
	/*@Override
	public void AfterSave() {
		System.out.println("hooked back to user after save");
	}*/

}

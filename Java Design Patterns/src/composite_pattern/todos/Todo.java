package composite_pattern.todos;

import composite_pattern.abstraction.ITodoList;

public class Todo implements ITodoList {
	@Override
	public String GetHTML() {
		return this.text;
	}

	String text;

	public Todo(String text) {
		this.text = text;
	}

}

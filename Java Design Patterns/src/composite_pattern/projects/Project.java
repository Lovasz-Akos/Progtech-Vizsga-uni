package composite_pattern.projects;

import java.util.List;

import composite_pattern.abstraction.ITodoList;

public class Project implements ITodoList {
	@Override
	public String GetHTML() {
		String html = "<h1>";
		html += this.title;
		html += "</h1><ul>";
		for (ITodoList iTodoList : todos) {
			html += "<li>";
			html += iTodoList.GetHTML();
			html += "</li>";
		}
		html += "</ul>";
		return html;
	}

	List<ITodoList> todos;
	String title;

	public Project(String title, List<ITodoList> todos) {
		this.title = title;
		this.todos = todos;
	}

}

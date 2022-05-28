package composite_pattern;

import java.util.ArrayList;
import java.util.List;

import composite_pattern.abstraction.ITodoList;
import composite_pattern.projects.Project;
import composite_pattern.todos.Todo;

public class CompositeStarter {

	public static void main(String[] args) {
		
		List<ITodoList> list = new ArrayList<ITodoList>();
		ITodoList itlLeaf = new Todo("text");
		list.add(itlLeaf);
		list.add(itlLeaf);
		list.add(itlLeaf);
		list.add(itlLeaf);
		
		ITodoList itl = new Project("title", list);
		
		System.out.println(itl.GetHTML());
	}

}

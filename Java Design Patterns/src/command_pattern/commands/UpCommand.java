package command_pattern.commands;

import command_pattern.Light;
import command_pattern.interfaces.ICommand;

public class UpCommand implements ICommand{
	
	public UpCommand(Light light) {
		this.light = light;
	}
	
	Light light;
	
	@Override
	public void Execute() {
		this.light.Up();
		
	}

	@Override
	public void Unexecute() {
		this.light.Down();
		
	}

}

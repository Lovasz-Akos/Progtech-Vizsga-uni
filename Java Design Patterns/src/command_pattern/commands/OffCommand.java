package command_pattern.commands;

import command_pattern.Light;
import command_pattern.interfaces.ICommand;

public class OffCommand implements ICommand{
	
	public OffCommand(Light light) {
		this.light = light;
	}

	Light light;

	@Override
	public void Execute() {
		this.light.Off();
		
	}

	@Override
	public void Unexecute() {
		this.light.On();
		
	}

}

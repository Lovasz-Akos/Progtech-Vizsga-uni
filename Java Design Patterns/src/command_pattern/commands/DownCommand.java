package command_pattern.commands;

import command_pattern.Light;
import command_pattern.interfaces.ICommand;

public class DownCommand implements ICommand{
	Light light;
	
	public DownCommand(Light light) {
		this.light = light;
	}

	@Override
	public void Execute() {
		this.light.Down();
	}

	@Override
	public void Unexecute() {
		this.light.Up();
	}

}

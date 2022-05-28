package command_pattern.commands;

import command_pattern.Light;
import command_pattern.interfaces.ICommand;

public class LightCommand implements ICommand {

	Light light;

	public LightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void Execute() {
		this.light.On();
	}

	@Override
	public void Unexecute() {
		this.light.Off();
	}

}

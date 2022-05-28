package command_pattern;

import command_pattern.commands.DownCommand;
import command_pattern.commands.LightCommand;
import command_pattern.commands.OffCommand;
import command_pattern.commands.UpCommand;
import command_pattern.interfaces.ICommand;
import command_pattern.invokers.Invoker;

public class CommandStarter {

	public static void main(String[] args) {
		Light l = new Light();
		ICommand on = new LightCommand(l);
		ICommand off = new OffCommand(l);
		ICommand up = new UpCommand(l);
		ICommand down = new DownCommand(l);

		Invoker remote = new Invoker(on, off, up, down);

		remote.PressOn();
		remote.PressUp();
		remote.PressOn();
		remote.PressOff();
		remote.PressUp();
		remote.PressDown();
	}

}

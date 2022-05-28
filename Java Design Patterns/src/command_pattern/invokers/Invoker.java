package command_pattern.invokers;

import command_pattern.interfaces.ICommand;

public class Invoker {
	ICommand on, off, up, down;

	public Invoker(ICommand on, ICommand off, ICommand up, ICommand down) {
		this.on = on;
		this.off = off;
		this.up = up;
		this.down = down;

	}

	public void PressOn() {
		this.on.Execute();
	}

	public void PressOff() {
		this.off.Execute();
	}
	
	public void PressUp() {
		this.up.Execute();
	}

	public void PressDown() {
		this.down.Execute();
	}
}

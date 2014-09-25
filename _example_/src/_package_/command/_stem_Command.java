package _package_.command;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import osgi.enroute.debug.api.Debug;
import _package_.api._stem_;

/**
 * This is the implementation. It registers the _stem_ interface and calls it
 * through a Gogo command.
 * 
 */
@Component(service=_stem_Command.class, property = { Debug.COMMAND_SCOPE + "=_cmd_",
		Debug.COMMAND_FUNCTION + "=_cmd_" }, name="_pid_.command")
public class _stem_Command {
	private _stem_ target;

	public void _cmd_(String message) {
		target.say(message);
	}

	@Reference
	void set_stem_(_stem_ service) {
		this.target = service;
	}

}

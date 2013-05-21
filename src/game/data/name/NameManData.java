package game.data.name;

import game.data.IData;

import java.util.Map;

public class NameManData implements IValue, IData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String value;

	public String toString() {
		return value;
	}

	@Override
	public Map<?, ?> toMap() {
		return null;
	}

	public final String getValue() {
		return value;
	}

	public final void setValue(String value) {
		this.value = value;
	}

}

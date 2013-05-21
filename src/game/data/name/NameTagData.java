package game.data.name;

import game.data.IData;

import java.util.Map;

public class NameTagData implements IValue, IData {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String value;

	public String getValue() {
		return value;
	}

	public final void setValue(String value) {
		this.value = value;
	}

	public String toString() {
		return value;
	}

	@Override
	public Map<?, ?> toMap() {
		// TODO Auto-generated method stub
		return null;
	}

}

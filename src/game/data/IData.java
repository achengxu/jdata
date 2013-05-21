package game.data;

import java.util.Map;

public interface IData extends java.io.Serializable {

	Map<?, ?> toMap();

	String toString();

}

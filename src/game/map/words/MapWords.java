package game.map.words;

import game.data.words.WordsData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MapWords implements IMap {

	private static MapWords instance;

	private List<String> words;

	private MapWords() {
		words = new ArrayList<String>();
	}

	public static MapWords getInstance() {
		if (null == instance) {
			instance = new MapWords();
		}
		return instance;
	}

	@Override
	public Map<?, ?> getMap() {
		return null;
	}

	@Override
	public void add(Object obj) {
		if (obj instanceof WordsData) {
			WordsData data = (WordsData) obj;
			words.add(data.getWord());
		}
	}
}

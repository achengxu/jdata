package game.map.words;

import game.data.words.WordsData;
import game.map.IMap;

import java.util.ArrayList;
import java.util.Map;

public class MapWords implements IMap {

	private static MapWords root;

	private ArrayList<String> words;

	private MapWords() {
		words = new ArrayList<String>();
	}

	public static MapWords getInstance() {
		if (null == root) {
			root = new MapWords();
		}
		return root;
	}

	@Override
	public Map<?, ?> toMap() {
		// TODO Auto-generated method stub
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

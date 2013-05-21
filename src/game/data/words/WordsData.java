package game.data.words;

import game.data.IData;

import java.util.HashMap;
import java.util.Map;

/***
 * 疲敝字库数据
 */
public class WordsData implements IData {

	private static final long serialVersionUID = 1L;
	private String word;

	public final String getWord() {
		return word;
	}

	public final void setWord(String word) {
		this.word = word;
	}

	public Map<String, String> toMap() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("word", word);
		return map;
	}

	public String toString() {
		return toMap().toString();
	}

}

package 在庫管理システム;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HTMLParser {

	/**
	 * タグの正規表現
	 */
	private static Pattern tagPattern = Pattern
	.compile("(<([^ >]+)([^>]*)>)([^<]*)");	
	
	private Matcher matcher;
	
	private Tag tag;
	
	int pos;
	
	/**
	 * コンストラクタ
	 * 
	 * @param src
	 *             Select.html
	 */
	public HTMLParser(String src) {
		matcher = tagPattern.matcher(src);
	}
	
	/**
	 * 次のHTMLタグがあるかどうかの検査
	 * 
	 * @return 存在する場合はtrue
	 */
	public boolean hasNext() {
		boolean found = matcher.find();
		if(found) {
			tag = new Tag(matcher.group(1),matcher.group(2),matcher.group(3),
					matcher.group(4));
		}
		return found;
	}
	
	/**
	 * 次のHTMLタグを返す
	 * 
	 * @return タグを表すオブジェクト
	 */
	public Tag next() {
		return tag;
	}
	
	public static void main(String args) {
		
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>在庫管理システム</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<p>在庫管理システム　トップ画面です。</p>");
		sb.append("<label>見たいジャンルを選択して下さい</label>");
		sb.append("<select> <option>本</option> <option>IT資産</option><option>その他</option></select>");
		
	}
	
}

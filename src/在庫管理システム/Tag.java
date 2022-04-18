package 在庫管理システム;

public class Tag {

	private String tagStr;
	
	private String tagName;
	
	private String tagAttribute;
	
	private String tagText;
	
	public Tag(String tagStr, String tagName, String tagAttribute,
			String tagText) {
		this.tagStr = tagStr;
		this.tagName = tagName;
		this.tagAttribute = tagAttribute;
		this.tagText = tagText;
	}
	
	@Override
	public String toString() {
		return "タグ:[" + tagName + "],属性:[" + tagAttribute +"],テキスト:["
				+tagText +"]";
	}
	
}

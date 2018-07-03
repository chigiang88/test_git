package giang.test;

public enum MyEnum {
	ENUM_1 ("this is enum 1"),
	ENUM_2 ("this is enum 2"),
	ENUM_3 ("this is enum 3");
	
	private String content;
	
	private MyEnum(String str) {
		content = str;
	}
	
	public String getContent() {
		return content;
	}
	
}

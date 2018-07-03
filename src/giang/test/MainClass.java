package giang.test;

public class MainClass {
	public static void main(String[] args) {
		System.out.println(MyEnum.valueOf("enum_1".toUpperCase()).getContent());
		
		System.out.println(Integer.MAX_VALUE);   

	    System.out.println(Long.MIN_VALUE);
	    
	    System.out.println("2147483647".length());
	    
//	    3600000000
	}
}

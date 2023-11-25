package xworz.com.logic.boot;



public class StringRunner {
	
	public static void main(String[] args) {
		//87 total string 
		String str="Yallalinga";
	
     	System.out.println("1:"+str.charAt(1));
    	System.out.println(	"2:"+str.chars());
	    System.out.println("3:"+str.codePointAt(2));	
		System.out.println("4:"+str.codePointBefore(4));
	    System.out.println("5:"+str.codePointCount(1, 2));
	    System.out.println(	"6:"+str.codePoints());
		System.out.println("7::"+ str.compareTo(str));
		System.out.println("8:"+str.compareToIgnoreCase(str));
		System.out.println("9:"+str.concat(str));
		System.out.println("10:"+str.contains(str));
        System.out.println("11:"+str.contentEquals(str));
		System.out.println("12:"+str.contentEquals("yallu"));
		System.out.println("13:"+str.contentEquals("linga"));
		System.out.println("14:"+str.describeConstable());
		System.out.println("15:"+str.endsWith("t"));
		System.out.println("16:"+str.equals("yallu"));
		System.out.println("17:"+str.equalsIgnoreCase("linga"));
		System.out.println("18:"+str.formatted("kumar"));
		//System.out.println(str.getBytes("2"));
		//System.out.println(str.getBytes("kumar"));
		System.out.println("19:"+str.hashCode());
		System.out.println("20:"+str.indent(4));
		System.out.println("21:"+str.indexOf(5));
		System.out.println("22:"+str.indexOf("Roopa"));
		System.out.println("23:"+str.indexOf('r', 'i'));
		System.out.println("23:"+str.indexOf(str, 6));
		System.out.println("24:"+str.intern());
		System.out.println("25:"+str.lastIndexOf(9));
		System.out.println("26:"+str.lastIndexOf("kumar"));
		System.out.println("27:"+str.lastIndexOf(3, 6));
		System.out.println("28:"+str.lastIndexOf("roopa", 7));
		System.out.println("29:"+str.length());
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

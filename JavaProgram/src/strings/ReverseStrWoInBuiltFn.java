package strings;

public class ReverseStrWoInBuiltFn {
	
	public static void main(String[] args) {
		String str = "automation is done";
		String reverseStr="";
		char[] chr = str.toCharArray();
		for(int i=chr.length-1;i>=0;i--) {
			reverseStr=reverseStr+chr[i];
			//reverseStr=chr[i]+reverseStr;
		}
		System.out.println(reverseStr);
	}

}

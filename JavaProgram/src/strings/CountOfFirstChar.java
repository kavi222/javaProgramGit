package strings;

public class CountOfFirstChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "KaviKKarasu";
		str = str + "asdgh";
		System.out.print("str : "+str);
		char ch = str.charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(c==ch) {
				count++;
			}
		}
		System.out.print(count);

	}

}

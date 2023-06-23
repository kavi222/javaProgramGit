package strings;

public class UpperToLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Convert the first character to upper case
		String s = "kaviarasu";
		char[] ch = s.toCharArray();
		ch[0] = (char) (ch[0] - 32);
		//System.out.print(ch[0]);
		s = new String(ch);
		System.out.println(s);
		/*for(int i=0;i<ch.length;i++) {
			System.out.print(ch[i]);
		}
		*/

	}

}

/*
 *A-Z=65-90, a-z=97-122
 */

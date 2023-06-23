package strings;

public class ConvertOddValueToCaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "kaviarasu";
        // convert string into array
		char[] ch = s.toCharArray();
	    for(int i=0;i<ch.length;i++) {
	    	System.out.print(ch[i]);
	    	if(i%2==0) {
	    	ch[i]=(char) (ch[i]-32);
	    	}
	    }
	    System.out.println("----------------------");
	    s=new String(ch);
	    System.out.print(s);
	}

}

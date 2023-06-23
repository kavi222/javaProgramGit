package stringProgramTest;

public class CopyOneStringIntoAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x="I working in chennai";
		char[] y = x.toCharArray();
		int size = y.length;
		char[] a = new char[size];
		int i=0;
		while(i!=size) {
			a[i]=y[i];
			i++;
		}
		System.out.println(y);
		System.out.println(a);

	}

}

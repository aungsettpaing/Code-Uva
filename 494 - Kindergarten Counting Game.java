import java.util.*;
import java.io.*;
public class P494 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		StringTokenizer st;
		while(sc.hasNext()){
			String str = sc.nextLine();
			String newStr = "";
			for(int i=0; i<str.length(); i++){
				int ch = (int)str.charAt(i);
				if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)){
					newStr += str.charAt(i);
				}
				else{
					newStr += " ";
				}
			}
			st = new StringTokenizer(newStr);
			System.out.println(st.countTokens());
		}
	}

}

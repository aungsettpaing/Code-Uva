import java.util.*;
public class Uva10851 {
	public static void main(String[] args) {
		String store[][];
		Scanner sc = new Scanner(System.in);
		int testcase = Integer.parseInt(sc.nextLine());
		String ans = "";
		for(int t=0; t<testcase; t++){
			ans = "";
			//Skip first row.
			sc.nextLine();
			
			store = new String[8][];
			for(int i=0; i<8; i++){
				String s = sc.nextLine();
				store[i] =  new String[s.length()-2];
				// Substring.
				s = s.substring(1, s.length()-1);
				s = s.replaceAll("[/]", "0");
				s = s.replaceAll("[\\\\]", "1");
				for(int j=0; j<s.length(); j++){
					store[i][j] = s.charAt(j) + "";
				}
			}
			// Skip last row.
			sc.nextLine();
			
			String biString = "";
			// Get bit strings vertically (by columns through row descending)
			for(int j=0; j<store[0].length; j++){
				biString = "";
				for(int i=store.length-1; i>=0; i--){
					biString += store[i][j];
				}
				char ch = (char) Integer.parseInt(biString,2);
				ans += ch;
			}
			// Print output.
			System.out.println(ans);		
			
			// Skip blank line.
			if(t+1 != testcase)
				sc.nextLine();
		}
		sc.close();
	}

}

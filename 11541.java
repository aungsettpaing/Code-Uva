import java.io.*;
import java.util.*;
class Main{

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testcase = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=testcase; i++){
			String s = br.readLine();
			int j=0;
			String number;
			StringBuilder sb = new StringBuilder();
			while(j < s.length()){
				number = "";
				// Get the letter.
				char letter = s.charAt(j++);
				// Get the frequency.
				while(j < s.length() &&Character.isDigit(s.charAt(j))){
					number += s.charAt(j++);
				}
				// Print the letter frequency times.
				for(int f=0; f<Integer.parseInt(number); f++)
					sb.append(letter);
			}
			System.out.println("Case "+(i)+": "+sb);
		}
	}

}

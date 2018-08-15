import java.util.*;
class Main{
	public static void main(String[] args){
		String keyboard = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(sc.hasNextLine()){
			str = sc.nextLine();
			str = str.toLowerCase();
			for(int i=0; i<str.length(); i++){
				if(str.charAt(i) == ' ') System.out.print(" ");
				else{
					System.out.print(keyboard.charAt(keyboard.indexOf(str.charAt(i))-2));
				}
			}
			System.out.println();
		}
	}
}

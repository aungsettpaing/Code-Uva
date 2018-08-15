import java.util.*;
class Main{
	static HashMap<Character, Character> map = new HashMap<Character, Character>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Computation.
		initialize();
		while(sc.hasNext()){
			String s = sc.nextLine();
			String ans = "";
			
			for(int i=0; i<s.length(); i++){
				char c = s.charAt(i);
				if(map.containsKey(c)){
					ans += map.get(c);
				}
				else ans += c;
			}
			System.out.println(ans);
		}
	}

	static void initialize(){
		map.put('4', 'q');map.put('q', '4');map.put('a', '7');
		map.put('5', 'j');map.put('w', '5');map.put('s', '8');
		map.put('6', 'l');map.put('e', '6');map.put('d', '9');
		map.put('7', 'm');map.put('r', '.');map.put('f', 'a');
		map.put('8', 'f');map.put('t', 'o');map.put('g', 'e');
		map.put('9', 'p');map.put('y', 'r');map.put('h', 'h');
		map.put('0', '/');map.put('u', 's');map.put('j', 't');
		map.put('-', '[');map.put('i', 'u');map.put('k', 'd');
		map.put('=', ']');map.put('o', 'y');map.put('l', 'c');
		map.put('z', '0');map.put('p', 'b');map.put(';', 'k');
		map.put('x', 'z');map.put('[', ';');map.put('\'', '-');
		map.put('c', 'x');map.put(']', '=');map.put('Q', '$');
		map.put('v', ',');map.put('$', 'Q');map.put('W', '%');
		map.put('b', 'i');map.put('&', 'M');map.put('E', '^');
		map.put('n', 'n');map.put('%', 'J');map.put('R', '>');
		map.put('m', 'w');map.put('^', 'L');map.put('T', 'O');
		map.put(',', 'v');map.put('*', 'F');map.put('Y', 'R');
		map.put('.', 'g');map.put('(', 'P');map.put('U', 'S');
		map.put('/', '\'');map.put(')', '?');map.put('I', 'U');
		map.put('A', '&');map.put('_', '{');map.put('O', 'Y');
		map.put('S', '*');map.put('+', '}');map.put('P', 'B');
		map.put('D', '(');map.put('H', 'H');map.put('{', ':');
		map.put('F', 'A');map.put('J', 'T');map.put('}', '+');
		map.put('G', 'E');map.put('K', 'D');map.put('L', 'C');
		map.put(':', 'K');map.put('Z', ')');map.put('C', 'X');
		map.put('\"', '_');map.put('X', 'Z');map.put('V', '<');
		map.put('B', 'I');map.put('N', 'N');map.put('M', 'W');
		map.put('<', 'V');map.put('>', 'G');map.put('?', '\"');
	}
}

import java.util.*;
import java.io.*;
class Main {

	private static char largestNode;
	private static HashSet<HashSet<Character>> VS;
	
	public static void main(String[] args) throws IOException{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// read test case.
		int testcase = Integer.parseInt(br.readLine());
		// read a blank line.
		br.readLine();
		// start computation.
		for(int i=testcase; i>0; i--){
			largestNode = br.readLine().charAt(0);
			VS = new HashSet<HashSet<Character>>();
			// initialize individual set.
			HashSet<Character> set;
			for(char ch='A'; ch<=largestNode; ch++){
				set = new HashSet<Character>();
				set.add(ch);
				// add individual set to VS.
				VS.add(set);
			}
			// read the edges.
			String edge = br.readLine();
			while(edge != null && !edge.isEmpty()){
				char firstNode = edge.charAt(0), secondNode = edge.charAt(1);
				HashSet<Character> set1 = findSet(firstNode), set2 = findSet(secondNode);
				if(!set1.equals(set2)){
					unionSets(set1, set2);		
				}
				edge = br.readLine();
			}
			System.out.println(VS.size());
			if(i != 1){
				System.out.println();
			}
		}
	}

	public static HashSet<Character> findSet(char ch){
		for(HashSet<Character> set : VS){
			if(set.contains(ch))
				return set;
		}
		return null;
	}
	public static void unionSets(HashSet<Character> set1, HashSet<Character> set2){
		HashSet<Character> set3 = new HashSet<Character>();
		set3.addAll(set1);
		set3.addAll(set2);
		VS.remove(set1); VS.remove(set2);
		VS.add(set3);
	}
	public static void displayVS(){
		for(HashSet<Character> s : VS){
			System.out.print(s+"\t");
		}
		System.out.println();
	}
}

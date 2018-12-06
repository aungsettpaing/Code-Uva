import java.util.*;
public class P902 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int N = sc.nextInt();
			String str = sc.next();
			HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
			
			for(int i=0; i<=str.length()-N; i++){
				String substr = str.substring(i, (i+N));
				if(hashmap.containsKey(substr)){
					hashmap.put(substr, hashmap.get(substr)+1);
				}
				else{
					hashmap.put(substr, 1);
				}
			}
			
			int max = Integer.MIN_VALUE;
			Set set = hashmap.entrySet();
			Iterator ite = set.iterator();
			String result = "";
			while(ite.hasNext()){
				Map.Entry en = (Map.Entry) (ite.next());
				String key = (String)en.getKey();
				int count = (Integer) en.getValue();
				if(count > max){
					max = count;
					result = key;
				}
			}
			System.out.println(result);
		}
	}

}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Demo {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.setPlayerId(100);
		p1.setPlayerName("Sachin");
		p1.setRuns(12222);
		Player p2 = new Player();
		p2.setPlayerId(7);
		p2.setPlayerName("Dhoni");
		p2.setRuns(56446);
		Player p3 = new Player();
		//
		HashMap<Integer, Player> hs = new HashMap<Integer, Player>();
		hs.put(600069, p1);
		hs.put(500500, p2);
		hs.put(700700, p3);
		

		System.out.println(hs.entrySet());
		System.out.println("***************");
		System.out.println(hs.keySet());

		for (Integer key : hs.keySet()) {
			System.out.println(hs.get(key));
		}

		System.out.println("*************");
		System.out.println(hs.values());

		// for (int i = 0; i < hs.size(); i++) {
		// System.out.println();
		// }
		// for (String city : hs) {
		// System.out.println(city);
		// }
		//
		// Iterator<String> itr=hs.iterator();
		// while(itr.hasNext()) {
		// System.out.println(itr.next());
		// }
		//
		// hs.forEach(e->System.out.println(e));
		//

		//

		// Player p1=new Player();
		// p1.setPlayerId(100);
		// p1.setPlayerName("Sachin");
		// p1.setRuns(12222);
		// Player p2=new Player();
		// p2.setPlayerId(7);
		// p2.setPlayerName("Dhoni");
		// p2.setRuns(56446);
		// Player p3=new Player();
		//
		// ArrayList<Player> playerList=new ArrayList<Player>();
		// playerList.add(p1);
		// playerList.add(p3);
		// playerList.add(p2);

	}
}

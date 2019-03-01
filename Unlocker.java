import java.util.ArrayList;

public class Unlocker 
{
	private Fridge fridge;
	private final int limit = 6;
	
	ArrayList<ArrayList<Integer>> allHistory = new ArrayList<>();
	
	public void unlock (Fridge fridge) {
		this.fridge = fridge;
		unlocked (limit, new ArrayList<>());
		print();
	}
	
	private void unlocked (int limit, ArrayList<Integer> history) {
		if (fridge.isUnlock())
		{
			allHistory.add(history);
			System.out.println("way");
			return;
		}
		
		if (limit==0)
			return;
//		metka:
		for (int i = 0; i < fridge.getCount(); i++) {
//			for (Integer el: history) {
//				if (el.intValue()==i) continue metka;
//			}
			if (history.contains(i)) continue;
			fridge.turn(i);
			history.add(i);
			unlocked (limit-1, (ArrayList<Integer>) history.clone());
			history.remove(history.size()-1);
			fridge.turn(i);
		}
	}
	
	private void print() {
		if (allHistory.isEmpty()) {
			System.out.println("Ways not found");
			return;
		}
		
		for (ArrayList<Integer> hst : allHistory) {
			System.out.println(hst.toString());
		}
	}
	
}

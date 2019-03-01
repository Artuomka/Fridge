
public class MainClass {

	public static void main(String[] args) {
		
		boolean [][] init = {
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false},
				{false, true, false, false}
		};
//		
//		boolean [][] init = {
//				{false, false, false, false},
//				{false, true, true, true},
//				{false, true, true, true},
//				{false, true, true, true}
//		};

		Fridge fr = new Fridge (init);
		System.out.println(fr.isUnlock());
		Unlocker unlocker = new Unlocker();
		unlocker.unlock(fr);
		
	}

}

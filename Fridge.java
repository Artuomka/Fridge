
public class Fridge 
{
	boolean [] [] lock;
	private int size;
	private int count;
	
	public Fridge (boolean [] [] lock) {
		 size = lock.length;
		 count = size*size;
		 this.lock = new boolean [size] [size];
		 
		 for (int i=0; i<size; i++) {
			 for (int j=0; j<size; j++) {
				 this.lock [i][j] = lock[i][j];
			 }
		 }
	}
	
	public boolean isUnlock() {
		boolean unlock = true;
		for (int i = 0; i<count; i++) {
			if (!lock[i/size][i%size]) {
				unlock = false;
				break;
			}
		}
		return unlock;
	}
	
	public void turn (int x) {
		int row = x / size;
		int col = x % size;
		
		for (int i = 0; i < count; i++) {
			int curRow = i / size;
			int curCol = i % size;
			
			if (curRow == row || curCol == col) {
				lock[curRow][curCol] = !lock[curRow][curCol];
			}
		}
	}
	
	public int getCount() {
		return count;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j<size; j++) {
				builder.append(lock[i][j]);
				
				if (lock[i][j]) {
					builder.append("   ");
				}
				else builder.append("  ");
			}
			builder.append("\n");
		}
		return builder.toString();
	}
	
}

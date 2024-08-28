package field;
import java.util.ArrayList;
import cell.Cell;
public class Field {
	private int width;
	private int height;
	private Cell[][] field;

	public Field (int width, int length) {
		this.width = width;
		this.height = height;
		field = new Cell[height][width];
	}
	
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	
	public Cell get(int row, int col) {
		return field[row][col];
	}
	
	//在指定位置放置细胞
	public Cell setCell(int row, int col, Cell cell) {
		Cell org = field[row][col];
		field[row][col] = cell;
		return org;
	}
	
	//Cell周围的有细胞的格子
	public Cell[] getNeighbour(int row, int col) {
		ArrayList<Cell> list = new ArrayList<Cell>();
		for(int i = row-1; i<=row+1; i++) {
			for(int j = col-1; j<=col+1; j++) {
				if(row+1<=height && col+1<=width && field[i][j]!=null) {
					list.add(field[i][j]);
				}
			}
		}
		return list.toArray(new Cell[list.size()]);
	}
	
	//Cell周围的空格子
	public Location[] getFreeNeighbour(int row, int col){
		ArrayList<Cell> list = new ArrayList<Cell>();
		for(int i = row-1; i<=row+1; i++) {
			for(int j = col-1; j<=col+1; j++) {
				if(row+1<=height && col+1<=width && field[i][j]==null) {
					list.add(field[i][j]);
				}
			}
		}
		return list.toArray(new Location[list.size()]);
	}
	
	//在周围空格子里随机放入细胞
	public boolean placeRandomAdj(int row, int col, Cell cell) {
		boolean flag = false;
		Location[] listFree = getFreeNeighbour(row, col);
		if(listFree.length > 0) {
			int index = (int)Math.random()*listFree.length;
			field[listFree[index].getRow()][listFree[index].getCol()] = cell;
			flag = true;
		}
		return flag;
	}
	
	//把指定细胞remove
	public Cell remove(int row, int col) {
		Cell rmv = field[row][col];
		field[row][col] = null;
		return rmv;
	}
	
	//清除所有细胞
	public void clear() {
		for(int i = height-1; i<=height+1; i++) {
			for(int j = width-1; j<=width+1; j++) {
				field[height][width] = null;
			}
		}
	}
	
	//把指定位置上的细胞移动到周围随机位置上
	public void move(int row, int col, Cell cell) {
		if(placeRandomAdj(row, col, cell)) {
			remove(row, col);
		}
	}
}

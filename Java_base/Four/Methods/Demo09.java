package Methods;

import java.util.Arrays;
/**
 * 对象数组
 * @author 李泽坤
 */
public class Demo09 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cell[] cells = new Cell[4];//null,null,null,null
		System.out.println(Arrays.toString(cells));
		cells[0] = new Cell(0, 4);
		cells[1] = new Cell(0, 3);
		cells[2] = new Cell(0, 5);
		cells[3] = new Cell(1, 4);
		Cell c = cells[0];
		System.out.println(c);
		System.out.println(c.toString());
		System.out.println(Arrays.toString(cells));
	
		Cell[] row0 = new Cell[10];
		Cell[] row1 = new Cell[10];
		Cell[] row2 = new Cell[10];
		//...
		Cell[] row19  = new Cell[10];
		
		
		//Cell[][] wall = {row0,row1,row2};
		Cell[][] wall = new Cell[20][10];
		wall[5][1] = new Cell(5, 1);
		for (int i = 0; i < wall.length; i++) {
			System.out.println(Arrays.toString(wall[i]));
		}
	} 
}


class Cell /*extends Object*/{
	int row;
	int col;
	public Cell(int row,int col) {
		this.row = row;
		this.col = col;
	}
	public String toString() {
		return "("+row+","+col+")";
	}	
}
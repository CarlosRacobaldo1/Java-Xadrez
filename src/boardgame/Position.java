package boardgame;

public class Position {
	private int row;
	private int Column;
	
	public Position(int row, int column) {
		super();
		this.row = row;
		Column = column;
	}
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return Column;
	}
	public void setColumn(int column) {
		Column = column;
	}
	@Override
	public String toString() {
		return "Position: Row: " + row + " Column: " + Column;
	}
	
	
	
}

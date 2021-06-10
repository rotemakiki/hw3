package BusinessLayer;

public abstract class Tile implements TileVisitor, TileVisited {
	
	//fields:
	protected char typeTile;
	protected Position position;
	
	//constructor:
	public Tile(char typeTile, Position position) {
		this.typeTile = typeTile;
		this.position = position; //
	}
	
	//methods:
	public char getTypeTile() {
		return typeTile;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public abstract String toString();

	public String contactWith(Empty empty) {
		// TODO Auto-generated method stub
		return null;
	}

	public String contactWith(Wall wall) {
		// TODO Auto-generated method stub
		return null;
	}

	public String contactWith(Enemy enemy) {
		// TODO Auto-generated method stub
		return null;
	}

	public String contactWith(Player player) {
		// TODO Auto-generated method stub
		return null;
	}
}

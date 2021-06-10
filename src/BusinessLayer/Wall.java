package BusinessLayer;

public class Wall extends Tile{
	
    public Wall(Position position) {
    	
        super('#', position);
        
    }
    
    @Override
    public String contactWith(Player player) {
        return "";
    }
    
    @Override
    public String contactWith(Enemy enemy) {
        return "";
    }
    
    @Override
    public String contactWith(Empty empty) {
        return "";
    }
    
    @Override
    public String contactWith(Wall wall) {
        return "";
    }
    
    public int acceptContact(TileVisitor tileVisitor) {
        return 0;
    }

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
    

}

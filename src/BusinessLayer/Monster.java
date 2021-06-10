package BusinessLayer;

public class Monster  extends Enemy 
{
	private int visionRange;
	
    public Monster(char tileType,Position position,String name,Health monsterHealth,int attackPoints, int defensePoints, int experienceValue,int visionRange)
    {
        super(tileType, position, name, monsterHealth, attackPoints, defensePoints, experienceValue);
        this.visionRange = visionRange;
    }
    

    public boolean isPlayerInRange(Position pos) {
    	boolean ans;
    	ans = this.position.getDistance(pos)<=this.visionRange;
    	return ans;
    }
    
    @Override
    public Position gameTick(Position playerPosition) 
    {
        if (this.isPlayerInRange(playerPosition)) 
        {
            Position moveTo;
            moveTo = this.movement(playerPosition);
            return moveTo;
        }
        Position moveTo;
        moveTo = this.randomMove();
        return moveTo;
    }


	@Override
	public String attack(Unit unitAttacked) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int acceptContact(TileVisitor t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public void startAttack() {
		
		
	}
	

}

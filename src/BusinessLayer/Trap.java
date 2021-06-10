package BusinessLayer;

public class Trap extends Enemy
{
	
    private int visibilityTime;
    private int invisibilityTime;
    private int ticksCount;
    private boolean visible;
    
    public Trap(char typeTile, final Position position, final String name, final Health trapHealth, final int attackPoints, final int defensePoints, final int experienceValue, final int visibilityTime, final int invisibilityTime)
    {
        super(typeTile, position, name, trapHealth, attackPoints, defensePoints, experienceValue);
        this.visible = true;
        this.ticksCount = 0;
        this.visibilityTime = visibilityTime;
        this.invisibilityTime = invisibilityTime;
    }
    

	@Override
	public Position gameTick(Position p) 
	{
		
        ++this.ticksCount;
        if (this.visible && this.ticksCount == this.visibilityTime) {
            this.ticksCount = 0;
            this.visible = false;
        }
        else if (!this.visible && this.ticksCount == this.invisibilityTime) {
            this.ticksCount = 0;
            this.visible = true;
        }
        return this.getPosition();

	}

	@Override
	public String toString() {
		
        if (this.visible==true) 
        {
            return "" + this.typeTile;
        }
        return ".";

	}


	@Override
	public String attack(Unit unitAttacked) {
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
		// TODO Auto-generated method stub
		
	}


	

}

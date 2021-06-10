package BusinessLayer;

import java.util.Random;

public abstract class Enemy extends Unit
{
    protected boolean isPlayerInRange;
    protected int experienceValue;
    
    public Enemy(char tileType,Position position,String name,Health enemyHealth,int attackPoints,int defensePoints,int experienceValue) {
        super(tileType, position, name, enemyHealth, attackPoints, defensePoints);
        this.experienceValue = experienceValue;
    }
    
    public abstract Position gameTick(Position p);
    
    
    public int getExperienceValue() {
        return this.experienceValue;
    }
    @Override
    public String contactWith(Enemy enemy) {
        return "";
    }

    public Position randomMove()
    {
        Position move = new Position(this.getPosition().getx(), this.getPosition().gety());
        Random rand = new Random();
        int randomMovement = rand.nextInt(4);
        
        if(randomMovement==0)
        {
        	move.moveDown();
        }
        if(randomMovement==1)
        {
        	move.moveUp();
        }
        if(randomMovement==2)
        {
        	move.moveLeft();
        }
        if(randomMovement==3)
        {
        	move.moveRight();
        }
        

        return move;
    }
    public Position movement(final Position playerPosition)
    {
        Position move = new Position(this.getPosition().getx(), this.getPosition().gety());
        int dx = this.position.getx() - playerPosition.getx();
        int dy = this.position.gety() - playerPosition.gety();
        if (Math.abs(dx) > Math.abs(dy))
        {
            if (dx > 0)
            {
                move.moveLeft();
            }
            else 
            {
            	move.moveRight();
            }
        }
        else if (dy > 0) 
        {
            move.moveUp();
        }
        else 
        {
           move.moveDown(); 
        }
        return move;
    }

    


}

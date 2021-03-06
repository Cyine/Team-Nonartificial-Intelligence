package edu.cpp.cs.cs141.finalProject;
import java.io.Serializable;
public class Powerup implements Serializable
{
	private String type;
	
	/**
	 * 
	 * @param pType
	 * sets powerup type
	 */
	public  Powerup (String pType)
	{
		type=pType;
	}
	
	/**
	 * returns powerup type
	 */
	public String getType()
	{
		return type;
	}

	/**
	 * Depending on powerup type does something to player 
	 * (gives ammo/ overshield/shows where brief case is)
	 */
	public void usePowerup(Player player)
	{
		if (type=="bullet")
		{
			player.fillAmmo();
		}
		if (type=="shield")
		{
			player.fillOverShield();
		}
		if (type=="radar")
		{
			player.pickUpRadar();
		}
		type="used";
	}
}

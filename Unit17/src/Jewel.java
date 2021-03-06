import java.awt.Graphics;
import java.awt.Image;
import java.awt.List;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

/**
 * This class adds a jewel into the Alien horde that is smaller in 
 * comparison to the aliens. If the jewel is hit, all of the aliens
 * will die and the player automatically wins.
 * @author viswanathv5741
 *
 */

public class Jewel extends Alien{
	//private int speed;
	/** this is the image for the Jewel */
	private Image image;
	
	public Jewel(){
		this(400, 300, 15, 15, 1);
	}
	public Jewel(int x, int y){
		super(x,y);
	}
	public Jewel(int x, int y, int w, int h){
		super(x,y,w,h, 0);
	}
	/**
	 * 
	 * @param x position of the Jewel
	 * @param y	this is the y position of the Jewel
	 * @param w	width of Jewel
	 * @param h	height of Jewel
	 * @param s	speed the Jewel is moving at
	 * This also loads the image for the Jewel
	 */
	public Jewel(int x, int y, int w, int h, int s){
		super(x,y,w,h, s);
		try
		{
			URL url = getClass().getResource("jewel.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Didn't work LOL");
		}
	}
	
	/**
	 * Checks if the Jewel is hit by checking x and y locations of each ammo shot.
	 *  This method is called in AlienHorde and if it returns true, all of the aliens are 
	 *  removed from the horde. 
	 *  @return true if Jewel hit, else return false;
	 */
	@Override
	public boolean destroy(ArrayList<Ammo> shots){
		for (int i=0; i<shots.size(); i++){
			if (shots.get(i).getX() >= (getX()-getWidth()/2) 
					&& shots.get(i).getX() <= (getX()+getWidth()/2)
					&& shots.get(i).getY() >= (getY()-getHeight()/2)
					&& shots.get(i).getY() <= (getY()+getHeight()/2)){
				return true;
			}
		}
		return false;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return super.getSpeed();
	}

	@Override
	public void move(String direction) {
		// TODO Auto-generated method stub
		if (getX()>800 || getX()<0){
			super.setSpeed(getSpeed()*-1);
			setY(getY()+getHeight()+25);
		}
		setX(getX()+getSpeed());
	
	}

	@Override
	public void draw(Graphics window) {
		// TODO Auto-generated method stub
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}
}

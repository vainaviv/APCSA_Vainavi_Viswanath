//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Ship extends MovingThing
{
	private int speed;
	private Image image;

	public Ship()
	{
		this(20,500,50,50,2);
	}

	public Ship(int x, int y)
	{
	   //add code here
		super(x,y);
	}

	public Ship(int x, int y, int s)
	{
	   //add code here
		super(x,y);
		setSpeed(s);
	}

	public Ship(int x, int y, int w, int h, int s)
	{
		super(x, y, w, h);
		speed=s;
		try
		{
			URL url = getClass().getResource("ship.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			//feel free to do something here
			System.out.println("Didn't work LOL");
		}
	}


	public void setSpeed(int s)
	{
	   //add more code
		speed = s;
	}

	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		//add code here
		if (direction.equals("j")){
			super.setX(super.getX()+speed);
		}
		else if (direction.equals("h")){
			super.setX(super.getX()-speed);
		}
		else if (direction.equals("u")){
			super.setY(super.getY()-speed);
		}
		else if (direction.equals("n")){
			super.setY(super.getY()+speed);
		}
	}

	public void draw( Graphics window )
	{
		window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return super.toString() + " " + getSpeed();
	}
}

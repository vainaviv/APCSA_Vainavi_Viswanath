//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Ball extends Block
{
	private int xSpeed;
	private int ySpeed;

	public Ball()
	{
		super(200,200);
		xSpeed = 3;
		ySpeed = 1;
	}

	//add the other Ball constructors
	public Ball(int x, int y){
		super(x,y);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h){
		super (x,y,w,h);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color look){
		super (x,y,w,h,look);
		xSpeed = 3;
		ySpeed = 1;
	}
	public Ball(int x, int y, int w, int h, Color look, int xSpe, int ySpe){
		super (x,y,w,h,look);
		setXSpeed(xSpe);
		setYSpeed(ySpe);
	}
	public Ball (int x, int y, int w, int h, int xSpe, int ySpe){
		this(x, y, w, h);
		setXSpeed(xSpe);
		setYSpeed(ySpe);
	}
	public void setXSpeed(int xSpe){
		xSpeed = xSpe;
	}
	public void setYSpeed(int ySpe){
		ySpeed = ySpe;
	}
	
	   
   //add the set methods
   

   public void moveAndDraw(Graphics window)
   {
   	//draw a white ball at old ball location

	  draw(window, Color.white);
      setX(getX()+xSpeed);
      setY(getY() + ySpeed);
		//setY
      
      super.draw(window);
		//draw the ball at its new location
   }
   
	public boolean equals(Object obj)
	{
		Ball rhs = (Ball)obj;
		if (super.equals(rhs) && rhs.getXSpeed()==xSpeed && rhs.getYSpeed()==ySpeed){
			return true;
		}
		return false;
	}   

   //add the get methods
	public int getX(){
		return super.getX();
	}
	public int getY(){
		return super.getY();
	}
	public int getWidth(){
		return super.getWidth();
	}
	public int getHeight(){
		return super.getHeight();
	}
	public Color getColor(){
		return super.getColor();
	}
	public int getXSpeed(){
		return xSpeed;
	}
	public int getYSpeed(){
		return ySpeed;
	}

   //add a toString() method
	public String toString(){
		return "X Position: " + getX() + " Y Position: " + getY() + " Width: " + getWidth() + 
				" Height: " + getHeight() + " Color: " + getColor() + " X Speed: " + getXSpeed() + " Y Speed: " + getYSpeed(); 
	}
}
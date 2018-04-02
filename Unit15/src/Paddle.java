//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
		super(10,10);
		speed =5;
   }
   public Paddle(int x, int y){
	   super.setX(x);
	   super.setY(y);
   }
   public Paddle(int x, int y, int vel){
	   super.setX(x);
	   super.setY(y);
	   setSpeed(vel);
   }
   public Paddle(int x, int y, int w, int h, int vel){
	   this(x,y,vel);
	   super.setWidth(w);
	   super.setHeight(h);
   }
   public Paddle(int x, int y, int w, int h, Color col, int vel){
	   this(x,y,w,h,vel);
	   super.setColor(col);
   }
   
   public void setSpeed(int vel){
	   speed = vel;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   super.setY(getY() + speed);
	   super.draw(window);
	   
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, Color.white);
	   super.setY(getY() - speed);
	   super.draw(window);
   }

   //add get methods
   public int getX(){
	   return super.getX();
   }
   public int getY(){
	   return super.getY();
   }
   public Color getColor(){
	   return super.getColor();
   }
   public int getWidth(){
	   return super.getWidth();
   }
   public int getHeight(){
	   return super.getHeight();
   }
   public int getSpeed(){
	   return speed;
   }
   
   //add a toString() method
   public String toString(){
	   return "X Position: " + getX() + " Y Position: " + getY() + " Width: " + getWidth() +
			   " Height: " + getHeight() + " Color: " + getColor() + " Speed: " + getSpeed();
   }
}
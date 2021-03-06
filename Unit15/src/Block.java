//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;

public class Block implements Locatable
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	private Color color;

	public Block()
	{
		xPos = 0;
		yPos = 0;
		width = 0;
		height = 0;
		color = Color.BLACK;
	}
	public Block(int x, int y){
		setX(x);
		setY(y);
	}

	//add other Block constructors - x , y , width, height, color
	public Block (int x, int y, int w, int h){
		setX(x);
		setY(y);
		setWidth(w);
		setHeight(h);
	}
	
	public Block(int x,int y,int w,int h,Color look){
		setColor(look);
		setPos(x,y);
		setWidth(w);
		setHeight(h);
	}
	
   //add the other set methods
   public void setColor(Color col)
   {
	   color = col;
   }
   @Override
	public void setPos(int x, int y) {
		// TODO Auto-generated method stub
		xPos = x;
		yPos = y;
		
	}   
   public void setX(int x){
	   xPos = x;
   }
   public void setY(int y){
	   yPos = y;
   }
   public void setWidth(int w){
	   width = w;
   }
   public void setHeight(int h){
	   height = h;
   }
   
   public Color getColor(){
	   return color;
   }
   public int getX(){
	   return xPos;
   }
   public int getY(){
	   return yPos;
   }
   public int getWidth(){
	   return width;
   }
   public int getHeight(){
	   return height;
   }

   public void draw(Graphics window)
   {
      window.setColor(color);
      window.fillRect(getX(), getY(), getWidth(), getHeight());
   }

   public void draw(Graphics window, Color col)
   {
	   window.setColor(col);
	   window.fillRect(getX(), getY(), getWidth(), getHeight());
   }
   
	public boolean equals(Object obj)
	{
		Block rhs = (Block)obj;
		if (rhs.getHeight() == height && rhs.getWidth()==width && rhs.getX()==xPos && rhs.getY()==yPos && rhs.getColor()==color){
			return true;
		}
		return false;
	}


   //add the other get methods
    

   //add a toString() method  - x , y , width, height, color
	public String toString(){
		String output = "";
		
		output = "x: " + xPos + ". y: " + yPos + ". Width: " + width + ". Height: " + height + ". Color: " + color;
		return output;
	}
}
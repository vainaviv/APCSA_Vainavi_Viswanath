//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall
{
	BlinkyBall ball;
   //instance variables

   public SpeedUpBall()
   {
	   super();
   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);
   }


   public SpeedUpBall(int x, int y, int xSpd, int ySpd)
   {
	   super(x,y,xSpd,ySpd);
   }

   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);
   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,col,xSpd,ySpd);
   }
   public void setXSpeed( int xSpd )
   {
	   if (xSpd > 0){
		   xSpd++;
	   }
	   else{
		   xSpd --;
	   }
	   super.setXSpeed(xSpd);
   }
   public void setYSpeed(int ySpd)
   {
	   if (ySpd > 0){
		   ySpd++;
	   }
	   else {
		   ySpd--;
	   }
	  super.setYSpeed(ySpd);
   }
}


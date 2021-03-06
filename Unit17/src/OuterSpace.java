//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class OuterSpace extends Canvas implements KeyListener, Runnable
{
	private Ship ship;
	//private Alien alienOne;
	//private Alien alienTwo;
	private Ammo ammo;

    private AlienHorde horde;
    private Bullets shots;

	private boolean[] keys;
	private BufferedImage back;

	private int cooldown = 0;
	
	public OuterSpace()
	{
		setBackground(Color.black);

		keys = new boolean[5];

		//instantiate other instance variables
		//Ship, Alien
		ship = new Ship();
		//alienOne = new Alien(400,50,30,30,0);
		//alienTwo = new Alien(430,50,30,30,0);
		//ammo = new Ammo();
		horde = new AlienHorde(17);
		shots = new Bullets();
		
		
		ammo = new Ammo(ship.getX()+ship.getWidth()/2, ship.getY(), 2);		
		shots.add(ammo);
		

		this.addKeyListener(this);
		new Thread(this).start();

		setVisible(true);
	}

   public void update(Graphics window)
   {
	   paint(window);
   }

	public void paint( Graphics window )
	{
		//set up the double buffering to make the game animation nice and smooth
		Graphics2D twoDGraph = (Graphics2D)window;

		//take a snap shop of the current screen and same it as an image
		//that is the exact same width and height as the current screen
		if(back==null)
		   back = (BufferedImage)(createImage(getWidth(),getHeight()));

		//create a graphics reference to the back ground image
		//we will draw all changes on the background image
		Graphics graphToBack = back.createGraphics();

		graphToBack.setColor(Color.BLACK);
		graphToBack.fillRect(0,0,800,600);
		graphToBack.setColor(Color.BLUE);
		graphToBack.drawString("StarFighter ", 25, 50 );
		twoDGraph.drawImage(back, null, 0, 0);
		ship.draw(window);
		horde.drawEmAll(window);
		horde.moveEmAll();
		//alienOne.draw(window);
		//alienTwo.draw(window);
		//ammo.draw(window);
		//ammo.move("UP");
		
		for (int i=0; i<shots.getList().size(); i++){
			shots.getList().get(i).draw(window);
			shots.getList().get(i).move("UP");
		}
		
		horde.drawEmAll(window);
		horde.moveEmAll();

		if(keys[0] == true)
		{
			ship.move("h");
		}
		else if (keys[1] == true){
			ship.move("j");
		}
		else if (keys[2] == true){
			ship.move("u");
		}
		else if (keys[3] == true){
			ship.move("n");
		}
		else if (keys[4] == true){
			if (cooldown <= 0) {
				shots.add(new Ammo(ship.getX()+ship.getWidth()/2, ship.getY(), 2));
				cooldown = 100;
			}
			//shots.getList().get(index).move("UP");
		}
		
		cooldown--;

		//add code to move Ship, Alien, etc.
		//alienOne.move("RIGHT");
		//alienTwo.move("RIGHT");
		//alienOne.move("LEFT");
		//alienTwo.move("LEFT");
		//alienOne.move("DOWN");
		//alienTwo.move("DOWN");


		//add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
		/*if ((ammo.getX() >= (alienOne.getX()-alienOne.getWidth()/2) &&
				ammo.getX() <= (alienOne.getX()+alienOne.getWidth()/2))
				&& (ammo.getY() >= (alienOne.getY()-alienOne.getHeight()/2) &&
				ammo.getY() <= (alienOne.getY()+alienOne.getHeight()/2))){
			alienOne.setHeight(0);
			alienOne.setWidth(0);
			alienOne.draw(window);
		}
		else if ((ammo.getX() >= (alienTwo.getX()-alienTwo.getWidth()/2) &&
				ammo.getX() <= (alienTwo.getX()+alienTwo.getWidth()/2))
				&& (ammo.getY() >= (alienTwo.getY()-alienTwo.getHeight()/2) && 
				ammo.getY() <= (alienTwo.getY()+alienTwo.getHeight()/2))){
			alienTwo.setHeight(0);
			alienTwo.setWidth(0);
			alienTwo.draw(window);
		}*/
		
		horde.removeDeadOnes(shots.getList());
		horde.drawEmAll(window);
	}


	public void keyPressed(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = true;
		}
		repaint();
	}

	public void keyReleased(KeyEvent e)
	{
		if (e.getKeyCode() == KeyEvent.VK_LEFT)
		{
			keys[0] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT)
		{
			keys[1] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_UP)
		{
			keys[2] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_DOWN)
		{
			keys[3] = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_SPACE)
		{
			keys[4] = false;
		}
		repaint();
	}

	public void keyTyped(KeyEvent e)
	{
      //no code needed here
	}

   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(5);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}
}


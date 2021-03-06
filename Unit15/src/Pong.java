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

public class Pong extends Canvas implements KeyListener, Runnable
{
	private SpeedUpBall ball;
	private Paddle paddle;
	private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	//private Integer right_points, left_points;


	public Pong()
	{
		//set up all variables related to the game
		ball = new SpeedUpBall(50,50,10,10,Color.BLUE, 2, 0);
		paddle = new Paddle (200, 200, 40, 40, Color.RED, 4);
		//rightPaddle = new Paddle(760, 200, 20, 50, Color.GREEN, 4);
		//right_points = 0;
		//left_points = 0;

		keys = new boolean[4];

    
    	setBackground(Color.WHITE);
		setVisible(true);
		
		new Thread(this).start();
		addKeyListener(this);		//starts the key thread to log key strokes
	}
	
   public void update(Graphics window){
	   paint(window);
   }

   public void paint(Graphics window)
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


		ball.moveAndDraw(graphToBack);
		paddle.draw(graphToBack);
		rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.BLACK);
		//graphToBack.drawString("Right points: " + right_points, 275, 50);
		//graphToBack.drawString("Left Points: " + left_points, 275, 70);

		//see if the ball hits the left paddle
		/*if (ball.getX()-ball.getWidth() <= leftPaddle.getX()+Math.abs(ball.getXSpeed()) 
		&& ball.getY()>= leftPaddle.getY() && 
		ball.getY() <= leftPaddle.getY() + leftPaddle.getHeight()){
			ball.setXSpeed(-ball.getXSpeed());
		}*/
				
		//see if the ball hits the blocks
		if (ball.getX()+ball.getWidth() >= rightPaddle.getX()+Math.abs(ball.getXSpeed()) 
		&& ball.getY() >= rightPaddle.getY() && 
		ball.getY() <= rightPaddle.getY() + leftPaddle.getHeight()){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if ball hits left wall or right wall
		/*if(!(ball.getX()>=10 && ball.getX()<=780))
		{
			ball.setXSpeed(0);
			ball.setYSpeed(0);
			ball.draw(graphToBack,Color.WHITE);

			if (ball.getX()<40){
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Right points: " + right_points, 275, 50);
				right_points ++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Right points: " + right_points, 275, 50);
				
			}
			else if (ball.getX() > 720){
				graphToBack.setColor(Color.WHITE);
				graphToBack.drawString("Left Points: " + left_points, 275, 70);
				left_points ++;
				graphToBack.setColor(Color.BLACK);
				graphToBack.drawString("Left Points: " + left_points, 275, 70);
			}
			ball.setX(400);
			ball.setY(250);
			ball.draw(graphToBack, Color.BLUE);
			ball.setXSpeed(3);
			ball.setYSpeed(1);
		}*/

		//see if the ball hits the top or bottom wall 
		if (!(ball.getY()>=20 && ball.getY()<=450)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		// see if ball hits the left or right wall
		if (!(ball.getX()>=10 && ball.getX()<=780)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveUpAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			rightPaddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			rightPaddle.moveUpAndDraw(graphToBack);
		}



		
		twoDGraph.drawImage(back, null, 0, 0);
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
		repaint();
	}

	public void keyTyped(KeyEvent e){}
	
   public void run()
   {
   	try
   	{
   		while(true)
   		{
   		   Thread.currentThread().sleep(8);
            repaint();
         }
      }catch(Exception e)
      {
      }
  	}

}
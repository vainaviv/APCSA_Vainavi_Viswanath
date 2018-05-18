//© A+ Computer Science  -  www.apluscompsci.com
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
import java.util.ArrayList;
import java.awt.event.ActionListener;

public class Pong extends Canvas implements KeyListener, Runnable
{
	private BlinkyBall ball;
	private Paddle paddle;
	//private Paddle rightPaddle;
	private boolean[] keys;
	private BufferedImage back;
	private ArrayList<Tile> allTiles;
	//private Integer right_points, left_points;


	public Pong()
	{
		//set up all variables related to the game
		ball = new BlinkyBall(400,400,10,10,Color.BLUE, 2, 1);
		paddle = new Paddle (400, 200, 40, 40, Color.GRAY, 4);
		//rightPaddle = new Paddle(760, 200, 20, 50, Color.GREEN, 4);
		//right_points = 0;
		//left_points = 0;
		ArrayList<Tile >top = new ArrayList<Tile>();
		ArrayList<Tile> bottom = new ArrayList<Tile>();
		ArrayList<Tile> left = new ArrayList<Tile>();
		ArrayList<Tile> right = new ArrayList<Tile>();
		
		for (int i=0; i<750; i+=85){
			top.add(new Tile(i,10,80,20,Color.CYAN));
			top.add(new Tile(i,40,80,20,Color.CYAN));
			bottom.add(new Tile(i, 505,80,20,Color.CYAN));
			bottom.add(new Tile (i, 535, 80,20,Color.CYAN));
		}
		
		for (int i=70; i<400; i+=85){
			left.add(new Tile(10,i,20,80,Color.CYAN));
			left.add(new Tile(40,i,20,80,Color.CYAN));
			right.add(new Tile(755,i,20,80,Color.CYAN));
			right.add(new Tile(725, i,20,80,Color.CYAN));
		}
		
		allTiles = new ArrayList<Tile>();
		for (int i=0; i<top.size();i++){
			allTiles.add(top.get(i));
		}
		for (int i=0; i<bottom.size();i++){
			allTiles.add(bottom.get(i));
		}
		for (int i=0; i<left.size(); i++){
			allTiles.add(left.get(i));
		}
		for (int i=0; i<right.size();i++){
			allTiles.add(right.get(i));
		}
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
		for (Tile x: allTiles){
			x.draw(graphToBack);
		}
		//rightPaddle.draw(graphToBack);
		graphToBack.setColor(Color.BLACK);
		//graphToBack.drawString("Right points: " + right_points, 275, 50);
		//graphToBack.drawString("Left Points: " + left_points, 275, 70);

		//see if the ball hits the left side of the paddle
		if (((ball.getX() <= paddle.getX() + paddle.getWidth() + Math.abs(ball.getXSpeed()))
				&& ball.getX() > paddle.getX() -3)
				&& (ball.getY() >= paddle.getY() && ball.getY() <= paddle.getY() + paddle.getHeight())){
			if (ball.getX() <= paddle.getX() + paddle.getWidth() - Math.abs(ball.getXSpeed())){
				ball.setYSpeed(-ball.getYSpeed());
				System.out.println("hit left side of paddle");
			}
			else {
				ball.setXSpeed(-ball.getXSpeed());
			}
		}
		
		// see if ball hits the right side of the paddle
		if (((ball.getX() + ball.getWidth() >= paddle.getX() - Math.abs(ball.getXSpeed())) &&
				ball.getX() < paddle.getX() +3) &&
				(ball.getY() > paddle.getY() && ball.getY() <= paddle.getY() + paddle.getHeight())){
					if (ball.getX() >= paddle.getX() + Math.abs(ball.getXSpeed())){
						ball.setYSpeed(-ball.getYSpeed());
						System.out.println("hit right side of paddle");
					}
					else {
						ball.setXSpeed(-ball.getXSpeed());
					}
				}
				
		//see if the ball hits the blocks
		for (int i=0; i<allTiles.size();i++){
			if (ball.getX() <= allTiles.get(i).getX() + allTiles.get(i).getWidth() - ball.getXSpeed()
					&& ball.getX() >= allTiles.get(i).getX() + allTiles.get(i).getWidth() + ball.getXSpeed() - 5 
					&& ball.getY() + ball.getHeight() >= allTiles.get(i).getY() && ball.getY() <= allTiles.get(i).getY() + allTiles.get(i).getHeight()
					&& ball.getXSpeed() < 0){
				allTiles.get(i).setColor(Color.WHITE);
				allTiles.get(i).draw(graphToBack);
				allTiles.remove(i);
				ball.setXSpeed(-ball.getXSpeed());
				//repaint();
				i--;
			}
			else if (ball.getX()+ball.getWidth() >= allTiles.get(i).getX() - ball.getXSpeed() &&
					ball.getX() + ball.getWidth() <= allTiles.get(i).getX() + ball.getXSpeed() + 5
			&& ball.getY() + ball.getHeight() >= allTiles.get(i).getY() && ball.getY() <= allTiles.get(i).getY() + allTiles.get(i).getHeight()
			&& ball.getXSpeed() > 0){
				allTiles.get(i).setColor(Color.WHITE);
				allTiles.get(i).draw(graphToBack);
				allTiles.remove(i);
				ball.setXSpeed(-ball.getXSpeed());
				//repaint();
				i--;
			}
			else if (ball.getY() <= allTiles.get(i).getY() + allTiles.get(i).getHeight() -ball.getYSpeed() && ball.getY() >= allTiles.get(i).getY() + ball.getYSpeed()
			&& ball.getX() >= allTiles.get(i).getX() && ball.getX() + ball.getWidth() <= allTiles.get(i).getX() + allTiles.get(i).getWidth() && ball.getYSpeed()<0){
				allTiles.get(i).setColor(Color.WHITE);
				allTiles.get(i).draw(graphToBack);
				allTiles.remove(i);
				ball.setYSpeed(-ball.getYSpeed());
				//repaint();
				i--;
			}
			else if (ball.getY() + ball.getHeight() >= allTiles.get(i).getY() - ball.getYSpeed()
			&& ball.getY() + ball.getHeight() <= allTiles.get(i).getY() + ball.getYSpeed() + 5 && ball.getX() >= allTiles.get(i).getX() && ball.getX() + ball.getWidth() <= allTiles.get(i).getX() + allTiles.get(i).getWidth()
			&& ball.getYSpeed() > 0){
				allTiles.get(i).setColor(Color.WHITE);
				allTiles.get(i).draw(graphToBack);
				allTiles.remove(i);
				ball.setYSpeed(-ball.getYSpeed());
				//repaint();
				i--;
			}
			if (allTiles.size() == 0){
				ArrayList<Tile >top = new ArrayList<Tile>();
				ArrayList<Tile> bottom = new ArrayList<Tile>();
				ArrayList<Tile> left = new ArrayList<Tile>();
				ArrayList<Tile> right = new ArrayList<Tile>();
				
				for (int i1=0; i1<750; i1+=85){
					top.add(new Tile(i1,10,80,20,Color.CYAN));
					top.add(new Tile(i1,40,80,20,Color.CYAN));
					bottom.add(new Tile(i1, 505,80,20,Color.CYAN));
					bottom.add(new Tile (i1, 535, 80,20,Color.CYAN));
				}
				
				for (int i1=70; i1<400; i1+=85){
					left.add(new Tile(10,i1,20,80,Color.CYAN));
					left.add(new Tile(40,i1,20,80,Color.CYAN));
					right.add(new Tile(755,i1,20,80,Color.CYAN));
					right.add(new Tile(725, i1,20,80,Color.CYAN));
				}
				
				allTiles = new ArrayList<Tile>();
				for (int i1=0; i1<top.size();i1++){
					allTiles.add(top.get(i1));
				}
				for (int i1=0; i1<bottom.size();i1++){
					allTiles.add(bottom.get(i1));
				}
				for (int i1=0; i1<left.size(); i1++){
					allTiles.add(left.get(i1));
				}
				for (int i1=0; i1<right.size();i1++){
					allTiles.add(right.get(i1));
				}
			}
		}

		//see if the ball hits the top or bottom wall 
		if (!(ball.getY()>=10 && ball.getY()<=550)){
			ball.setYSpeed(-ball.getYSpeed());
		}
		
		//see if the ball hits the left or right wall
		if (!(ball.getX()>=10 && ball.getX()<=780)){
			ball.setXSpeed(-ball.getXSpeed());
		}
		
		//see if the paddles need to be moved
		if(keys[0] == true)
		{
			//move left paddle up and draw it on the window
			paddle.moveLeftAndDraw(graphToBack);
		}
		if(keys[1] == true)
		{
			//move left paddle down and draw it on the window
			paddle.moveRightAndDraw(graphToBack);

		}
		if(keys[2] == true)
		{
			paddle.moveDownAndDraw(graphToBack);
		}
		if(keys[3] == true)
		{
			paddle.moveUpAndDraw(graphToBack);
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
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class AlienHorde
{
	private List<Alien> aliens;

	public AlienHorde(int size)
	{
		aliens = new ArrayList<Alien>();
		for (int i=0; i<size; i++){
			Alien alien = new Alien(i*50, 70, 40, 40, 1);
			//System.out.println(i);
			add(alien); 
		}
		int pos = (int) (Math.random()*aliens.size());
		System.out.println(pos);
		aliens.add(pos, new Jewel(pos*50,75,15,15,1));
		aliens.remove(pos+1);
	}

	public void add(Alien al)
	{
		aliens.add(al);
	}

	public void drawEmAll(Graphics window)
	{
		for (int i=0; i<aliens.size(); i++){
			aliens.get(i).draw(window);
		}
	}

	public void moveEmAll()
	{
		for (int i=0; i<aliens.size(); i++){
			aliens.get(i).move("RIGHT");
		}
	}

	public void removeDeadOnes(ArrayList<Ammo> shots)
	{
		for (int i=0; i<shots.size(); i++){
			for (int j=0; j<aliens.size(); j++){
				if ((shots.get(i).getX() >= (aliens.get(j).getX()-aliens.get(j).getWidth()/2) &&
						shots.get(i).getX() <= (aliens.get(j).getX()+aliens.get(j).getWidth()/2))
						&& (shots.get(i).getY() >= (aliens.get(j).getY()-aliens.get(j).getHeight()/2) &&
						shots.get(i).getY() <= (aliens.get(j).getY()+aliens.get(j).getHeight()/2))){
					if (aliens.get(j).destroy(shots)){
						for (int x=0; x<aliens.size(); x++){
							aliens.remove(x);
							x--;
						}
					}
					else {
						aliens.remove(j);
					}
				}
			}
		}
	}

	public String toString()
	{
		return "";
	}
}

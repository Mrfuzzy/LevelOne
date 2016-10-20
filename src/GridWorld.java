import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class GridWorld {
public static void main(String[] args) throws InterruptedException {
	World world = new World();
	world.show();
	Location bug1L = new Location(5, 5);
	Bug bug1 = new Bug(Color.CYAN);
	Location flower1l = new Location(4, 5);
	Flower flower1 = new Flower(Color.GREEN);
	world.add(bug1L, bug1);
	world.add(flower1l, flower1);
	for (int i = 0; i < 20; i++) {
		int randomx = new Random().nextInt(10);
		int randomy = new Random().nextInt(10);
		Location bug2l = new Location(randomx, randomy);
		Location flower2l = new Location(randomx, randomy);
		int r = new Random().nextInt(255);
		int g = new Random().nextInt(255);
		int b = new Random().nextInt(255);
		Bug bug2 = new Bug(new Color(r, g, b));
		Flower flower2 = new Flower(new Color(r,g,b));
		world.add(bug2l, bug2);
		world.add(flower2l, flower2);
		Thread.sleep(2000);
		world.show();
	}
}
}

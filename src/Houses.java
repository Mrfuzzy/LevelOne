import java.awt.Color;

import org.teachingextensions.logo.Tortoise;

public class Houses {
public static void main(String[] args) {
	Tortoise.getBackgroundWindow().setBackground(Color.BLACK);
	Tortoise.setSpeed(10);
	Tortoise.setY(430);
	Tortoise.setX(10);
	Tortoise.show();
	BuildHouse("small", Color.BLUE);
	BuildHouse("medium", Color.CYAN);
	BuildHouse("small", Color.GREEN);
	BuildHouse("small", Color.DARK_GRAY);
	BuildHouse("big", Color.LIGHT_GRAY);
	BuildHouse("medium", Color.MAGENTA);
	BuildHouse("medium", Color.ORANGE);
	BuildHouse("small", Color.PINK);
	BuildHouse("big", Color.WHITE);
	BuildHouse("big", Color.YELLOW);
	
	

}

private static void BuildHouse(String size, Color color) {
	int hight = 0;
	if (size.equalsIgnoreCase("small")) {
		hight = 60;
		
	}
	if (size.equalsIgnoreCase("medium")) {
		hight = 120;
	}
	if (size.equalsIgnoreCase("big")) {
		hight = 250;
	}
	
	Tortoise.setPenColor(color);
	Tortoise.move(hight);
	if (size.equals("big")) {
		
		DrawFlatRoof();
	}
	else {
		DrawPointyRoof();
	}
	
	Tortoise.move(hight);
	Tortoise.turn(270);
	Tortoise.setPenColor(Color.green);
	Tortoise.move(30);
	Tortoise.turn(270);
}

private static void DrawPointyRoof() {
	Tortoise.turn(40);
	Tortoise.move(25);
	Tortoise.turn(100);
	Tortoise.move(25);
	Tortoise.turn(40);
}
private static void DrawFlatRoof() {
	Tortoise.turn(90);
	Tortoise.move(25);
	Tortoise.turn(90);
}
}

package edu.smith.cs.csc212.aquarium;

import java.awt.Color;
import java.awt.Graphics2D;

public class Fish {
	//every fish has a color that is a color
	Color color;
	// every fish has a position (x,y) that are integers
	int x;
	int y;
	boolean isLittle;
	
	public Fish(Color c, int starX, int starY) {
		this.color= color;
		this.x = starX;
		this.y = starY;
		this.isLittle = isLittle;
	}
	public void draw(Graphics2D g) {
		if (this.isLittle) {
		DrawFish.smallFacingLeft(g,this.color, this.x, this.y);
		}else {
			DrawFish.facingleft(g,this.color,this.x, this.y);
		
		}
		this.swim();
		}
	}
	public void swim() {
		this.x += 1;
		this.y +=1;
	}
}

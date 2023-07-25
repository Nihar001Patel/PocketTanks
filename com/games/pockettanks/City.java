package com.games.pockettanks;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Rectangle;

public class City {

	Block[] blocks;

	public City() {
		blocks = new Block[5];
	}

	public void drawCity(Graphics g, Component c) {

		g.drawLine(0, 450, c.getWidth(), 450);

		blocks[0] = new Block(450, 300, 75, 150, "/resources/buildings/building1.png");
		blocks[0].draw(g, c);

		blocks[1] = new Block(520, 300, 75, 150, "/resources/buildings/building2.png");
		blocks[1].draw(g, c);
	
		blocks[2] = new Block(590, 300, 75, 150, "/resources/buildings/building3.png");
		blocks[2].draw(g, c);

		blocks[3] = new Block(735, 350, 50, 100, "/resources/buildings/building4.png");
		blocks[3].draw(g, c);

		blocks[4] = new Block(650, 350, 75, 100, "/resources/buildings/building5.png");
		blocks[4].draw(g, c);

	}

	public boolean collide(int x, int y) {

		Rectangle bomb = new Rectangle(x, y, 10, 10);

		for (Block block : blocks) {
			if (block.rectangle.intersects(bomb)) {
				return true;
			}
		}

		return false;
	}
}

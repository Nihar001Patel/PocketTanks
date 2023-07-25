package com.games.pockettanks;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class StartPage extends JPanel {

	private static final long serialVersionUID = 1L;
	Image background;
	Font fontHeadLine = new Font("monospace", Font.BOLD, 30);
	
	Font font = new Font("monospace", Font.BOLD, 15);
	

	public StartPage() {
		setLayout(null);
		
		try {
			background = ImageIO.read(Main.class.getResource("/resources/backgrounds/citysky.jpeg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(fontHeadLine);
		g.drawImage(background, 0, 0, this.getWidth(), this.getHeight(), null);
		g.drawString("POCKET TANKS", 200, 50);
		g.setFont(font);
		g.drawString("Instructions", 200, 100);
		g.drawString("1. Two player game. Each side has a tank and you have to destroy other tank.", 200, 150);
		g.drawString("2. Choose angle, position and speed and target the opposite tank.", 200, 200);
		g.drawString("3. Destroy the oppsite tank and win the game.",200, 250);
	}
}

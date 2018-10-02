package com.nekisse.java.chick;
import java.awt.Frame;
import java.awt.Graphics;


public class MyFrame extends Frame{
	
	public static final int FRAME_WIDTH=500;
	public static final int FRAME_HEIGHT=400;

	private ChickManager mgr=ChickManager.getInstance();
	
	public MyFrame(){
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(true);
	}
	

	@Override
	public void paint(Graphics g) {
		
		if(mgr!=null){
			mgr.displayAllChicks(g); //모양출력
			mgr.displayPpick(g); //소리 기능
			mgr.displayFly(g); // 나는 기능
		}
	}
	
};

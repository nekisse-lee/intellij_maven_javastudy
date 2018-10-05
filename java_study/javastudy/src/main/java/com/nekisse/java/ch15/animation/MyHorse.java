package com.nekisse.java.ch15.animation;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;


public class MyHorse extends Canvas implements Runnable {
	public static final int HORSE_SIZE=30;	// ����(���ָ�)�� ������
	
	private int x;
	private int speed;
	
	private static int count=0;
	private final int num;
	
	public MyHorse() {
		x=10;			// 기본위치
		speed=1;
		num=++count;		// 객체 생성 번호
	}

	@Override
	public void paint(Graphics g) {
		g.setColor(Color.RED);
		// 동그라미보다 1픽셀 위에 자신의 번호를 문자열로 변환 후 출력
		g.drawString(num+"", x, this.getHeight()/2-(HORSE_SIZE/2)-1);
		// 주어진 패널의 한가운데 위치에 출력
		g.fillOval(x, this.getHeight()/2-(HORSE_SIZE/2), 
					HORSE_SIZE, HORSE_SIZE);
	}

	@Override
	public void run() {
		while(true) {
			if(x<MyFrame.FRAME_WIDTH-50) {
				// 5~9 사이의 이동 값을 랜덤하게 추출
				speed=(int)(Math.random()*5)+5;
				x=x+speed;
				repaint();		// 변경된 내용으로 화면 갱신
				try {
					// 0.5초 단위로 화면 갱신
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {	// 탈출 조건
				break;
			}
		} // while
	}
};

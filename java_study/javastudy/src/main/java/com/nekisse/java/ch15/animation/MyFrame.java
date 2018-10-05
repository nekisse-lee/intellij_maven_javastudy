package com.nekisse.java.ch15.animation;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyFrame extends Frame{
	public static final int FRAME_WIDTH=500;
	public static final int FRAME_HEIGHT=400;
	
	public static final int HORSE_SIZE=5;
	
	MyHorse[] arr=new MyHorse[HORSE_SIZE];
	Button btn_start=new Button("게임시작");
	
	public MyFrame(){

		//윈도우 종료 이벤트 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});		

		setVisible(true);
		setSize(FRAME_WIDTH,FRAME_HEIGHT);
		makeHourse();
		makeUi();
	}
	
	private void makeHourse(){
		for(int i=0;i<HORSE_SIZE;i++){
			arr[i]=new MyHorse();
		}
	}
	
	private void startHorse(){
		for(int i=0;i<arr.length;i++){
			new Thread(arr[i]).start();
		}
	}
	
	private void makeUi(){
		//상단배치
		Panel pNorth=new Panel();
		
		btn_start.addActionListener(new MyHandler());
		pNorth.add(btn_start);


		//중앙배치
		Panel pCenter=new Panel();
		pCenter.setLayout(new GridLayout(HORSE_SIZE,1));
		
		for(MyHorse temp:arr){
			pCenter.add(temp);
		}
		
		this.add("North",pNorth);
		this.add(pCenter);
	}
	
	//----------------------------------------------
	class MyHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==btn_start){
				startHorse();
			}
		}
		
	}//MyHandler

};

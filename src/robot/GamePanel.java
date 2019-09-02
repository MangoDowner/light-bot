package robot;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements Constants{
	JButton ButGo,ButReset,ButForw,ButLeft,ButRight,ButJump,ButLight,ButFun1,ButFun2,ButCur;
	JLabel LabTotalCom,LabMainMeth,LabFun1,LabFun2;
	
	JButton ButPrev,ButNext;
	
	JLabel LabMAIN[],LabFUN1[],LabFUN2[];
	
//	JLabel LabRobot;//JLabel方法不能实现图像的覆盖
	TDFake Fake;//定义一个TDFake对象
	
	Image up,down,left,right;
	Image up_light,down_light,left_light,right_light;
	
	int MAINorder[],FUN1order[],FUN2order[];//各区的指令
	int MAINnum,FUN1num,FUN2num;//当前各区指令数
	int MAINstep,FUN1step,FUN2step;//当前各区执行指令数字
	int CurFunct;//当前处于函数,1:主函数,2：函数1,3:函数2
	int PreFunct;//之前的函数
	
	int CurStage;//当前关卡，初始为第一关
	int ScreenID;//初始为欢迎界面
	
	public GamePanel(){
		setBounds(0,0,CLIENT_WIDTH,CLIENT_HEIGHT);
		this.setLayout(null);
		setBackground(Color.gray);
		
		MAINorder=new int[12];
		FUN1order=new int[8];
		FUN2order=new int[8];
		MAINnum=0;
		FUN1num=0;
		FUN2num=0;
		MAINstep=0;
		FUN1step=1;
		FUN2step=2;
		CurFunct=1;
		PreFunct=2;
		
		CurStage=1;//当前关卡
		
		ScreenID=0;
		
		
		up = Toolkit.getDefaultToolkit().getImage("images/up_30_60.gif");  
		down = Toolkit.getDefaultToolkit().getImage("images/down_30_60.gif");  
		left = Toolkit.getDefaultToolkit().getImage("images/left_30_60.gif");  
		right = Toolkit.getDefaultToolkit().getImage("images/right_30_60.gif");   
		
		up_light = Toolkit.getDefaultToolkit().getImage("images/up_light_30_60.gif");  
		down_light = Toolkit.getDefaultToolkit().getImage("images/down_light_30_60.gif");  
		left_light = Toolkit.getDefaultToolkit().getImage("images/left_light_30_60.gif");  
		right_light = Toolkit.getDefaultToolkit().getImage("images/right_light_30_60.gif");  
		
		ButGo=new JButton();
		ButReset=new JButton();
		ButForw=new JButton();
		ButLeft=new JButton();
		ButRight=new JButton();
		ButJump=new JButton();
		ButLight=new JButton();
		ButFun1=new JButton();
		ButFun2=new JButton();
		ButCur=new JButton();
	
		ButPrev=new JButton();
		ButNext=new JButton();
		
		LabTotalCom=new JLabel();
		LabMainMeth=new JLabel();
		LabFun1=new JLabel();
		LabFun2=new JLabel();
		

		LabMAIN=new JLabel[12];
		LabFUN1=new JLabel[8];
		LabFUN2=new JLabel[8];
	
		for(int i=0;i<=11;i++)
		{
			LabMAIN[i]=new JLabel();
			LabMAIN[i].setIcon(new ImageIcon(""));
			LabMAIN[i].setBounds(503+36*(i%4),111+36*(i/4),28,28);
			this.add(LabMAIN[i]);
		}
		
		for(int i=0;i<=7;i++)
		{
			LabFUN1[i]=new JLabel();
			LabFUN2[i]=new JLabel();
			LabFUN1[i].setIcon(new ImageIcon(""));
			LabFUN2[i].setIcon(new ImageIcon(""));
			LabFUN1[i].setBounds(503+36*(i%4),231+36*(i/4),28,28);
			LabFUN2[i].setBounds(503+36*(i%4),315+36*(i/4),28,28);
			this.add(LabFUN1[i]);
			this.add(LabFUN2[i]);
		}
		//指令按钮
		ButGo.setBounds(400, 380, 52, 28);//大两像素,显示黑色边框
		ButGo.setIcon(new ImageIcon("images/go_50_26.gif"));
		ButReset.setBounds(5, 380, 52, 28);
		ButReset.setIcon(new ImageIcon("images/reset_50_26.gif"));
		ButForw.setBounds(395, 68, 32, 32);
		ButForw.setIcon(new ImageIcon("images/forw_frame_30_30.gif"));
		ButLeft.setBounds(431, 68, 32, 32);
		ButLeft.setIcon(new ImageIcon("images/left_frame_30_30.gif"));
		ButRight.setBounds(467, 68, 32, 32);
		ButRight.setIcon(new ImageIcon("images/right_frame_30_30.gif"));
		ButJump.setBounds(503, 68, 32, 32);
		ButJump.setIcon(new ImageIcon("images/jump_frame_30_30.gif"));
		ButLight.setBounds(539, 68, 32, 32);
		ButLight.setIcon(new ImageIcon("images/light_frame_30_30.gif"));
		ButFun1.setBounds(575, 68, 32, 32);
		ButFun1.setIcon(new ImageIcon("images/fun1_frame_30_30.gif"));
		ButFun2.setBounds(611, 68, 32, 32);
		ButFun2.setIcon(new ImageIcon("images/fun2_frame_30_30.gif"));
		ButCur.setBounds(450, 110, 20, 20);
		ButCur.setIcon(new ImageIcon("images/curfunct_20_20.gif"));
		
		ButPrev.setBounds(50, 270, 22, 22);
		ButPrev.setIcon(new ImageIcon("images/prev_20_20.gif"));
		ButNext.setBounds(50,300,22,22);
		ButNext.setIcon(new ImageIcon("images/next_20_20.gif"));
		
		//指示文字
		LabTotalCom.setBounds(480,390,117,10);
		LabTotalCom.setIcon(new ImageIcon("images/TotalCommands_117_10.gif"));
		LabMainMeth.setBounds(480, 110, 14, 102);
		LabMainMeth.setIcon(new ImageIcon("images/MainMethod_14_102.gif"));
		LabFun1.setBounds(480, 235, 15, 58);
		LabFun1.setIcon(new ImageIcon("images/Funct1_15_58.gif"));
		LabFun2.setBounds(480, 317, 17, 62);
		LabFun2.setIcon(new ImageIcon("images/Funct2_17_62.gif"));
		
		this.add(ButGo);
		this.add(ButReset);
		this.add(ButForw);
		this.add(ButLeft);
		this.add(ButRight);
		this.add(ButJump);
		this.add(ButLight);
		this.add(ButFun1);
		this.add(ButFun2);
		this.add(ButCur);
		
		this.add(ButPrev);
		this.add(ButNext);
		this.add(LabTotalCom);
		this.add(LabMainMeth);
		this.add(LabFun1);
		this.add(LabFun2);
		Fake=new TDFake();
	    //Fake.InitialMap(12);
		InitialGame(CurStage);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		DrawGameState(g);
		//Fake.light_Bot.InitialRobot(1);
		DrawGame(g);
	}
	
	//绘制所有游戏事物
	public void DrawGame(Graphics g){
		//先绘制可能被小机器人挡住的区域
//		Fake.DrawMap(g, 0,4,0,4);
		Fake.DrawMap(g,0,Fake.light_Bot.curX,0,Fake.light_Bot.curY);
		DrawRobot(g);
		//再绘制可能挡住小机器人的地方
		Fake.DrawMap(g, Fake.light_Bot.curX+1,7,0,Fake.light_Bot.curY);
		Fake.DrawMap(g, 0,7,Fake.light_Bot.curY+1,7);
	}
	
	//绘制小机器人
	public void DrawRobot(Graphics g){
		
		//偏移量
		int x_shift=100;
		int y_shift=100;
		
		if(Fake.light_Bot.Light_On==false)
		{
			switch(Fake.light_Bot.Direction)
			{
			case 1:
				g.drawImage(left, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
				break;
			case 2:
				g.drawImage(up, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
				break;
			case 3:
				g.drawImage(right, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
				break;
			case 4:
				g.drawImage(down, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
			}
		}
		else
		{
			switch(Fake.light_Bot.Direction)
			{
			case 1:
				g.drawImage(left_light, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
				break;
			case 2:
				g.drawImage(up_light, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
				break;
			case 3:
				g.drawImage(right_light, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);

				break;
			case 4:
				g.drawImage(down_light, 145+(Fake.light_Bot.curX-Fake.light_Bot.curY)*20+x_shift, 
						75+(Fake.light_Bot.curX+Fake.light_Bot.curY)*10-15*Fake.light_Bot.curZ+y_shift, this);
			}
		}
	}
	
	//初始化游戏事物
	public void InitialGame(int CurStage){
		Fake.light_Bot.InitialRobot(CurStage);
		Fake.InitialMap(CurStage);
	}
	
	//绘制指令区
	public void DrawGameState(Graphics g){
		
		//画指令方格
		for(int i=0;i<=3;i++)
			for(int j=0;j<=2;j++)
			{
				//g.drawRect(x, y, width, height);
				g.setColor(Color.DARK_GRAY );
				g.fillRect(500+36*i,108+36*j,34,34);
				g.setColor(Color.black);
				g.drawRect(500+36*i,108+36*j,34,34);
			}
		
		for(int i=0;i<=3;i++)
			for(int j=0;j<=1;j++)
			{
				g.setColor(Color.DARK_GRAY );
				g.fillRect(500+36*i,228+36*j,34,34);
				g.setColor(Color.black);
				g.drawRect(500+36*i,228+36*j,34,34);
		    }
		
		for(int i=0;i<=3;i++)
			for(int j=0;j<=1;j++)
			{
				g.setColor(Color.DARK_GRAY );
				g.fillRect(500+36*i,312+36*j,34,34);
				g.setColor(Color.black);
				g.drawRect(500+36*i,312+36*j,34,34);
		    }
		g.drawLine(480,222,643, 222);
		g.drawLine(480,306,643,306);
	
	}

}

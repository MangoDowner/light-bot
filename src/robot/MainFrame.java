package robot;

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MainFrame extends JFrame implements Constants , ActionListener,Runnable{
	
	TitlePanel title;
	GamePanel game;
	Thread actNow;
	
	public static void main(String[]args){
		MainFrame frame=new MainFrame();
	}
	
	public MainFrame(){
		this.setTitle("light-Bot");
		this.getContentPane().setBackground(Color.gray);
		title=new TitlePanel();
		game=new GamePanel();
		this.add(title);//��ʼΪ����ҳ��
		this.setBounds(500, 500, CLIENT_WIDTH,CLIENT_HEIGHT);
		this.setResizable(false);//�޷��϶���С
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image image=Toolkit.getDefaultToolkit().getImage("images/Robot.gif");
		this.setIconImage(image);
		this.setVisible(true);
		this.validate();
		this.repaint();
		
		title.ButNew.addActionListener(this);
		title.ButLoad.addActionListener(this);
		title.ButMore.addActionListener(this);
		title.ButCred.addActionListener(this);
		title.ButArmor.addActionListener(this);
		
		game.ButForw.addActionListener(this);
		game.ButLeft.addActionListener(this);
		game.ButRight.addActionListener(this);
		game.ButJump.addActionListener(this);
		game.ButLight.addActionListener(this);
		game.ButFun1.addActionListener(this);
		game.ButFun2.addActionListener(this);
		game.ButReset.addActionListener(this);
		game.ButGo.addActionListener(this);
		game.ButCur.addActionListener(this);
		game.ButPrev.addActionListener(this);
		game.ButNext.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton butt = (JButton) e.getSource();

		if(butt==title.ButNew){//�½���Ϸ
			title.setBounds(0,0,0,0);//
			this.add(game);
		}
		
		//�������ǰ��ť
		if(butt==game.ButForw){
			switch(game.CurFunct)
			{
			case 1://��ǰ����Ϊ������
				game.MAINorder[game.MAINnum]=1;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/forw_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2://��ǰ����Ϊ����1
				game.FUN1order[game.FUN1num]=1;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/forw_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3://��ǰ����Ϊ����2
				game.FUN2order[game.FUN2num]=1;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/forw_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
//			game.Fake.RobotForward();
//			game.repaint();
		}
		
		//�������ť
		if(butt==game.ButLeft){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=2;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/left_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				game.FUN1order[game.FUN1num]=2;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/left_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3:
				game.FUN2order[game.FUN2num]=2;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/left_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
//			game.Fake.RobotLeft();
//			game.repaint();
		}
		
		//������Ұ�ť
		if(butt==game.ButRight){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=3;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/right_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				game.FUN1order[game.FUN1num]=3;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/right_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3:
				game.FUN2order[game.FUN2num]=3;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/right_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
//			game.Fake.RobotRight();
//			game.repaint();
		}
		
		//�������Ծ��ť
		if(butt==game.ButJump){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=4;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/jump_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				game.FUN1order[game.FUN1num]=4;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/jump_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3:
				game.FUN2order[game.FUN2num]=4;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/jump_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
//			game.Fake.RobotJump();
//			game.repaint();
		}
		
		//����ǵ�ư�ť��ť
		if(butt==game.ButLight){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=5;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/light_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				game.FUN1order[game.FUN1num]=5;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/light_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3:
				game.FUN2order[game.FUN2num]=5;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/light_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
//			game.Fake.RobotLight();
//			game.repaint();
		}
		
		//����Ǻ���1��ť
		if(butt==game.ButFun1){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=6;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/fun1_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				break;
			case 3:
				game.FUN2order[game.FUN2num]=6;
				game.LabFUN2[game.FUN2num].setIcon(new ImageIcon("images/fun1_28_28.gif"));
				game.FUN2num+=1;
				break;
			}
		}
		
		//����Ǻ���2��ť
		if(butt==game.ButFun2){
			switch(game.CurFunct)
			{
			case 1:
				game.MAINorder[game.MAINnum]=7;
				game.LabMAIN[game.MAINnum].setIcon(new ImageIcon("images/fun2_28_28.gif"));
				game.MAINnum+=1;
				break;
			case 2:
				game.FUN1order[game.FUN2num]=7;
				game.LabFUN1[game.FUN1num].setIcon(new ImageIcon("images/fun2_28_28.gif"));
				game.FUN1num+=1;
				break;
			case 3:
				break;
			}
		}
		
		//���Ϊ��ʼ�ж���ť
		if(butt==game.ButGo){
			actNow=new Thread(this);
			actNow.start();//�߳̿�ʼ
			game.ButCur.setBounds(450,110, 20, 20);
		}
		
		//���Ϊ���ư�ť
		if(butt==game.ButReset){
			game.InitialGame(game.CurStage);
			game.MAINnum=0;
			game.FUN1num=0;
			game.FUN2num=0;
			game.MAINstep=0;
			game.FUN1step=0;
			game.FUN2step=0;
			
			for(int i=0;i<=11;i++)
			{
				game.MAINorder[i]=0;
				game.LabMAIN[i].setIcon(new ImageIcon(""));
			}
			
			for(int i=0;i<=7;i++)
			{
				game.FUN1order[i]=0;
				game.FUN2order[i]=0;
				game.LabFUN1[i].setIcon(new ImageIcon(""));
				game.LabFUN2[i].setIcon(new ImageIcon(""));
			}

			game.CurFunct=1;
			game.ButCur.setBounds(450,110, 20, 20);
			game.repaint();
			actNow.stop();//�߳���ֹ
		}
		
		if(butt==game.ButCur){
			if(game.CurFunct!=3)
				game.CurFunct+=1;
			else
				game.CurFunct=1;

			switch(game.CurFunct)
			{
			case 1:
				game.ButCur.setBounds(450, 110, 20, 20);
				break;
			case 2:
				game.ButCur.setBounds(450, 230, 20, 20);
				break;
			case 3:
				game.ButCur.setBounds(450, 310, 20, 20);
				break;
			}
		}
		
		//���ѡ��ǰһ��
		if(butt==game.ButPrev){
			if(game.CurStage>1)
			{
				game.CurStage-=1;
			}
			game.InitialGame(game.CurStage);
			game.MAINnum=0;
			game.FUN1num=0;
			game.FUN2num=0;
			game.MAINstep=0;
			game.FUN1step=0;
			game.FUN2step=0;
			
			for(int i=0;i<=11;i++)
			{
				game.MAINorder[i]=0;
				game.LabMAIN[i].setIcon(new ImageIcon(""));
			}
			
			for(int i=0;i<=7;i++)
			{
				game.FUN1order[i]=0;
				game.FUN2order[i]=0;
				game.LabFUN1[i].setIcon(new ImageIcon(""));
				game.LabFUN2[i].setIcon(new ImageIcon(""));
			}

			game.CurFunct=1;
			game.ButCur.setBounds(450,110, 20, 20);
			game.repaint();
			actNow.stop();//�߳���ֹ
		}
		
		//���ѡ���һ��
		if(butt==game.ButNext){
			if(game.CurStage<12)
			{
				game.CurStage+=1;
			}
			game.InitialGame(game.CurStage);
			game.MAINnum=0;
			game.FUN1num=0;
			game.FUN2num=0;
			game.MAINstep=0;
			game.FUN1step=0;
			game.FUN2step=0;
			
			for(int i=0;i<=11;i++)
			{
				game.MAINorder[i]=0;
				game.LabMAIN[i].setIcon(new ImageIcon(""));
			}
			
			for(int i=0;i<=7;i++)
			{
				game.FUN1order[i]=0;
				game.FUN2order[i]=0;
				game.LabFUN1[i].setIcon(new ImageIcon(""));
				game.LabFUN2[i].setIcon(new ImageIcon(""));
			}

			game.CurFunct=1;
			game.ButCur.setBounds(450,110, 20, 20);
			game.repaint();
			actNow.stop();//�߳���ֹ
		}
		
			
	}
	
	public void run()
	{		
		game.Fake.light_Bot.Light_On=false;//��ǰ����ܵ�����С�����˶���Ϩ��
		
		while(game.MAINstep<=game.MAINnum)
		{
			try {
				Thread.sleep(300);//ÿ���������300MS
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			game.repaint();
			
			switch(game.CurFunct)
			{
			case 1:
				if(game.MAINstep<=game.MAINnum-1)
				{
					switch(game.MAINorder[game.MAINstep])
					{
					case 1:
						game.Fake.RobotForward();
						break;
				    case 2:
					    game.Fake.RobotLeft();
					    break;
				    case 3:
					    game.Fake.RobotRight();
					    break;
				    case 4:
					    game.Fake.RobotJump();
					    break;
				    case 5:
					    game.Fake.RobotLight();
					    try {
							Thread.sleep(200);//С����200MS
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					    game.Fake.light_Bot.Light();
					    break;
					case 6:
						game.CurFunct=2;
						game.PreFunct=1;
						break;
					case 7:
						game.CurFunct=3;
						game.PreFunct=1;
						break;
					}
					game.MAINstep+=1;
				}
				break;
			case 2:
				if(game.FUN1step<=game.FUN1num-1)
				{
					switch(game.FUN1order[game.FUN1step])
					{
					case 1:
						game.Fake.RobotForward();
						break;
				    case 2:
					    game.Fake.RobotLeft();
					    break;
				    case 3:
					    game.Fake.RobotRight();
					    break;
				    case 4:
					    game.Fake.RobotJump();
					    break;
				    case 5:
					    game.Fake.RobotLight();
					    break;
					case 6:
						break;
					case 7:
						game.CurFunct=3;
						if(game.FUN1step!=game.FUN1num)
							game.PreFunct=2;
						break;
					}
					game.FUN1step+=1;
				}
				else 
				{
					game.FUN1step=0;
					if(game.PreFunct==2)
						game.CurFunct=1;
					else
						game.CurFunct=game.PreFunct;
				}
				break;	
			case 3:
				if(game.FUN2step<=game.FUN2num-1)
				{
					switch(game.FUN2order[game.FUN2step])
					{
					case 1:
						game.Fake.RobotForward();
						break;
				    case 2:
					    game.Fake.RobotLeft();
					    break;
				    case 3:
					    game.Fake.RobotRight();
					    break;
				    case 4:
					    game.Fake.RobotJump();
					    break;
				    case 5:
					    game.Fake.RobotLight();
					    break;
					case 6:
						game.CurFunct=2;
						if(game.FUN1step!=game.FUN1num)
							game.PreFunct=3;
						game.PreFunct=3;
						break;
					case 7:
						break;
					}
					game.FUN2step+=1;
				}
				else
				{
					game.FUN2step=0;
					if(game.PreFunct==3)
						game.CurFunct=1;
					else
						game.CurFunct=game.PreFunct;
				}
				break;	
			}
		}
		
	}
}

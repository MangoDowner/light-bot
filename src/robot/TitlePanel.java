package robot;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel; 

public class TitlePanel extends JPanel implements Constants{
	JButton ButNew,ButLoad,ButMore,ButCred,ButArmor;
	JLabel StartPage;
	
	public TitlePanel(){
		setBounds(0,0,CLIENT_WIDTH,CLIENT_HEIGHT);
		
		this.setLayout(null);
		setBackground(Color.gray);
		
		ButNew=new JButton();
		ButLoad=new JButton();
		ButMore=new JButton();
		ButCred=new JButton();
		ButArmor=new JButton();
		
		StartPage=new JLabel();
		StartPage.setIcon(new ImageIcon("images/startpage.gif"));
		StartPage.setBounds(-25, 200, 218, 218);
        this.add(StartPage);
		
	
	}
	
	public void paintComponent(Graphics g){
		FontMetrics fontMetrics;
		super.paintComponent(g);
        
		NewButton(ButNew,400,200,250,25,1,16,Color.LIGHT_GRAY,"New Game");
		NewButton(ButLoad,400,225,250,25,1,16,Color.LIGHT_GRAY,"Load Game");
		NewButton(ButMore,400,250,250,25,1,16,Color.LIGHT_GRAY,"Play More Games");
		NewButton(ButCred,400,275,250,25,1,16,Color.LIGHT_GRAY,"Credits");
		NewButton(ButArmor,400,350,250,25,1,10,Color.ORANGE,"                                        (c) 2011 light-Bot");
		Font font=new Font("AgencyFB", 1, 11);
		g.setFont(font);
		g.setColor(Color.BLACK);
		fontMetrics=g.getFontMetrics();
		//输出帮助文字,并且右对齐
		for(int i=0;i<14;i++)
			g.drawString(content[i],380-fontMetrics.stringWidth(content[i]),150+16*i);
		Graphics2D g2d=(Graphics2D)g;
		Stroke stroke=new BasicStroke(2.5f);//设置线宽为2.5
		g2d.setStroke(stroke);
		g.setColor(Color.WHITE);
		g.drawLine(390,100,390,380);
	
	}
	
	//集成按钮设置
	public void NewButton(JButton But,int x,int y,int w,int h,int b,int l,Color c,String s)
	{
		But.setBackground(c);
		But.setBounds(x,y,w,h);
		But.setText(s);
		Font font=new Font("DigitalFace", b, l);
		But.setFont(font);
		But.setForeground(Color.WHITE);
		this.add(But);
	}
	
}

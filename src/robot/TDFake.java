package robot;

import java.awt.*;

public class TDFake {
	
	Robot light_Bot;//地图中的小机器人
	int BrickHeight[][];
	int BrickColor[][];
	int xPoints[];
	int yPoints[];
	
	public TDFake()
	{
		light_Bot=new Robot();
	}
	
	//绘制地图
	public void DrawMap(Graphics g,int x_start,int x_end,int y_start,int y_end){
		int [] xPoints=new int[4];
		int [] yPoints=new int[4];
		
		//偏移量
		int x_shift=100;
		int y_shift=100;
		
		//绘制地板
		for(int i=x_start;i<=x_end;i++)
			for(int j=y_start;j<=y_end;j++)
			{
				switch(BrickColor[i][j])
				{
				case 0:
					g.setColor(Color.gray);
					break;
				case 1:
					g.setColor(Color.blue);
					break;
				case 2:
					g.setColor(Color.yellow);
				
				}
				
			xPoints[0]=160+20*(i-j)+x_shift;//e
			yPoints[0]=105+10*(i+j)+15+y_shift;
			xPoints[1]=140+20*(i-j)+x_shift;//d
			yPoints[1]=115+10*(i+j)+15+y_shift;
			xPoints[2]=160+20*(i-j)+x_shift;//c
			yPoints[2]=125+10*(i+j)+15+y_shift;
			xPoints[3]=180+20*(i-j)+x_shift;//f
			yPoints[3]=115+10*(i+j)+15+y_shift;
			g.fillPolygon(xPoints, yPoints, 4);
			g.setColor(Color.darkGray);
			g.drawPolygon(xPoints,yPoints,4);
			}
		
		//绘制高台
		for(int i=x_start;i<=x_end;i++)
			for(int j=y_start;j<=y_end;j++)
				for(int k=0;k<BrickHeight[i][j];k++)
				{
					//画左面
					g.setColor(Color.GRAY );
					xPoints[0]=140+20*(i-j)+x_shift;//a
					yPoints[0]=130+10*(i+j)-15*k+y_shift;
					xPoints[1]=160+20*(i-j)+x_shift;//b
					yPoints[1]=140+10*(i+j)-15*k+y_shift;
					xPoints[2]=160+20*(i-j)+x_shift;//c
					yPoints[2]=125+10*(i+j)-15*k+y_shift;
					xPoints[3]=140+20*(i-j)+x_shift;//d
					yPoints[3]=115+10*(i+j)-15*k+y_shift;
					g.fillPolygon(xPoints, yPoints, 4);
					g.setColor(Color.black);
					g.drawPolygon(xPoints,yPoints,4);
					
					//画右面
					g.setColor(Color.lightGray);
					xPoints[0]=180+20*(i-j)+x_shift;//g
					yPoints[0]=130+10*(i+j)-15*k+y_shift;
					xPoints[1]=160+20*(i-j)+x_shift;//b
					yPoints[1]=140+10*(i+j)-15*k+y_shift;
					xPoints[2]=160+20*(i-j)+x_shift;//c
					yPoints[2]=125+10*(i+j)-15*k+y_shift;
					xPoints[3]=180+20*(i-j)+x_shift;//f
					yPoints[3]=115+10*(i+j)-15*k+y_shift;
					g.fillPolygon(xPoints, yPoints, 4);
					g.setColor(Color.black);
					g.drawPolygon(xPoints,yPoints,4);
					
					//画上面
					switch(BrickColor[i][j])
					{
					case 0:
						g.setColor(Color.lightGray);
						break;
					case 1:
						g.setColor(Color.blue);
						break;
					case 2:
						g.setColor(Color.yellow);
					}
					xPoints[0]=160+20*(i-j)+x_shift;//e
					yPoints[0]=105+10*(i+j)-15*k+y_shift;
					xPoints[1]=140+20*(i-j)+x_shift;//d
					yPoints[1]=115+10*(i+j)-15*k+y_shift;
					xPoints[2]=160+20*(i-j)+x_shift;//c
					yPoints[2]=125+10*(i+j)-15*k+y_shift;
					xPoints[3]=180+20*(i-j)+x_shift;//f
					yPoints[3]=115+10*(i+j)-15*k+y_shift;
					g.fillPolygon(xPoints, yPoints, 4);
					g.setColor(Color.black);
					g.drawPolygon(xPoints,yPoints,4);
				}
	}
	
	
	//初始化地图
	public void InitialMap(int CurStage){

		int Stage1_Height[][]=new int[][]
		{
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2},
			{2,0,0,0,0,0,0,2}
		};

		int Stage2_Height[][]=new int[][]
		{
			{3,0,0,0,0,0,0,3},
			{2,0,0,0,0,0,0,2},
			{1,0,0,0,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{1,0,0,2,0,0,0,1},
			{1,0,0,0,0,0,0,1},
			{2,0,0,0,0,0,0,2},
			{3,0,0,0,0,0,0,3}
		};

		int Stage3_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{1,1,1,1,1,1,1,1},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage4_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,2,2,1,0,0,0},
			{0,0,2,0,0,0,0,0},
			{0,0,2,0,0,0,0,0},
			{0,0,2,0,0,0,0,0},
			{0,0,2,0,0,0,0,0},
			{0,0,2,0,0,0,0,0}
		};

		int Stage5_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
		    {0,0,0,0,0,0,0,0},
			{0,0,4,0,0,0,0,0},
			{0,0,3,0,0,1,0,0},
			{0,0,2,0,0,1,0,0},
			{0,0,1,1,1,1,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage6_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,2,1,0,0,0},
			{0,0,0,3,0,0,0,0},
			{0,0,0,4,0,0,0,0},
			{2,2,2,2,2,2,2,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage7_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage8_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,1,1,1,1,0,0,0},
			{0,1,0,1,0,0,0,0},
			{0,1,1,1,1,1,0,0},
			{0,1,0,1,0,1,0,0},
			{0,1,1,1,1,1,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage9_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,1,0,0,1,0,0,0},
			{1,2,1,1,2,1,0,0},
			{0,1,0,0,1,0,0,0},
			{0,1,0,0,1,0,0,0},
			{1,2,1,1,2,1,0,0},
			{0,1,0,0,1,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage10_Height[][]=new int[][]
		{
			{0,0,0,0,0,2,0,0},
			{0,0,0,0,0,2,0,0},
			{0,0,0,0,0,2,0,0},
			{0,0,0,0,4,4,0,0},
			{0,0,0,0,3,2,1,0},
			{0,0,0,0,4,3,0,0},
			{0,0,0,0,2,2,0,0},
			{0,0,0,0,2,0,0,0}
		};

		int Stage11_Height[][]=new int[][]
		{
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
			{3,2,1,0,1,0,1,0},
		};

		int Stage12_Height[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,1,2,3,4,0,0},
			{0,0,2,0,0,3,0,0},
			{0,0,3,0,0,2,0,0},
			{0,0,4,3,2,1,0,0},
			{0,0,3,0,0,2,0,0},
			{0,0,2,0,0,3,0,0},
			{0,0,1,2,3,4,0,0}
		};
	    
		//各关卡地砖颜色设置
		int Stage1_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage2_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage3_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage4_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0}
		};

		int Stage5_Color[][]=new  int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,1,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage6_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,1,0,0,0,0},
			{1,0,0,0,0,0,1,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage7_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0},
			{0,0,0,1,1,0,0,0}
		};

		int Stage8_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,1,0,1,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,1,0,1,0,1,0,0},
			{0,0,0,0,0,0,0,0},
			{0,1,0,1,0,1,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage9_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,1,1,1,1,0,0,0},
			{0,1,0,0,1,0,0,0},
			{0,1,0,0,1,0,0,0},
			{0,1,1,1,1,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0}
		};

		int Stage10_Color[][]=new int[][]
		{
			{0,0,0,0,0,1,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0},
			{0,0,0,0,1,0,0,0}
		};

		int Stage11_Color[][]=new int[][]
		{
			{0,0,1,1,1,1,1,0},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1},
			{0,0,1,1,1,1,1,1}
		};

		int Stage12_Color[][]=new int[][]
		{
			{0,0,0,0,0,0,0,0},
			{0,0,1,1,1,1,0,0},
			{0,0,1,0,0,1,0,0},
			{0,0,1,0,0,1,0,0},
			{0,0,1,1,1,1,0,0},
			{0,0,1,0,0,1,0,0},
			{0,0,1,0,0,1,0,0},
			{0,0,1,1,1,1,0,0},
		};
		
		BrickHeight=new int[8][8];
		BrickColor=new int[8][8];
		
		switch(CurStage)
		{
		case 1:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage1_Height[i][j];
					BrickColor[i][j]=Stage1_Color[i][j];
				}
			break;
		case 2:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage2_Height[i][j];
					BrickColor[i][j]=Stage2_Color[i][j];
				}
			break;
		case 3:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage3_Height[i][j];
					BrickColor[i][j]=Stage3_Color[i][j];
				}
			break;
		case 4:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage4_Height[i][j];
					BrickColor[i][j]=Stage4_Color[i][j];
				}
			break;
		case 5:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage5_Height[i][j];
					BrickColor[i][j]=Stage5_Color[i][j];
				}
			break;
		case 6:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage6_Height[i][j];
					BrickColor[i][j]=Stage6_Color[i][j];
				}
			break;
		case 7:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage7_Height[i][j];
					BrickColor[i][j]=Stage7_Color[i][j];
				}
			break;
		case 8:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage8_Height[i][j];
					BrickColor[i][j]=Stage8_Color[i][j];
				}
			break;
		case 9:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage9_Height[i][j];
					BrickColor[i][j]=Stage9_Color[i][j];
				}
			break;
		case 10:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage10_Height[i][j];
					BrickColor[i][j]=Stage10_Color[i][j];
				}
			break;
		case 11:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage11_Height[i][j];
					BrickColor[i][j]=Stage11_Color[i][j];
				}
			break;
		case 12:
			for(int i=0;i<=7;i++)
				for(int j=0;j<=7;j++)
				{
					BrickHeight[i][j]=Stage12_Height[i][j];
					BrickColor[i][j]=Stage12_Color[i][j];
				}
			break;
		}
	}
		
	//机器人向前走一步
	public void RobotForward(){
		
		switch(light_Bot.Direction){
		case 1://左走一步
			if(light_Bot.curX!=7 & BrickHeight[light_Bot.curX][light_Bot.curY+1] ==
				                         BrickHeight[light_Bot.curX][light_Bot.curY])
				light_Bot.curY+=1;
			break;
		case 2://上走一步
			if(light_Bot.curX!=0 & BrickHeight[light_Bot.curX-1][light_Bot.curY] ==
				                         BrickHeight[light_Bot.curX][light_Bot.curY])
				 light_Bot.curX-=1;
			break;
		case 3://右走一步
			if(light_Bot.curY!=0 & BrickHeight[light_Bot.curX][light_Bot.curY-1] ==
			                             BrickHeight[light_Bot.curX][light_Bot.curY])
		         light_Bot.curY-=1;
			break;
		case 4://下走一步
			if(light_Bot.curX!=7 & BrickHeight[light_Bot.curX+1][light_Bot.curY] ==
										 BrickHeight[light_Bot.curX][light_Bot.curY])
		         light_Bot.curX+=1;
			break;
		}
	}
	
	//机器人左转
	public void RobotLeft(){
		light_Bot.Left();
	}
	
	//机器人右转
	public void RobotRight(){
		light_Bot.Right();
	}
	
	//机器人跳跃
	public void RobotJump(){
		switch(light_Bot.Direction)
		{
		case 1://向左跳
			switch(BrickHeight[light_Bot.curX][light_Bot.curY+1]-
					BrickHeight[light_Bot.curX][light_Bot.curY])
			{
			case -4://跳下四层
				light_Bot.curY+=1;
				light_Bot.curZ-=4;
				break;
			case -3://跳下三层
				light_Bot.curY+=1;
				light_Bot.curZ-=3;
				break;
			case -2://跳下二层
				light_Bot.curY+=1;
				light_Bot.curZ-=2;
				break;
			case -1://跳下一层
				light_Bot.curY+=1;
				light_Bot.curZ-=1;
				break;
			case 0://原地跳
				break;
			case 1://跳上一层
				light_Bot.curY+=1;
				light_Bot.curZ+=1;
				break;
			}
			break;
		case 2://向上跳
			switch(BrickHeight[light_Bot.curX-1][light_Bot.curY]-
				   BrickHeight[light_Bot.curX][light_Bot.curY])
			{
			case -4:
				light_Bot.curX-=1;
				light_Bot.curZ-=4;
				break;
			case -3:
				light_Bot.curX-=1;
				light_Bot.curZ-=3;
				break;
			case -2:
				light_Bot.curX-=1;
				light_Bot.curZ-=2;
				break;
			case -1:
				light_Bot.curX-=1;
				light_Bot.curZ-=1;
				break;
			case 0:
				break;
			case 1:
				light_Bot.curX-=1;
				light_Bot.curZ+=1;
				break;
			}
			break;
		case 3://向右跳
			switch(BrickHeight[light_Bot.curX][light_Bot.curY-1]-
				   BrickHeight[light_Bot.curX][light_Bot.curY])
			{
			case -4:
				light_Bot.curY-=1;
				light_Bot.curZ-=4;
				break;
			case -3:
				light_Bot.curY-=1;
				light_Bot.curZ-=3;
				break;
			case -2:
				light_Bot.curY-=1;
				light_Bot.curZ-=2;
				break;
			case -1:
				light_Bot.curY-=1;
				light_Bot.curZ-=1;
				break;
			case 0:
				break;
			case 1:
				light_Bot.curY-=1;
				light_Bot.curZ+=1;
				break;
			}
			break;
		case 4://向下跳
			switch(BrickHeight[light_Bot.curX+1][light_Bot.curY]-
					BrickHeight[light_Bot.curX][light_Bot.curY])
			{
			case -4:
				light_Bot.curX+=1;
				light_Bot.curZ-=4;
				break;
			case -3:
				light_Bot.curX+=1;
				light_Bot.curZ-=3;
				break;
			case -2:
				light_Bot.curX+=1;
				light_Bot.curZ-=2;
				break;
			case -1:
				light_Bot.curX+=1;
				light_Bot.curZ-=1;
				break;
			case 0:
				break;
			case 1:
				light_Bot.curX+=1;
				light_Bot.curZ+=1;
				break;
			}
			break;
		}
	}
	
	//机器人点灯
	public void RobotLight(){
		light_Bot.Light();
		switch(BrickColor[light_Bot.curX][light_Bot.curY])
		{
		case 0:
			break;
		case 1:
			BrickColor[light_Bot.curX][light_Bot.curY]=2;
			break;
		case 2:
			BrickColor[light_Bot.curX][light_Bot.curY]=1;
			break;
		}
	}
	
}

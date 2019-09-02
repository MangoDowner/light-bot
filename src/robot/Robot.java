package robot;

//小机器人,负责控制小机器人的操作

public class Robot {
	public final int ROBOT_MAIN=0;   //主函数
	public final int ROBOT_FORWARD=1;//前进一步
	public final int ROBOT_LEFT=2;   //左转
	public final int ROBOT_RIGHT=3;  //右转
	public final int ROBOT_JUMP=4;   //跳跃
	public final int ROBOT_LIGHT=5;  //点灯
	public final int ROBOT_FUNCT1=6; //函数1
	public final int ROBOT_FUNCT2=7; //函数2

	public int curX; //机器人当前坐标
	public int curY;
	public int curZ;
	public int Direction; //机器人当前朝向
	boolean Light_On;     //机器人顶灯是否亮
	
	public void Light(){
		Light_On=!Light_On;
	}
	
	public void Left(){
		if(Direction!=1)
			Direction-=1;
		else
			Direction=4;
	}
	
	public void Right(){
		if(Direction!=4)
			Direction+=1;
		else 
			Direction=1;
	}
	
	//初始化机器人
	public void InitialRobot(int CurStage){
		curZ=0;
		Light_On=false;
		switch(CurStage){
		case 1:
			curX=2;
			curY=3;
			Direction=4;
			break;
		case 2:
			curX=2;
			curY=3;
			Direction=4;
			break;
		case 3:
			curX=0;
			curY=4;
			Direction=4;
			break;
		case 4:
			curX=2;
			curY=6;
			Direction=3;
			break;
		case 5:
			curX=2;
			curY=6;
			Direction=4;
			break;
		case 6:
			curX=2;
			curY=6;
			Direction=4;
			break;
		case 7:
			curX=0;
			curY=3;
			Direction=4;
			break;
		case 8:
			curX=2;
			curY=5;
			Direction=3;
			break;
		case 9:
			curX=1;
			curY=5;
			Direction=4;
			break;
		case 10:
			curX=0;
			curY=6;
			Direction=4;
			break;
		case 11:
			curX=0;
			curY=7;
			Direction=4;
			break;
		case 12:
			curX=4;
			curY=7;
			Direction=3;
			break;		
		}
	}
}

package robot;

//С������,�������С�����˵Ĳ���

public class Robot {
	public final int ROBOT_MAIN=0;   //������
	public final int ROBOT_FORWARD=1;//ǰ��һ��
	public final int ROBOT_LEFT=2;   //��ת
	public final int ROBOT_RIGHT=3;  //��ת
	public final int ROBOT_JUMP=4;   //��Ծ
	public final int ROBOT_LIGHT=5;  //���
	public final int ROBOT_FUNCT1=6; //����1
	public final int ROBOT_FUNCT2=7; //����2

	public int curX; //�����˵�ǰ����
	public int curY;
	public int curZ;
	public int Direction; //�����˵�ǰ����
	boolean Light_On;     //�����˶����Ƿ���
	
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
	
	//��ʼ��������
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

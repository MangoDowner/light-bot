package robot;

public interface Constants {
	public final int MAX_LOADSTRING=100;
	public final int ID_NEWGAME=1;  //����Ϸ��ť
	public final int ID_LOADGAME=2; //������Ϸ��ť
	public final int ID_MOREGAME=3; //������Ϸ��ť
	public final int ID_CREDIT=4;   //�����߰�ť
	public final int ID_ARMORGAME=5;//�����ذ�ť��
	public final int ID_SOUND=6;    //�������ذ�ť
	
	public final int ID_GO=7;       //�������ж���ť
	public final int ID_RESET=8;    //����ָ�ť
	
	public final int ID_FORWARD=9;  //1.ǰ��ָ�ť
	public final int ID_LEFT=10;    //2.��תָ�ť
	public final int ID_RIGHT=11;   //3.��תָ�ť
	public final int ID_JUMP=12;    //4.��Ծָ�ť
	public final int ID_LIGHT=13;   //5.���ָ�ť
	public final int ID_FUNCT1=14;  //6.����1ָ�ť
	public final int ID_FUNCT2=15;  //7.����2ָ�ť
	public final int ID_CUR=16;     //�л���ǰ�������밴ť
	
	public final int ID_ENTER=17;   //������Ϸ�˵�
	public final int CLIENT_WIDTH=660; //��Ϸ����
	public final int CLIENT_HEIGHT=540;//��Ϸ����
	
	//��������
	String content[]=
	{	
		"Artificial  Intelligence  is  hard  to",
		"program . Not  every  bot  ever",
	    "created  can  maneuver  and",
		"function  on  its  own",
		"",
		"Rather , some  bots  run  along",
		"a  path  that  the  programmer",
		"presents  for  them  for  various",
		"situations . ",
		"",
		"Your  job  is  to  light  up  all  the",
		"blue  tiles  in  the  factory  by",
		"commands  you  issue  to",
		"the  light-bot . Good  luck."
	};
	//�����߽�������
	String content1[]=
	{
		"Original Concept By",
		"Matt Chase",
		"",
		"Art , Annimation and Coding",
		"Li Meng,Zhang Jia hua",
		"",
		"Sponsor and Distributer",
		"Armer Games",
	};
	

}

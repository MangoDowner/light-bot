package robot;

public interface Constants {
	public final int MAX_LOADSTRING=100;
	public final int ID_NEWGAME=1;  //新游戏按钮
	public final int ID_LOADGAME=2; //载入游戏按钮
	public final int ID_MOREGAME=3; //更多游戏按钮
	public final int ID_CREDIT=4;   //制作者按钮
	public final int ID_ARMORGAME=5;//做返回按钮用
	public final int ID_SOUND=6;    //声音开关按钮
	
	public final int ID_GO=7;       //机器人行动按钮
	public final int ID_RESET=8;    //重制指令按钮
	
	public final int ID_FORWARD=9;  //1.前进指令按钮
	public final int ID_LEFT=10;    //2.左转指令按钮
	public final int ID_RIGHT=11;   //3.右转指令按钮
	public final int ID_JUMP=12;    //4.跳跃指令按钮
	public final int ID_LIGHT=13;   //5.点灯指令按钮
	public final int ID_FUNCT1=14;  //6.函数1指令按钮
	public final int ID_FUNCT2=15;  //7.函数2指令按钮
	public final int ID_CUR=16;     //切换当前函数输入按钮
	
	public final int ID_ENTER=17;   //进入游戏菜单
	public final int CLIENT_WIDTH=660; //游戏区宽
	public final int CLIENT_HEIGHT=540;//游戏区高
	
	//标题文字
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
	//制作者界面文字
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

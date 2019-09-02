# 可编程机器人
> 大学时候偶然找到的一款迅雷小游戏，个人比较喜欢，当时就自己制作了下。 界面与原作基本相同，也做出了主要功能，费了点心思，发上来分享下。 

人工智能编程并不是一件轻松的事情，也不是所有的机器人都能够完全依靠自己行动。

但是一些机器人却能够严格按照程序员设定的多种多样的路径行动。

现在，你的任务就是通过有限的指令，让小机器人点亮所有的蓝色地板，祝你好运！

![image](https://github.com/MangoDowner/light-bot/blob/master/images/README/game.png)

## 游戏操作:
通过排列组合五种基本指令，指挥小机器人的行动。

+ ![image](https://github.com/MangoDowner/light-bot/blob/master/images/forw_frame_30_30.gif)：前进一步:
+ ![image](https://github.com/MangoDowner/light-bot/blob/master/images/left_frame_30_30.gif)：左转
+ ![image](https://github.com/MangoDowner/light-bot/blob/master/images/right_frame_30_30.gif) ：右转
+ ![image](https://github.com/MangoDowner/light-bot/blob/master/images/jump_frame_30_30.gif) ：跳跃
+ ![image](https://github.com/MangoDowner/light-bot/blob/master/images/light_frame_30_30.gif) ：点（灭）灯

当游戏较为复杂时，您可以将一些经常一起执行的指令放在一个子函数里。
点击黄色箭头，切换函数输入区，主函数区可以调用子函数1，子函数2，子函数间也可以互相调用。
您可以通过在函数区中添加 ![image](https://github.com/MangoDowner/light-bot/blob/master/images/fun1_frame_30_30.gif)或者![image](https://github.com/MangoDowner/light-bot/blob/master/images/fun2_frame_30_30.gif) ，调用子函数中封装的操作。

点击“GO”按钮让小机器人开始行动，点击“RESET”，重设指令。
点击地图左侧上下按钮，可以切换关卡。

当图上所有蓝色地板都被点亮时候，关卡成功！
![image](https://github.com/MangoDowner/light-bot/blob/master/images/README/finish.png)

## 地图绘制原理
其中地图绘制的原理是,如下图所示:

![image](https://github.com/MangoDowner/light-bot/blob/master/images/README/tdfake.png)

分析可知道，其实每一个立方体都可以分为三个平行四边形绘制:左面、右边、上面，只要确定了一个点坐标，
其他点坐标都可以由运算获取，用DrawPolygon以及FillPolygon绘制四边形，并采取不同颜色深度的灰色做出阴影效果来。
而高低阶梯则可以通过Y轴坐标的平移依次绘制立方体得到。

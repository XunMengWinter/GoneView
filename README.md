# GoneView
10种让TextView消失的方法

![GoneView](https://raw.githubusercontent.com/XunMengWinter/source/master/gif/GoneView.gif)

### 前言
许多时候，我们需要让文字或者视图从用户眼前消失，最常见的做法当然是
> view.setVisibility(View.GONE);

但是，这在某些情况下无法满足业务需求，比如说某控件既有图像又有文字，而我只想让文字消失，那上面的方法显然不行，这时可以使用
> textView.setText("");

再有些情况，我们甚至不能改变文字的内容，以及......
总之呢，多会几种解决问题的方法便能应对更多的情况。

### 简要说明
其实效果GIF图里的文字已经就已经告诉你实现方法啦，这里做少量补充。
如上面的GIF图，十种方法如下，这里我用view来表示点击的视图控件：
* 调用View的setVisibility(View.GONE)方法，使view消失。
* 调用View的setVisibility(View.INVISIBLE)方法，将view原地隐藏。
* 调用View的setAlpha(0)方法，使view的透明度变为0。
* 调用TextView的setTextColor(0x00123456)方法，将字体颜色设为透明。
* 调用TextView的setText("")方法，将文字内容置空。
* 调用View的animate().alpha(0)方法，使view执行透明动画。
* 调用View的animate().x(3000)方法，使view执行将x坐标移动至3000的动画（将view移至屏幕外）。
* 调用View的animate().scaleX(0)方法，使view执行将x坐标缩放至0的动画。
* 调用View的父视图的removeView(view)方法，将view移除。
* 调用View的setBackgroundColor(0xff000000)方法，将view的背景色设置为文字颜色。


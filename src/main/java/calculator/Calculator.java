package calculator;

import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;
import java.util.*;
import javax.swing.*;

public class Calculator extends JFrame{
    /*
     * 图形化界面设计
     * */
	public int tag = 0;
	public String mem = "";
    private static final long serialVersionUID = 4907149509182425824L;
 // 用于存放一个正括号的集合, 用于简化代码
    static Set<Character> brace = new HashSet<>();
    public static void main(String[] args) {
    	// 初始化正括号集合
    	brace.add('{');
        brace.add('(');
        brace.add('[');
    	new Calculator();
    }
    
    public Calculator(){

    	Container c = getContentPane(); //定义一个顶级容器c
        setLayout(new GridLayout(2,1));//新建网格布局管理器，2行1列
        final JTextField jtf = new JTextField("0",40);//构造一个用指定文本和列初始化的新文本框--jtf
            jtf.setHorizontalAlignment(JTextField.RIGHT);//设置水平对齐方式：居右对齐
        JButton data0 = new JButton("0");
        JButton data1 = new JButton("1");
        JButton data2 = new JButton("2");
        JButton data3 = new JButton("3");
        JButton data4 = new JButton("4");
        JButton data5 = new JButton("5");
        JButton data6 = new JButton("6");
        JButton data7 = new JButton("7");
        JButton data8 = new JButton("8");
        JButton data9 = new JButton("9");
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton lbrac = new JButton("(");
        JButton rbrac = new JButton(")");
        JButton mtp = new JButton("*");
        JButton dvd = new JButton("÷");
        JButton jiecheng = new JButton("!");
        JButton root = new JButton("^");
        JButton tg = new JButton("退格");
        JButton MEM = new JButton("记忆");
        JButton point = new JButton(".");
        JButton equ = new JButton("=");
        JButton AC = new JButton("AC");
        JPanel jp = new JPanel();   //新建JPanel面板--jp
        jp.setLayout(new GridLayout(5,5));//新建网格布局管理器（行数，列数，组件间的水平垂直间距）
        
		Color myColor = new Color(250-400/3,200-400/3,400/3);
		c.setBackground(myColor);
		jp.setBackground(myColor);
		
	  //第一行
        jp.add(data1);
        jp.add(data2);
        jp.add(data3);
        jp.add(tg);
        jp.add(AC);
      //第二行
        jp.add(data4);
        jp.add(data5);
        jp.add(data6);
        jp.add(lbrac);
        jp.add(rbrac);
      //第三行
        jp.add(data7);
        jp.add(data8);
        jp.add(data9);
        jp.add(plus);
        jp.add(minus);
      //第四行
        jp.add(point);
        jp.add(data0);
        jp.add(equ);
        jp.add(mtp);
        jp.add(dvd);
      //第五行
        jp.add(root);
        jp.add(MEM);
        jp.add(jiecheng);

        c.add(jtf);//将文本框jtf添加到顶级容器c中
        c.add(jp);//将JPanel面板jp添加到顶级容器c中
        setLocation(440, 150);
        setSize(500,400);
        setTitle("周楚翘的计算器");
        setVisible(true);
        setResizable(false);//窗体大小由程序员决定，用户不能自由改变大小
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        /*
         * *********************************************************
         *                  
                    相关计算功能的实现                             
         * *********************************************************
         * */

        data0.addActionListener(new ActionListener(){	//数字0的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//将按钮值与0作比较
                    jtf.requestFocus();//把输入焦点放在调用这个方法的控件上(即把光标放在文本框jtf里)
                }
                else{
                    String str = jtf.getText();//取得当前按钮的按钮值
                    jtf.setText(str+"0");   //将文本内容后加上字符0
                }
            }
        });
        data1.addActionListener(new ActionListener(){	//数字1的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){//将按钮值与0作比较
                    jtf.setText("");//将文本框初始化为空
                    jtf.setText("1");//将文本框内容置为 1
                    jtf.requestFocus();//把输入焦点放在调用这个方法的控件上(即把光标放在文本框jtf里)
                }
                else{
                    String str = jtf.getText();//取得当前按钮的按钮值
                    jtf.setText(str+"1");   //将文本内容后加上字符1
                }
            }
        });
        data2.addActionListener(new ActionListener(){	//数字2的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("2");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"2");
                }
            }
        });
        data3.addActionListener(new ActionListener(){	//数字3的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("3");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"3");
                }
            }
        });
        data4.addActionListener(new ActionListener(){	//数字4的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("4");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"4");
                }
            }
        });
        data5.addActionListener(new ActionListener(){	//数字5的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("5");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"5");
                }
            }
        });
        data6.addActionListener(new ActionListener(){	//数字6的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("6");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"6");
                }
            }
        });
        data7.addActionListener(new ActionListener(){	//数字7的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("7");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"7");
                }
            }
        });
        
        data8.addActionListener(new ActionListener(){	//数字8的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("8");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"8");
                }
            }
        });
        data9.addActionListener(new ActionListener(){	//数字9的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("9");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"9");
                }
            }
        });
        lbrac.addActionListener(new ActionListener(){	//左括号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("(");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"(");
                }
            }
        });
        rbrac.addActionListener(new ActionListener(){	//右括号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText(")");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+")");
                }
            }
        });

        point.addActionListener(new ActionListener(){    //.号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText(".");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+".");
                }
            }
        });
        plus.addActionListener(new ActionListener(){    //+号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("+");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"+");
                }
            }
        });
        minus.addActionListener(new ActionListener(){    //-号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("-");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"-");
                }
            }
        });
        mtp.addActionListener(new ActionListener(){    //*号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("*");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"*");
                }
            }
        });
        root.addActionListener(new ActionListener(){    //^号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("^");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"^");
                }
            }
        });
        dvd.addActionListener(new ActionListener(){    //÷号的输入
            public void actionPerformed(ActionEvent arg0){
                if(jtf.getText().equals("0")){
                    jtf.setText("");
                    jtf.setText("÷");
                    jtf.requestFocus();
                }
                else{
                    String str = jtf.getText();
                    jtf.setText(str+"÷");
                }
            }
        });
        //【**退格功能如下**】
        tg.addActionListener(new ActionListener(){//监听退格键
            public void actionPerformed(ActionEvent arg0){//处理退格键被按下的事件
                String text = jtf.getText();
                int i = text.length();
                if(i>0){
                    text = text.substring(0,i-1);//去掉最后一个字符
                    if (text.length() == 0) {// 如果文本没有了内容，则初始化计算器的各种值
                        jtf.setText("0");
                    } else { // 显示新的文本
                        jtf.setText(text);
                }
            }
            }
        });
      //【**清屏功能如下**】
        AC.addActionListener(new ActionListener(){//监听清屏键
            public void actionPerformed(ActionEvent arg0){//处理清屏键被按下的事件
                jtf.setText("0");
            }
        });
        //【**阶乘功能如下**】
        jiecheng.addActionListener(new ActionListener(){//监听阶乘键
            public void actionPerformed(ActionEvent e) {
                String i = (jtf.getText().split("\\."))[0];
                int j = Integer.parseInt(i);
                int k;
                BigInteger sum = BigInteger.valueOf(1);
                for (k=1;k<=j;k++) {
                	sum = sum.multiply(BigInteger.valueOf(k));
                }
                //String answer =String.valueOf(sum);
                jtf.setText(sum.toString());
                	
            }
        });

        //【**存储功能如下**】
        MEM.addActionListener(new ActionListener(){//监听MEM键
            public void actionPerformed(ActionEvent e){//MEM键被按事件
                if (tag==0) {
                	mem = jtf.getText();
                	tag = 1;
                }
                else if (tag == 1) {
                	if(jtf.getText().equals("0")) {
                		tag = 0;
                		jtf.setText(mem);
                		mem = "";
                	}
                	else {
                		tag = 0;
                		String s = jtf.getText();
                		jtf.setText(s+mem);//将文本框设置为mem中的值
                		mem = "";
                	}
                }
            }
        });

        //【等号实现 加减乘除 功能】
        equ.addActionListener(new ActionListener(){ //监听 “等号” 按键
            public void actionPerformed(ActionEvent arg0){//处理“等号” 按键被按下事件
            	
            	if(jtf.getText().indexOf("^")!=-1) {
                	String[] s = jtf.getText().split("\\^");
                	jtf.setText("");
                	Double d1 = Double.parseDouble(s[0]);
                	Double d2 = Double.parseDouble(s[1]);
                	double ans = java.lang.Math.pow(d1, d2);
                	String answer =String.valueOf(ans);
                	jtf.setText(answer);
                }

            	else {
            		String s = jtf.getText();
//            		System.out.println(s);
            		String exp = s.replaceAll("(?<![0-9)}\\]])(?=-[0-9({\\[])", "0") + "#";
            		double ans = calculate(exp);
            		String answer = String.valueOf(ans);
            		jtf.setText(answer);
            	}
            }
        });
    }
    
    private static double calculate(String exp){
        // 初始化栈
        Stack<Double> opStack = new Stack<>();
        Stack<Character> otStack = new Stack<>();
         
        // 整数记录器
        String num = "";
        for(int i = 0; i < exp.length(); i++){
            // 抽取字符
            char c = exp.charAt(i);
            // 如果字符是数字，则加这个数字累加到num后面
            if(Character.isDigit(c)||c=='.'){
                num += c;
            }
            // 如果不是数字
            else{
                // 如果有字符串被记录，则操作数入栈，并清空
                if(!num.isEmpty()){
                    double n = Double.parseDouble(num);
                    num = "";
                    opStack.push(n);
                }
                // 如果遇上了终结符则退出
                if(c == '#')
                    break;
                // 如果遇上了+-
                else if(c == '+' || c == '-'){
                    // 空栈或者操作符栈顶遇到正括号，则入栈
                    if(otStack.isEmpty() || brace.contains(otStack.peek())){
                        otStack.push(c);
                    } else {
                        // 否则一直做弹栈计算，直到空或者遇到正括号为止，最后入栈
                        while(!otStack.isEmpty() && !brace.contains(otStack.peek()))
                            popAndCal(opStack, otStack);
                        otStack.push(c);
                    }
                }
                // 如果遇上*÷
                else if(c == '*' || c == '÷'){
                    // 空栈或者遇到操作符栈顶是括号，或者遇到优先级低的运算符，则入栈
                    if(otStack.isEmpty()
                            || brace.contains(otStack.peek())
                            || otStack.peek() == '+' || otStack.peek() == '-'){
                        otStack.push(c);
                    }else{
                        // 否则遇到*或÷则一直做弹栈计算，直到栈顶是优先级比自己低的符号，最后入栈
                        while(!otStack.isEmpty()
                                && otStack.peek() != '+' && otStack.peek() != '-'
                                && !brace.contains(otStack.peek()))
                            popAndCal(opStack, otStack);
                        otStack.push(c);
                    }
                } else {
                    // 如果是正括号就压栈
                    if(brace.contains(c))
                        otStack.push(c);
                    else{
                        // 反括号就一直做弹栈计算，直到遇到正括号为止
                        char r = getBrace(c);
                        while(otStack.peek() != r){
                            popAndCal(opStack, otStack);
                        }
                        // 最后弹出正括号
                        otStack.pop();
                    }
                }
            }
        }
        // 将剩下的计算完，直到运算符栈为空
        while(!otStack.isEmpty())
            popAndCal(opStack, otStack);
        // 返回结果
        return opStack.pop();
    }
    private static void popAndCal(Stack<Double> opStack, Stack<Character> otStack) {
		// TODO Auto-generated method stub
    	double op2 = opStack.pop();
        double op1 = opStack.pop();
        char ot = otStack.pop();
        double res = 0;
        switch(ot){
            case '+':
                res = op1 + op2;
                break;
            case '-':
                res = op1 - op2;
                break;
            case '*':
                res = op1 * op2;
                break;
            case '÷':
                res = op1 / op2;
                break;
        }
        opStack.push(res);
	}

    private static char getBrace(char brace){
        switch(brace){
            case ')':
                return '(';
            case ']':
                return '[';
            case '}':
                return '{';
        }
        return '#';
    }

}
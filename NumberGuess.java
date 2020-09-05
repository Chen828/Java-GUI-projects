package ClassDesign;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NumberGuess implements ActionListener{
	JFrame jFrame;
	JPanel jPanel;
	int rand=0;
	int user=0;
	int counter=0;
	JLabel jLabel1,jLabel2,jLabel3,jLabel4;
//	JLabel ,jLabel5,jLabel6,jLabel7,jLabel8,jLabel9;
	JButton jButton;
	JTextField jTextField;
	public NumberGuess() {
		//界面内容、格式
		jFrame=new JFrame("愿辰集团-智能猜数");
		jFrame.setLayout(new BorderLayout());
		rand=(int)(Math.random()*100);                       //  100  ??
		jLabel1=new JLabel("欢迎来到智能猜数游戏  :)");
		jLabel2=new JLabel("                    好期待啊！");
		jLabel3=new JLabel("              请输入0-100之间的整数：");
		jButton=new JButton("确定");
		jTextField=new JTextField(10);
		jLabel4=new JLabel("您猜了"+counter+"次了，加油哦！");
		//将输入框和确定按钮放入一个jpanel
		jPanel=new JPanel();
		jPanel.setLayout(new GridLayout(4, 1));   //网格布局 
		jPanel.add(jLabel3); 
		jPanel.add(jTextField); 
		jPanel.add(jButton); 
		jPanel.add(jLabel4);
		jTextField.addActionListener(this);   //注册动作
		jButton.addActionListener(this);
		//jframe排版
		jFrame.add(BorderLayout.NORTH,jLabel1);
		jFrame.add(BorderLayout.CENTER,jPanel);
		jFrame.add(BorderLayout.SOUTH,jLabel2);
		//窗口形态、位置、大小化、关闭
		jFrame.setBounds(500,200,350,200);    //横，竖，宽，高
//		jFrame.setSize(300, 150);
//		jFrame.setLocation(500, 200);
		jFrame.setVisible(true);
		jFrame.addWindowListener((WindowListener)this);  //注册给windows
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void eventHandle(){
//	  do{
//		  user=0;
		try{
			user=Integer.parseInt(jTextField.getText().trim());
		   	if(user<0||user>100){
	    		//输入数据在0-100之间
	    		JOptionPane.showMessageDialog(jTextField,"请输入0到100之间的整数！");
	    		jTextField.setText("");
	    		jTextField.requestFocus();                    //文本清空并使文本重新获得焦点
	    		counter=0;
	    		jLabel4.setText("您猜了"+counter+"次！");
	    		jLabel2.setText("                    好期待啊！");
	    	}else if(user<rand){                              //用户输入值偏小
	    		jLabel2.setText("     您猜的数值偏小！");
	    		jTextField.setText("");
	    		jTextField.requestFocus();
	    		counter++;
	    		jLabel4.setText("您猜了"+counter+"次！");
	    	}else if(user>rand){                              //用户输入值偏大
	    		jLabel2.setText("     您猜的数值偏大！");
	    		jTextField.setText("");
	    		jTextField.requestFocus();
	    		counter++;
	    		jLabel4.setText("您猜了"+counter+"次！");
	    	}
	    	else if (user==rand){
	    		jLabel2.setText("     恭喜您，猜对了！");
	    		jLabel4.setText("您猜了"+counter+"次！");
	    	}
		}catch(NumberFormatException e){
			//如果没有输入或内容不是数值型数据
			JOptionPane.showMessageDialog(jTextField,"请将您输入的整数输入到文本框中！");
    		//弹出对话框提示用户"请将您猜得的整数输入到文本框中！"
    		jTextField.setText("");
    		jTextField.requestFocus();//文本框清空并使文本框重新获得焦点
    		
    		counter=0;
    		jLabel4.setText("您猜了"+counter+"次！");
    		jLabel2.setText("                    好期待啊！");
//    		continue;
    	}
// 	}
//	  }while(user!=rand);                               //用户猜对了
//    	jLabel2.setText("     恭喜您，猜对了！");
//    	jLabel4.setText("您猜了"+counter+"次！");
}
	public void actionPerformed(ActionEvent e) {
	    /*
	     * 监听者可以是包容事件源的容器JFrame，直接实现动作事件接ActionListener
	     * 所需要实现的方法actionPerformed(ActionEvent e)
	    */
	    	if(e.getSource()==jButton){
	    		//如果触发动作事件的事件源是确定按钮jbutton文本框jtextfile
	    		eventHandle();
	    	}else if(e.getSource()==jTextField){
	    		//如果触发动作事件的事件源是文本框jtextfile
	    		eventHandle();
	    	}
	}
	public static void main(String[] args){
		new NumberGuess();
	}

}


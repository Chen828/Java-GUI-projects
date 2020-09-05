package ClassDesign;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.FileWriter;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

/*
 * 11商品管理系统
	要求：
	1）	该系统主要处理商场中的商品信息。
	2）	商品信息主要包括：商品编号、商品类型、商品类型、价格、供应商等内容。
	3）	供应商信息主要包括：供应商编号、供应商名称、联系电话等内容。
	4）	完成以下的操作：实现商品信息、商品类型、供应商信息的添加、修改、删除和查询。
	提示：
	1）建立商品类、商品类型类、供应商类
	2）商品、商品类型、供应商信息的初始化
	）商品信息的添加、修改、删除、查找
	4）供应商信息的添加、修改、删除、查找
	5）商品信息、供应商信息的输出
*/

public class GoodManagement implements ActionListener{
	//图形界面
	JFrame jFrame;
	JPanel jPanel1,jPanel2,jPanel3,jPanel4;
	JLabel ajLabel0,ajLabel1,ajLabel2,ajLabel3,ajLabel4,ajLabel5,ajLabel6,ajLabel7,ajLabel8,
		ajLabel9,ajLabel10,ajLabel11,ajLabel12,ajLabel13,ajLabel14;
	JLabel bjLabel0,bjLabel1,bjLabel2,bjLabel3,bjLabel4,bjLabel5,bjLabel6,bjLabel7,bjLabel8,
		bjLabel9,bjLabel10,bjLabel11,bjLabel12,bjLabel13,bjLabel14,bjLabel15;
	JTextField aJTextField1,aJTextField2,aJTextField3,aJTextField4,aJTextField5;
	JTextField bJTextField1,bJTextField2,bJTextField3,bJTextField4;
	
	JLabel cjLabel0,cjLabel1,cjLabel2,cjLabel3,cjLabel4,cjLabel5,cjLabel6,cjLabel7,cjLabel8,  cjLabel9,
	cjLabel10,cjLabel11,cjLabel12,cjLabel13,cjLabel14,cjLabel15,cjLabel16,cjLabel17,cjLabel18;
	JTextField cjTextField;
	JButton cjButton3,cjButton1,cjButton2,cjButton4;
	String[] description={"  ","零食类","饮料类","日常类","食物类","科技类","办公类","娱乐类"};
	String string;
	int count=0;
	JComboBox jComboBox;
	
	JButton aadd,aselect,arevise,adelete;
	JButton badd,bselect,brevise,bdelete;
	JButton save;
	JTextArea jTextArea;
	//商品信息,供应商信息
	int i=0,k=0;	//商品good，供应商provide
	int[] gnum=new int[20];
	int[] pnum=new int[20];
	String[] gname=new String[20];
	String[] gpname=new String[20];
	String[] pname=new String[20];
	String[] gkind=new String[20];
	int[] gprice=new int[20];
	int[] pphone=new int[20];
	String[] paddress=new String[20];
	//构造方法
	GoodManagement(){
		jFrame=new JFrame("愿辰集团-商品管理系统");
		//jpanel1窗口
		jPanel1=new JPanel(new GridLayout(3, 8));
		ajLabel0=new JLabel("商品信息：",JLabel.CENTER);
		ajLabel7=new JLabel("");
		ajLabel8=new JLabel("");
		ajLabel9=new JLabel("");
		ajLabel10=new JLabel("");
		ajLabel11=new JLabel("");
		ajLabel12=new JLabel("");
		ajLabel6=new JLabel("");
//		save=new JButton("保存");
//		save.addActionListener(this);
		ajLabel1=new JLabel("商品编号：");
		aJTextField1=new JTextField(10);
		ajLabel2=new JLabel("商品名称：");
		aJTextField2=new JTextField(10);
		ajLabel3=new JLabel("商品类型：");
		aJTextField3=new JTextField(10);
		ajLabel4=new JLabel("商品价格：");
		aJTextField4=new JTextField(10);
		ajLabel5=new JLabel("商品供应商：");
		aJTextField5=new JTextField(10);
		ajLabel13=new JLabel("");
		ajLabel14=new JLabel("");
		aadd=new JButton("添加");
		aselect=new JButton("查找");
		arevise=new JButton("修改");
		adelete=new JButton("删除");
		aadd.addActionListener(this);
		aselect.addActionListener(this);
		arevise.addActionListener(this);
		adelete.addActionListener(this);
		jPanel1.add(ajLabel0);
		jPanel1.add(ajLabel7);
		jPanel1.add(ajLabel8);
		jPanel1.add(ajLabel9);
		jPanel1.add(ajLabel10);
		jPanel1.add(ajLabel11);
		jPanel1.add(ajLabel12);
//		jPanel1.add(save);
		jPanel1.add(ajLabel6);
		jPanel1.add(ajLabel1);
		jPanel1.add(aJTextField1);
		jPanel1.add(ajLabel2);
		jPanel1.add(aJTextField2);
		jPanel1.add(ajLabel3);
		jPanel1.add(aJTextField3);
		jPanel1.add(ajLabel4);
		jPanel1.add(aJTextField4);
		jPanel1.add(ajLabel5);
		jPanel1.add(aJTextField5);
		jPanel1.add(ajLabel13);
		jPanel1.add(ajLabel14);
		jPanel1.add(aadd);
		jPanel1.add(aselect);
		jPanel1.add(arevise);
		jPanel1.add(adelete);
		//jpanel2窗口
		jPanel2=new JPanel(new GridLayout(3, 8));
		bjLabel0=new JLabel("供应商信息：",JLabel.CENTER);
		bjLabel7=new JLabel("");
		bjLabel8=new JLabel("");
		bjLabel9=new JLabel("");
		bjLabel10=new JLabel("");
		bjLabel11=new JLabel("");
		bjLabel12=new JLabel("");
		bjLabel6=new JLabel("");
		bjLabel1=new JLabel("供应商编号：");
		bJTextField1=new JTextField(10);
		bjLabel2=new JLabel("供应商名称：");
		bJTextField2=new JTextField(10);
		bjLabel3=new JLabel("供应商电话：");
		bJTextField3=new JTextField(10);
		bjLabel4=new JLabel("供应商地址：");
		bJTextField4=new JTextField(10);
		bjLabel5=new JLabel("");
		bjLabel15=new JLabel("");
		bjLabel13=new JLabel("");
		bjLabel14=new JLabel("");
		badd=new JButton("添加");
		bselect=new JButton("查找");
		brevise=new JButton("修改");
		bdelete=new JButton("删除");
		badd.addActionListener(this);
		bselect.addActionListener(this);
		brevise.addActionListener(this);
		bdelete.addActionListener(this);
		jPanel2.add(bjLabel0);
		jPanel2.add(bjLabel7);
		jPanel2.add(bjLabel8);
		jPanel2.add(bjLabel9);
		jPanel2.add(bjLabel10);
		jPanel2.add(bjLabel11);
		jPanel2.add(bjLabel12);
		jPanel2.add(bjLabel6);
		jPanel2.add(bjLabel1);
		jPanel2.add(bJTextField1);
		jPanel2.add(bjLabel2);
		jPanel2.add(bJTextField2);
		jPanel2.add(bjLabel3);
		jPanel2.add(bJTextField3);
		jPanel2.add(bjLabel4);
		jPanel2.add(bJTextField4);
		jPanel2.add(bjLabel5);
		jPanel2.add(bjLabel15);
		jPanel2.add(bjLabel13);
		jPanel2.add(bjLabel14);
		jPanel2.add(badd);
		jPanel2.add(bselect);
		jPanel2.add(brevise);
		jPanel2.add(bdelete);
		
		//jpanel3
		jPanel3=new JPanel(new GridLayout(3,8));
		cjLabel10=new JLabel("");
		cjLabel11=new JLabel("");
		cjLabel12=new JLabel("");
		cjLabel13=new JLabel("");
		cjLabel14=new JLabel("");
		cjLabel15=new JLabel("");
		cjLabel16=new JLabel("");
		cjLabel17=new JLabel("");
		cjLabel0=new JLabel("书籍类型");
		cjTextField=new JTextField(10);
		jComboBox=new JComboBox();
		//		cjLabel1=new JLabel("");
		cjLabel2=new JLabel("");
		cjButton1=new JButton("添加");
		cjButton1.addActionListener(this);
		cjButton2=new JButton("查找");
		cjButton2.addActionListener(this);
		cjButton3=new JButton("修改");
		cjButton3.addActionListener(this);
		cjButton4=new JButton("删除");
		cjButton4.addActionListener(this);
		cjLabel3=new JLabel("");
		cjLabel4=new JLabel("");
		cjLabel5=new JLabel("");
		cjLabel6=new JLabel("");
		cjLabel7=new JLabel("");
		cjLabel8=new JLabel("");
		cjLabel9=new JLabel("");
		cjLabel18=new JLabel("");
//		save=new JButton("保存");
//		save.addActionListener(this);
		jPanel3.add(cjLabel10);
		jPanel3.add(cjLabel11);
		jPanel3.add(cjLabel12);
		jPanel3.add(cjLabel13);
		jPanel3.add(cjLabel14);
		jPanel3.add(cjLabel15);
		jPanel3.add(cjLabel16);
		jPanel3.add(cjLabel17);
		jPanel3.add(cjLabel0);
		jPanel3.add(cjTextField);
		jPanel3.add(jComboBox);
		jPanel3.add(cjLabel2);
		jPanel3.add(cjButton1);
		jPanel3.add(cjButton2);
		jPanel3.add(cjButton3);
		jPanel3.add(cjButton4);
		jPanel3.add(cjLabel3);
		jPanel3.add(cjLabel4);
		jPanel3.add(cjLabel5);
		jPanel3.add(cjLabel6);
//		jPanel3.add(save);
		jPanel3.add(cjLabel18);
		jPanel3.add(cjLabel7);
		jPanel3.add(cjLabel8);
		jPanel3.add(cjLabel9);
		for(int i=0;i<5;i++,count++){
			jComboBox.addItem(description[count]);
			}
		jComboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				aJTextField3.setText("index:"+jComboBox.getSelectedIndex()+" "+((JComboBox)e.getSource()).
						getSelectedItem());
//				bJTextField3.setText("index:"+jComboBox.getSelectedIndex()+" "+((JComboBox)e.getSource()).
//						getSelectedItem());
				cjTextField.setText("index:"+jComboBox.getSelectedIndex()+" "+((JComboBox)e.getSource()).
						getSelectedItem());
			}
		});
	
		//jpanel4
		jPanel4=new JPanel(new GridLayout(3,1));//必须网格，否则两个只能显示第一个
		jPanel4.add(jPanel1);
		jPanel4.add(jPanel2);
		jPanel4.add(jPanel3);
				
		//jtextarea
		jTextArea=new JTextArea(940,100);
		jTextArea.setEnabled(false);
		JScrollPane jScrollPane=new JScrollPane(jTextArea);
		//BorderLayout布局才显示
		//jframe窗口
		jFrame.add(BorderLayout.NORTH,jPanel4);
		jFrame.add(BorderLayout.CENTER,jScrollPane);
		jFrame.setBounds(220, 100, 940, 550);
//		jFrame.setSize(300,300);			//JFrame尺寸
//		jFrame.setLocation(500, 220);
		jFrame.setVisible(true);
		jFrame.addWindowListener((WindowListener) this);
	}
	//商品信息方法
	public void gselects() {
		int find=0;
		for(int j=0;j<i;j++){
			//**整型要先Integer.parseInt再进行==比较，字符串直接用.equals()比较
			//单用if避免用户对要查信息模糊
			if(aJTextField1.getText().length()!=0){
				if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
					jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
					find=1;
				}
			}else if(aJTextField2.getText().length()!=0){
				if(aJTextField2.getText().equals(gname[j])){
					jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
					find=1;
				}
			}else if(aJTextField3.getText().length()!=0){
				if(aJTextField3.getText().equals(gkind[j])){
					jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
					find=1;
				}
			}else if (aJTextField4.getText().length()!=0) {           //判断JTextField是否为空
				if(Integer.parseInt(aJTextField4.getText())==gprice[j]){
					jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
					find=1;
				}
			}else if (aJTextField5.getText().length()!=0) {
				if(aJTextField5.getText()==gpname[j]){
					jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
					find=1;
				}
			}
		}
		if(find==0){
			jTextArea.append("您好，此人的通讯录不存在！\n");
		}
	}
	public void gadds() {
		gnum[i]=Integer.parseInt(aJTextField1.getText());           //string 读取
		gname[i]=aJTextField2.getText();
		gkind[i]=aJTextField3.getText();
		gprice[i]=Integer.parseInt(aJTextField4.getText());
		gpname[i]=aJTextField5.getText();
		jTextArea.append("添加结果为：\n"+"  商品编号："+gnum[i]+"  商品名称："+gname[i]+"  商品类型："+gkind[i]+"  商品价格："
		+gprice[i]+"  商品供应商："+gpname[i]+"\n");
		this.i++;
		aJTextField1.setText("");
		aJTextField2.setText("");              
		aJTextField3.setText("");
		aJTextField4.setText("");
		aJTextField5.setText("");
	}
	public void grevises() {
		for (int j=0; j<i; j++) {
			if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
				//单独if而非else，避免有多重改动
				if(aJTextField2.getText().length()!=0){
					gname[j]=aJTextField2.getText();
				}if(aJTextField3.getText().length()!=0){
					gkind[j]=aJTextField3.getText();
				}if (aJTextField3.getText().length()!=0) {           //  ****判断JTextField是否为空***
					gprice[j]=Integer.parseInt(aJTextField3.getText());
				}if (aJTextField4.getText().length()!=0) {
					gpname[j]=aJTextField4.getText();
				}
				jTextArea.append("修改结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+"  商品类型："
				+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
			}
		}
	}
	public void gdeletes() {
		for(int j=0;j<i;j++){             //寻找序号
			if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
				for(;j<i;j++){
					if(j==i-1){  //通讯录最后一人，直接i-1,等再次输入
						i--;     //此时j=i，break更快结束
						break;
					}else{
						gnum[j]=gnum[j+1];
						gname[j]=gname[j+1];
						gkind[j]=gkind[j+1];
						gprice[j]=gprice[j+1];
						gpname[j]=gpname[j+1];
					}
				}
				jTextArea.append("删除成功！\n");
			}
		}
	}
	//供应商方法
	public void pselects() {
		int find=0;
		for(int j=0;j<i;j++){
			//**整型要先Integer.parseInt再进行==比较，字符串直接用.equals()比较
			//单用if避免用户对要查信息模糊
			if(bJTextField1.getText().length()!=0){
				if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
						"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField2.getText().length()!=0){
				if(bJTextField2.getText().equals(pname[j])){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(Integer.parseInt(bJTextField3.getText())==pphone[j]){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField4.getText().length()!=0) {           //判断JTextField是否为空
				if(bJTextField4.getText().equals(paddress[j])){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}
		}
		if(find==0){
			jTextArea.append("您好，此人的通讯录不存在！\n");
		}
	}
	public void padds() {
		pnum[k]=Integer.parseInt(bJTextField1.getText());           //string 读取
		pname[k]=bJTextField2.getText();
		pphone[k]=Integer.parseInt(bJTextField3.getText());
		paddress[k]=bJTextField4.getText();
		jTextArea.append("添加结果为：\n"+"  供应商编号："+pnum[k]+"  供应商名称："+pname[k]+"  供应商电话："+
				pphone[k]+"  供应商地址："+paddress[k]+"\n");
		this.k++;
		bJTextField1.setText("");
		bJTextField2.setText("");              
		bJTextField3.setText("");
		bJTextField4.setText("");
		//写入文件
//			String lines= jTextArea.getText();
//			FileWriter fw = null;
//			PrintWriter pw = null;
//			try{
//			    fw = new FileWriter("src/classdesign/GoodManagement.txt");//文件输出流
//			    pw = new PrintWriter(fw);                           //缓冲式文件输出流
//			    for (int i = 0; i < lines.length(); i++) {
//			    	char c = lines.charAt(i);
//			    	if( c != 10 ){
//			    		pw.print(c);
//			    	}else{
//			    		pw.println();
//			    	}
//			    }
//
//			}catch(java.io.IOException ioe){
//			    ioe.printStackTrace();
//			}finally{
//			    try{
//			if( pw != null )    pw.close();
//			if( fw != null )    fw.close();
//			    }catch(java.io.IOException ignore){
//			    }
//			}
	}
	public void previses() {
		for (int j=0; j<i; j++) {
			if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
				//单独if而非else，避免有多重改动
				if(bJTextField2.getText().length()!=0){
					pname[j]=aJTextField2.getText();
				}if(bJTextField3.getText().length()!=0){
					pphone[j]=Integer.parseInt(bJTextField3.getText());
				}if (bJTextField4.getText().length()!=0) {           //  ****判断JTextField是否为空***
					paddress[j]=aJTextField4.getText();
				}
				jTextArea.append("修改结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+"  供应商电话："+
						pphone[j]+"  供应商地址："+paddress[j]+"\n");
			}
		}
	}
	public void pdeletes() {
		for(int j=0;j<i;j++){             //寻找序号
			if(Integer.parseInt(aJTextField1.getText())==pnum[j]){
				for(;j<i;j++){
					if(j==i-1){  //通讯录最后一人，直接i-1,等再次输入
						i--;     //此时j=i，break更快结束
						break;
					}else{
						pnum[j]=pnum[j+1];
						pname[j]=pname[j+1];
						pphone[j]=pphone[j+1];
						paddress[j]=paddress[j+1];
					}
				}
				jTextArea.append("删除成功！");
			}
		}
	}
	//商品类型
	public void sadd(){
//		String[] description={"  ","信息类","建筑类","化学类","生物类","数学类","文学类","英语类"};
		if(count<description.length){
			jComboBox.addItem(description[count++]);
		}
	}
	public void sselect(){
		for(int j=0;j<i;j++){
			if(cjTextField.getText().equals(gkind[j])){
				jTextArea.append("查找结果为：\n"+"  商品编号："+gnum[j]+"  商品名称："+gname[j]+
						"  商品类型："+gkind[j]+"  商品价格："+gprice[j]+"  商品供应商："+gpname[j]+"\n");
			}
		}
	}
//	public void save(){
		//写入文件
//		String lines= jTextArea.getText();
//		FileWriter fw = null;
//		PrintWriter pw = null;
//		try{
//		    fw = new FileWriter("src/classdesign/GoodManagement.txt");//文件输出流
//		    pw = new PrintWriter(fw);                           //缓冲式文件输出流
//		    for (int i = 0; i < lines.length(); i++) {
//		    	char c = lines.charAt(i);
//		    	if( c != 10 ){
//		    		pw.print(c);
//		    	}else{
//		    		pw.println();
//		    	}
//		    }
//
//		}catch(java.io.IOException ioe){
//		    ioe.printStackTrace();
//		}finally{
//		    try{
//		if( pw != null )    pw.close();
//		if( fw != null )    fw.close();
//		    }catch(java.io.IOException ignore){
//		    }
//		}
//	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==aselect){
			gselects();
		}else if(e.getSource()==aadd){
			gadds();
		}else if(e.getSource()==arevise){
			grevises();
		}else if(e.getSource()==adelete){
			gdeletes();
		}else if(e.getSource()==bselect){
			pselects();
		}else if(e.getSource()==badd){
			padds();
		}else if(e.getSource()==brevise){
			previses();
		}else if(e.getSource()==bdelete){
			pdeletes();
//		}else if(e.getSource()==save){
//			save();
		}
	}
	public static void main (String[] args){
		new GoodManagement();
	}
}


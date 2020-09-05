package ClassDesign;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 	13图书管理系统
	要求：
	1）	该系统主要处理图书馆中的图书信息以及供应商向图书馆供应图书的信息。
	2）	图书信息主要包括：图书编号、图书名称、图书类型、作者、出版社、库存等内容。
	3）供应商信息主要包括：供应商编号、供应商名称、供书类型、地址、电话等内容
	4）其中，图书类型和供书类型是都是书籍类型（如：信息类、建筑类、化学类、生物类等）
	5）	完成以下的操作：
		实现图书信息的添加、修改、删除和查询；
		图书供应商信息的添加、修改、删除和查询；
		书籍类型的添加、修改、删除和查询；
		供应商向图书馆供应图书的情况查询、统计。
	提示：
	1）建立书籍类型类、图书类、供应商类
	2）书籍类型、图书信息、供应商的初始化
	3）书籍类型、图书信息、供应商的添加、修改、删除、查找
	4）对图书信息按编号、书名排序
	5）将图书信息和供应商信息保存为文件
*/

public class BookManagment implements ActionListener{
	//图形界面
	JFrame jFrame;
	JPanel jPanel1,jPanel2,jPanel3,jPanel4;
	//图书
	JLabel ajLabel0,ajLabel1,ajLabel2,ajLabel3,ajLabel4,ajLabel5,ajLabel6,ajLabel7,ajLabel8,
		ajLabel9,ajLabel10,ajLabel11,ajLabel12,ajLabel13;
	JTextField aJTextField1,aJTextField2,aJTextField3,aJTextField4,aJTextField5,aJTextField6;
	JButton aadd,aselect,arevise,adelete;
//	JComboBox ajComboBox;
	//供应商
	JLabel bjLabel0,bjLabel1,bjLabel2,bjLabel3,bjLabel4,bjLabel5,bjLabel6,bjLabel7,bjLabel8,
		bjLabel9,bjLabel10,bjLabel11,bjLabel12,bjLabel13,bjLabel14,bjLabel15,bjLabel16,bjLabel17;
	JTextField bJTextField1,bJTextField2,bJTextField3,bJTextField4,bJTextField5;
	JButton badd,bselect,brevise,bdelete;
	//书籍类型
	JLabel cjLabel0,cjLabel1,cjLabel2,cjLabel3,cjLabel4,cjLabel5,cjLabel6,cjLabel7,cjLabel8,  cjLabel9,
		cjLabel10,cjLabel11,cjLabel12,cjLabel13,cjLabel14,cjLabel15,cjLabel16,cjLabel17;
	JTextField cjTextField;
	JButton cjButton3,cjButton1,cjButton2,cjButton4;
	String[] description={"  ","信息类","建筑类","化学类","生物类","数学类","文学类","英语类"};
	String string;
	int count=0;
	JComboBox jComboBox;
	
	JLabel djLabel;
	JButton save;
	JTextArea jTextArea;
	//商品信息,供应商信息
	int i=0,k=0;	//商品good，供应商provide
	int[] gnum=new int[20];
	int[] pnum=new int[20];
	int[] gn=new int[20];
	String[] gname=new String[20];
	String[] gpname=new String[20];
	String[] pname=new String[20];
	String[] gkind=new String[20];
	String[] pkind=new String[20];
	String[] gth=new String[20];
	int[] pphone=new int[20];
	String[] paddress=new String[20];
	File file;
	FileWriter fWriter;
	BufferedWriter bWriter;
	//构造方法
	BookManagment(){
		jFrame=new JFrame("愿辰集团-图书管理系统");
		//jpanel1窗口
		jPanel1=new JPanel(new GridLayout(3, 8));
		ajLabel0=new JLabel("图书信息：",JLabel.CENTER);
		ajLabel7=new JLabel("");
		ajLabel8=new JLabel("");
		ajLabel9=new JLabel("");
		ajLabel10=new JLabel("");
		ajLabel11=new JLabel("");
		ajLabel12=new JLabel("");
		ajLabel13=new JLabel("");		
		ajLabel1=new JLabel("图书编号：");
		aJTextField1=new JTextField(10);
		ajLabel2=new JLabel("图书名称：");
		aJTextField2=new JTextField(10);
		ajLabel3=new JLabel("图书类型：");
		aJTextField3=new JTextField(10);
		ajLabel4=new JLabel("作者：");
		aJTextField4=new JTextField(10);
		ajLabel5=new JLabel("出版社：");
		aJTextField5=new JTextField(10);
		ajLabel6=new JLabel("库存：");
		aJTextField6=new JTextField(10);
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
		jPanel1.add(ajLabel13);
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
		jPanel1.add(ajLabel6);
		jPanel1.add(aJTextField6);
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
		bjLabel3=new JLabel("供书类型：");
		bJTextField3 =new JTextField(10);
		bjLabel4=new JLabel("供应商电话：");
		bJTextField4=new JTextField(10);
		bjLabel5=new JLabel("供应商地址：");
		bJTextField5=new JTextField(10);
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
		jPanel2.add(bJTextField5);
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
		save=new JButton("保存");
		save.addActionListener(this);
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
		jPanel3.add(save);
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
				bJTextField3.setText("index:"+jComboBox.getSelectedIndex()+" "+((JComboBox)e.getSource()).
						getSelectedItem());
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
//		jFrame.setLayout(new GridLayout(4,1));
//		jFrame.add(jPanel1);
//		jFrame.add(jPanel2);
//		jFrame.add(jPanel3);
//		jFrame.add(jPanel4);
		jFrame.add(BorderLayout.NORTH ,jPanel4);
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
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
					find=1;
				}
			}else if(aJTextField2.getText().length()!=0){
				if(aJTextField2.getText().equals(gname[j])){
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(bJTextField3.getText().equals(gkind[j])){
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField4.getText().length()!=0) {           //判断JTextField是否为空
				if(aJTextField4.getText().equals(gth[i])){
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField5.getText().length()!=0) {
				if(aJTextField5.getText()==gpname[j]){
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField6.getText().length()!=0) {
				if(Integer.parseInt(aJTextField6.getText())==gn[i]){
					jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
							+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
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
		gth[i]=aJTextField4.getText();
		gpname[i]=aJTextField5.getText();
		gn[i]=Integer.parseInt(aJTextField6.getText());
		jTextArea.append("添加结果为：\n"+"  图书编号："+gnum[i]+"  图书名称："+gname[i]+"  图书类型："+gkind[i]+"  作者："
		+gth[i]+"  出版社："+gpname[i]+"  库存："+gn[i]+"\n");
		this.i++;
		aJTextField1.setText("");
		aJTextField2.setText("");              
		aJTextField3.setText("");
		aJTextField4.setText("");
		aJTextField5.setText("");
		aJTextField6.setText("");
	}
	public void grevises() {
		for (int j=0; j<i; j++) {
			if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
				//单独if而非else，避免有多重改动
				if(aJTextField2.getText().length()!=0){
					gname[j]=aJTextField2.getText();
				}if(aJTextField3.getText().length()!=0){
					gkind[j]=aJTextField3.getText();
				}if (aJTextField4.getText().length()!=0) {           //  ****判断JTextField是否为空***
					gth[j]=aJTextField4.getText();
				}if (aJTextField5.getText().length()!=0) {
					gpname[j]=aJTextField5.getText();
				}if (aJTextField6.getText().length()!=0) {
					gn[j]=Integer.parseInt(aJTextField6.getText());
				}
				jTextArea.append("修改结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
						+gth[j]+"  出版社："+gpname[i]+"  库存："+gn[j]+"\n");
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
						gth[j]=gth[j+1];
						gpname[j]=gpname[j+1];
						gn[j]=gn[j+1];
					}
				}
				jTextArea.append("删除成功！\n");
			}
		}
	}

	//供应商方法
	public void pselects() {
		int find=0;
		for(int j=0;j<k;j++){
			//**整型要先Integer.parseInt再进行==比较，字符串直接用.equals()比较
			//单用if避免用户对要查信息模糊
			if(bJTextField1.getText().length()!=0){
				if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField2.getText().length()!=0){
				if(bJTextField2.getText().equals(pname[j])){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(bJTextField3.getText().equals(pkind[j])){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField4.getText().length()!=0) {           //判断JTextField是否为空
				if(Integer.parseInt(bJTextField4.getText())==pphone[j]){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField5.getText().length()!=0) {           //判断JTextField是否为空
				if(bJTextField5.getText().equals(paddress[j])){
					jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
							"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
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
		pkind[k]=bJTextField3.getText();
		pphone[k]=Integer.parseInt(bJTextField4.getText());
		paddress[k]=bJTextField5.getText();
		jTextArea.append("添加结果为：\n"+"  供应商编号："+pnum[k]+"  供应商名称："+pname[k]+
				"  供应书类型："+pkind[k]+"  供应商电话："+pphone[k]+"  供应商地址："+paddress[k]+"\n");
		this.k++;
		bJTextField1.setText("");
		bJTextField2.setText("");              
		bJTextField3.setText("");
		bJTextField4.setText("");
		bJTextField5.setText("");
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
		for (int j=0; j<k; j++) {
			if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
				//单独if而非else，避免有多重改动
				if(bJTextField2.getText().length()!=0){
					pname[j]=aJTextField2.getText();
				}if (bJTextField3.getText().length()!=0) {           //  ****判断JTextField是否为空***
					pkind[j]=aJTextField3.getText();
				}if(bJTextField4.getText().length()!=0){
					pphone[j]=Integer.parseInt(bJTextField4.getText());
				}if (bJTextField5.getText().length()!=0) {           //  ****判断JTextField是否为空***
					paddress[j]=aJTextField5.getText();
				}
				jTextArea.append("修改结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
						"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
			}
		}
	}
	public void pdeletes() {
		for(int j=0;j<k;j++){             //寻找序号
			if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
				for(;j<k;j++){
					if(j==k-1){  //通讯录最后一人，直接i-1,等再次输入
						k--;     //此时j=i，break更快结束
						break;
					}else{
						pnum[j]=pnum[j+1];
						pname[j]=pname[j+1];
						pkind[j]=pkind[j+1];
						pphone[j]=pphone[j+1];
						paddress[j]=paddress[j+1];
					}
				}
				jTextArea.append("删除成功！");
			}
		}
	}
		
	//书籍类型
	public void sadd(){
//		String[] description={"  ","信息类","建筑类","化学类","生物类","数学类","文学类","英语类"};
		if(count<description.length){
			jComboBox.addItem(description[count++]);
		}
	}
	public void sselect(){
		for(int j=0;j<i;j++){
			if(cjTextField.getText().equals(gkind[j])){
				jTextArea.append("查找结果为：\n"+"  图书编号："+gnum[j]+"  图书名称："+gname[j]+"  图书类型："+gkind[j]+"  作者："
						+gth[j]+"  出版社："+gpname[j]+"  库存："+gn[j]+"\n");
			}
			if(cjTextField.getText().equals(pkind[j])){
				jTextArea.append("查找结果为：\n"+"  供应商编号："+pnum[j]+"  供应商名称："+pname[j]+
						"  供应书类型："+pkind[j]+"  供应商电话："+pphone[j]+"  供应商地址："+paddress[j]+"\n");
			}
		}
	}
	public void srevise(){
		
	}
	public void sdelete(){
		
	}
	
	//保存
//	public void save(){
//		//写入文件
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
	public void saves(){
		try {
			File fin1=new File("src"+File.separator+"classdesign"); 
			if(fin1.exists()){
				jTextArea.append("文件夹已存在\n");
//				return;
			}else{
				fin1.mkdirs();
			}
			
			file= new File(fin1+File.separator+"BoodManagement.txt");//文件输出流
			if(!file.exists()){
//				file1.mkdirs();
				jTextArea.append("文件不存在，已成功创建！\n");
				file.createNewFile();			
			}
//			FileWriter fWriter;
			fWriter = new FileWriter(file);
			bWriter=new BufferedWriter(fWriter);
			for(int j=0;j<i;j++){
				bWriter.write("图书信息\n图书编号:");
				bWriter.write(gnum[j]);
				bWriter.write("图书名称:");
				bWriter.write(gname[j]);
				bWriter.write("图书类型:");
				bWriter.write(gkind[j]);
				bWriter.write("图书作者:");
				bWriter.write(gth[j]);
				bWriter.write("出版社:");
				bWriter.write(gpname[j]);
				bWriter.write("库存:");
				bWriter.write(gn[j]);
				bWriter.write("\n");
			}
			for(int j=0;j<k;j++){
				bWriter.write("供应商信息\n供应商编号:");
				bWriter.write(pnum[j]);
				bWriter.write("供应商名称:");
				bWriter.write(pname[j]);
				bWriter.write("供应商类型:");
				bWriter.write(pkind[j]);
				bWriter.write("供应商电话:");
				bWriter.write(pphone[j]);
				bWriter.write("供应商地址:");
				bWriter.write(paddress[j]);
				bWriter.write("\n");
			}
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jTextArea.append("文件复制完成，请看以下目录\n");
		jTextArea.append(file.getAbsolutePath()+"\n");

	}
	//动作监听
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
		}else if(e.getSource()==cjButton1){
			sadd();
		}else if(e.getSource()==cjButton2){
			sselect();
		}else if(e.getSource()==cjButton3){
			srevise();
		}else if(e.getSource()==cjButton3){
			sdelete();
		}else if (e.getSource()==save) {
			saves();
		}
	}
	public static void main (String[] args){
		new BookManagment();
	}
}
	


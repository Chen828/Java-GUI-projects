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
 	13ͼ�����ϵͳ
	Ҫ��
	1��	��ϵͳ��Ҫ����ͼ����е�ͼ����Ϣ�Լ���Ӧ����ͼ��ݹ�Ӧͼ�����Ϣ��
	2��	ͼ����Ϣ��Ҫ������ͼ���š�ͼ�����ơ�ͼ�����͡����ߡ������硢�������ݡ�
	3����Ӧ����Ϣ��Ҫ��������Ӧ�̱�š���Ӧ�����ơ��������͡���ַ���绰������
	4�����У�ͼ�����ͺ͹��������Ƕ����鼮���ͣ��磺��Ϣ�ࡢ�����ࡢ��ѧ�ࡢ������ȣ�
	5��	������µĲ�����
		ʵ��ͼ����Ϣ����ӡ��޸ġ�ɾ���Ͳ�ѯ��
		ͼ�鹩Ӧ����Ϣ����ӡ��޸ġ�ɾ���Ͳ�ѯ��
		�鼮���͵���ӡ��޸ġ�ɾ���Ͳ�ѯ��
		��Ӧ����ͼ��ݹ�Ӧͼ��������ѯ��ͳ�ơ�
	��ʾ��
	1�������鼮�����ࡢͼ���ࡢ��Ӧ����
	2���鼮���͡�ͼ����Ϣ����Ӧ�̵ĳ�ʼ��
	3���鼮���͡�ͼ����Ϣ����Ӧ�̵���ӡ��޸ġ�ɾ��������
	4����ͼ����Ϣ����š���������
	5����ͼ����Ϣ�͹�Ӧ����Ϣ����Ϊ�ļ�
*/

public class BookManagment implements ActionListener{
	//ͼ�ν���
	JFrame jFrame;
	JPanel jPanel1,jPanel2,jPanel3,jPanel4;
	//ͼ��
	JLabel ajLabel0,ajLabel1,ajLabel2,ajLabel3,ajLabel4,ajLabel5,ajLabel6,ajLabel7,ajLabel8,
		ajLabel9,ajLabel10,ajLabel11,ajLabel12,ajLabel13;
	JTextField aJTextField1,aJTextField2,aJTextField3,aJTextField4,aJTextField5,aJTextField6;
	JButton aadd,aselect,arevise,adelete;
//	JComboBox ajComboBox;
	//��Ӧ��
	JLabel bjLabel0,bjLabel1,bjLabel2,bjLabel3,bjLabel4,bjLabel5,bjLabel6,bjLabel7,bjLabel8,
		bjLabel9,bjLabel10,bjLabel11,bjLabel12,bjLabel13,bjLabel14,bjLabel15,bjLabel16,bjLabel17;
	JTextField bJTextField1,bJTextField2,bJTextField3,bJTextField4,bJTextField5;
	JButton badd,bselect,brevise,bdelete;
	//�鼮����
	JLabel cjLabel0,cjLabel1,cjLabel2,cjLabel3,cjLabel4,cjLabel5,cjLabel6,cjLabel7,cjLabel8,  cjLabel9,
		cjLabel10,cjLabel11,cjLabel12,cjLabel13,cjLabel14,cjLabel15,cjLabel16,cjLabel17;
	JTextField cjTextField;
	JButton cjButton3,cjButton1,cjButton2,cjButton4;
	String[] description={"  ","��Ϣ��","������","��ѧ��","������","��ѧ��","��ѧ��","Ӣ����"};
	String string;
	int count=0;
	JComboBox jComboBox;
	
	JLabel djLabel;
	JButton save;
	JTextArea jTextArea;
	//��Ʒ��Ϣ,��Ӧ����Ϣ
	int i=0,k=0;	//��Ʒgood����Ӧ��provide
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
	//���췽��
	BookManagment(){
		jFrame=new JFrame("Ը������-ͼ�����ϵͳ");
		//jpanel1����
		jPanel1=new JPanel(new GridLayout(3, 8));
		ajLabel0=new JLabel("ͼ����Ϣ��",JLabel.CENTER);
		ajLabel7=new JLabel("");
		ajLabel8=new JLabel("");
		ajLabel9=new JLabel("");
		ajLabel10=new JLabel("");
		ajLabel11=new JLabel("");
		ajLabel12=new JLabel("");
		ajLabel13=new JLabel("");		
		ajLabel1=new JLabel("ͼ���ţ�");
		aJTextField1=new JTextField(10);
		ajLabel2=new JLabel("ͼ�����ƣ�");
		aJTextField2=new JTextField(10);
		ajLabel3=new JLabel("ͼ�����ͣ�");
		aJTextField3=new JTextField(10);
		ajLabel4=new JLabel("���ߣ�");
		aJTextField4=new JTextField(10);
		ajLabel5=new JLabel("�����磺");
		aJTextField5=new JTextField(10);
		ajLabel6=new JLabel("��棺");
		aJTextField6=new JTextField(10);
		aadd=new JButton("���");
		aselect=new JButton("����");
		arevise=new JButton("�޸�");
		adelete=new JButton("ɾ��");
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
		
		//jpanel2����
		jPanel2=new JPanel(new GridLayout(3, 8));
		bjLabel0=new JLabel("��Ӧ����Ϣ��",JLabel.CENTER);
		bjLabel7=new JLabel("");
		bjLabel8=new JLabel("");
		bjLabel9=new JLabel("");
		bjLabel10=new JLabel("");
		bjLabel11=new JLabel("");
		bjLabel12=new JLabel("");
		bjLabel6=new JLabel("");
		bjLabel1=new JLabel("��Ӧ�̱�ţ�");
		bJTextField1=new JTextField(10);
		bjLabel2=new JLabel("��Ӧ�����ƣ�");
		bJTextField2=new JTextField(10);
		bjLabel3=new JLabel("�������ͣ�");
		bJTextField3 =new JTextField(10);
		bjLabel4=new JLabel("��Ӧ�̵绰��");
		bJTextField4=new JTextField(10);
		bjLabel5=new JLabel("��Ӧ�̵�ַ��");
		bJTextField5=new JTextField(10);
		bjLabel13=new JLabel("");
		bjLabel14=new JLabel("");
		badd=new JButton("���");
		bselect=new JButton("����");
		brevise=new JButton("�޸�");
		bdelete=new JButton("ɾ��");
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
		cjLabel0=new JLabel("�鼮����");
		cjTextField=new JTextField(10);
		jComboBox=new JComboBox();
		//		cjLabel1=new JLabel("");
		cjLabel2=new JLabel("");
		cjButton1=new JButton("���");
		cjButton1.addActionListener(this);
		cjButton2=new JButton("����");
		cjButton2.addActionListener(this);
		cjButton3=new JButton("�޸�");
		cjButton3.addActionListener(this);
		cjButton4=new JButton("ɾ��");
		cjButton4.addActionListener(this);
		cjLabel3=new JLabel("");
		cjLabel4=new JLabel("");
		cjLabel5=new JLabel("");
		cjLabel6=new JLabel("");
		cjLabel7=new JLabel("");
		cjLabel8=new JLabel("");
		cjLabel9=new JLabel("");
		save=new JButton("����");
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
		jPanel4=new JPanel(new GridLayout(3,1));//�������񣬷�������ֻ����ʾ��һ��
		jPanel4.add(jPanel1);
		jPanel4.add(jPanel2);
		jPanel4.add(jPanel3);
		//jtextarea
		jTextArea=new JTextArea(940,100);
		jTextArea.setEnabled(false);
		JScrollPane jScrollPane=new JScrollPane(jTextArea);
		//BorderLayout���ֲ���ʾ
		
		//jframe����
//		jFrame.setLayout(new GridLayout(4,1));
//		jFrame.add(jPanel1);
//		jFrame.add(jPanel2);
//		jFrame.add(jPanel3);
//		jFrame.add(jPanel4);
		jFrame.add(BorderLayout.NORTH ,jPanel4);
		jFrame.add(BorderLayout.CENTER,jScrollPane);
		jFrame.setBounds(220, 100, 940, 550);
//		jFrame.setSize(300,300);			//JFrame�ߴ�
//		jFrame.setLocation(500, 220);
		jFrame.setVisible(true);
		jFrame.addWindowListener((WindowListener) this);
	}
	
	//��Ʒ��Ϣ����
	public void gselects() {
		int find=0;
		for(int j=0;j<i;j++){
			//**����Ҫ��Integer.parseInt�ٽ���==�Ƚϣ��ַ���ֱ����.equals()�Ƚ�
			//����if�����û���Ҫ����Ϣģ��
			if(aJTextField1.getText().length()!=0){
				if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}else if(aJTextField2.getText().length()!=0){
				if(aJTextField2.getText().equals(gname[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(bJTextField3.getText().equals(gkind[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField4.getText().length()!=0) {           //�ж�JTextField�Ƿ�Ϊ��
				if(aJTextField4.getText().equals(gth[i])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField5.getText().length()!=0) {
				if(aJTextField5.getText()==gpname[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}else if (aJTextField6.getText().length()!=0) {
				if(Integer.parseInt(aJTextField6.getText())==gn[i]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
							+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
					find=1;
				}
			}
		}
		if(find==0){
			jTextArea.append("���ã����˵�ͨѶ¼�����ڣ�\n");
		}
	}
	public void gadds() {
		gnum[i]=Integer.parseInt(aJTextField1.getText());           //string ��ȡ
		gname[i]=aJTextField2.getText();
		gkind[i]=aJTextField3.getText();
		gth[i]=aJTextField4.getText();
		gpname[i]=aJTextField5.getText();
		gn[i]=Integer.parseInt(aJTextField6.getText());
		jTextArea.append("��ӽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[i]+"  ͼ�����ƣ�"+gname[i]+"  ͼ�����ͣ�"+gkind[i]+"  ���ߣ�"
		+gth[i]+"  �����磺"+gpname[i]+"  ��棺"+gn[i]+"\n");
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
				//����if����else�������ж��ظĶ�
				if(aJTextField2.getText().length()!=0){
					gname[j]=aJTextField2.getText();
				}if(aJTextField3.getText().length()!=0){
					gkind[j]=aJTextField3.getText();
				}if (aJTextField4.getText().length()!=0) {           //  ****�ж�JTextField�Ƿ�Ϊ��***
					gth[j]=aJTextField4.getText();
				}if (aJTextField5.getText().length()!=0) {
					gpname[j]=aJTextField5.getText();
				}if (aJTextField6.getText().length()!=0) {
					gn[j]=Integer.parseInt(aJTextField6.getText());
				}
				jTextArea.append("�޸Ľ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
						+gth[j]+"  �����磺"+gpname[i]+"  ��棺"+gn[j]+"\n");
			}
		}
	}
	public void gdeletes() {
		for(int j=0;j<i;j++){             //Ѱ�����
			if(Integer.parseInt(aJTextField1.getText())==gnum[j]){
				for(;j<i;j++){
					if(j==i-1){  //ͨѶ¼���һ�ˣ�ֱ��i-1,���ٴ�����
						i--;     //��ʱj=i��break�������
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
				jTextArea.append("ɾ���ɹ���\n");
			}
		}
	}

	//��Ӧ�̷���
	public void pselects() {
		int find=0;
		for(int j=0;j<k;j++){
			//**����Ҫ��Integer.parseInt�ٽ���==�Ƚϣ��ַ���ֱ����.equals()�Ƚ�
			//����if�����û���Ҫ����Ϣģ��
			if(bJTextField1.getText().length()!=0){
				if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField2.getText().length()!=0){
				if(bJTextField2.getText().equals(pname[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(bJTextField3.getText().equals(pkind[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField4.getText().length()!=0) {           //�ж�JTextField�Ƿ�Ϊ��
				if(Integer.parseInt(bJTextField4.getText())==pphone[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField5.getText().length()!=0) {           //�ж�JTextField�Ƿ�Ϊ��
				if(bJTextField5.getText().equals(paddress[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}
		}
		if(find==0){
			jTextArea.append("���ã����˵�ͨѶ¼�����ڣ�\n");
		}
	}
	public void padds() {
		pnum[k]=Integer.parseInt(bJTextField1.getText());           //string ��ȡ
		pname[k]=bJTextField2.getText();
		pkind[k]=bJTextField3.getText();
		pphone[k]=Integer.parseInt(bJTextField4.getText());
		paddress[k]=bJTextField5.getText();
		jTextArea.append("��ӽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[k]+"  ��Ӧ�����ƣ�"+pname[k]+
				"  ��Ӧ�����ͣ�"+pkind[k]+"  ��Ӧ�̵绰��"+pphone[k]+"  ��Ӧ�̵�ַ��"+paddress[k]+"\n");
		this.k++;
		bJTextField1.setText("");
		bJTextField2.setText("");              
		bJTextField3.setText("");
		bJTextField4.setText("");
		bJTextField5.setText("");
		//д���ļ�
//			String lines= jTextArea.getText();
//			FileWriter fw = null;
//			PrintWriter pw = null;
//			try{
//			    fw = new FileWriter("src/classdesign/GoodManagement.txt");//�ļ������
//			    pw = new PrintWriter(fw);                           //����ʽ�ļ������
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
				//����if����else�������ж��ظĶ�
				if(bJTextField2.getText().length()!=0){
					pname[j]=aJTextField2.getText();
				}if (bJTextField3.getText().length()!=0) {           //  ****�ж�JTextField�Ƿ�Ϊ��***
					pkind[j]=aJTextField3.getText();
				}if(bJTextField4.getText().length()!=0){
					pphone[j]=Integer.parseInt(bJTextField4.getText());
				}if (bJTextField5.getText().length()!=0) {           //  ****�ж�JTextField�Ƿ�Ϊ��***
					paddress[j]=aJTextField5.getText();
				}
				jTextArea.append("�޸Ľ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
						"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
			}
		}
	}
	public void pdeletes() {
		for(int j=0;j<k;j++){             //Ѱ�����
			if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
				for(;j<k;j++){
					if(j==k-1){  //ͨѶ¼���һ�ˣ�ֱ��i-1,���ٴ�����
						k--;     //��ʱj=i��break�������
						break;
					}else{
						pnum[j]=pnum[j+1];
						pname[j]=pname[j+1];
						pkind[j]=pkind[j+1];
						pphone[j]=pphone[j+1];
						paddress[j]=paddress[j+1];
					}
				}
				jTextArea.append("ɾ���ɹ���");
			}
		}
	}
		
	//�鼮����
	public void sadd(){
//		String[] description={"  ","��Ϣ��","������","��ѧ��","������","��ѧ��","��ѧ��","Ӣ����"};
		if(count<description.length){
			jComboBox.addItem(description[count++]);
		}
	}
	public void sselect(){
		for(int j=0;j<i;j++){
			if(cjTextField.getText().equals(gkind[j])){
				jTextArea.append("���ҽ��Ϊ��\n"+"  ͼ���ţ�"+gnum[j]+"  ͼ�����ƣ�"+gname[j]+"  ͼ�����ͣ�"+gkind[j]+"  ���ߣ�"
						+gth[j]+"  �����磺"+gpname[j]+"  ��棺"+gn[j]+"\n");
			}
			if(cjTextField.getText().equals(pkind[j])){
				jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
						"  ��Ӧ�����ͣ�"+pkind[j]+"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
			}
		}
	}
	public void srevise(){
		
	}
	public void sdelete(){
		
	}
	
	//����
//	public void save(){
//		//д���ļ�
//		String lines= jTextArea.getText();
//		FileWriter fw = null;
//		PrintWriter pw = null;
//		try{
//		    fw = new FileWriter("src/classdesign/GoodManagement.txt");//�ļ������
//		    pw = new PrintWriter(fw);                           //����ʽ�ļ������
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
				jTextArea.append("�ļ����Ѵ���\n");
//				return;
			}else{
				fin1.mkdirs();
			}
			
			file= new File(fin1+File.separator+"BoodManagement.txt");//�ļ������
			if(!file.exists()){
//				file1.mkdirs();
				jTextArea.append("�ļ������ڣ��ѳɹ�������\n");
				file.createNewFile();			
			}
//			FileWriter fWriter;
			fWriter = new FileWriter(file);
			bWriter=new BufferedWriter(fWriter);
			for(int j=0;j<i;j++){
				bWriter.write("ͼ����Ϣ\nͼ����:");
				bWriter.write(gnum[j]);
				bWriter.write("ͼ������:");
				bWriter.write(gname[j]);
				bWriter.write("ͼ������:");
				bWriter.write(gkind[j]);
				bWriter.write("ͼ������:");
				bWriter.write(gth[j]);
				bWriter.write("������:");
				bWriter.write(gpname[j]);
				bWriter.write("���:");
				bWriter.write(gn[j]);
				bWriter.write("\n");
			}
			for(int j=0;j<k;j++){
				bWriter.write("��Ӧ����Ϣ\n��Ӧ�̱��:");
				bWriter.write(pnum[j]);
				bWriter.write("��Ӧ������:");
				bWriter.write(pname[j]);
				bWriter.write("��Ӧ������:");
				bWriter.write(pkind[j]);
				bWriter.write("��Ӧ�̵绰:");
				bWriter.write(pphone[j]);
				bWriter.write("��Ӧ�̵�ַ:");
				bWriter.write(paddress[j]);
				bWriter.write("\n");
			}
			bWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		jTextArea.append("�ļ�������ɣ��뿴����Ŀ¼\n");
		jTextArea.append(file.getAbsolutePath()+"\n");

	}
	//��������
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
	


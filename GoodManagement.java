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
 * 11��Ʒ����ϵͳ
	Ҫ��
	1��	��ϵͳ��Ҫ�����̳��е���Ʒ��Ϣ��
	2��	��Ʒ��Ϣ��Ҫ��������Ʒ��š���Ʒ���͡���Ʒ���͡��۸񡢹�Ӧ�̵����ݡ�
	3��	��Ӧ����Ϣ��Ҫ��������Ӧ�̱�š���Ӧ�����ơ���ϵ�绰�����ݡ�
	4��	������µĲ�����ʵ����Ʒ��Ϣ����Ʒ���͡���Ӧ����Ϣ����ӡ��޸ġ�ɾ���Ͳ�ѯ��
	��ʾ��
	1��������Ʒ�ࡢ��Ʒ�����ࡢ��Ӧ����
	2����Ʒ����Ʒ���͡���Ӧ����Ϣ�ĳ�ʼ��
	����Ʒ��Ϣ����ӡ��޸ġ�ɾ��������
	4����Ӧ����Ϣ����ӡ��޸ġ�ɾ��������
	5����Ʒ��Ϣ����Ӧ����Ϣ�����
*/

public class GoodManagement implements ActionListener{
	//ͼ�ν���
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
	String[] description={"  ","��ʳ��","������","�ճ���","ʳ����","�Ƽ���","�칫��","������"};
	String string;
	int count=0;
	JComboBox jComboBox;
	
	JButton aadd,aselect,arevise,adelete;
	JButton badd,bselect,brevise,bdelete;
	JButton save;
	JTextArea jTextArea;
	//��Ʒ��Ϣ,��Ӧ����Ϣ
	int i=0,k=0;	//��Ʒgood����Ӧ��provide
	int[] gnum=new int[20];
	int[] pnum=new int[20];
	String[] gname=new String[20];
	String[] gpname=new String[20];
	String[] pname=new String[20];
	String[] gkind=new String[20];
	int[] gprice=new int[20];
	int[] pphone=new int[20];
	String[] paddress=new String[20];
	//���췽��
	GoodManagement(){
		jFrame=new JFrame("Ը������-��Ʒ����ϵͳ");
		//jpanel1����
		jPanel1=new JPanel(new GridLayout(3, 8));
		ajLabel0=new JLabel("��Ʒ��Ϣ��",JLabel.CENTER);
		ajLabel7=new JLabel("");
		ajLabel8=new JLabel("");
		ajLabel9=new JLabel("");
		ajLabel10=new JLabel("");
		ajLabel11=new JLabel("");
		ajLabel12=new JLabel("");
		ajLabel6=new JLabel("");
//		save=new JButton("����");
//		save.addActionListener(this);
		ajLabel1=new JLabel("��Ʒ��ţ�");
		aJTextField1=new JTextField(10);
		ajLabel2=new JLabel("��Ʒ���ƣ�");
		aJTextField2=new JTextField(10);
		ajLabel3=new JLabel("��Ʒ���ͣ�");
		aJTextField3=new JTextField(10);
		ajLabel4=new JLabel("��Ʒ�۸�");
		aJTextField4=new JTextField(10);
		ajLabel5=new JLabel("��Ʒ��Ӧ�̣�");
		aJTextField5=new JTextField(10);
		ajLabel13=new JLabel("");
		ajLabel14=new JLabel("");
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
		bjLabel3=new JLabel("��Ӧ�̵绰��");
		bJTextField3=new JTextField(10);
		bjLabel4=new JLabel("��Ӧ�̵�ַ��");
		bJTextField4=new JTextField(10);
		bjLabel5=new JLabel("");
		bjLabel15=new JLabel("");
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
		cjLabel18=new JLabel("");
//		save=new JButton("����");
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
		jFrame.add(BorderLayout.NORTH,jPanel4);
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
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
					find=1;
				}
			}else if(aJTextField2.getText().length()!=0){
				if(aJTextField2.getText().equals(gname[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
					find=1;
				}
			}else if(aJTextField3.getText().length()!=0){
				if(aJTextField3.getText().equals(gkind[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
					find=1;
				}
			}else if (aJTextField4.getText().length()!=0) {           //�ж�JTextField�Ƿ�Ϊ��
				if(Integer.parseInt(aJTextField4.getText())==gprice[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
					find=1;
				}
			}else if (aJTextField5.getText().length()!=0) {
				if(aJTextField5.getText()==gpname[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
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
		gprice[i]=Integer.parseInt(aJTextField4.getText());
		gpname[i]=aJTextField5.getText();
		jTextArea.append("��ӽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[i]+"  ��Ʒ���ƣ�"+gname[i]+"  ��Ʒ���ͣ�"+gkind[i]+"  ��Ʒ�۸�"
		+gprice[i]+"  ��Ʒ��Ӧ�̣�"+gpname[i]+"\n");
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
				//����if����else�������ж��ظĶ�
				if(aJTextField2.getText().length()!=0){
					gname[j]=aJTextField2.getText();
				}if(aJTextField3.getText().length()!=0){
					gkind[j]=aJTextField3.getText();
				}if (aJTextField3.getText().length()!=0) {           //  ****�ж�JTextField�Ƿ�Ϊ��***
					gprice[j]=Integer.parseInt(aJTextField3.getText());
				}if (aJTextField4.getText().length()!=0) {
					gpname[j]=aJTextField4.getText();
				}
				jTextArea.append("�޸Ľ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+"  ��Ʒ���ͣ�"
				+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
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
						gprice[j]=gprice[j+1];
						gpname[j]=gpname[j+1];
					}
				}
				jTextArea.append("ɾ���ɹ���\n");
			}
		}
	}
	//��Ӧ�̷���
	public void pselects() {
		int find=0;
		for(int j=0;j<i;j++){
			//**����Ҫ��Integer.parseInt�ٽ���==�Ƚϣ��ַ���ֱ����.equals()�Ƚ�
			//����if�����û���Ҫ����Ϣģ��
			if(bJTextField1.getText().length()!=0){
				if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
						"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField2.getText().length()!=0){
				if(bJTextField2.getText().equals(pname[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if(bJTextField3.getText().length()!=0){
				if(Integer.parseInt(bJTextField3.getText())==pphone[j]){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
					find=1;
				}
			}else if (bJTextField4.getText().length()!=0) {           //�ж�JTextField�Ƿ�Ϊ��
				if(bJTextField4.getText().equals(paddress[j])){
					jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+
							"  ��Ӧ�̵绰��"+pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
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
		pphone[k]=Integer.parseInt(bJTextField3.getText());
		paddress[k]=bJTextField4.getText();
		jTextArea.append("��ӽ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[k]+"  ��Ӧ�����ƣ�"+pname[k]+"  ��Ӧ�̵绰��"+
				pphone[k]+"  ��Ӧ�̵�ַ��"+paddress[k]+"\n");
		this.k++;
		bJTextField1.setText("");
		bJTextField2.setText("");              
		bJTextField3.setText("");
		bJTextField4.setText("");
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
		for (int j=0; j<i; j++) {
			if(Integer.parseInt(bJTextField1.getText())==pnum[j]){
				//����if����else�������ж��ظĶ�
				if(bJTextField2.getText().length()!=0){
					pname[j]=aJTextField2.getText();
				}if(bJTextField3.getText().length()!=0){
					pphone[j]=Integer.parseInt(bJTextField3.getText());
				}if (bJTextField4.getText().length()!=0) {           //  ****�ж�JTextField�Ƿ�Ϊ��***
					paddress[j]=aJTextField4.getText();
				}
				jTextArea.append("�޸Ľ��Ϊ��\n"+"  ��Ӧ�̱�ţ�"+pnum[j]+"  ��Ӧ�����ƣ�"+pname[j]+"  ��Ӧ�̵绰��"+
						pphone[j]+"  ��Ӧ�̵�ַ��"+paddress[j]+"\n");
			}
		}
	}
	public void pdeletes() {
		for(int j=0;j<i;j++){             //Ѱ�����
			if(Integer.parseInt(aJTextField1.getText())==pnum[j]){
				for(;j<i;j++){
					if(j==i-1){  //ͨѶ¼���һ�ˣ�ֱ��i-1,���ٴ�����
						i--;     //��ʱj=i��break�������
						break;
					}else{
						pnum[j]=pnum[j+1];
						pname[j]=pname[j+1];
						pphone[j]=pphone[j+1];
						paddress[j]=paddress[j+1];
					}
				}
				jTextArea.append("ɾ���ɹ���");
			}
		}
	}
	//��Ʒ����
	public void sadd(){
//		String[] description={"  ","��Ϣ��","������","��ѧ��","������","��ѧ��","��ѧ��","Ӣ����"};
		if(count<description.length){
			jComboBox.addItem(description[count++]);
		}
	}
	public void sselect(){
		for(int j=0;j<i;j++){
			if(cjTextField.getText().equals(gkind[j])){
				jTextArea.append("���ҽ��Ϊ��\n"+"  ��Ʒ��ţ�"+gnum[j]+"  ��Ʒ���ƣ�"+gname[j]+
						"  ��Ʒ���ͣ�"+gkind[j]+"  ��Ʒ�۸�"+gprice[j]+"  ��Ʒ��Ӧ�̣�"+gpname[j]+"\n");
			}
		}
	}
//	public void save(){
		//д���ļ�
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


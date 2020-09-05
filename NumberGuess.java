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
		//�������ݡ���ʽ
		jFrame=new JFrame("Ը������-���ܲ���");
		jFrame.setLayout(new BorderLayout());
		rand=(int)(Math.random()*100);                       //  100  ??
		jLabel1=new JLabel("��ӭ�������ܲ�����Ϸ  :)");
		jLabel2=new JLabel("                    ���ڴ�����");
		jLabel3=new JLabel("              ������0-100֮���������");
		jButton=new JButton("ȷ��");
		jTextField=new JTextField(10);
		jLabel4=new JLabel("������"+counter+"���ˣ�����Ŷ��");
		//��������ȷ����ť����һ��jpanel
		jPanel=new JPanel();
		jPanel.setLayout(new GridLayout(4, 1));   //���񲼾� 
		jPanel.add(jLabel3); 
		jPanel.add(jTextField); 
		jPanel.add(jButton); 
		jPanel.add(jLabel4);
		jTextField.addActionListener(this);   //ע�ᶯ��
		jButton.addActionListener(this);
		//jframe�Ű�
		jFrame.add(BorderLayout.NORTH,jLabel1);
		jFrame.add(BorderLayout.CENTER,jPanel);
		jFrame.add(BorderLayout.SOUTH,jLabel2);
		//������̬��λ�á���С�����ر�
		jFrame.setBounds(500,200,350,200);    //�ᣬ��������
//		jFrame.setSize(300, 150);
//		jFrame.setLocation(500, 200);
		jFrame.setVisible(true);
		jFrame.addWindowListener((WindowListener)this);  //ע���windows
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void eventHandle(){
//	  do{
//		  user=0;
		try{
			user=Integer.parseInt(jTextField.getText().trim());
		   	if(user<0||user>100){
	    		//����������0-100֮��
	    		JOptionPane.showMessageDialog(jTextField,"������0��100֮���������");
	    		jTextField.setText("");
	    		jTextField.requestFocus();                    //�ı���ղ�ʹ�ı����»�ý���
	    		counter=0;
	    		jLabel4.setText("������"+counter+"�Σ�");
	    		jLabel2.setText("                    ���ڴ�����");
	    	}else if(user<rand){                              //�û�����ֵƫС
	    		jLabel2.setText("     ���µ���ֵƫС��");
	    		jTextField.setText("");
	    		jTextField.requestFocus();
	    		counter++;
	    		jLabel4.setText("������"+counter+"�Σ�");
	    	}else if(user>rand){                              //�û�����ֵƫ��
	    		jLabel2.setText("     ���µ���ֵƫ��");
	    		jTextField.setText("");
	    		jTextField.requestFocus();
	    		counter++;
	    		jLabel4.setText("������"+counter+"�Σ�");
	    	}
	    	else if (user==rand){
	    		jLabel2.setText("     ��ϲ�����¶��ˣ�");
	    		jLabel4.setText("������"+counter+"�Σ�");
	    	}
		}catch(NumberFormatException e){
			//���û����������ݲ�����ֵ������
			JOptionPane.showMessageDialog(jTextField,"�뽫��������������뵽�ı����У�");
    		//�����Ի�����ʾ�û�"�뽫���µõ��������뵽�ı����У�"
    		jTextField.setText("");
    		jTextField.requestFocus();//�ı�����ղ�ʹ�ı������»�ý���
    		
    		counter=0;
    		jLabel4.setText("������"+counter+"�Σ�");
    		jLabel2.setText("                    ���ڴ�����");
//    		continue;
    	}
// 	}
//	  }while(user!=rand);                               //�û��¶���
//    	jLabel2.setText("     ��ϲ�����¶��ˣ�");
//    	jLabel4.setText("������"+counter+"�Σ�");
}
	public void actionPerformed(ActionEvent e) {
	    /*
	     * �����߿����ǰ����¼�Դ������JFrame��ֱ��ʵ�ֶ����¼���ActionListener
	     * ����Ҫʵ�ֵķ���actionPerformed(ActionEvent e)
	    */
	    	if(e.getSource()==jButton){
	    		//������������¼����¼�Դ��ȷ����ťjbutton�ı���jtextfile
	    		eventHandle();
	    	}else if(e.getSource()==jTextField){
	    		//������������¼����¼�Դ���ı���jtextfile
	    		eventHandle();
	    	}
	}
	public static void main(String[] args){
		new NumberGuess();
	}

}


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Keypad extends JFrame implements ActionListener {
	private JTextField txt;
	private  JPanel panel;
    private  JButton[] btn;
	private String[] labels = {
			 "0","1","2","3",
			 "+","4","5","6",
			 "-","7","8","9",
			 "*","/","C","="
	}; 
	String strTmp;
	double n1,result;
	char op; 
	
	public Keypad() {
		txt = new JTextField(20);
		add(txt,BorderLayout.NORTH);
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,4));
		add(panel, BorderLayout.CENTER);
		btn = new JButton[16];
		 for(int i = 0; i<16; i++) 
		 {
			btn[i] = new JButton(labels[i]);
			btn[i].addActionListener(this); 
            btn[i].setPreferredSize(new Dimension(100, 100)); 
		    panel.add(btn[i]); 
		} 
		pack();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		strTmp = "";
	} 
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource().equals(btn[0])){
			strTmp += ""+ 0;
			txt.setText(strTmp);
		}// 버튼 0 눌렀을 때 
		else if (e.getSource().equals(btn[1])){
			strTmp += ""+1;
			txt.setText(strTmp);
		}// 버튼 1 눌렀을 때 
		else if (e.getSource().equals(btn[2])){
			strTmp += ""+2;
			txt.setText(strTmp);
		}// 버튼 2 눌렀을 때 
		else if (e.getSource().equals(btn[3])){
			strTmp += ""+3;
			txt.setText(strTmp);
		}// 버튼 3 눌렀을 때 
		else if (e.getSource().equals(btn[4])){
			if(!strTmp.equals("")){
				op = '+';
				txt.setText(strTmp);
				n1 = Double.parseDouble(strTmp);
				strTmp="";
			}
		}// 버튼 + 눌렀을 때 
		else if (e.getSource().equals(btn[5])){
			strTmp += "" +4;
			txt.setText(strTmp);
		}// 버튼 4 눌렀을 때 
		else if (e.getSource().equals(btn[6])){
			strTmp += "" + 5;
			txt.setText(strTmp);
		}// 버튼 5 눌렀을 때 
		else if (e.getSource().equals(btn[7])){
			strTmp += "" + 6;
			txt.setText(strTmp);
		}// 버튼 6 눌렀을 때 
		else if (e.getSource().equals(btn[8])){
			if(!strTmp.equals("")){
				op = '-';
				txt.setText(strTmp);
				n1 = Double.parseDouble(strTmp);
				strTmp="";
			}}
		// 버튼 - 눌렀을 때 
		else if (e.getSource().equals(btn[9])){
			strTmp += "" +7;
			txt.setText(strTmp);
		}// 버튼 7 눌렀을 때 
		else if (e.getSource().equals(btn[10])){
			strTmp += "" +8;
			txt.setText(strTmp);
		}// 버튼 8 눌렀을 때 
		else if (e.getSource().equals(btn[11])){
			strTmp += "" +9;
			txt.setText(strTmp);
		}// 버튼 9 눌렀을 때 
		else if (e.getSource().equals(btn[12])){
			if(!strTmp.equals("")){
				op = '*';
				txt.setText(strTmp);
				n1 = Double.parseDouble(strTmp);
				strTmp="";
			}}// 버튼 * 눌렀을 때 
		else if (e.getSource().equals(btn[13])){
			if(!strTmp.equals("")){
				op = '/';
				txt.setText(strTmp);
				n1 = Double.parseDouble(strTmp);
				strTmp="";
			}}// 버튼 / 눌렀을 때
		else if (e.getSource().equals(btn[14])){
			strTmp = "";
			txt.setText(strTmp);
		}// 버튼 C 눌렀을 때 
		else if (e.getSource().equals(btn[15])){
			if(!strTmp.equals("")){
				if(op == '+'){
					result =n1 + Double.parseDouble(strTmp);
					txt.setText(Double.toString(result));
					strTmp = Double.toString(result);
				}
				if(op == '-'){
					result =n1 - Double.parseDouble(strTmp);
					txt.setText(Double.toString(result));
					strTmp = Double.toString(result);
				}
				if(op == '*'){
					result =n1 * Double.parseDouble(strTmp);
					txt.setText(Double.toString(result));
					strTmp = Double.toString(result);
				}
				if(op == '/'){
					result =n1/Double.parseDouble(strTmp);
					txt.setText(Double.toString(result));
					strTmp = Double.toString(result);
				}}
			
			}// 버튼 = 눌렀을 때 
		}

	public static void main(String[] args) {
		Keypad p = new Keypad();
	}
}


		
			
		
	


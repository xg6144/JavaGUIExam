package ex02;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JavaGUIExam {

	public static void main(String[] args) {
		
		JFrame f = new JFrame();
		JLabel label1 = new JLabel("이름");
		JLabel label2 = new JLabel("성적");
		JTextField text1 = new JTextField("", 20);
		JTextField text2 = new JTextField("", 20);
		JButton btn1 = new JButton("입 력");
		
		f.setTitle("성적 입력");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		
		f.setLayout(new BorderLayout());
		
		f.add(panel1, BorderLayout.NORTH);
		f.add(panel2, BorderLayout.SOUTH);
		
		panel1.setLayout(new GridLayout(2,2,0,5));
		panel1.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		panel1.add(label1);
		panel1.add(text1);
		
		panel1.add(label2);
		panel1.add(text2);
		
		panel2.add(btn1);
		
		f.pack();
		f.setVisible(true);
		

		
	}

}

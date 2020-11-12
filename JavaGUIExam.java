package exam01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class JavaGUIExam extends JFrame {
	JavaGUIExam(){
		setTitle("Event");
		
		JButton btn = new JButton("Click");
		btn.addActionListener(e -> {
			System.out.println("Clicked Button!");
		});
		
		add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(260, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JavaGUIExam();
	}
}

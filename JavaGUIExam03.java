package exam01;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyListener implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		JButton button = (JButton) e.getSource();
		button.setText("Clicked Button!");
	}
}
class MyFrame extends JFrame{
	private JButton button;
	private JLabel label;
	
	public MyFrame()
	{
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Event Exam");
		
		JPanel panel = new JPanel();
		button = new JButton("Click Button!");
		label = new JLabel("Not Clicked");
		button.addActionListener(new MyListener());
		panel.add(button);
		panel.add(label);
		this.add(panel);
		this.setVisible(true);
	}
}
public class JavaGUIExam03 {
	public static void main(String[] args) {
		new MyFrame();
	}
}

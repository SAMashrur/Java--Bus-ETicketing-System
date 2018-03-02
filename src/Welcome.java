import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Welcome implements ActionListener{

	private JFrame JFr1= new JFrame();
	
	private Store S;
	
	private JButton cancel= new JButton("cancel");
	private JButton next= new JButton("next");
	
	private JLabel JL1= new JLabel("Welcome to E-Ticketing Reservation system!");
	
	public void initGUI2(Store s){
		
		S=s;
		
		JFr1.setSize(500,300);
		JFr1.setTitle("Welcome");
		JFr1.setBackground(Color.BLUE);
		
		JL1.setBounds(100,50, 300, 100);
		JFr1.add(JL1);
		
		cancel.setBounds(375, 200, 100, 50);
		JFr1.add(cancel);
		
		next.setBounds(265, 200, 100, 50);
		JFr1.add(next);
		
		next.addActionListener(this);
		cancel.addActionListener(this);
		
		JFr1.setLayout(null);
		JFr1.setVisible(true);
		} 
	
	public static void main(String [] args){
		
		Welcome frame= new Welcome();
		//frame.initGUI2();
		
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==next){
			
			InputLayout IL=new InputLayout(); 
			IL.initGUI(S);
			
			JFr1.dispose();
			
			}
		
		if(e.getSource()==cancel){
			
			JFr1.dispose();
			
			}
		
		}
	
	}

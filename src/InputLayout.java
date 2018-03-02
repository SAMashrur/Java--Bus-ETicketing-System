import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class InputLayout implements ActionListener{

	private JFrame JFr1= new JFrame();
	
	private JButton cancel= new JButton("cancel");
	private JButton next= new JButton("next");
	
	private Store S;
	
	private JLabel name= new JLabel("NAME:");
	private JLabel id= new JLabel("ID:");
	
	private JTextField JTf1= new JTextField(); 
	private JTextField JTf2= new JTextField();
	
	
	public void initGUI(Store s){
		
		S=s;
		
		JFr1.setSize(380,550);
		JFr1.setTitle("Input Layout");
		JFr1.setBackground(Color.BLUE);
		
		cancel.setBounds(250, 450, 100, 50);
		JFr1.add(cancel);
		
		next.setBounds(140, 450, 100, 50);
		JFr1.add(next);

		next.addActionListener(this);
		cancel.addActionListener(this);
		
		name.setBounds(50, 50, 100, 50);
		JFr1.add(name);
		
		JTf1.setBounds(100, 50, 200, 50);
		JFr1.add(JTf1);
		
		id.setBounds(50, 120, 100, 50);
		JFr1.add(id);
		
		JTf2.setBounds(100, 120, 200, 50);
		JFr1.add(JTf2);
		
		JFr1.setLayout(null);
		JFr1.setVisible(true);
		
		}
	
	public static void main(String [] args){
		
		InputLayout frame= new InputLayout();
		//frame.initGUI();
		
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
	
		if( e.getSource()==next){
			
			S.setName(JTf1.getText());
			S.setId(JTf2.getText());
			
			Scroll S1=new Scroll(S);
			
			JFr1.dispose();
			
			}	
		
		if(e.getSource()==cancel){
			
			JFr1.dispose();
			
			}
		
		}

	}

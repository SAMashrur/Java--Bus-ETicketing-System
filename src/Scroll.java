import javax.swing.*;
import javax.swing.border.*;

import java.awt.*;
import java.awt.event.*;

public class Scroll implements ActionListener{

	private Store S;
	 JButton p;
   JFrame jf=new JFrame ();	
	 
   public Scroll(Store s){
   	
   	S=s;
   	
   	jf.setSize(650, 250);
   	
	//this is the part for Departure
	    jf.setLayout(new BorderLayout(2,2));  
   	JPanel d=new JPanel();//panel for depart
   	JLabel D;//label for depart
   	Font font1=new Font("TimesRoman",Font.ITALIC,20);
   	String[] L={"Comilla","Dhaka","Chittagong","Rajshahi","Rongpur","Jessore","Benapole","Kolkata"};
	    JComboBox depart=new JComboBox(L); 
       d.add(D=new JLabel("Place of Departure"));
		d.add(depart);
		 
		D.setFont(font1);
	    jf.add(d,BorderLayout.WEST);
	
	    jf.setVisible(true);
	    
	    
	    
	    
	    
	    //this is the part for Arrival
	    
	    
	    JPanel a=new JPanel();
	    JLabel A;
	    JComboBox arrival=new JComboBox(L); 
	    a.add(A=new JLabel("Place of Arrival"));
		a.add(arrival);
	    jf.add(a,BorderLayout.EAST); 
	    A.setFont(font1);
	     
	    
	   // this is the part for TimeSlot
	     JRadioButton e,b,c; //declaration for radio button 
	     JPanel r=new JPanel(); //panel for time slot
	     JLabel time;//label for time slot of the radio button
	     
	     r.add(time=new JLabel("Time Slot: "));
	     r.add(e=new JRadioButton("8 am"));
	     r.add(b=new JRadioButton("9 am"));
	     r.add( c=new JRadioButton("11 am"));
	     ButtonGroup group=new ButtonGroup();
	     group.add(e);
	     group.add(b);
	     group.add(c);
	     jf.add(r,BorderLayout.NORTH);
	    
	     // this is the part for Screen 
	    JPanel screen=new JPanel();
	    Border lineBorder=new LineBorder(Color.BLACK,2);
	    
	    JLabel sCr1= new JLabel("Bus no.: 1");
	    
	    screen.add(sCr1);
	    
	    jf.add(screen,BorderLayout.CENTER);
	    screen.setBorder(lineBorder);
	 //   screen.add(new JLabel("THis part is the Screen"));
	    
	    
	   //this is the part for Process Button
	    JPanel process=new JPanel();
	     p=new JButton("Process");
	    process.add(p);
	    jf.add(p,BorderLayout.SOUTH);
	     p.addActionListener(this);
	    
	    
	    arrival.addActionListener(new ActionListener(){
			   
			   public void actionPerformed( ActionEvent e){
				   
				    JComboBox temp=(JComboBox)(e.getSource());
				   String Arrival=temp.getSelectedItem().toString();
				   
				    S.setArrive(Arrival);//this is done for testing to see that is it working or not
				   //but this is not included.this print the text for the selected location in the combo
				   //box
				   
			   }
		   }
		   );
		
	     
	    depart.addActionListener(new ActionListener(){
			   
			   public void actionPerformed( ActionEvent e){
				   
				    JComboBox temp=(JComboBox)(e.getSource());
				   String Depart=temp.getSelectedItem().toString();
				   
				   S.setDepart(Depart);
				   
			   }
		   }
		   );
	    e.addActionListener(new ActionListener(){
			   
			   public void actionPerformed( ActionEvent e){
				   
				    JRadioButton temp=(JRadioButton)(e.getSource());
				   String A=temp.getText();
				   S.setTime(A);
				    
				   
			   }
		   }
		   );
	    
	    b.addActionListener(new ActionListener(){
			   
			   public void actionPerformed( ActionEvent e){
				   
				    JRadioButton temp=(JRadioButton)(e.getSource());
    				 String B=temp.getText();
				   
				   S.setTime(B);
				   
			   }
		   }
		   );
	    c.addActionListener(new ActionListener(){
			   
			   public void actionPerformed( ActionEvent e){
				   
				    JRadioButton temp=(JRadioButton)(e.getSource());
				   String C=temp.getText();
				   S.setTime(C);
				    
				   
			   }
		    }
		   );
	    
	    
	     
	
		 
	    
	    
	    
	
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		 if(e.getSource()==p)
		 {
						
				 Bus S2=new Bus(S);	 
				 jf.dispose();
		 }
		
	}
	
	
	
	
	
//	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		//Scroll m=new Scroll();
		/*  m.setSize(1000,600);
		  
		  m.setLocationRelativeTo(null);
		  m.setDefaultCloseOperation(EXIT_ON_CLOSE);
		  m.setTitle("SO WHAT");
		
		*/
		
		
		
		
	//}





	//@Override
	//public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		//Bus s=new Bus(S);  
		/*j.setLayout(new BorderLayout(2,2));
		JPanel a=new JPanel();
		JPanel b=new JPanel();
		JButton z=new JButton("OK");
		a.add(new JLabel("Name- "+S.getname()));
		a.add(new JLabel("ID "+S.getid()));
		a.add(new JLabel("Arrival- "+ S.getarrive()));
		a.add(new JLabel("Depart-"+ S.getdepart()));
		a.add(new JLabel("Time is "+S.gettime()));
		
		j.add(a,BorderLayout.NORTH);
	    j.add(z,BorderLayout.SOUTH);
	   
	    j.setSize(300,300);
	    j.setVisible(true);
	    j.setLocationRelativeTo(null);
	     j.setDefaultCloseOperation(0);*/
	    
  
		   
	//}

	
	}

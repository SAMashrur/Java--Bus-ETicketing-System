import javax.swing.*;

import java.awt.*; 
import java.awt.event.*;
	
public class Bus{
	
	Store S;
	boolean check ;
	JFrame kr;
	JToggleButton [] bus;
	
	
	public Bus(Store s){
		kr = new JFrame();
		kr.setSize(260,600);
	    kr.setVisible(true);
	    kr.setLocationRelativeTo(null);
	    kr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.S=s;
		bus=new JToggleButton[61];
		kr.setLayout(new BorderLayout(15,15));
		JPanel B=new JPanel();//panel for bus seat
		B.setLayout(new GridLayout(15,2,3,10));//layout for bus seat
		int i;
		for(i=1;i<=30;i++)
		{    
			JToggleButton t=new JToggleButton(""+i);//creating new togglebutton
			B.add(t);//adding button to panel
		    bus[i]=t;//array storing the address
		}
		
		
		
		JPanel a=new JPanel();
		JPanel b=new JPanel();
		JPanel j=new JPanel();
		JPanel m=new JPanel();
		a.setLayout(new BorderLayout(5,5));
		
		j.setLayout(new GridLayout(15,2,3,10));
		a.add(new JButton("Driver"),BorderLayout.EAST);
		for(i=31;i<=60;i++)
		{
			JToggleButton t=new JToggleButton(""+i);
			j.add(t);
		    bus[i]=t;
		
		}
		
		b.setLayout(new BorderLayout(5,5));
		JButton ok;
		b.add(ok=new JButton("OK"),BorderLayout.AFTER_LAST_LINE);
	  
		kr.add(B,BorderLayout.WEST);
		kr.add(j,BorderLayout.EAST);
		kr.add(m,BorderLayout.CENTER);
		kr.add(a,BorderLayout.PAGE_START);
		kr.add(b,BorderLayout.PAGE_END);

		//this is the actionlistener for button
		/* 
		int z;
		for(z=0;z<=60;z++)
		  {
			
			
			bus[z].addActionListener(new ActionListener() {
			
			 @Override
			public void actionPerformed(ActionEvent e) {
				int k;
				JToggleButton temp=(JToggleButton)e.getSource();
				String no=temp.getText();
				 //print the seat no but this is to written to check;
				k=Integer.parseInt(no);
			 
			   check=temp.isSelected();//this is done to check is the button click or not
			   S.setNo(check,k);
				
			  }
		  });
		  }
		*/
		
		/* OK button */
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				String seats = "";
				// loop through buttons to find out which seats are selected
				for(int i = 1; i <= 60; i++){
					
					if(bus[i].isSelected()){	// seat is selected
						seats += i;
						seats += " ";
					}
				}
				
				seats = seats.trim();	// trim leading and trailing whitespace
				S.setSeats(seats); 	// set seats onto Store object
				S.initGUI5();
				kr.dispose();
			}
		});
		
		  /*
		ok.addActionListener(new ActionListener(){
			
			
			public void actionPerformed(ActionEvent e){
				
				  
			   	 kr.dispose();
			   	 S.initGUI5();
			}
			
		});
		*/
		
		
		
		
		
		
		
	}
	
	
	//public static void main(String []args){
		
	/*  Bus m=new Bus();
      
	  .setSize(280,600);
	  m.setVisible(true);
	  m.setLocationRelativeTo(null);
	  m.setDefaultCloseOperation(EXIT_ON_CLOSE);
	  m.setTitle("Falgun");
	*/
   // }
	
	}

import java.awt.*;
import java.awt.event.*;

import java.io.*;

import javax.swing.*;


public class Store implements ActionListener{

	String name, id, depart, arrive, time, seats;
	
	private JFrame JFr1= new JFrame();
	
	private JButton ok= new JButton("OK");
	
	private JLabel JLb1=new JLabel("NAME:");
	private JLabel JLb2=new JLabel("ID:");
	private JLabel JLb3=new JLabel("Depart from:");
	private JLabel JLb4=new JLabel("Arrive at:");
	private JLabel JLb5=new JLabel("Bus no.: 1");
	private JLabel JLb6=new JLabel("Seat no.:");
	private JLabel JLb7=new JLabel("Departure time:");
	private JLabel JLb8=new JLabel("Ticket price: 1000 tk");
	private JLabel JLb9=new JLabel("Successful!");
	private JLabel JLb10=new JLabel("Ticket:-");
	
	boolean [] no= new boolean [60];
	
	public void seat( boolean no []){
		
		for( int i=0; i<no.length; i++){
			
			if(no[i]==true){
				
				seats=""+i;
				
				System.out.print(",");
				
				}
			
			}
		
		}
	
	String a,b,c,d,e,g;
	
	private JLabel nameTxt;
	private JLabel idTxt;
	private JLabel departTxt;
	private JLabel arriveTxt;
	private JLabel seatTxt;
	private JLabel timeTxt;
	
		
	private File f=new File("C:\\Users\\S A Mashrur\\Desktop\\Receipt.txt");//file will be saved in this directory
	
	
	public static void main( String [] args){
		
		Store S= new Store();
		
		Welcome W= new Welcome();
		
		W.initGUI2(S);
		
		//S.initGUI5(); //I USED IT TO TEST MY JFr1
		
		}
	
	
	
	public void setSeats(String x){
		seats = x;
	}
	
	public String getSeats(){
		return seats;
	}
	
	Store(){

		nameTxt= new JLabel();
		idTxt= new JLabel();
		departTxt= new JLabel();
		arriveTxt= new JLabel();
		timeTxt= new JLabel();
		seatTxt= new JLabel();
		
	}
	
	
	public void setName( String name){
		
		this.name=name;
		
		}
	
	public String getName(){
		return name;
	}
	
	public void setId( String id){
		
		this.id=id;
		
		}
	
	public String getId(){
		return id;
	}
	
	public void setDepart( String depart){
		
		this.depart=depart;
		
		}
	
	public String getDepart(){
		return depart;
	}
	
	public void setArrive( String arrive){
		
		this.arrive=arrive;
		
		}
	
	public String getArrive(){
		return arrive;
	}
	
	public void setNo( boolean f,int i){
		
		no[i]= f;
		
		}
	
	public void setTime( String time){
		
		this.time=time;
		
		}
	
	public String getTime(){
		return time;
	}
	
	
	public void initGUI5(){
		
		JFr1.setSize(600,600);
		JFr1.setTitle("Receipt");
		JFr1.setBackground(Color.BLUE);
		
		JLb9.setBounds(50, 15, 100, 10);//Successful
		JFr1.add(JLb9);
		
		JLb10.setBounds(50, 40, 100, 10);//Successful
		JFr1.add(JLb10);
		
		JLb1.setBounds(50, 50, 100, 100);//Name
		JFr1.add(JLb1);
		
		nameTxt.setBounds(150, 50, 400, 100);
		JFr1.add(nameTxt);
		
		JLb2.setBounds(50, 100, 100, 100);//ID
		JFr1.add(JLb2);
		
		idTxt.setBounds(150, 100, 400, 100);
		JFr1.add(idTxt);
		
		JLb7.setBounds(50, 150, 100, 100);//Departure time
		JFr1.add(JLb7);
		
		timeTxt.setBounds(150, 150, 400, 100);
		JFr1.add(timeTxt);
		
		JLb3.setBounds(50, 200, 100, 100);// Depart from
		JFr1.add(JLb3);
		
		departTxt.setBounds(150, 200, 400, 100);
		JFr1.add(departTxt);
		
		JLb4.setBounds(50, 250, 100, 100);// Arrive at
		JFr1.add(JLb4);
		
		arriveTxt.setBounds(150, 250, 400, 100);
		JFr1.add(arriveTxt);
		
		JLb6.setBounds(50, 300, 100, 100);//Seat no.
		JFr1.add(JLb6);
		
		seatTxt.setBounds(150, 300, 400, 100);
		JFr1.add(seatTxt);
		
		JLb5.setBounds(50, 350, 100, 100);//bus no.
		JFr1.add(JLb5);
		
		JLb8.setBounds(50, 400, 200, 100);//Ticket price.
		JFr1.add(JLb8);
		
		ok.setBounds(475, 500, 100, 50);
		JFr1.add(ok);
		
		nameTxt.setText(getName());
		idTxt.setText(getId());
		departTxt.setText(getDepart());
		arriveTxt.setText(getArrive());
		timeTxt.setText(getTime());
		seatTxt.setText(getSeats());
		
		ok.addActionListener(this);
		
		JFr1.setLayout(null);
		JFr1.setVisible(true);
		
		}

	public void saveFile(){
		
		try{
			
			FileWriter fw = new FileWriter(f, true);
			
			
			fw.write("Name");
			fw.write(name);
			fw.write("\n");
			
			fw.write("ID:");
			fw.write(id);
			fw.write("\n");
			
			fw.write("Depart from:");
			fw.write(depart);
			fw.write("\n");
			
			fw.write("Arrive at:");
			fw.write(arrive);
			fw.write("\n");
			
			fw.write("Time of Departure:");
			fw.write(time);
			fw.write("\n");
			
			fw.write("Seats:");
			fw.write(seats);
			fw.write("\n");
			
			fw.close();
			
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==ok){
			
			saveFile();
			
			JFr1.dispose();
			
			}
		
		}
	
	}

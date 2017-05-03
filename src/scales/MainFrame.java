package scales;

import java.util.Random;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class MainFrame extends JFrame {
	private static final long serialVersionUID = 6466925741741776825L;
	
	public static Random random=new Random();
	private static JPanel onPanel;
	private JTextField Caret;
	private JTextField Number;
	static JButton scales1,scales2,scalesl1,scalesl2,scalesr1,scalesr2,coin1,coin2;	
	static JButton btnSignup;
	static JLabel num1,num2,num3,result,badkind;
	String n,n1,n2,n3;

	public MainFrame(){
		
		setSize(800, 600);
		setLocationRelativeTo(null);
		setTitle("Find the Bad Coin.");
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        onPanel=new JPanel();
		onPanel.setLayout(null);
		this.getContentPane().add(onPanel);
		onPanel.setBackground(Color.white);
		
		Caret = new JTextField();
		Caret.setBounds(0, 0, 1, 1);
		Caret.setBackground(null);
		Caret.setBorder(null);
		Caret.setCaretColor(Caret.getBackground());
		onPanel.add(Caret);
		
		Number = new JTextField();
		Number.setBounds(50, 10, 107, 30);
		Number.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
		Number.setBackground(null);
		Number.setCaretColor(null);
		Number.setCaretColor(Number.getBackground());
		Number.setText(" Coins' number");
		Number.setFont(new Font("Times New Roman",Font.BOLD,15)); 
		Number.setForeground(new Color(55,55,55));
		Number.addFocusListener(new FocusAdapter()
		{
			@Override
			public void focusGained(FocusEvent e)
			{
				Number.setText("");
			}
			@Override
			public void focusLost(FocusEvent e)
			{
				if (Number.getText().isEmpty()){
					Number.setText(" Coins' number");
				}
			}
		});
		onPanel.add(Number);
		
		//n= Number.getText();
		n1="0";
		num1= new JLabel(n1);
		num1.setBounds(145,500,50,30);
		num1.setForeground(new Color(55,55,55));
		num1.setFont(new Font("Times New Roman",Font.BOLD,15));
		onPanel.add(num1);
		
		n2="0";
		num2= new JLabel(n2);
		num2.setBounds(555,500,50,30);
		num2.setForeground(new Color(55,55,55));
		num2.setFont(new Font("Times New Roman",Font.BOLD,15));
		onPanel.add(num2);
		
		
		num3= new JLabel();
		num3.setBounds(745,500,50,20);
		num3.setForeground(new Color(55,55,55));
		num3.setFont(new Font("Times New Roman",Font.BOLD,15));
		onPanel.add(num3);
		
		result= new JLabel();
		result.setBounds(715,520,50,20);
		result.setForeground(new Color(55,55,55));
		result.setFont(new Font("Times New Roman",Font.BOLD,20));
		onPanel.add(result);
		
		badkind= new JLabel();
		badkind.setBounds(220,15,350,20);
		badkind.setForeground(new Color(55,55,55));
		badkind.setFont(new Font("Times New Roman",Font.BOLD,20));
		onPanel.add(badkind);
		
		btnSignup=new JButton(); 
        ImageIcon ImbtnSignup=new ImageIcon(this.getClass().getResource("/scales/find.png"));
        btnSignup.setIcon(ImbtnSignup);  
        btnSignup.setBorder(null);
        btnSignup.setContentAreaFilled(false);
        onPanel.setLayout(null);
        btnSignup.setBounds(170,12,ImbtnSignup.getIconWidth(), ImbtnSignup.getIconHeight());
        onPanel.add(btnSignup); 
				
	    btnSignup.addActionListener(new btnSignupActionListener());
		
	    coin1=new JButton(); 
        ImageIcon Imscoin1=new ImageIcon(this.getClass().getResource("/scales/coin1.jpeg"));
        coin1.setIcon(Imscoin1);  
        coin1.setBorder(null);
        coin1.setContentAreaFilled(false);
        onPanel.setLayout(null);
        coin1.setBounds(660,400,Imscoin1.getIconWidth(), Imscoin1.getIconHeight());
        //onPanel.add(coin1); 
	    
	    coin2=new JButton(); 
        ImageIcon Imscoin2=new ImageIcon(this.getClass().getResource("/scales/coin2.jpeg"));
        coin2.setIcon(Imscoin2);  
        coin2.setBorder(null);
        coin2.setContentAreaFilled(false);
        onPanel.setLayout(null);
        coin2.setBounds(660,400,Imscoin2.getIconWidth(), Imscoin2.getIconHeight());
        //onPanel.add(coin2); 
	    
	    scales2=new JButton(); 
        ImageIcon Imscales2=new ImageIcon(this.getClass().getResource("/scales/scales2.jpeg"));
        scales2.setIcon(Imscales2);  
        scales2.setBorder(null);
        scales2.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scales2.setBounds(50,70,Imscales2.getIconWidth(), Imscales2.getIconHeight());
        onPanel.add(scales2); 
	    
        scales1=new JButton(); 
        ImageIcon Imscales1=new ImageIcon(this.getClass().getResource("/scales/scales1.jpg"));
        scales1.setIcon(Imscales1);  
        scales1.setBorder(null);
        scales1.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scales1.setBounds(50,70,Imscales1.getIconWidth(), Imscales1.getIconHeight());
        //onPanel.add(scales1); 
        
        scalesl1=new JButton(); 
        ImageIcon Imscalesl1=new ImageIcon(this.getClass().getResource("/scales/scalesl1.jpg"));
        scalesl1.setIcon(Imscalesl1);  
        scalesl1.setBorder(null);
        scalesl1.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scalesl1.setBounds(50,70,Imscalesl1.getIconWidth(), Imscalesl1.getIconHeight());
        //onPanel.add(scalesl1); 
        
        scalesr1=new JButton(); 
        ImageIcon Imscalesr1=new ImageIcon(this.getClass().getResource("/scales/scalesr1.jpg"));
        scalesr1.setIcon(Imscalesr1);  
        scalesr1.setBorder(null);
        scalesr1.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scalesr1.setBounds(50,70,Imscalesr1.getIconWidth(), Imscalesr1.getIconHeight());
        //onPanel.add(scalesl1); 
        
        scalesl2=new JButton(); 
        ImageIcon Imscalesl2=new ImageIcon(this.getClass().getResource("/scales/scalesl2.jpg"));
        scalesl2.setIcon(Imscalesl2);  
        scalesl2.setBorder(null);
        scalesl2.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scalesl2.setBounds(50,70,Imscalesl2.getIconWidth(), Imscalesl2.getIconHeight());
        //onPanel.add(scalesl2); 
        
        scalesr2=new JButton(); 
        ImageIcon Imscalesr2=new ImageIcon(this.getClass().getResource("/scales/scalesr2.jpg"));
        scalesr2.setIcon(Imscalesr2);  
        scalesr2.setBorder(null);
        scalesr2.setContentAreaFilled(false);
        onPanel.setLayout(null);
        scalesr2.setBounds(50,70,Imscalesr2.getIconWidth(), Imscalesr2.getIconHeight());
        //onPanel.add(scalesr2); 
		
		setVisible(true);
	}
	
	@SuppressWarnings("static-access")
	public static void cheng1(int l1,int r1,int l2,int r2,int which,int weight,int x) {
		
		try{
		    Thread thread = Thread.currentThread();
		    thread.sleep(1000);//wait 1500ms
		}catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}

		num1.setText(""+r1);
    	num2.setText(""+r1);
    	if(x%3==0) num3.setText(""+r1);
    	else num3.setText(""+r1+"+"+x%3);
    	
    	if (weight==0){
        	if (which<=r1&&which>=l1){
        		//right high , bad coin heavy
            	scales2.setVisible(false);
            	scalesl1.setVisible(false);
            	scalesl2.setVisible(false);
            	scalesr1.setVisible(false);
            	scales1.setVisible(false);
            	coin2.setVisible(false);
            	onPanel.add(coin1);
            	onPanel.add(scalesr2); 
            	coin1.setVisible(true);
            	scalesr2.setVisible(true);
            	onPanel.validate();
            	return;
        	}
        	else if(which<=r2&&which>=l2){
        		//left high , bad coin light
            	scales2.setVisible(false);
            	scales1.setVisible(false);
            	scalesl2.setVisible(false);
            	scalesr1.setVisible(false);
            	scalesr2.setVisible(false);
            	coin2.setVisible(false);
            	onPanel.add(coin1);
            	onPanel.add(scalesl1); 
            	coin1.setVisible(true);
            	scalesl1.setVisible(true);
            	onPanel.validate();
            	return;
        	}
        	else
        		//balance
        		scales2.setVisible(false);
        		scalesl1.setVisible(false);
        		scalesl2.setVisible(false);
        		scalesr1.setVisible(false);
        		scalesr2.setVisible(false);    
        		coin1.setVisible(false);
        		onPanel.add(coin2);
        		onPanel.add(scales1); 
        		coin2.setVisible(true);
        		scales1.setVisible(true);
        		onPanel.validate();
        		return;
		}
		//lighter
    	else{
			if (which<=r1&&which>=l1){
				//left high , bad coin light
	        	scales2.setVisible(false);
	        	scales1.setVisible(false);
	        	scalesl2.setVisible(false);
	        	scalesr1.setVisible(false);
	        	scalesr2.setVisible(false);
	        	coin2.setVisible(false);
	        	onPanel.add(coin1);
	        	onPanel.add(scalesl1); 
	        	coin1.setVisible(true);
	        	scalesl1.setVisible(true);
	        	onPanel.validate();
	        	return;
			}
			else if(which<=r2&&which>=l2){
				//right high , bad coin light
	        	scales2.setVisible(false);
	        	scalesl1.setVisible(false);
	        	scalesl2.setVisible(false);
	        	scales1.setVisible(false);
	        	scalesr2.setVisible(false);
	        	coin2.setVisible(false);
	        	onPanel.add(coin1);
	        	onPanel.add(scalesr1);
	        	coin1.setVisible(true);
	        	scalesr1.setVisible(true);
	        	onPanel.validate();
	        	return;
			}
			else
        		//balance
        		scales2.setVisible(false);
        		scalesl1.setVisible(false);
        		scalesl2.setVisible(false);
        		scalesr1.setVisible(false);
        		scalesr2.setVisible(false);    
        		coin1.setVisible(false);
        		onPanel.add(coin2);
        		onPanel.add(scales1);
        		coin2.setVisible(true);
        		scales1.setVisible(true);
        		onPanel.validate();
        		return;
		}    	
		
	}
	
@SuppressWarnings("static-access")
public static void cheng2(int l1,int r1,int l2,int r2,int which,int weight) {
		
		try{
		    Thread thread = Thread.currentThread();
		    thread.sleep(1000);//wait 1500ms
		}catch (InterruptedException e) {
		    // TODO Auto-generated catch block
		    e.printStackTrace();
		}
		num1.setText(""+r1);
    	num2.setText(""+r1);    	
    	num3.setText("");
    	if (weight==0){
        	if (which<=r1&&which>=l1){
        		//right high , bad coin heavy
            	scales2.setVisible(false);
            	scalesl1.setVisible(false);
            	scalesl2.setVisible(false);
            	scalesr1.setVisible(false);
            	scales1.setVisible(false);
            	coin2.setVisible(false);
            	coin1.setVisible(false);
            	onPanel.add(coin1);
            	onPanel.add(scalesr2); 
            	scalesr2.setVisible(true);
            	onPanel.validate();
            	return;
        	}
        	else if(which<=r2&&which>=l2){
        		//left high , bad coin light
            	scales2.setVisible(false);
            	scales1.setVisible(false);
            	scalesl1.setVisible(false);
            	scalesr1.setVisible(false);
            	scalesr2.setVisible(false);
            	coin2.setVisible(false);
            	coin1.setVisible(false);
            	onPanel.add(coin1);
            	onPanel.add(scalesl2); 
            	scalesl2.setVisible(true);
            	onPanel.validate();
            	return;
        	}
        	else
        		//balance
        		scales2.setVisible(false);
        		scalesl1.setVisible(false);
        		scalesl2.setVisible(false);
        		scalesr1.setVisible(false);
        		scalesr2.setVisible(false);    
        		coin1.setVisible(false);
        		onPanel.add(scales1); 
        		coin2.setVisible(false);
        		scales1.setVisible(true);
        		onPanel.validate();
        		return;
		}
		//lighter
    	else{
			if (which<=r1&&which>=l1){
				//left high , bad coin light
	        	scales2.setVisible(false);
	        	scales1.setVisible(false);
	        	scalesl2.setVisible(false);
	        	scalesr1.setVisible(false);
	        	scalesr2.setVisible(false);
	        	coin2.setVisible(false);
            	coin1.setVisible(false);
	        	onPanel.add(coin1);
	        	onPanel.add(scalesl1); 
	        	scalesl1.setVisible(true);
	        	onPanel.validate();
	        	return;
			}
			else if(which<=r2&&which>=l2){
				//right high , bad coin light
	        	scales2.setVisible(false);
	        	scalesl1.setVisible(false);
	        	scalesl2.setVisible(false);
	        	scales1.setVisible(false);
	        	scalesr2.setVisible(false);
	        	coin2.setVisible(false);
            	coin1.setVisible(false);
	        	onPanel.add(coin1);
	        	onPanel.add(scalesr1);
	        	scalesr1.setVisible(true);
	        	onPanel.validate();
	        	return;
			}
			else
        		//balance
        		scales2.setVisible(false);
        		scalesl1.setVisible(false);
        		scalesl2.setVisible(false);
        		scalesr1.setVisible(false);
        		scalesr2.setVisible(false);   
        		coin2.setVisible(false);
            	coin1.setVisible(false);
        		onPanel.add(coin2);
        		onPanel.add(scales1);
        		scales1.setVisible(true);
        		onPanel.validate();
        		return;
		}    	
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainFrame();
	}
	class btnSignupActionListener implements ActionListener, Runnable {
		int x;
		int which;
		int per;
		int weight;
        @Override
        public void actionPerformed(ActionEvent e) {
        	num1.setText("0");
        	num2.setText("0");
        	num3.setText("0");
        	result.setText("");
        	weight = random.nextInt(2);
        	x=Integer.parseInt(Number.getText());
        	if (x==1) {
        		scales2.setVisible(false);
        		scalesl1.setVisible(false);
        		scalesl2.setVisible(false);
        		scalesr1.setVisible(false);
        		scalesr2.setVisible(false);    
        		coin1.setVisible(false);
        		onPanel.add(scales1); 
        		coin2.setVisible(false);
        		scales1.setVisible(true);
        		onPanel.validate();
    			num1.setText("0");
            	num2.setText("0");
            	num3.setText("1");
            	result.setText("Find!");
            	return;
    		}
        	else if (x==2) {
            	//left high , bad coin light
            	scales2.setVisible(false);
            	scales1.setVisible(false);
            	scalesl2.setVisible(false);
            	scalesr1.setVisible(false);
            	scalesr2.setVisible(false);
            	coin2.setVisible(false);
            	onPanel.add(coin1);
            	onPanel.add(scalesl1); 
            	coin1.setVisible(true);
            	scalesl1.setVisible(true);
    			num1.setText("1");
            	num2.setText("1");
            	num3.setText("0");
            	result.setText("GG!");
            	return;
    		}	

    		which = random.nextInt(x)+1;
    		per = x/3;
    		
    		cheng1(1,per,per+1,per*2,which,weight,x);
    		Thread a =new Thread(this);
    		a.start();
    		
    		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			cheng1(1,per,per*2+1,per*3,which,weight,x);
			if (weight==0) badkind.setText("Bad Coin is Heaveier!");
			else badkind.setText("Bad Coin is Lighter!");
			
    		if (x%3==1) {
    			if (which==x){
    				result.setText("Find!");
    				return;
    			}
    			
    		}
    		else if (x%3==2) {
    			if (which==x-1){
    				cheng2(1,1,x-1,x-1,which,weight);
    				result.setText("Find!");
    				return;
    			}
    			if (which==x){
    				cheng2(1,1,x-1,x-1,which,weight);
    				cheng2(1,1,x,x,which,weight);
    				result.setText("Find!");
    				return;
    			}
    			
    		}
		
    			while(per>1){
    				int m=per/2;
    				int which=random.nextInt(per)+1;    			 		
    				cheng2(1,m,m+1,m*2,which,weight);
    				if (m*2<per && which==per) per=1;
    				else
    					per=m;
    			}
    			
    			if (per==1){
    				result.setText("Find!");
    				return;
    			}
    		
		}
		
	}
}

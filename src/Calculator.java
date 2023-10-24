import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Calculator implements ActionListener {
	boolean  isoperatorClicked=false;
	
	JFrame jf;
	JLabel displayLabel; JButton sevenButton;
	JButton eightButton;JButton nineButton;
	JButton fourButton; JButton fiveButton;
	JButton sixButton; JButton oneButton; 
	JButton twoButton; 
	JButton threeButton; JButton dotButton;
	JButton zeroButton;  JButton equalButton;
	JButton divButton;	JButton multButton;
	JButton subButton;JButton pluseButton;JButton clearButton;
	
	String OldValue;
	int operator=0;
	float result=0;
	
			public Calculator() {
	  jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300, 150);
		
		
		displayLabel=new JLabel("");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.cyan);
		displayLabel.setFont(new Font("Arial",Font.PLAIN,29));
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabel.setForeground(Color.white);
		jf.add(displayLabel);

		sevenButton=new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
	    sevenButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sevenButton);
		

		eightButton=new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		 eightButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(eightButton);
		
		
		 nineButton=new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		 nineButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(nineButton);
		
		fourButton=new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		 fourButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fourButton);
		
		 fiveButton=new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		 fiveButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(fiveButton);
		
	    sixButton=new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		 sixButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(sixButton);
		
		oneButton=new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		 oneButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(oneButton);
				
		twoButton=new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		 twoButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(twoButton);
		
		threeButton=new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		 threeButton.setFont(new Font("Arial",Font.PLAIN,40));
		jf.add(threeButton);
		
		dotButton=new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		 dotButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(dotButton);
				
		zeroButton=new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		 zeroButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(zeroButton);
		
		 equalButton=new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		equalButton.setFont(new Font("Arial",Font.PLAIN,30));
		jf.add(equalButton);
		
		
	     divButton=new JButton("/");
		divButton.setBounds(330, 130, 80, 80);
		divButton.setBackground(Color.orange);
		divButton.addActionListener(this);
		jf.add(divButton);
		

		multButton=new JButton("X");
		multButton.setBounds(330, 230, 80, 80);
		multButton.setBackground(Color.orange);
		multButton.addActionListener(this);
		jf.add(multButton);
		

		subButton=new JButton("-");
		subButton.setBounds(330, 330, 80, 80);
		subButton.setBackground(Color.orange);
		subButton.addActionListener(this);
		jf.add(subButton);
		

		pluseButton=new JButton("+");
		pluseButton.setBounds(330, 430, 80, 80);
		pluseButton.setBackground(Color.orange);
		pluseButton.addActionListener(this);
		jf.add(pluseButton);
		

		clearButton=new JButton("clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.setBackground(Color.orange);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
public static void main(String[] args) {
	new Calculator ();
}

@Override
public void actionPerformed(ActionEvent e) {
	//jf.getContentPane().setBackground(Color.GREEN);
	//displayLabel.setText("7");
	if(e.getSource()==sevenButton) {
		if(isoperatorClicked) {
			
			displayLabel.setText("7");
			isoperatorClicked=false;}
			else {displayLabel.setText(displayLabel.getText()+"7");
		}
			}else if(e.getSource()==eightButton) {
				if(isoperatorClicked) {
					
					displayLabel.setText("8");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"8");
				}
					}else if(e.getSource()==nineButton) {
						if(isoperatorClicked) {
							
							displayLabel.setText("9");
							isoperatorClicked=false;}
							else {displayLabel.setText(displayLabel.getText()+"9");
						}
			}else if(e.getSource()==fourButton) {
                 if(isoperatorClicked) {
					
					displayLabel.setText("4");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"4");
				}
			}else if(e.getSource()==fiveButton) {
             if(isoperatorClicked) {
					
					displayLabel.setText("5");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"5");
				}
			}else if(e.getSource()==sixButton) {
            
				
				if(isoperatorClicked) {
					
					displayLabel.setText("6");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"6");
				}
			}else if(e.getSource()==oneButton) {
if(isoperatorClicked) {
					
					displayLabel.setText("1");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"1");
				}
			}else if(e.getSource()==twoButton) {
if(isoperatorClicked) {
					
					displayLabel.setText("2");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"2");
				}
			}else if(e.getSource()==threeButton) {
if(isoperatorClicked) {
					
					displayLabel.setText("3");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+"3");
				}
			}else if(e.getSource()==dotButton) {
if(isoperatorClicked) {
					
					displayLabel.setText(".");
					isoperatorClicked=false;}
					else {displayLabel.setText(displayLabel.getText()+".");
				}
			}else if(e.getSource()==zeroButton) {
				displayLabel.setText(displayLabel.getText()+"0");
				
			}else if(e.getSource()==divButton) {
				operator=1;
				isoperatorClicked=true;
				OldValue=displayLabel.getText();
				//displayLabel.setText("/");
				
			}else if(e.getSource()==multButton) {
					operator=2;
				isoperatorClicked=true;
				OldValue=displayLabel.getText();
				//displayLabel.setText("*");
				
			}else if(e.getSource()==subButton) {
				operator=3;
				isoperatorClicked=true;
				OldValue=displayLabel.getText();
				//displayLabel.setText("-");
				
			}else if(e.getSource()==pluseButton) {
				operator=4;
				isoperatorClicked=true;
				OldValue=displayLabel.getText();
				//displayLabel.setText("+");
				
			}else if(e.getSource()==clearButton) {
				displayLabel.setText("  ");
				
				
			}else if(e.getSource()==equalButton) {
				
				String newValue=displayLabel.getText();
			float OldValuealueF=Float.parseFloat(OldValue);  //string convert to float
			float newValueF=Float.parseFloat(newValue);
			
			switch (operator) {
			case 1:
				result=newValueF/OldValuealueF;
				displayLabel.setText(result+"");
				break;
			case 2:
				result=newValueF*OldValuealueF;
				displayLabel.setText(result+"");
				break;
			case 3:
				result=newValueF-OldValuealueF;
				displayLabel.setText(result+"");
				break;
			case 4:
				result=newValueF+OldValuealueF;
				displayLabel.setText(result+"");
				break;
			
			default:
			displayLabel.setText(result+" ");
	
}}
}
}
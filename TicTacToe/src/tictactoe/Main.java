/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author HP
 */
public class Main extends JFrame implements ActionListener
{

    JLabel l4,l5;
   ImageIcon i1,i2;
   JButton  b1;

    Main()
    {
        Font f1=new Font("Algerian",Font.BOLD,70);
       Font f2=new Font("Showcard Gothic",Font.BOLD,30);
       

       i1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\cover-start.png");
       l5=new JLabel(i1);

       i2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\cover2.jpg");
       l4=new JLabel(i2);

       b1=new JButton("Start Game");
       setLayout(null);

       add(b1);
       b1.setBounds(600,650,300,100);
       b1.setFont(f2);
       b1.setForeground(Color.white);
       b1.setBackground(Color.green);
       b1.addActionListener(this);

       add(l5);
       l5.setBounds(150,100,1200,800);

       add(l4);
       l4.setBounds(0,0,1500,1000);


    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==b1)
        {
          game b1=new game();
          b1.setTitle("TicTacToe");
          b1.setVisible(true);
          b1.setSize(1500,1000);
          b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
    }
    
    public static void main(String[] args) {
        Main b=new Main();
        b.setTitle("TicTacToe");
        b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.setSize(1500,1000);
        b.setVisible(true);

    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tictactoe;
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
/**
 *
 * @author HP
 */
public class game extends JFrame implements ActionListener
{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,exit;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8;
    ImageIcon i1,i2,i3;
    int counter=1,p1,p2;
    boolean b;
     JLabel label;
    String str="";

    game()
    {
        Font f2=new Font("Showcard Gothic",Font.BOLD,30);
        i1=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\cover2.jpg");
        l1=new JLabel(i1);
        i2=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\game1.png");
        l3=new JLabel(i2);
        i3=new ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\TicTacToe\\src\\tictactoe\\p1.png");
        l4=new JLabel(i3);
        l2=new JLabel("Tic Tac Toe");
        l5=new JLabel("Player 1 :");
        l6=new JLabel("0");
        l7=new JLabel("Player 2 :");
        l8=new JLabel("0");
        b1=new JButton();
        b2=new JButton();
        b3=new JButton();
        b4=new JButton();
        b5=new JButton();
        b6=new JButton();
        b7=new JButton();
        b8=new JButton();
        b9=new JButton();
        exit=new JButton("Exit Game");
        setLayout(null);

        b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);

        

        b1.setFont(f2);
        b2.setFont(f2);
        b3.setFont(f2);
        b4.setFont(f2);
        b5.setFont(f2);
        b6.setFont(f2);
        b7.setFont(f2);
        b8.setFont(f2);
        b9.setFont(f2);


        add(b1);
        b1.setBounds(500,350,150,150);
        add(b2);
        b2.setBounds(650,350,150,150);
        add(b3);
        b3.setBounds(800,350,150,150);
        add(b4);
        b4.setBounds(500,500,150,150);
        add(b5);
        b5.setBounds(650,500,150,150);
        add(b6);
        b6.setBounds(800,500,150,150);
        add(b7);
        b7.setBounds(500,650,150,150);
        add(b8);
        b8.setBounds(650,650,150,150);
        add(b9);
        b9.setBounds(800,650,150,150);
        add(exit);
        exit.setFont(new Font("Harlow Solid Italic",Font.PLAIN,30));
        exit.setBackground(Color.YELLOW);
        exit.setForeground(Color.MAGENTA);
        exit.setBounds(1200,800,200,70);
        exit.addActionListener(this);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);

        getContentPane().setBackground(Color.cyan);

        add(l2);
        l2.setFont(new Font("Showcard Gothic",Font.BOLD,130));
        l2.setForeground(Color.RED);
        l2.setBounds(400,50,900,150);

        add(l3);
        l3.setBounds(1100,300,300,400);

        add(l4);
        l4.setBounds(100,0,250,250);
        
        add(l5);
        l5.setFont(new Font("Cooper Black",Font.BOLD,40));
        l5.setForeground(Color.blue);
        l5.setBounds(50,300,250,250);
        add(l6);
        l6.setFont(new Font("Cooper Black",Font.BOLD,40));
        l6.setBounds(270,300,250,250);

        add(l7);
        l7.setFont(new Font("Cooper Black",Font.BOLD,40));
        l7.setForeground(Color.blue);
        l7.setBounds(50,400,250,250);
        add(l8);
        l8.setFont(new Font("Cooper Black",Font.BOLD,40));
        l8.setBounds(270,400,250,250);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        counter++;

        
        if(counter%2==0)
        {
            str="X";
        }
        else
        {
            str="0";
        }

        if(ae.getSource()==b1)
        {
            b1.setText(str);
            b1.setFont(new Font("Arial",1,30));
            b1.setEnabled(false);
            if(str.equals("X"))
            {
                b1.setBackground(Color.MAGENTA);
            }
            else
            {
                 b1.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b2)
        {
            b2.setText(str);
            b2.setFont(new Font("Arial",1,30));
            b2.setEnabled(false);
            if(str.equals("X"))
            {
                b2.setBackground(Color.MAGENTA);
            }
            else
            {
                 b2.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b3)
        {
            b3.setText(str);
            b3.setFont(new Font("Arial",1,30));
            b3.setEnabled(false);
            if(str.equals("X"))
            {
                b3.setBackground(Color.MAGENTA);
            }
            else
            {
                 b3.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b4)
        {
            b4.setText(str);
            b4.setFont(new Font("Arial",1,30));
            b4.setEnabled(false);
            if(str.equals("X"))
            {
                b4.setBackground(Color.MAGENTA);
            }
            else
            {
                 b4.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b5)
        {
            b5.setText(str);
            b5.setFont(new Font("Arial",1,30));
            b5.setEnabled(false);
            if(str.equals("X"))
            {
                b5.setBackground(Color.MAGENTA);
            }
            else
            {
                 b5.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b6)
        {
            b6.setText(str);
            b6.setFont(new Font("Arial",1,30));
            b6.setEnabled(false);
            if(str.equals("X"))
            {
                b6.setBackground(Color.MAGENTA);
            }
            else
            {
                 b6.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b7)
        {
            b7.setText(str);
            b7.setFont(new Font("Arial",1,30));
            b7.setEnabled(false);
            if(str.equals("X"))
            {
                b7.setBackground(Color.MAGENTA);
            }
            else
            {
                 b7.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b8)
        {
            b8.setText(str);
            b8.setFont(new Font("Arial",1,30));
            b8.setEnabled(false);
            if(str.equals("X"))
            {
                b8.setBackground(Color.MAGENTA);
            }
            else
            {
                 b8.setBackground(Color.YELLOW);
            }
        }
        if(ae.getSource()==b9)
        {
            b9.setText(str);
            b9.setFont(new Font("Arial",1,30));
            b9.setEnabled(false);
            if(str.equals("X"))
            {
                b9.setBackground(Color.MAGENTA);
            }
            else
            {
                 b9.setBackground(Color.YELLOW);
            }
        }
        
        if(ae.getSource()==exit)
        {
            System.exit(0);
        }

        winnig_Pos();
        who_Win();

    }

    public void winnig_Pos()
    {
        if((b1.getText()).equals(b2.getText()) && (b2.getText()).equals(b3.getText()) && !(b1.getText()).equals(""))
        {
            b=true;
        }
        else if((b4.getText()).equals(b5.getText()) && (b5.getText()).equals(b6.getText()) && !(b4.getText()).equals(""))
        {
            b=true;
        }
        else if((b7.getText()).equals(b8.getText()) && (b8.getText()).equals(b9.getText()) && !(b7.getText()).equals(""))
        {
            b=true;
        }
        else if((b1.getText()).equals(b4.getText()) && (b4.getText()).equals(b7.getText()) && !(b1.getText()).equals(""))
        {
            b=true;
        }
        else if((b2.getText()).equals(b5.getText()) && (b5.getText()).equals(b8.getText()) && !(b2.getText()).equals(""))
        {
            b=true;
        }
        else if((b3.getText()).equals(b6.getText()) && (b6.getText()).equals(b9.getText()) && !(b3.getText()).equals(""))
        {
            b=true;
        }
        else  if((b1.getText()).equals(b5.getText()) && (b5.getText()).equals(b9.getText()) && !(b1.getText()).equals(""))
        {
            b=true;
        }
        else if((b3.getText()).equals(b5.getText()) && (b5.getText()).equals(b7.getText()) && !(b3.getText()).equals(""))
        {
            b=true;
        }
        else 
        {
            b=false;
        }
        
    }

    public void who_Win()
    {
        if(b==true)
        {
             String s="";
            if(str.equals("X"))
            {
                p1+=30;
                String score=""+p1;
                l6.setText(score);
                s="Player 1 wins Game....";
            }
            else
            {
                p2+=30;
                String score=""+p2;
                l8.setText(score);
                 s="Player 2 wins Game....";
            }
            label = new JLabel(s);
            label.setFont(new Font("Arial", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null,label,"TicTacToe",JOptionPane.PLAIN_MESSAGE);
            restart_game();
        }
        else if(counter == 10)
        {
            label = new JLabel("Game Draws....");
            label.setFont(new Font("Arial", Font.PLAIN, 18));
            JOptionPane.showMessageDialog(null,label,"TicTacToe",JOptionPane.PLAIN_MESSAGE);
            p1+=10;
            String score=""+p1;
            l6.setText(score);
            p2+=10;
            String score1=""+p2;
            l8.setText(score1);
            restart_game();
        }
    }
    public void restart_game()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

         b1.setBackground(Color.white);
        b2.setBackground(Color.white);
        b3.setBackground(Color.white);
        b4.setBackground(Color.white);
        b5.setBackground(Color.white);
        b6.setBackground(Color.white);
        b7.setBackground(Color.white);
        b8.setBackground(Color.white);
        b9.setBackground(Color.white);
        
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        
        counter=1;
    }
    
    public static void main(String[] args)
    {
        game b1=new game();
        b1.setTitle("TicTacToe");
        b1.setVisible(true);
        b1.setSize(1500,1000);
        b1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

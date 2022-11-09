
package lingkaranbres;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author fikri
 */
public class input extends JFrame{
    public input()
    {
        JFrame mainFrame=new JFrame();
    mainFrame.setSize(400,230);
    mainFrame.getContentPane().setBackground(Color.ORANGE);
    mainFrame.setLocationRelativeTo(null);
    mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    mainFrame.setTitle("Algoritma Lingkaran Bressenhem");
    mainFrame.setLayout(null);
    JLabel judul =new JLabel("Algoritma Lingkaran Bressenhem");
    judul.setBounds(70, 30, 600, 30);
    judul.setFont(new Font("Arial",Font.BOLD,16));
    mainFrame.add(judul);
    //Label
    JLabel Xclabel = new JLabel("Xc");
    JLabel Yclabel = new JLabel("Yc");
    JLabel rlabel = new JLabel("r");
    JTextField Xc = new JTextField();
    JTextField Yc = new JTextField();
    JTextField r = new JTextField();
    
    Xclabel.setBounds(30, 80,50, 30);
    Xc.setBounds(70, 80, 50, 30);
    Yclabel.setBounds(140, 80, 50, 30);
    Yc.setBounds(180, 80, 50, 30);
    rlabel.setBounds(250, 80, 50, 30);
    r.setBounds(290, 80, 50, 30);
    Xclabel.setFont(new Font("Arial",Font.BOLD,14));
    Xc.setFont(new Font("Arial",Font.BOLD,14));
    Yclabel.setFont(new Font("Arial",Font.BOLD,14));
    Yc.setFont(new Font("Arial",Font.BOLD,14));
    rlabel.setFont(new Font("Arial",Font.BOLD,14));
    r.setFont(new Font("Arial",Font.BOLD,14));
    mainFrame.add(Xclabel);
    mainFrame.add(Yclabel);
    mainFrame.add(rlabel);
    mainFrame.add(Xc);
    mainFrame.add(Yc);
    mainFrame.add(r);
    
    JButton Input1 = new JButton("Cek");
    Input1.setBounds(170, 130, 70, 30);
    Input1.setFont(new Font("Consolas",Font.BOLD,12));
    Input1.setForeground(Color.white);
    Input1.setBackground(Color.black);
    Input1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if(Xc.getText().equals("")&&Yc.getText().equals("")&&r.getText().equals(""))
                
                {
                    JOptionPane.showMessageDialog(null, "Input masih kosong");
                   
                }else if(Xc.getText().equals("")||Yc.getText().equals("")||r.getText().equals(""))
                {
                     JOptionPane.showMessageDialog(null, "Data yang di-inputkan ada yang kosong");
                }else
                {
                String x0 =Xc.getText();
                int x =Integer.parseInt(x0);
                AllObject.o.setXc(x);
                String y0 =Yc.getText();
                int y =Integer.parseInt(y0);
                AllObject.o.setYc(y);
                String ra =r.getText();
                int r1 =Integer.parseInt(ra);
                AllObject.o.setr(r1);
                
                view v = new view (x,y,r1);
                Xc.setText("");
                Yc.setText("");
                r.setText("");
                }}
            
        });
    mainFrame.add(Input1);
    mainFrame.setVisible(true);
    }
    
}
    


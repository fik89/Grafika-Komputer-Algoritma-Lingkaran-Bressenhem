
package lingkaranbres;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
/**
 *
 * @author fikri
 */
public class view  extends JFrame{
    public view (int a,int b,int c)
    {
        JFrame frame = new JFrame("Algoritma Bressehem Lingkaran");
        AlgoLingkaran o = new AlgoLingkaran();
        AllObject.o.setXc(a);
        AllObject.o.setYc(b);
        AllObject.o.setr(c);
        frame.add(o);
        frame.setBounds(100,100,600,600);
        frame.setVisible(true);
        frame.setResizable(true);
    }
}


package lingkaranbres;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoLingkaran extends JPanel{    
    int Xc,Yc,r;
    //step 1
    public void setXc(int x) {AllObject.o.Xc = x;}
    public void setYc(int y) {AllObject.o.Yc = y;}
    public void setr(int r) {AllObject.o.r = r;}
    
    public int getXc(){return AllObject.o.Xc;}
    public int getYc(){return AllObject.o.Yc;}
    public int getr(){return AllObject.o.r;}

    @Override
    public void paint(Graphics grs) {  
        //step 2,hitung nilai Po
        int Po =  1-AllObject.o.getr();
        int x; 
        int y = AllObject.o.getr();
        
        super.paint(grs);
        this.setBackground(Color.WHITE);
        grs.setColor(Color.blue);
        
        //step 3,perulangan dr x sampai y maka
        for(x=0;x<=y;x++) {
            
            if(Po<0){
               Po+=2*x+1;
            }else{
                y--;
                Po+=2*(x-y)+1;
            }
            
            //step 5,langkah menggambar atau mewarnai pixel sesuai x dan y
            grs.drawRect(AllObject.o.getXc()+x, AllObject.o.getYc()+y, 1, 1);
            grs.drawRect(AllObject.o.getXc()-x, AllObject.o.getYc()+y, 1, 1);
            grs.drawRect(AllObject.o.getXc()+x, AllObject.o.getYc()-y, 1, 1);
            grs.drawRect(AllObject.o.getXc()-x, AllObject.o.getYc()-y, 1, 1);
            grs.drawRect(AllObject.o.getXc()+y, AllObject.o.getYc()+x, 1, 1);
            grs.drawRect(AllObject.o.getXc()-y, AllObject.o.getYc()+x, 1, 1);
            grs.drawRect(AllObject.o.getXc()+y, AllObject.o.getYc()-x, 1, 1);
            grs.drawRect(AllObject.o.getXc()-y, AllObject.o.getYc()-x, 1, 1);
            
        }
    }
}
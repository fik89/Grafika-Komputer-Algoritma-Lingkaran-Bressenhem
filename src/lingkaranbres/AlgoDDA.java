package lingkaranbres;
//import library yg dibutuhkan
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoDDA extends JPanel{

    private int x1,y1,x2,y2;
    public void setx1(int x1) {
        this.x1 = x1;
    }
    public void setx2(int x2) {
        this.x2 = x2;
    }
    public void sety1(int y1) {
        this.y1 = y1;
    }
    public void sety2(int y2) {
        this.y2 = y2;
    }
 
    @Override
    public void paint(Graphics grs) {
        int jmlLangkah,i;
        float x_inc,y_inc;
     
        int dx = x2-x1;  //mencari jarak x2 dengan x1
     
        int dy = y2-y1; //mencari jarak y2 dengan y1
     
        //dibuat atau di casting menjadi float karena variabel akan menampung nilai desimal
        float x=x1;
        float y=y1;
     
        super.paint(grs);  //menurunkan fungsi parent
        this.setBackground(Color.MAGENTA);  //warna background
        grs.setColor(Color.RED);  //warna garis
     
        //menentukan jumlah langkah untuk perulangan
        //apabila variabel adalah bilangan negatif maka diubah menjadi bilangan positif
        if(Math.abs(dx)>Math.abs(dy)){
            jmlLangkah = Math.abs(dx);
        }
        else{
            jmlLangkah = Math.abs(dy);
        }
     
        //menentukan pertambahan nilai tiap langkah
        x_inc = dx/(float)jmlLangkah;
     
        y_inc = dy/(float)jmlLangkah;
     
        //perulangan utk menggambar titik
        for(i=1;i<=jmlLangkah;i++) {
            //setiap langkah, x dan y akan mengalami pertambahan sesuai increment
            x += x_inc;
            y += y_inc;
         
            //menggambar atau mewarnai titik sesuai x dan y
            grs.drawRect(Math.round(x), Math.round(y), 1, 1);
        }
    }}
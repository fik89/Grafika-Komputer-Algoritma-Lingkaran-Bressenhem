/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lingkaranbres;
 //import library yg dibutuhkan
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoBresenham extends JPanel{
    //variable untuk menentukan x dan y
    private int x1,y1,x2,y2,p,pkd0,pld0;
    
    //constructor bresenham
    public AlgoBresenham() {
        
    }
    
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
        int x,y,endx,endy;
        
        //mencari jarak x2 dengan x1
        int dx = Math.abs(x2-x1);
        int dy = Math.abs(y2-y1);
        
        super.paint(grs); //menurunkan fungsi parent
        this.setBackground(Color.black); //warna bachround
        grs.setColor(Color.YELLOW);// warna garis
        
        //apabila jarak dx lbh besar dari dy, maka perulangan berpatokan titik x
        if(dx>=dy){
            p = 2*dy-dx;   //P awal  
            pkd0 = 2*dy;   //P selanjutnya jika P<0
            pld0 = 2*(dy-dx);  //P selanjutnya jika P>0
                
            //menentukan x, y
            //endx untuk menandai batas x dan untuk akhir perulangan
            //bila x1 lbh besar dari x2 maka awal pembuatan garis dimulai dari x2 (titik paling kiri                          menuju ke kanan)
            if (x1>x2){
                x = x2;
                y = y2;
                endx = x1;
            }else{
                x = x1;
                y = y1;
                endx = x2;
            }
            
            //perulangan membuat titik berpatokan x karena dx lbh besar dari dy
            while(x<endx){
                x++;
                
                //bila p<0 maka hanya x yg bertambah
                if(p<0) {
                    p += pkd0;
                }else{
                    //jika y lbh besar dari endy maka gambar akan semakin keatas
                    //jika endy lbh besar maka gambar akan menurun kebawah
                    if(y1>y2){
                        y--;
                    } 
                    else{ 
                        y++;
                    }    
                    
                    p+=pld0;   
                }    
            
                //menggambar titik sesuai x dan y
                grs.drawRect(x, y, 1, 1);
            }
        }
        //perulangan berpatokan sumbu y karena dy lebih besar
        else{
            p = 2*dx-dy;  //P awal 
            pkd0 = 2*dx; //P selanjutnya, jika P<0
            pld0 = 2*(dx-dy); //P selanjutnya, jika P>0
            
            //menentukan x, y
            //endy untuk menandai batas y                
            //bila x1 lbh besar dari x2 maka awal pembuatan garis dimulai dari x2 (titik paling kiri                           menuju ke kanan)
            if(y1>y2){
                x = x2;
                y = y2;
                endy = y1;
            }
            //karena y2 lebih besar dari y1
            else{
                x = x1;
                // x = 80
                // y = 30
                y = y1;
                endy = y2;
                //endy = 180
            }
            
            //perulangan membuat titik berpatokan y karena dy lbh besar dari dx
            while(y<endy){
                y++;
                
                if(p<0) {
                    p+=pkd0;
                }else{
                    //jika x lbh besar dari endx maka gambar akan semakin keatas
                    //jika endx lbh besar maka gambar akan menurun kebawah
                    if(x1>x2){
                        x--;
                    }else{
                        x++;
                    }
                    
                    p+=pld0;
                }
                
                //menggambar titik sesuai x dan y
                grs.drawRect(x, y, 1, 1);
            }
        }
    }
}
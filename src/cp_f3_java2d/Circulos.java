/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cp_f3_java2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Stroke;
import java.awt.geom.Line2D;

/**
 *
 * @author PC
 */
public class Circulos extends javax.swing.JPanel {

    /**
     * Creates new form Circulos
     */
    public Circulos() {
        initComponents();
    }
    
        @Override
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g;
        
        // Dibujar borde de la cara
        Line2D l1 = new Line2D.Double(90, 90, 110, 40);       
        Line2D l2 = new Line2D.Double(110, 40, 150, 10);
        Line2D l3 = new Line2D.Double(150, 10, 200, 10);
        Line2D l4 = new Line2D.Double(200, 10, 230, 50);
        Line2D l5 = new Line2D.Double(230, 50, 240, 100);
        Line2D l6 = new Line2D.Double(240, 100, 220, 150);
        Line2D l7 = new Line2D.Double(220, 150, 240, 220);
        Line2D l8 = new Line2D.Double(240, 220, 190, 250);
        Line2D l9 = new Line2D.Double(190, 250, 150, 240);
        Line2D l10 = new Line2D.Double(150, 240, 150, 200);
        Line2D l11 = new Line2D.Double(150, 200, 100, 200);
        Line2D l12 = new Line2D.Double(100, 200, 100, 170);
        Line2D l13 = new Line2D.Double(100, 170, 110, 170);
        Line2D l14 = new Line2D.Double(110, 170, 90, 160);
        Line2D l15 = new Line2D.Double(90, 160, 110, 130);
        Line2D l16 = new Line2D.Double(97, 150, 80, 140);
        Line2D l17 = new Line2D.Double(80, 140, 100, 110);
        Line2D l18 = new Line2D.Double(100, 110, 90, 90);

       // Frente interna
       Line2D l19 = new Line2D.Double(110, 90, 120, 50); 
       Line2D l20 = new Line2D.Double(120, 50, 160, 30); 
       Line2D l21 = new Line2D.Double(160, 30, 200, 30);
       Line2D l22 = new Line2D.Double(200, 30, 220, 60);
       Line2D l23 = new Line2D.Double(220, 60, 240, 100);
       
       // Conectores frente externa con interna
       Line2D l24 = new Line2D.Double(90, 90, 110, 90); 
       Line2D l25 = new Line2D.Double(110, 40, 120, 50); 
       Line2D l26 = new Line2D.Double(150, 10, 160, 30); 
       Line2D l27 = new Line2D.Double(200, 30, 200, 10); 
       Line2D l28 = new Line2D.Double(220, 60, 230, 50); 
       
       Line2D l29 = new Line2D.Double(110, 90, 130, 110); 
       Line2D l30 = new Line2D.Double(130, 110, 140, 100); 
       Line2D l31 = new Line2D.Double(140, 100, 180, 110); 
       Line2D l32 = new Line2D.Double(180, 110, 180, 100); 
       Line2D l33 = new Line2D.Double(180, 100, 190, 90); 
       Line2D l34 = new Line2D.Double(190, 90, 200, 30); // 5
       Line2D l35 = new Line2D.Double(190, 90, 210, 100);
       Line2D l36 = new Line2D.Double(210, 100, 210, 110);
       Line2D l37 = new Line2D.Double(210, 110, 240, 100);
       
       Line2D l38 = new Line2D.Double(130, 110, 130, 120);
       Line2D l39 = new Line2D.Double(130, 120, 180, 120);
       Line2D l40 = new Line2D.Double(180, 120, 180, 110);
       
       Line2D l41 = new Line2D.Double(180, 120, 170, 140);
       Line2D l42 = new Line2D.Double(170, 140, 190, 140);
       Line2D l43 = new Line2D.Double(190, 140, 210, 110);
       
       // Conectores internos inferiores
       Line2D l44 = new Line2D.Double(190, 140, 220, 150);
       Line2D l45 = new Line2D.Double(190, 140, 240, 220);
       Line2D l46 = new Line2D.Double(190, 140, 190, 250);
       Line2D l47 = new Line2D.Double(185, 140, 150, 240);
       Line2D l48 = new Line2D.Double(180, 140, 170, 170);
       Line2D l49 = new Line2D.Double(170, 170, 150, 200);
       Line2D l50 = new Line2D.Double(170, 140, 160, 160);
       Line2D l51 = new Line2D.Double(160, 160, 120, 190);
       Line2D l52 = new Line2D.Double(120, 190, 120, 130);
       Line2D l53 = new Line2D.Double(120, 130, 130, 120);
       
       // Ojo
       Line2D l54 = new Line2D.Double(105, 110, 110, 110);
       Line2D l55 = new Line2D.Double(110, 110, 120, 110);
       Line2D l56 = new Line2D.Double(120, 110, 110, 120);
       Line2D l58 = new Line2D.Double(110, 120, 102, 125);
       Line2D l57 = new Line2D.Double(110, 120, 110, 110);
       
       


        
        Stroke pincel = new BasicStroke(3.0f);
        g2.setStroke(pincel);
        
        g2.setColor(Color.GREEN);
        
        // Dibujar
        g2.draw(l1);
        g2.draw(l2);
        g2.draw(l3);
        g2.draw(l4);
        g2.draw(l5);
        g2.draw(l6);
        g2.draw(l7);
        g2.draw(l8);
        g2.draw(l9);
        g2.draw(l10);
        g2.draw(l11);
        g2.draw(l12);
        g2.draw(l13);
        g2.draw(l14);
        g2.draw(l15);
        g2.draw(l16);
        g2.draw(l17);       
        g2.draw(l18);
        g2.draw(l19);
        g2.draw(l20);
        g2.draw(l21);
        g2.draw(l22);
        g2.draw(l23);
        g2.draw(l24);
        g2.draw(l25);
        g2.draw(l26);
        g2.draw(l27);
        g2.draw(l28);
        g2.draw(l29);
        g2.draw(l30);
        g2.draw(l31);
        g2.draw(l32);
        g2.draw(l33);
        g2.draw(l34);
        g2.draw(l35);
        g2.draw(l36);
        g2.draw(l37);
        g2.draw(l38);
        g2.draw(l39);
        g2.draw(l40);
        g2.draw(l41);
        g2.draw(l42);
        g2.draw(l43);
        g2.draw(l44);
        g2.draw(l45);
        g2.draw(l46);
        g2.draw(l47);
        g2.draw(l48);
        g2.draw(l49);
        g2.draw(l50);
        g2.draw(l51);
        g2.draw(l52);
        g2.draw(l53);
        g2.draw(l54);
        g2.draw(l55);
        g2.draw(l56);
        g2.draw(l57);
        g2.draw(l58);


        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

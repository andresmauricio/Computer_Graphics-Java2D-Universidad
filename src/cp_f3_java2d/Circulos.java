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
import java.awt.geom.Arc2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

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
        Line2D l1 = new Line2D.Double(150, 50, 170, 70);  
        
        // Cabeza
        Rectangle2D head = new Rectangle2D.Double(230, 170, 150, 150);
        
        // Cuerpo
        Ellipse2D body1 = new Ellipse2D.Double(255, 320, 100, 100);
        Ellipse2D body2 = new Ellipse2D.Double(255, 420, 100, 100);
        Ellipse2D body3 = new Ellipse2D.Double(255, 520, 100, 100);
        Ellipse2D body4 = new Ellipse2D.Double(255, 620, 100, 100);
        Ellipse2D body5 = new Ellipse2D.Double(255, 720, 100, 100);
        
        // Antenas
        Ellipse2D ant1 = new Ellipse2D.Double(100, 55, 75, 75);
        Ellipse2D ant2 = new Ellipse2D.Double(420, 55, 75, 75);
        
        // Conexión Antenas
        Arc2D arc = new Arc2D.Double(23, 70, 250, 200, 0, 90, Arc2D.OPEN);
        Arc2D arc2 = new Arc2D.Double(320, 70, 250, 200, 90, 90, Arc2D.OPEN);
        
        // Alas
        Arc2D arc3 = new Arc2D.Double(350, 350, 250, 200, 90, 360, Arc2D.CHORD);
        Arc2D arc4 = new Arc2D.Double(350, 570, 250, 200, 90, 360, Arc2D.CHORD);
        
        Arc2D arc5 = new Arc2D.Double(10, 350, 250, 200, 90, 360, Arc2D.CHORD);
        Arc2D arc6 = new Arc2D.Double(10, 570, 250, 200, 90, 360, Arc2D.CHORD);
              
        Stroke pincel = new BasicStroke(3.0f);
        g2.setStroke(pincel);
        
        g2.setColor(Color.DARK_GRAY);
        
        // Dibujar
        g2.draw(head);
        g2.draw(body1);
        g2.draw(body2);
        g2.draw(body3);
        g2.draw(body4);
        g2.draw(body5);
        g2.draw(ant1);
        g2.draw(ant2);
        g2.draw(arc);
        g2.draw(arc2);
        g2.draw(arc3);
        g2.draw(arc4);
        g2.draw(arc5);
        g2.draw(arc6);
        
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

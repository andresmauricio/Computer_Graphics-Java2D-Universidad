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
import java.awt.Polygon;
import java.awt.Stroke;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author PC
 */
public class ImagenesAcopladas extends javax.swing.JPanel {

    /**
     * Creates new form ImagenesAcopladas
     */
    public ImagenesAcopladas() {
        initComponents();
    }
    
    public void paint(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g;
        
        // Dibujar paisaje
        int tri1X[] = { 300, 350, 260 };
        int tr11Y[] = { 20, 40, 40 }; 
        Polygon tiangle1 = new Polygon(tri1X, tr11Y, 3);
        
        int tri2X[] = { 300, 350, 260 };
        int tr12Y[] = { 100, 130, 130 }; 
        Polygon tiangle2 = new Polygon(tri2X, tr12Y, 3);
        
        Line2D l1 = new Line2D.Double(270, 40, 270, 80);
        Line2D l2 = new Line2D.Double(270, 80, 280, 80);
        Line2D l3 = new Line2D.Double(280, 80, 280, 115);
        Line2D l4 = new Line2D.Double(340, 40, 340, 125);
        Line2D l5 = new Line2D.Double(340, 130, 340, 200);
        Line2D l6 = new Line2D.Double(340, 200, 270, 200);
        Line2D l7 = new Line2D.Double(270, 200, 270, 130);
        Line2D l8 = new Line2D.Double(270, 180, 190, 180);
        Line2D l9 = new Line2D.Double(190, 180, 190, 80);
        Line2D l10 = new Line2D.Double(190, 80, 280, 80);
        Line2D l11 = new Line2D.Double(230, 80, 230, 50);
        Line2D l12 = new Line2D.Double(230, 50, 260, 50);
        Line2D l13 = new Line2D.Double(260, 50, 260, 80);
        
        // Ventanas redondas
        Ellipse2D ventana1 = new Ellipse2D.Double(240, 60, 10, 10);
        Ellipse2D ventana2 = new Ellipse2D.Double(310, 140, 20, 20);
        
        // Ventanas cuadradas
        Rectangle2D ventana3 = new Rectangle2D.Double(280, 50, 25, 25);
        Rectangle2D ventana4 = new Rectangle2D.Double(320, 50, 12.5, 12.5);
        Rectangle2D ventana5 = new Rectangle2D.Double(320, 75, 12.5, 12.5);
        
        Rectangle2D ventana6 = new Rectangle2D.Double(200, 100, 15, 15);
        Rectangle2D ventana7 = new Rectangle2D.Double(220, 100, 15, 15);
        Rectangle2D ventana8 = new Rectangle2D.Double(240, 100, 15, 15);
        
        // Puertas 1 
        Line2D l14 = new Line2D.Double(280, 200, 280, 170);
        Line2D l15 = new Line2D.Double(280, 170, 300, 170);
        Line2D l16 = new Line2D.Double(300, 170, 300, 200);
        
         // Puertas 2
        Line2D l17 = new Line2D.Double(210, 180, 210, 150);
        Line2D l18 = new Line2D.Double(210, 150, 240, 150);
        Line2D l19 = new Line2D.Double(240, 150, 240, 180);
        
        // Arboles pequeños
        int base1X[] = { 70, 80, 60 };
        int base1Y[] = { 230, 250, 250 }; 
        Polygon baseArbolespequenos1 = new Polygon(base1X, base1Y, 3);
        Ellipse2D puntaArbolPequeno1 = new Ellipse2D.Double(60, 210, 20, 20);

        int base2X[] = { 110, 100, 120 };
        int base2Y[] = { 230, 250, 250 }; 
        Polygon baseArbolespequenos2 = new Polygon(base2X, base2Y, 3);
        Ellipse2D puntaArbolPequeno2 = new Ellipse2D.Double(100, 210, 20, 20);
               
        // Arbol
        int arbolx[] = { 140, 180, 110 };
        int arboly[] = { 130, 190, 190 }; 
        Polygon baseArbol = new Polygon(arbolx, arboly, 3);
        Line2D l20 = new Line2D.Double(130, 190, 130, 230);
        Line2D l21 = new Line2D.Double(130, 230, 160, 230);
        Line2D l22 = new Line2D.Double(160, 230, 160, 190);
        
        // Arbol redondo
        Line2D l23 = new Line2D.Double(80, 190, 60, 190);
        Line2D l24 = new Line2D.Double(60, 190, 60, 170);
        Line2D l25 = new Line2D.Double(80, 190, 80, 170);
        Ellipse2D puntaArbol = new Ellipse2D.Double(55, 142, 30, 30);
        
        // Linea Divisora
        Line2D l26 = new Line2D.Double(30, 110, 190, 110);
        Line2D l27 = new Line2D.Double(340, 110, 400, 110);
        
        // Sol
        Ellipse2D sol = new Ellipse2D.Double(60, 30, 40, 40);
        
        int punta1X[] = { 80, 90, 70 };
        int punta1Y[] = { 10, 25, 25}; 
        Polygon puntaSol1 = new Polygon(punta1X, punta1Y, 3);
        
        int punta2X[] = { 80, 90, 70 };
        int punta2Y[] = { 90, 75, 75}; 
        Polygon puntaSol2 = new Polygon(punta2X, punta2Y, 3);
        
        int punta3X[] = { 40, 55, 55 };
        int punta3Y[] = { 50, 40, 60}; 
        Polygon puntaSol3 = new Polygon(punta3X, punta3Y, 3);
        
        int punta4X[] = { 120, 105, 105 };
        int punta4Y[] = { 50, 60, 40}; 
        Polygon puntaSol4 = new Polygon(punta4X, punta4Y, 3);
        
        // Tren 
        Ellipse2D rueda1 = new Ellipse2D.Double(220, 240, 20, 20);
        Ellipse2D rueda2 = new Ellipse2D.Double(240, 240, 20, 20);
        
        Ellipse2D rueda3 = new Ellipse2D.Double(280, 240, 20, 20);
        Ellipse2D rueda4 = new Ellipse2D.Double(300, 240, 20, 20);
        
        Ellipse2D rueda5 = new Ellipse2D.Double(340, 240, 20, 20);
        Ellipse2D rueda6 = new Ellipse2D.Double(360, 240, 20, 20);
        
        Rectangle2D bagon1 = new Rectangle2D.Double(223, 225, 15, 15);
        Rectangle2D bagon2 = new Rectangle2D.Double(238, 225, 15, 15);
        
        Rectangle2D bagon3 = new Rectangle2D.Double(285, 225, 15, 15);
        Rectangle2D bagon4 = new Rectangle2D.Double(300, 225, 15, 15);
        
        Rectangle2D bagon5 = new Rectangle2D.Double(345, 225, 15, 15);
        Rectangle2D bagon6 = new Rectangle2D.Double(360, 225, 15, 15);
        
        Line2D conexion1 = new Line2D.Double(255, 235, 285, 235);
        Line2D conexion2 = new Line2D.Double(315, 235, 345, 235);
        

        g.setColor(Color.DARK_GRAY);
        // Dibujar
        g.drawPolygon(tiangle1);
        g.drawPolygon(tiangle2);
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
        g.drawPolygon(baseArbol);
        g2.draw(l20);
        g2.draw(l21);
        g2.draw(l22);
        g2.draw(l23);
        g2.draw(l24);
        g2.draw(l25);
        g2.draw(l26);
        g2.draw(l27);
        g2.draw(puntaArbol);
        g2.draw(ventana1);
        g2.draw(ventana2);
        g2.draw(ventana3);
        g2.draw(ventana4);
        g2.draw(ventana5);
        g2.draw(ventana6);
        g2.draw(ventana7);
        g2.draw(ventana8);
        g2.draw(baseArbolespequenos1);
        g2.draw(baseArbolespequenos2);
        g2.draw(puntaArbolPequeno1);
        g2.draw(puntaArbolPequeno2);
        g2.draw(sol);
        g.drawPolygon(puntaSol1);
        g.drawPolygon(puntaSol2);
        g.drawPolygon(puntaSol3);
        g.drawPolygon(puntaSol4);
        g2.draw(rueda1);
        g2.draw(rueda2);
        g2.draw(rueda3);
        g2.draw(rueda4);
        g2.draw(rueda5);
        g2.draw(rueda6);
        g2.draw(bagon1);
        g2.draw(bagon2);
        g2.draw(bagon3);
        g2.draw(bagon4);
        g2.draw(bagon5);
        g2.draw(bagon6);
        g2.draw(conexion1);
        g2.draw(conexion2);
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

package com.mycompany.banhang.view.viewchinh.raven.component;


import com.mycompany.banhang.view.viewchinh.raven.event.EventMenuSelected;
import com.mycompany.banhang.view.viewchinh.raven.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Path2D;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    private EventMenuSelected event;

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        listMenu1.addEventMenuSelected(event);
    }

    public Menu() {
        initComponents();
        setOpaque(false);
        listMenu1.setOpaque(false);
        init();
    }

    private void init() {
        listMenu1.addItem(new Model_Menu( "Dashboard ", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "UI Elements ", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Comonents", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Forms Stuff", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Date Table", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Icons", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Sample Page", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Extra", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "More", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "Logout", Model_Menu.MenuType.MENU));
        listMenu1.addItem(new Model_Menu( "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profile2 = new com.mycompany.banhang.view.viewchinh.raven.component.Profile();
        jScrollPane2 = new javax.swing.JScrollPane();
        listMenu1 = new com.mycompany.banhang.view.viewchinh.raven.swing.ListMenu<>();

        jScrollPane2.setViewportView(listMenu1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(profile2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintChildren(Graphics grphcs) {
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#e74c3c"), 0, getHeight(), Color.decode("#000000"));
        int height = 140;
        Path2D.Float f = new Path2D.Float();
        f.moveTo(0, 0);
        f.curveTo(0, 0, 0, 70, 100, 70);
        f.curveTo(100, 70, getWidth(), 70, getWidth(), height);
        f.lineTo(getWidth(), getHeight());
        f.lineTo(0, getHeight());
        g2.setColor(new Color(60, 60, 60));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.setPaint(g);
        g2.fill(f);
        super.paintChildren(grphcs);
    }

    private int x;
    private int y;

    public void initMoving(JFrame fram) {
        profile2.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        profile2.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                fram.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private com.mycompany.banhang.view.viewchinh.raven.swing.ListMenu<String> listMenu1;
    private com.mycompany.banhang.view.viewchinh.raven.component.Profile profile2;
    // End of variables declaration//GEN-END:variables
}

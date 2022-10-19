/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.grupojcc.finanzasproject.views;

import com.grupojcc.finanzasproject.controllers.ESFController;
import javax.swing.JInternalFrame;

/**
 *
 * @author Johnny
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        inicio();
    }

    
    public void inicio(){
        ESFController esfc = new ESFController(this);
        newButtonItem.addActionListener(esfc);
    }
    
    
    public void isVisible(JInternalFrame ESFFrame, boolean maxizeFrame) {
        jDesktopPane1.add(ESFFrame);
        ESFFrame.setVisible(true);
        if (maxizeFrame) {
            jDesktopPane1.getDesktopManager().maximizeFrame(ESFFrame);
        }
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        newMenuItem = new javax.swing.JMenu();
        newButtonItem = new javax.swing.JMenuItem();
        razonesButtonItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 462, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        newMenuItem.setText("Archivo");
        newMenuItem.setActionCommand("archivo");

        newButtonItem.setText("Nuevo Balance General");
        newButtonItem.setActionCommand("Nuevo");
        newMenuItem.add(newButtonItem);

        razonesButtonItem.setText("Razones Financieras");
        razonesButtonItem.setActionCommand("razones");
        newMenuItem.add(razonesButtonItem);

        jMenuBar1.add(newMenuItem);

        jMenu2.setText("Opciones");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JMenuItem newButtonItem;
    public javax.swing.JMenu newMenuItem;
    public javax.swing.JMenuItem razonesButtonItem;
    // End of variables declaration//GEN-END:variables
}

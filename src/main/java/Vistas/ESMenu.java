/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vistas;

import javax.swing.JFrame;

/**
 *
 * @author Camilo Castro
 */
public class ESMenu {

    public ESMenu() {
        IS.setVisible(true);
        IS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    IncomeStatement IS = new IncomeStatement();
}

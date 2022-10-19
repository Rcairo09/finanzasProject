/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupojcc.finanzasproject.controllers;

import com.grupojcc.finanzasproject.views.ESFFrame;
import com.grupojcc.finanzasproject.views.MainFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Johnny
 */
public class ESFController implements ActionListener{
    MainFrame mf;
    ESFFrame esff;
    
    public ESFController(MainFrame mf){
        this.mf = mf;
    }
    
    public ESFController(ESFFrame esff){
        this.esff = esff;
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Nuevo":
                isVisibleESFFrame();
                break;
        }
    }
    
    
    public void isVisibleESFFrame() {
        ESFFrame esff = new ESFFrame();
        mf.isVisible(esff, true);
    }
    
    
}

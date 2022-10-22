/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupojcc.finanzasproject.controllers;

import com.grupojcc.finanzasproject.models.BalanceArreglo;
import com.grupojcc.finanzasproject.models.ESFModel;
import com.grupojcc.finanzasproject.views.ESFFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Johnny
 */
public class BalanceController implements ActionListener {
ESFFrame esf;
    public BalanceController(ESFFrame esf){
        this.esf = esf;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
     switch(e.getActionCommand()){
      case "Agregar":
        esf.agregado();
        break;
      case "Guardar":
          guardar();
        break;
      case "Mostrar":
          esf.lectura();
        break;
    } 
        
        
    }

    public void guardar() {
        BalanceArreglo balance = esf.guardado();
        ESFModel model = new ESFModel();
        JFileChooser j = new JFileChooser();
        j.showSaveDialog(esf);
        File file = j.getSelectedFile();
        if(file!=null){
           try {
                model.save(file, balance);
                if(file.exists()){
                    JOptionPane.showMessageDialog(esf, "El archivo fue guardado corectamente");
                    
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(esf, "El archivo no pudo ser guardado correctamente");
                Logger.getLogger(BalanceController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public BalanceArreglo Leer() {
       JFileChooser x = new JFileChooser();
       BalanceArreglo balance = null;
       ESFModel model = new ESFModel();
       x.showOpenDialog(esf);
       File f = x.getSelectedFile();
       if(f!=null){
           try {
               balance = model.read(f);
           } catch (IOException ex) {
               JOptionPane.showMessageDialog(esf, "El archivo no pudo ser leido correctamente");
               Logger.getLogger(BalanceController.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
       
     return balance;
        
    }
    

    

    
}

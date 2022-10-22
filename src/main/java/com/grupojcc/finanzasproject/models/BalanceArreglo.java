/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupojcc.finanzasproject.models;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Johnny
 */
public class BalanceArreglo implements Serializable{
    private ArrayList<ESFModel>esf;
    
    public BalanceArreglo(){
        esf = new ArrayList <ESFModel>();
    }
    
    public void adicionar(ESFModel m){
        esf.add(m);
    }
    
    public ESFModel obtener(int posicion){
        return esf.get(posicion);
    }
    
    public int tamaño(){
        return esf.size();
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gabriela
 */
import javax.swing.*;
public class Practica5 extends JFrame {
    private JLabel label1,label2,label3;
    
    public Practica5() {
        setLayout(null);
        label1=new JLabel("Rojo");
        label1.setBounds(10,20,100,30);
        add(label1);
        label2=new JLabel("Amarillo");
        label2.setBounds(10,60,100,30);
        add(label2);
        label3=new JLabel("Azul");
        label3.setBounds(10,100,100,30);
        add(label3);
    }
    public static void main(String[] ar) {
        Practica5 colores1=new Practica5();
        colores1.setBounds(0,0,300,200);
        colores1.setVisible(true);
    }
}


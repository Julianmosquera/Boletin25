
package boletin25_1;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author julian
 */
public class Interfaz implements ActionListener {
JFrame marco;
    JPanel panel;
    JButton boton;
    JLabel etiqueta;
           
    
    
    public void crearVentana(){
        marco=new JFrame("Evento ");
        panel=new JPanel();
        boton=new JButton("Premer");
        boton.setBackground(Color.CYAN);
        etiqueta=new JLabel();
        marco.setSize(200,200);
        //Monitorizamos el boton
        //si esta en la misma clase se pone this si no se crearia un objeto de esa clase
        
        boton.addActionListener(this);
        panel.add(boton);
        panel.add(etiqueta);
        marco.add(panel);
        
        marco.setVisible(true);
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        etiqueta.setText("**********premiches o botón***********");
    }
    
}
    
    
    
    
    
    
    
    
    
     
    
    


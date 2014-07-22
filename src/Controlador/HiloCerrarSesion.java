/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;


import static Vista.JFcerrarSesionn.pbsesion;
import static Vista.JFcerrarSesionn.lbltitulo;
import static Vista.JFcerrarSesionn.jButton1;

/**
 *
 * @author Carlos
 */
public class HiloCerrarSesion extends Thread{
int a=0;
    @Override
    public void run() {
     
        
        lbltitulo.setText("Cerrando sesion...");

    while(a<=100){
        try{
        Thread.sleep(40);
        }catch(InterruptedException e){
}
        
        if(a==100){
         jButton1.setEnabled(true);
            
            
        }
        
      pbsesion.setValue(a);
      

       
        
       
        
        a++;
    }
        
    }
    
    
    
}

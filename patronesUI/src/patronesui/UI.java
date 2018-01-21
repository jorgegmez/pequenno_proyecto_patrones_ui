/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import cl.*;

/**
 *
 * @author jorge
 */
public class UI {
    static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    static PrintStream out = System.out;
    static Hola_Mundo txtEspannol = new Hola_Mundo();
    static Hello_World txtIngles = new Hello_World();
    static Ciao_Mondo txtItaliano = new Ciao_Mondo();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion = -1;
        boolean finalizar = false;   
            do{
                try {
                mostrarMenu();
                opcion = leerOpcion();
                finalizar = ejecutarOpcion(opcion);
                } catch (Exception e) {
                  out.println("Digite una opcion correcta");
            }
               
            }while(finalizar != true); 
    }
    
    public static void mostrarMenu() throws IOException{
        out.println("**Menu principla**");
        out.println("1. Imprimir Hola_Mundo en español.");
        out.println("2. Imprimir Hola_Mundo en inglés.");
        out.println("3. Imprimir Hola_Mundo en italiano.");
        out.println("4.  Salir");
    }
    
    public static int leerOpcion() throws IOException{         
        int opcion;
        
        out.println("Seleccione su opcion: ");
        opcion = Integer.parseInt(in.readLine());
        out.println();

        return opcion;
    }
    
    static boolean ejecutarOpcion(int pOpcion) throws IOException{
     boolean salir = false;

     switch(pOpcion){
         case 1:
            imprimirTextoEspannol();
         break;
         
         case 2:
             imprimirTextoIngles();
         break;

         case 3:
             imprimirTextoItaliano();
         break;
         
         case 4:
             salir = true;
         break;
         
         default:
             out.print("Ingrese una opcion valida" + "\n");
         break;
        }
    return salir;
    }
    
    
    public static void imprimirTextoEspannol()
    {
        String txtEspannol;
        txtEspannol = UI.txtEspannol.getMensaje();
        
        out.println("En espannol: " + txtEspannol + "\n");
    }
    
    public static void imprimirTextoIngles()
    {
        String txtIngles;
        txtIngles = UI.txtIngles.getMessage();
        
        out.println("En ingles: " + txtIngles + "\n");
    }
    
    public static void imprimirTextoItaliano()
    {
        String txtItaliano;
        txtItaliano = UI.txtItaliano.getMessaggio();
        
        out.println("En italiano: " + txtItaliano + "\n");
    }
}

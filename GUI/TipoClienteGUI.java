
package GUI;

import BL.TipoClienteBL;
import Entidades.TipoCliente;
import java.util.ArrayList;
import java.util.Scanner;

public class TipoClienteGUI 
{
    private static Scanner entrada = new Scanner(System.in);
    
    public static void Nuevo()
    {
        TipoCliente tipoCliente = new TipoCliente();
        TipoClienteBL tipoClienteBL = new TipoClienteBL();
        System.out.print("Digite id tipo cliente: ");
        tipoCliente.setId(entrada.nextInt());
        System.out.print("Digite descripcion de tipo cliente: ");
        tipoCliente.setDescripcion(entrada.next());
        System.out.print("Digite descuento nombre cliente: ");
        tipoCliente.setDescuento(entrada.nextDouble());
        if(tipoClienteBL.Nuevo(tipoCliente))
            System.out.println("Registro Tipo Cliente correcto");
        else
            System.out.println("F");
        
    }
    
    
    
    //LO HACEN USTEDES
}

package GUI;
import java.util.Scanner;
import BL.TipoClienteBL;

public class Menu 
{
    private static Scanner entrada = new Scanner(System.in);
    
    
    
    public static void MenuTipoCliente()
    {
        boolean estado=true;
        int opc;
        do
        {
            System.out.print(
                    "\n\n-------------------\nMenu Tipo Cliente\n\n"
                    + "1. Nuevo Tipo Cliente\n"
                    + "2. Buscar Tipo Cliente\n"
                    + "3. Buscar todos los Tipo clientes\n"
                    + "4. Actualizar Tipo Cliente\n"
                    + "5. Menu Principal\n\n"
                    + "Seleccione una opcion: "
            );
            opc=entrada.nextInt();
            switch(opc)
            {
                case 1:
                    TipoClienteGUI.Nuevo();
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    estado=false;
                    break;
                default:
                    System.out.println("No es una opcion, intente de nuevo");
            }
        }while(estado);
    }
    
    
    
    
    public static void MenuCliente()
    {
        boolean estado=true;
        int opc;
        do
        {
            System.out.print(
                    "\n\n-------------------\nMenu Cliente\n\n"
                    + "1. Nuevo Cliente\n"
                    + "2. Buscar Cliente\n"
                    + "3. Buscar todos los clientes\n"
                    + "4. Actualizar Cliente\n"
                    + "5. Menu Principal\n\n"
                    + "Seleccione una opcion: "
            );
            opc=entrada.nextInt();
            switch(opc)
            {
                case 1:
                    ClienteGUI.NuevoCliente();
                    break;
                case 2:
                    ClienteGUI.BuscarCliente();
                    break;
                case 3:
                    ClienteGUI.BuscarTodos();
                    break;
                case 4:
                    ClienteGUI.Actualizar();
                    break;
                case 5:
                    estado=false;
                    break;
                default:
                    System.out.println("No es una opcion, intente de nuevo");
            }
        }while(estado);
    }
    
    
    public static void MenuPincipal()
    {
        boolean estado=true;
        int opc;
        do
        {
            System.out.print(
                    "\n\n-------------------\nMenu Principal\n\n"
                    + "1. Tipo Cliente\n"
                    + "2. Cliente\n"
                    + "3. Salir\n\n"
                    + "Seleccione una opcion: "
            );
            opc=entrada.nextInt();
            switch(opc)
            {
                case 1:
                    MenuTipoCliente();
                    break;
                case 2:
                    TipoClienteBL tipoClienteBL = new TipoClienteBL();
                    if(tipoClienteBL.BuscarCantidad()>=1)
                        MenuCliente();
                    else
                        System.out.println("Primero incluir tipo cliente");
                    break;
                case 3:
                    estado=false;
                    break;
            }
        }while(estado);
    }
}

package GUI;

import BL.ClienteBL;
import BL.TipoClienteBL;
import Entidades.Cliente;
import Entidades.TipoCliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteGUI 
{
    private static Scanner entrada = new Scanner(System.in);
    
    public static void NuevoCliente()
    {
        ClienteBL bl = new ClienteBL();
        Cliente cliente = new Cliente();
        System.out.print("Digite id cliente: ");
        cliente.setId(entrada.nextInt());
        System.out.print("Digite cedula cliente: ");
        cliente.setCedula(entrada.next());
        System.out.print("Digite nombre cliente: ");
        cliente.setNombre(entrada.next());
        System.out.print("Digite telefono cliente: ");
        cliente.setTelefono(entrada.next());
        System.out.print("Digite correo cliente: ");
        cliente.setCorreo(entrada.next());
        
        //idtipocliente
        boolean revision=true;
        while(revision)
        {
            System.out.print("Tipo Cliente: \n");
            ArrayList<TipoCliente> listaTipoCliente = new ArrayList<TipoCliente>();
            TipoClienteBL tipoClienteBL = new TipoClienteBL();
            listaTipoCliente=tipoClienteBL.BuscarTodos();
            for(TipoCliente t : listaTipoCliente)
            {
                System.out.print("\t Id: "+t.getId()+
                        " - Descrpcion: "+t.getDescripcion()+
                        " - Descuento: "+t.getDescuento()+"\n");
            }
            System.out.print("Digite id: ");
            cliente.setIdTipoCliente(entrada.nextInt());
            
            TipoCliente tipoCliente = new TipoCliente();
            tipoCliente=tipoClienteBL.Buscar(cliente.getIdTipoCliente());
            if(tipoCliente!=null)
                revision=false;
            else
                System.out.print("Id no existe intente de nuevo: \n");
        }
        
        
        ////
        if(bl.Nuevo(cliente))
            System.out.println("Registro Cliente correcto");
        else
            System.out.println("F");
        
    }
    
    public static void  BuscarCliente()
    {
        ClienteBL bl = new ClienteBL();
        Cliente cliente = new Cliente();
        System.out.print("Digite id a buscar: ");
        int id=entrada.nextInt();
        cliente=bl.Buscar(id);
        if(cliente!=null)
        {
            System.out.print(
                    "id: "+cliente.getId()+
                    "\ncedula: "+cliente.getCedula()+
                    "\nnombre: "+cliente.getNombre()+
                    "\ntelefono: "+cliente.getTelefono()+
                    "\ncorreo: "+cliente.getCorreo()+"\n\n"
            );
        }
        else
            System.out.print("Id digitado no existe");
    }
    
    public static void BuscarTodos()
    {
        ClienteBL bl = new ClienteBL();
        ArrayList<Cliente> lista = new ArrayList<Cliente>();
        lista=bl.BuscarTodos();
        for(Cliente c: lista)
        {
            System.out.print(
                    "id: "+c.getId()+
                    "\tcedula: "+c.getCedula()+
                    "\tnombre: "+c.getNombre()+
                    "\ttelefono: "+c.getTelefono()+
                    "\tcorreo: "+c.getCorreo()+"\n\n"
            );
        }
    }
    
    public static void Actualizar()
    {
        ClienteBL bl = new ClienteBL();
        Cliente clienteAnterior = new Cliente();
        Cliente clienteModificado = new Cliente();
        System.out.print("Digite id a modificar: ");
        clienteAnterior=bl.Buscar(entrada.nextInt());
        if(clienteAnterior!=null)
        {
            clienteModificado.setId(clienteAnterior.getId());
            System.out.print("Cedula anterior "+clienteAnterior.getCedula()+", digite nueva: ");
            clienteModificado.setCedula(entrada.next());
            System.out.print("Nombre anterior "+clienteAnterior.getNombre()+", digite nuevo: ");
            clienteModificado.setNombre(entrada.next());
            System.out.print("Telefono anterior "+clienteAnterior.getTelefono()+", digite nuevo: ");
            clienteModificado.setTelefono(entrada.next());
            System.out.print("Correo anterior "+clienteAnterior.getCorreo()+", digite nuevo: ");
            clienteModificado.setCorreo(entrada.next());
            if(bl.Actualizar(clienteModificado))
                System.out.print("Modificacion exitosa");
            else
                System.out.print("F");
        }
        else
            System.out.print("Id no resgitrado en el sistema");
        
    }
}

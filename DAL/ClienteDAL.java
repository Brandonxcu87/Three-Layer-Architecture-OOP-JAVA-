package DAL;

import Entidades.Cliente;
import java.util.ArrayList;

public class ClienteDAL 
{
    private static ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
    
    public boolean Nuevo(Cliente cliente)
    {
        boolean retVal=false;
        if(cliente!=null)
        {
            listaCliente.add(cliente);
            retVal=true;
        }
        return retVal;
    }
    
    public Cliente Buscar(int id)
    {
        Cliente cliente = new Cliente();
        boolean estado=false;
        for(Cliente c : listaCliente)
        {
            if(c.getId()==id)
            {
                cliente=c;
                estado=true;
                break;
            }
        }
        if(!estado)
            cliente=null;
        return cliente;
    }
    
    public ArrayList<Cliente> BuscarTodos()
    {
        return listaCliente;
    }
    
    public boolean Actualizar(Cliente cliente)
    {
        boolean retVal=false;
        for(Cliente c: listaCliente)
        {
            if(c.getId()==cliente.getId())
            {
                c.setCedula(cliente.getCedula());
                c.setNombre(cliente.getNombre());
                c.setTelefono(cliente.getTelefono());
                c.setCorreo(cliente.getCorreo());
                c.setIdTipoCliente(cliente.getIdTipoCliente());
                retVal=true;
                break;
            }
        }
        return retVal;
    }
    
    
}

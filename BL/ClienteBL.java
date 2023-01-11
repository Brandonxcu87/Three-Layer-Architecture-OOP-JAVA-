package BL;

import java.util.ArrayList;
import Entidades.Cliente;
import DAL.ClienteDAL;

public class ClienteBL 
{
    public boolean Nuevo(Cliente cliente)
    {
        ClienteDAL dal = new ClienteDAL();
        return dal.Nuevo(cliente);
    }
    
    public Cliente Buscar(int id)
    {
        ClienteDAL dal = new ClienteDAL();
        return dal.Buscar(id);
    }
    
    public ArrayList<Cliente> BuscarTodos()
    {
        ClienteDAL dal = new ClienteDAL();
        return dal.BuscarTodos();
    }
    
    public boolean Actualizar(Cliente cliente)
    {
        ClienteDAL dal = new ClienteDAL();
        return dal.Actualizar(cliente);
    }
    
}

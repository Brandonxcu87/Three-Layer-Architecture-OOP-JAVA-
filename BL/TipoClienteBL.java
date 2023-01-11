package BL;

import java.util.ArrayList;
import Entidades.TipoCliente;
import DAL.TipoClienteDAL;

public class TipoClienteBL 
{
    public boolean Nuevo(TipoCliente tipoCliente)
    {
        TipoClienteDAL dal = new TipoClienteDAL();
        return dal.Nuevo(tipoCliente);
    }
    
    public TipoCliente Buscar(int id)
    {
        TipoClienteDAL dal = new TipoClienteDAL();
        return dal.Buscar(id);
    }
    
    public ArrayList<TipoCliente> BuscarTodos()
    {
        TipoClienteDAL dal = new TipoClienteDAL();
        return dal.BuscarTodos();
    }
    
    public boolean Actualizar(TipoCliente tipoCliente)
    {
        TipoClienteDAL dal = new TipoClienteDAL();
        return dal.Actualizar(tipoCliente);
    }
    
    public int BuscarCantidad()
    {
        TipoClienteDAL dal = new TipoClienteDAL();
        return dal.BuscarCantidad();
    }
    
}

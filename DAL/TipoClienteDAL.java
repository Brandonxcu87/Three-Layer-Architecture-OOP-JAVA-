package DAL;

import java.util.ArrayList;
import Entidades.TipoCliente;

public class TipoClienteDAL 
{
    private static ArrayList<TipoCliente> listaTipoCliente = new ArrayList<TipoCliente>();
    
    public boolean Nuevo(TipoCliente tipoCliente)
    {
        boolean retVal=false;
        if(tipoCliente!=null)
        {
            listaTipoCliente.add(tipoCliente);
            retVal=true;
        }
        return retVal;
    }
    
    public TipoCliente Buscar(int id)
    {
        TipoCliente tipoCliente = new TipoCliente();
        boolean estado=false;
        for(TipoCliente t : listaTipoCliente)
        {
            if(t.getId()==id)
            {
                tipoCliente=t;
                estado=true;
                break;
            }
        }
        if(!estado)
            tipoCliente=null;
        return tipoCliente;
    }
    
    public ArrayList<TipoCliente> BuscarTodos()
    {
        return listaTipoCliente;
    }
    
    public boolean Actualizar(TipoCliente tipoCliente)
    {
        boolean retVal=false;
        for(TipoCliente t: listaTipoCliente)
        {
            if(t.getId()==tipoCliente.getId())
            {
                t.setDescripcion(tipoCliente.getDescripcion());
                t.setDescuento(tipoCliente.getDescuento());
                retVal=true;
                break;
            }
        }
        return retVal;
    }
    
    
    public int BuscarCantidad()
    {
//        int retVal=0;
//        for(TipoCliente t: listaTipoCliente)
//        {
//            retVal++;
//        }
//        retVal=listaTipoCliente.size();
//        
//        return retVal;
        return listaTipoCliente.size();
    }
}

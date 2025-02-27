package simulacroExamenBoogaloo;

import java.util.ArrayList;

interface TareasHotel {
    void recibirCliente(Cliente cliente);
    void asignarHabitacion(Cliente cliente);
    void realizarMantenimiento();
    void realizarLimpieza();
}



abstract class Hotel implements TareasHotel{
    ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
    ArrayList<Personal> listaPersonal = new ArrayList<Personal>();

    public void recibirCliente(Cliente cliente){
        
    }



}

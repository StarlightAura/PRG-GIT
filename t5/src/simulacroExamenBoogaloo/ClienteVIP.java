package simulacroExamenBoogaloo;

public class ClienteVIP extends Cliente {

    public ClienteVIP(String name){
        super.setName(name);
        super.setNumHab(0);
    }

    @Override
    public void reservar(int n){
        super.setNumHab(n);
    }
}

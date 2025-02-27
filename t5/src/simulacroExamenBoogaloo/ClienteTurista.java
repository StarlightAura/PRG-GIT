package simulacroExamenBoogaloo;

public class ClienteTurista extends Cliente {

    public ClienteTurista(String name){
        super.setName(name);
        super.setNumHab(0);
    }

    @Override
    public void reservar(int n){
        super.setNumHab(n);
    }


}

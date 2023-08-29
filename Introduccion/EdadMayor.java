package Introduccion;
import java.util.ArrayList;

public class EdadMayor {
    ArrayList<Persona> pMayores = new ArrayList<>();
    ArrayList<Persona> pMenores = new ArrayList<>();
    
    public void mayor(Persona persona){
        pMayores.add(persona);
    }
    public void menor(Persona persona){
        pMenores.add(persona);
    }
}

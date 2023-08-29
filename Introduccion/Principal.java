package Introduccion;
import javax.crypto.spec.OAEPParameterSpec;

public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona("Jaime", 22);
        Persona p2 = new Persona("Maria", 3);
        Persona p3 = new Persona("Jose", 8);
        Persona p4 = new Persona("Cristina", 18);
        EdadMayor eM = new EdadMayor();
        Persona arregloPersona [] = {p1,p2,p3,p4};

        for(int x=0; x<arregloPersona.length; x++){

            if(arregloPersona[x].getEdad() > 17){
                eM.mayor(arregloPersona[x]);
            }else{
                eM.menor(arregloPersona[x]);
            }
        }

        System.out.println("Mayores de edad: ");
        for(int i=0; i<eM.pMayores.size(); i++){

        }

        




    }
}
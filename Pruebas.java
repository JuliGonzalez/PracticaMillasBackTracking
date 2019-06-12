import java.util.ArrayList;

public class Pruebas {
    public static void main(String[] args){
        AcuerdosMillas am = new AcuerdosMillas();
        System.out.println(am.getTodosLosAcuerdos());

        String[] aerolineas = am.getAerolineas();
        for(int i=1; i<am.numAerolineas(); i++){
            System.out.print(aerolineas[0] + " y " + aerolineas[i] + " -> ");
            System.out.println(am.hayAcuerdo(aerolineas[0], aerolineas[i]));
        }
    }
}

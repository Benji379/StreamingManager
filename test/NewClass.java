
public class NewClass {

    public static void main(String[] args) {

        Object dato = null;
        
        String paseandoA = String.valueOf(dato);
//        String paseandoB = null.toString();
        String pasenadoC = (String) dato;
        System.out.println("RES_1: " + paseandoA);
//        System.out.println("RES_2: " + paseandoB);
        System.out.println("RES_3: " + pasenadoC);
    }
}

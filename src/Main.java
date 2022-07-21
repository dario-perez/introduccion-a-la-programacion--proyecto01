public class Main {
    public static void main(String[] args) {
        suma(10,10,10);

        Coche miCoche = new Coche();
        miCoche.masPuertas();

        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        int result;
        result = a + b + c;


        System.out.println(result);
    }



}
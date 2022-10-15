public class Main {

    public static void main(String[] args) {
        suma(225, 385, 890);

        Coche miCoche = new Coche();
        miCoche.getPorts();
        miCoche.getPorts();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int num1, int num2, int num3) {
        int result = num1 + num2 + num3;
        System.out.println(result);
    }
}

class Coche {

    public int puertas = 4;

    public void getPorts() {
        this.puertas++;
    }
}

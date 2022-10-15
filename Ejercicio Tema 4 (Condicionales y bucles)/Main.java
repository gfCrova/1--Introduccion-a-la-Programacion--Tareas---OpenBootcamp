
public class Main {

    public static void main(String[] args) {

       //CONDICIÓN IF/ELSE

        int numeroIf = 5;

        if(numeroIf < 0) {
            System.out.println("El numero es menor a 0");
        } else if(numeroIf ==0) {
            System.out.println("El numero es igual a 0");
        } else {
            System.out.println("El numeroIf es mayor a 0");
        }

        //BUCLE WHILE
        System.out.println("BUCLE WHILE:");

        int numeroWhile = 0;
        while (numeroWhile <= 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        //BUCLE DO WHILE
        System.out.println("BUCLE DO WHILE:");

        int numeroDoWhile = 0;
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile++;
        } while (numeroDoWhile <= 3);


        //BUCLE FOR
        System.out.println("BUCLE FOR:");

        int numeroFor = 0;

        for (; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        System.out.println("CONDICIÓN SWITCH:");

        String estación = "Primavera";

        switch (estación) {
            case "Verano":
                System.out.println("La estación es Verano");
                break;
            case "Otoño":
                System.out.println("La estación es Otoño");
                break;
            case "Invierno":
                System.out.println("La estación es Invierno");
                break;
            case "Primavera":
                System.out.println("La estación es Primavera");
                break;
            default:
                System.out.println("No existe la estación");
        }
    }

}

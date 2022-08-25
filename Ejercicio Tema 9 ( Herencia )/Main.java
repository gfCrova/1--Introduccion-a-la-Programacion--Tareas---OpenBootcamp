
public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente();

        cliente1.datos("Diego", 33, 344653423, 240);

        System.out.println(cliente1.nombre);
        System.out.println(cliente1.edad);
        System.out.println(cliente1.telefono);
        System.out.println(cliente1.credito);

        System.out.println("-----------");

        Trabajador programador = new Trabajador();

        programador.datos("Gian Franco", 27, 245509540, 10000);

        System.out.println(programador.nombre);
        System.out.println(programador.edad);
        System.out.println(programador.telefono);
        System.out.println(programador.salario);
    }
}


class Persona {
    String nombre;
    int edad;
    int telefono;
}

class Cliente extends Persona {
    int credito;

    public void datos(String nombre, int edad, int telefono, int credito){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.credito = credito;
    }
}

class Trabajador extends Persona {
    int salario;

    public void datos(String nombre, int edad, int telefono, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.salario = salario;
    }
}


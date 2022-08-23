
public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setNombre("Pedro");
        persona1.setEdad(20);
        persona1.setTelefono(349199345);
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getEdad());
        System.out.println(persona1.getTelefono());

    }
}


class Persona {

    private String nombre;
    private int edad;
    private int telefono;

    // NOMBRE
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return this.nombre;
    }

    //EDAD
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getEdad() {
        return this.edad;
    }

    //TELEFONO
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return this.telefono;
    }
}
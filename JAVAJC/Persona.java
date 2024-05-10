import java.util.Calendar;

public class Persona {

    private String nombre;
    private int edad;
    private String fechaNacimiento;


    public Persona(String nombre, int edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }


    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerEdad() {
        return edad;
    }

    public String obtenerFechaNacimiento() {
        return fechaNacimiento;
    }


    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa");
        }
    }

    public void establecerFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String calcularFechaNacimiento() {

        int añoActual = Calendar.getInstance().get(Calendar.YEAR);

        int añoNacimiento = añoActual - edad;

        return "Fecha de nacimiento aproximada: " + añoNacimiento;
    }
}

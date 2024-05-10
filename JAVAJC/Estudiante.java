public class Estudiante extends Persona {

    private String grado;


    public Estudiante(String nombre, int edad, String fechaNacimiento, String grado) {
        super(nombre, edad, fechaNacimiento);
        this.grado = grado;
    }


    public String obtenerGrado() {
        return grado;
    }


    public void establecerGrado(String grado) {
        this.grado = grado;
    }

    // Método para inscribirse a un curso
    public void inscribirseACurso(String curso) {
        System.out.println("El estudiante " + obtenerNombre() + " se ha inscrito al curso de " + curso);
    }


    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + obtenerNombre() + '\'' +
                ", edad=" + obtenerEdad() +
                ", fechaNacimiento='" + obtenerFechaNacimiento() + '\'' +
                ", grado='" + grado + '\'' +
                '}';
    }
}

// FiguraGeometrica.java
public class FiguraGeometrica {
    private String nombre;
    private String color;

    public FiguraGeometrica(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerColor() {
        return color;
    }

    public void establecerColor(String color) {
        this.color = color;
    }

    // Clase adicional: Circulo
    public static class Circulo extends FiguraGeometrica {
        private double radio;

        public Circulo(String nombre, String color, double radio) {
            super(nombre, color);
            this.radio = radio;
        }

        public double calcularArea() {
            return Math.PI * radio * radio;
        }

        public double calcularPerimetro() {
            return 2 * Math.PI * radio;
        }
    }

    // Clase adicional: Triangulo
    public static class Triangulo extends FiguraGeometrica {
        private double base;
        private double altura;

        public Triangulo(String nombre, String color, double base, double altura) {
            super(nombre, color);
            this.base = base;
            this.altura = altura;
        }

        public double calcularArea() {
            return (base * altura) / 2;
        }

        public double calcularPerimetro() {
            // Implementa el cálculo del perímetro dependiendo del tipo de triángulo
        }
    }

    // Clase adicional: Cuadrado
    public static class Cuadrado extends FiguraGeometrica {
        private double lado;

        public Cuadrado(String nombre, String color, double lado) {
            super(nombre, color);
            this.lado = lado;
        }

        public double calcularArea() {
            return lado * lado;
        }

        public double calcularPerimetro() {
            return 4 * lado;
        }
    }

    // Agrega más clases adicionales según sea necesario...
}

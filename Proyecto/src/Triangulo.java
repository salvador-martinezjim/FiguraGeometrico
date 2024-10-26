class Triangulo extends FiguraGeometrica {
    private double lado1 = 1.0;
    private double lado2 = 1.0;
    private double lado3 = 1.0;

    public Triangulo() {}

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public Triangulo(double lado1, double lado2, double lado3, String color, boolean relleno) {
        super(color, relleno);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public double getArea() {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    public double getPerimetro() {
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triangulo[lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", area=" + getArea() + ", perimetro=" + getPerimetro() + ", " + super.toString() + "]";
    }
}

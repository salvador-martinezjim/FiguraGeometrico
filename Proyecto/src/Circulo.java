

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(){
        this.radio = 1;
    }

    public Circulo(double radio, String color, boolean relleno){
        this.radio = radio;
        this.color = color;
        setRelleno(relleno);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    public double getArea(){
        return Math.PI * Math.sqrt(radio);
    }

    public double getPerimetro(){
        return Math.PI * (radio + radio);
    }

    public double getDiametro(){
        return radio + radio;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }


}
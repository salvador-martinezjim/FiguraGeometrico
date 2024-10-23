public class Cuadrado extends FiguraGeometrica{
    private double base;
    private double altura;

    public Cuadrado(double base, double altura){
        this.altura = base;
        this.base = altura;
    }
    
    public Cuadrado(double base, double altura, String color, boolean relleno){
        this.base = base;
        this.altura = altura;
        this.color = color;
        setRelleno(relleno);
        
    }

    //setBase, getBase, setAltura, getAltura, getPerimetro, getArea
    public void setBase(double base){
        this.base = base;
    }

    public double getBase(){
        return base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    public double getArea(){
        return base * altura;
    }

    public double getPerimetro(){
        return (base + base) + (altura + altura);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }
}

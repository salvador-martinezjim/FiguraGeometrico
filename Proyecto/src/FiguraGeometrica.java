import java.time.LocalDate;
import java.util.Scanner;


public class FiguraGeometrica{
    private String color;
    private boolean relleno;
    private LocalDate fechaCreacion;

    public FiguraGeometrica(){
        this.color = "Blanco";
        this.relleno = false;
        this.fechaCreacion = fechaCreacion.now();
    }

    public FiguraGeometrica(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
        this.fechaCreacion = fechaCreacion.now();
    }

    public String setColor() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el color");
        this.color = entrada.nextLine();
        return color;
    }

    public void getColor(){
        System.out.println("El color de esta figura es: " + this.color);
    }
    
    public void estaRelleno(){
        if(relleno == true){
            System.out.println("La figura no tiene relleno.");
        }else{
            System.out.println("La figura no esta relleno.");
        }

    }
    
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public void getFechaCreacion(){
        System.out.println("La fecha de creacion es" + fechaCreacion);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return fechaCreacion.toString();
    }
}


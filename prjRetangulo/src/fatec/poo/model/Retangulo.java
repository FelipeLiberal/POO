package fatec.poo.model;

/**
 *
 * @author Felipe Liberal
 */
public class Retangulo {
    private double Altura;
    private double Base;
    public void setAltura(double a){
        Altura = a;
    }
    public void setBase(double b){
        Base = b;
    }
    public double calcArea(){
        double Area;
        Area = Altura * Base;
        return(Area);
    }
    public double calcPerimetro(){
        double Perimetro;
        Perimetro = 2*(Base+Altura);
        return(Perimetro);
    }
}

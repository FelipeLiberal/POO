
import fatec.poo.model.Retangulo;

/**
 *
 * @author Felipe Liberal
 */
public class Aplic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Definição de um ponteiro
        //para um objeto da
        //classe Retangulo
        Retangulo objRet;
        
        
        //Instanciação de um
        //objeto da classe Retangulo
        objRet = new Retangulo();
        
        
        //Passagem de mensagens
        //para o objeto Retangulo instaciado
        objRet.setAltura(5.0);
        objRet.setBase(8.0);
        
        System.out.println("Area: " + objRet.calcArea());
        System.out.println("Perimentro: " + objRet.calcPerimetro());
    }
    
}

package Unidad3;



/**
 *
 * @author Luis Angel
 */
public class menor_mayor_igual_edad_prog3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=181;
        int y=125;
        boolean comparacion = (x<y); //VERDADERO O FALSO (True or False)
        System.out.println("x es menor que y:"+comparacion);//false
        
        comparacion = (x>y);//true
        System.out.println("x es mayor que y:"+comparacion);
        comparacion = (x==y);//false
        System.out.println("x es igual que y:"+comparacion);
        
        // != Significa "Diferente de"
        comparacion = (x!=y);//true
        System.out.println("x es diferente que y:"+comparacion);
        comparacion = (x<=y);//false
        System.out.println("x es menor o igual que y:"+comparacion);
        comparacion = (x>=y);//true
        System.out.println("x es mayor o igual que y:"+comparacion);
        
    }
    
}
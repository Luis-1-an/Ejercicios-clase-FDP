package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class busca_novio_prog10 {

    public static void main(String[] args) {
        String artistaF_chico= "megadeth", artistaF_chica ="";
        int edad_chico, edad_chica, altura;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("BUSCADOR DE PAREJAS");
        System.out.println("Ingresa tu edad (chica):" );
        edad_chica = sc.nextInt();
        System.out. println("Ingresa tu edad (chico):" );
        edad_chico = sc.nextInt();
        System.out.println("Ingresa tu altura(chico): ");
        altura = sc.nextInt();
        System.out.println("Ingresa tu artista Favorito (chico): ");
        artistaF_chico = sc.next();
        
        if (edad_chico>edad_chica && altura >= 180 && artistaF_chica.equals(artistaF_chico)){
        System.out.println("Aprobado");
        }
        else
        System.out.println("NO APROBADO");
    }
    
}

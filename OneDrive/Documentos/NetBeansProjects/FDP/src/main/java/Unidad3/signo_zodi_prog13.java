package Unidad3;
import java.util.Scanner;

/**
 *
 * @author Luis Angel
 */
public class signo_zodi_prog13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su signo zodiacal (todos en mayusculas): ");
        String signoUsuario = scanner.nextLine();

        switch (signoUsuario) {
            case "ARIES":
                System.out.println("Eres Aries, un signo de Fuego.");
                System.out.println("Eres compatible con: Leo y Sagitario.");
                break;
            case "TAURO":
                System.out.println("Eres Tauro, un signo de Tierra.");
                System.out.println("Eres compatible con: Virgo y Capricornio.");
                break;
            case "GEMINIS":
                System.out.println("Eres Géminis, un signo de Aire.");
                System.out.println("Eres compatible con: Libra y Acuario.");
                break;
            case "CANCER":
                System.out.println("Eres Cancer, un signo de Agua.");
                System.out.println("Eres compatible con: Escorpio y Piscis.");
                break;
            case "LEO":
                System.out.println("Eres Leo, un signo de Fuego.");
                System.out.println("Eres compatible con: Aries y Sagitario.");
                break;
            case "VIRGO":
                System.out.println("Eres Virgo, un signo de Tierra.");
                System.out.println("Eres compatible con: Tauro y Capricornio.");
                break;
            case "LIBRA":
                System.out.println("Eres Libra, un signo de Aire.");
                System.out.println("Eres compatible con: Geminis y Acuario.");
                break;
            case "ESCORPIO":
                System.out.println("Eres Escorpion, un signo de Agua.");
                System.out.println("Eres compatible con: Cancer y Piscis.");
                break;
            case "SAGITARIO":
                System.out.println("Eres Sagitario, un signo de Fuego.");
                System.out.println("Eres compatible con: Aries y Leo.");
                break;
            case "CAPRICORNIO":
                System.out.println("Eres Capricornio, un signo de Tierra.");
                System.out.println("Eres compatible con: Tauro y Virgo.");
                break;
            case "ACUARIO":
                System.out.println("Eres Acuario, un signo de Aire.");
                System.out.println("Eres compatible con: Geminis y Libra.");
                break;
            case "PISCIS":
                System.out.println("Eres Piscis, un signo de Agua.");
                System.out.println("Eres compatible con: Cancer y Escorpio.");
                break;
            default:
                System.out.println("Signo zodiacal no valido. Por favor, ingrese un signo correcto.");
        }

        
    }
}
    
    


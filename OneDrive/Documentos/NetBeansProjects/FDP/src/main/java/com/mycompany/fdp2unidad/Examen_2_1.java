package com.mycompany.fdp2unidad;

/**
 *
 * @author Luis
 */
public class Examen_2_1 {
    public static void main(String[] args) {
        double x,y,z,a,b;
        x= 3.0/2.0+10.0-3.0;
        y=7;
        z=8*2/8 + Math.pow(2,8);
        a= x*y+1-(z%y*4);
        b= Math.sqrt((a)+z)*2/25;
        System.out.println("Valor de x" +x
                + "\n Valor de y: " + y
                + "\n Valor de z: " + z 
                + "\n Valor de a: " + a
                + "\n Valor de b: " + b);
    }
    
}

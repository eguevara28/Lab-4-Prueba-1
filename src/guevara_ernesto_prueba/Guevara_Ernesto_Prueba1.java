/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guevara_ernesto_prueba;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Ernesto
 */
public class Guevara_Ernesto_Prueba1 {

    public static void main(String[] args) {

        Scanner lea = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.println("*** Menu ***");
            System.out.println("1. Palabra Alreves");
            System.out.println("2. Numero perfecto");
            System.out.println("3. Numeros Primos");
            System.out.println("4. Votaciones");
            int op = lea.nextInt();

            if (op == 1) {
                System.out.println("Ingrese una palabra: ");
                String palabra = lea.next();
                String palabraalreves = "";

                for (int i = palabra.length() - 1; i >= 0; i--) {
                    palabraalreves += palabra.charAt(i);
                }

                System.out.println("Palabra Alreves: " + palabraalreves);
            }

            if (op == 2) {
                System.out.println("Ingrese un numero cualquiera: ");
                int numero = lea.nextInt();
                int suma = 0;
                for (int contador1 = 1; contador1 < numero; contador1++) {
                    if (numero % contador1 == 0) {
                        suma = suma + contador1;
                    }
                }
                if (suma == numero) {
                    System.out.println("El numero "+numero+" es perfecto");
                }

                if (suma != numero) {
                    System.out.println("El numero "+numero+" no es pefecto");
                }
            }
            
            if(op==3){
                
                System.out.println("Se generara un numero aleatorio y se determinara si es un numero primo o no");
                
                int numeroaleatorio=random.nextInt(100)+1;
                
                
                int divisibles=0;
                
                for (int i = 1; i <= numeroaleatorio; i++) {
                    if(numeroaleatorio % i==0){
                        divisibles+=i;
                    }
                }
                
                if(divisibles==numeroaleatorio+1){
                    System.out.println("El numero "+numeroaleatorio+" es primo");
                    System.out.println("Los divisores son: 1 y "+numeroaleatorio);
                }else
                    System.out.println("El numero "+numeroaleatorio+" No es primo");
                
            }
            
            if(op == 4){
                System.out.println("Cuantos votantes hay en el pais?: ");
                int votantes=lea.nextInt();
                
                int azul=0, rojo=0, negro=0, amarillo=0, nulo=0, validos=0;
                
                for (int i = 1; i <= votantes; i++) {
                    System.out.println("Elecciones:");
                    System.out.println("AZUL");
                    System.out.println("ROJO");
                    System.out.println("NEGRO");
                    System.out.println("AMARILLO");
                    String voto=lea.next().toUpperCase();
                    
                    if(voto.equals("AZUL")){
                        azul++;
                        validos++;
                    }else if(voto.equals("ROJO")){
                        rojo++;
                        validos++;
                    }else if(voto.equals("NEGRO")){
                        negro++;
                        validos++;
                    }else if(voto.equals("AMARILLO")){
                        amarillo++;
                        validos++;
                    }else nulo++;
                }
                
                double porcentaje=(validos*100)/votantes;
                if(porcentaje>60.0){
                    
                    if(azul>rojo && azul>negro && azul>amarillo){
                        System.out.println("El ganador es: Azul");
                        System.out.println("Con "+azul+" votos");
                    }
                    
                    if(rojo>azul && rojo>negro && rojo>amarillo){
                        System.out.println("El ganador es: Rojo");
                        System.out.println("Con "+rojo+" votos");
                    }
                    
                    if(negro>rojo && negro>azul && negro>amarillo){
                        System.out.println("El ganador es: Negro");
                        System.out.println("Con "+negro+" votos");
                    }
                    
                    if(amarillo>rojo && amarillo>azul && amarillo>negro){
                        System.out.println("El ganador es: Amarillo");
                        System.out.println("Con "+amarillo+" votos");
                    }
                }else{
                    System.out.println("VOTACION FALLIDA");
                }
            }
        }
    }

}

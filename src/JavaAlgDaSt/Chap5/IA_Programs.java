package JavaAlgDaSt.Chap5;

import java.util.Scanner; 
/**
 * Autores: Gómez González Omar Otoniel
 *          Posthuma Solís Carl Theodoro
 *          Urbina González Josue Fabricio
 *          Zuñiga Reyes Miguel Ángel
 * 
 * Programa que realiza operaciones con números complejos
 */
public class IA_Programs {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in); 
	String opcion; 
	boolean bandera = true;
        IA_Complejos complejo = new IA_Complejos();
        
        System.out.print("Operaciones con numeros complejos\n");
      
        while(bandera) {
          System.out.println("Selecciona una opcion:\n");
          System.out.println("a) Modulo y angulo\nb) Suma y resta\nc) Multiplicacion y division\nd) Potenciacion\ne) Salir\n");
          
          opcion = entrada.nextLine(); 
          
          switch(opcion){
              case "a": 
                  complejo.ModAng();
                  break;
              case "b": 
                  complejo.SumRes();
                  break;
              case "c": 
                  complejo.MulDiv();
                  break;
              case "d": 
                  complejo.Pot();
                  break;
              case "e": 
                  bandera = false;
                  break;
              default: System.out.println("Opcion invalida");
                  break;
          }
        }
    }
    
}

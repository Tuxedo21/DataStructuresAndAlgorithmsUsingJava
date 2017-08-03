package JavaAlgDaSt.Chap5;


import java.lang.Math;
import java.util.Scanner;

/**
 * Autores: Gómez González Omar Otoniel
 *          Posthuma Solís Carl Theodoro
 *          Urbina González Josue Fabricio
 *          Zuñiga Reyes Miguel Ángel
 */
public class IA_Complejos {

    private Scanner scanner;
    
    IA_Complejos(){
        scanner = new Scanner(System.in);
    }
    
    public void ModAng(){
        
        System.out.print("Ingresa un numero complejo, en la forma a+bi: ");
        
        int[] numeros = leerComplejos();
        
        float modulo = (float) Math.sqrt(numeros[0]*numeros[0] + numeros[1]*numeros[1]);
    
        float angulo = (float) Math.toDegrees(Math.atan(numeros[1] / (float)numeros[0]));
        
        System.out.println("\nNumero: " + numeros[0] + " + " + numeros[1] + "i");
        System.out.println("Modulo: " + modulo + "\nAngulo: " + angulo + "\n");
    }
    
    public void SumRes(){



        System.out.print("Ingresa el primer numero, en la forma a+bi: ");
        int[] numero1 = leerComplejos();
        
        System.out.print("Ingresa el segundo numero, en la forma a+bi: ");
        int[] numero2 = leerComplejos();
        
        System.out.println("\nLa suma es: " + (numero1[0] + numero2[0]) + " + " + (numero1[1] + numero2[1]) + "i");
        System.out.println("La resta es: " + (numero1[0] - numero2[0]) + " + " + (numero1[1] - numero2[1]) + "i\n");
    }
    
    public void MulDiv(){
        
        System.out.print("Ingresa el primer numero, en la forma a+bi: ");
        int[] numero1 = leerComplejos();
        
        System.out.print("Ingresa el segundo numero, en la forma a+bi: ");
        int[] numero2 = leerComplejos();
        
        System.out.println("\nEl producto es: " + (numero1[0]*numero2[0] - numero1[1]*numero2[1]) + " + " + (numero1[0]*numero2[1] + numero1[1]*numero2[0]) + "i");
        System.out.println("La division es: " + ((numero1[0]*numero2[0] + numero1[1]*numero2[1])/(float)(numero2[0]*numero2[0] + numero2[1]*numero2[1])) + " + " + ((numero1[1]*numero2[0] - numero1[0]*numero2[1])/(float)(numero2[0]*numero2[0] + numero2[1]*numero2[1])) + "i\n");
    }
    
    public void Pot(){
        
        System.out.print("Ingresa el numero complejo, en la forma a+bi: ");
        int[] numero = leerComplejos();
        
        System.out.print("Ingresa la potencia: ");

        String tempPot = scanner.nextLine();

        while (!tempPot.matches("[0-9]+")){
            System.out.println("Te dije un numero.");
            tempPot = scanner.nextLine();
        }

        int pot = Integer.parseInt(tempPot);

        float modulo = (float) Math.sqrt(numero[0]*numero[0] + numero[1]*numero[1]);
    
        float angulo = (float) Math.toDegrees(Math.atan(numero[1] / (float)numero[0]));
        
        System.out.println("\nLa potencia es: " + (Math.pow(modulo, pot)) + " con " + (angulo * pot) + " grados");
        System.out.println("\nEl numero es: " + (Math.cos(Math.toRadians(angulo * pot)) * Math.pow(modulo, pot)) + " + " + (Math.sin(Math.toRadians(angulo * pot)) * Math.pow(modulo, pot)) + "i\n");
    }
    
    public int[] leerComplejos(){

        int coeficientes[] = new int[2];
        boolean isNeg=false;
        String iNum = scanner.nextLine();

        while (!isImg(iNum)){ //When there is a '+' and there are digits
            System.out.println("Te dije un numero imaginario!\n" + iNum + " no es valido");
            iNum = scanner.nextLine();
        }

        String[] nums = iNum.split("\\+");//get array separated by +
        int[] ints = new int[nums.length];//make an array the same size

        for(int j = 0; j < nums.length; j++){

            if (nums[j].contains("-"))
                isNeg = true;

            nums[j] = nums[j].replaceAll("\\D+","");

            if (isNeg)
                ints[j] = -1 *(Integer.parseInt(nums[j]));
            else
                ints[j] = (Integer.parseInt(nums[j]));

        }



        coeficientes[0] = ints[0];
        coeficientes[1] = ints[1];

        return coeficientes;
    }

    private boolean isImg(String iNum) {
        if(iNum.endsWith("i") && iNum.matches(".*\\d+.*") && iNum.contains("+")){
            return true;
        }
        else
            return false;
    }
}

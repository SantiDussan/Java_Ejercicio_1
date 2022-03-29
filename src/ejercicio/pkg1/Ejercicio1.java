
package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio1 {

  
    public static void main(String[] args) {
        
        //DECLARAR DOS VARIABLES NUMÉRICAS (CON EL VALOR QUE DESEES), MUESTRA POR CONSOLA
        //LA SUMA, RESTA, MULTIPLICACIÓN, DIVISIÓN Y MÓDULO (RESTO DE LA DIVISIÓN)
        
        double x=0, y=0,sum=0, res=0, mul=0; //DECALARACIÓN DE LAS DOS VARIABLES
        double div=0;
        Scanner entrada= new Scanner(System.in); //IMPORTAR LA CLASE PARA EL INGRESO DE DATOS
        
        System.out.println("POR FAVOR INGRESE EL PRIMER VALOR");
        x=entrada.nextInt();
        
        System.out.println("POR FAVOR INGRESE EL SEGUNDO VALOR VALOR");
        while (y==0){ //EL WHILE ES MIENTRAS EL VALOR DE Y SEA 0
            y=entrada.nextInt();
        }
        
        sum=x+y;
        System.out.println("EL RESULTADO DE LA SUMA ES: "+ sum);
        
        res=x-y;
        System.out.println("EL RESULTADO DE LA RESTA ES: "+ res);
        
        //EMPEZAMOS PARTE DE LAS OPERACIONES
        mul=x*y;
        System.out.println("EL RESULTADO DE LA MULTIPLICACIÓN ES: "+ mul);
        
        div=x/y;
        double mod=x%y;
        System.out.println("EL RESULTADO DE LA DIVISIÓN ES: "+ div+ " EL COCIENTE ES: "+ mod);
      
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_operaciones;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_7_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //las operaciones se realizan a través de simbolos 
        //OPERACIONES ARIMETICAS
        int x = 10; // declaracion y asigancion 
        int y = 5;
        //decalracionde multiples variables del
        //mismo tipo
        int suma, resta, div, multi, pot, raiz;
        
        //Suma resta
        suma = x + y; //operador de suma +
        System.out.println("Suma de x + y: ");
        System.out.println(suma);
        
        resta = x - y; // operador de diferencia -
        System.out.println("Resta de x - y: ");
        System.out.println(resta);
        
        multi = x * y;
        System.out.println("Suma de x * y: ");
        System.out.println(multi);
        
        div = x / y;
        System.out.println("Division de x(10) / y(5): ");
        System.out.println(div);
        
       x = 7;
       y = 3;
       div = x / y;
       System.out.println("Division de x(7) / y(3): ");
        System.out.println(div);
        //Divisiones---> manejo de tipos de datos
        //si dividimos enteros, java da resultsdo como 
        
        double vall = 11;
        double val2 = 3;
        double diviD;
        diviD = vall / val2;
        System.out.println("Division de vall / val2: "); //Diviciones entre decimales
        System.out.println(diviD);
        
        
    }
    
}

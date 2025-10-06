/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadorabasica;

     import java.util.Scanner; // Importa la clase Scanner para leer la entrada del usuario

public class CalculadoraBasica {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        char operador;
        
        System.out.println("--- Calculadora de Operaciones Básicas ---");
        try {
          
            System.out.print("Ingrese el primer número: ");
            num1 = scanner.nextDouble();
            
            System.out.print("Ingrese el operador (+, -, *, /): ");
            operador = scanner.next().charAt(0);
            
            System.out.print("Ingrese el segundo número: ");
            num2 = scanner.nextDouble();
          
                    
            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    System.out.println("El resultado de " + num1 + " + " + num2 + " es: " + resultado);
                    break;
                case '-':
                    resultado = num1 - num2;
                    System.out.println("El resultado de " + num1 + " - " + num2 + " es: " + resultado);
                    break;
                case '*':
                    resultado = num1 * num2;
                    System.out.println("El resultado de " + num1 + " * " + num2 + " es: " + resultado);
                    break;
                case '/':
                    // Validar que el segundo número no sea cero para la división
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("El resultado de " + num1 + " / " + num2 + " es: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir por cero.");
                    }
                    break;
                default:
                    System.out.println("Error: Operador no válido.");
                    break;
            }
        } catch (Exception e) {
            // Manejo de errores para entradas no numéricas
            System.out.println("Error: Entrada no válida. Por favor, ingrese solo números para los operandos.");
        } finally {
            // Cierra el objeto Scanner para liberar recursos
            scanner.close();
        }
        
    }
}

    
    


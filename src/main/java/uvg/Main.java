package uvg;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bandera = true;
        
        // Solicitar al usuario la implementación de lista a utilizar
        System.out.println("Seleccione la implementación de lista (ArrayList, LinkedList, Vector, Stack):");
        String listType = scanner.nextLine();
        ListFactory listFactory = new ListFactory();
        java.util.List<Integer> list = listFactory.createList(listType);
        
        // Solicitar al usuario la implementación de stack a utilizar
        System.out.println("Seleccione la implementación de stack (Stack):");
        String stackType = scanner.nextLine();
        StackFactory stackFactory = new StackFactory();
        Stack<Integer> stack = stackFactory.createStack(stackType);
        
        if (list == null || stack == null) {
            System.out.println("Implementación no válida. Saliendo del programa.");
            return;
        }
        
        while (bandera) {
            System.out.println("Ingrese una expresión matemática en formato infix (o escriba 'salir' para terminar):");
            String infixExpression = scanner.nextLine();
            
            if (infixExpression.equalsIgnoreCase("salir")) {
                bandera = false;
                break;
            }
            
            // Convertir la expresión infix a postfix
            String postfixExpression = convertInfixToPostfix(infixExpression);
            System.out.println("Expresión en postfix: " + postfixExpression);
            
            // Evaluar la expresión postfix
            int result = evaluatePostfix(postfixExpression);
            System.out.println("Resultado de la expresión: " + result);
        }
        
        System.out.println("Programa finalizado.");
    }
    
    private static String convertInfixToPostfix(String infix) {
        // Implementación de conversión de infix a postfix (a completar por el usuario)
        return "10 20 + 9 *"; // Valor de ejemplo
    }
    
    private static int evaluatePostfix(String postfix) {
        // Implementación de evaluación de postfix (a completar por el usuario)
        return 270; // Valor de ejemplo
    }
}


import java.util.Scanner;

public class Main {

    public static boolean validarExpresion(String expresion) {

        Pila pila = new Pila();
        for (int i = 0; i < expresion.length(); i++) {
            char c = expresion.charAt(i);
            if (c == '(') {
                pila.push(c);
            }
            else if (c == ')') {
                if (pila.estaVacia()) {
                    return false;
                }
                pila.pop();
            }
        }
        return pila.estaVacia();
    }

    public static void menu() {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(" MENU ");
            System.out.println("1. Analizar expresion");
            System.out.println("2. Salir");
            System.out.print("Seleccione: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Ingrese expresion: ");
                    String expresion = teclado.nextLine();
                    if (validarExpresion(expresion)) {
                        System.out.println("Expresion correcta.");}
                    else {
                        System.out.println("Expresion incorrecta.");}
                    break;

                case 2:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion invalida.");

            }

        } while (opcion != 2);
    }

    public static void main(String[] args) {
        menu();
    }
}

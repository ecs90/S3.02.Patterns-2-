package org.ecs90;

import java.util.Scanner;

public class MenuBolsa {
    private static final String opciones =
            "Introduce una opción:\n" +
                    "1. Añadir agencia\n" +
                    "2. Eliminar agencia\n" +
                    "3. Informar cambio en la bolsa\n" +
                    "4. Salir";

    private AgenteBolsa agente = new AgenteBolsa(100);

    public void printOpciones() {
        System.out.println(opciones);
    }

    public void optionsSwitch(int opcion, Scanner input) {
        String comando = "";
        switch(opcion){
            case 1 :
                System.out.println("Introduce el nombre de la nueva agencia: ");
                comando = input.nextLine();
                Agencia agencia = new Agencia(comando);
                agente.addObserver(agencia);
                System.out.println("Agencia agregada!");
                break;
            case 2:
                System.out.println("Introduce la agencia a quitar: ");
                comando = input.nextLine();
                if (agente.removeObserver(new Agencia(comando)))
                    System.out.println("Agencia borrada!");
                else
                    System.out.println("Agencia no existente");
                break;
            case 3:
                try {
                    System.out.println("Ingrese el nuevo valor de la bolsa: ");
                    comando = input.nextLine();
                    agente.setValorActual(Double.parseDouble(comando));
                    System.out.println("Valor de la bolsa actualizado!");
                } catch (NumberFormatException e) {
                    System.out.println(comando + " no es un valor válido.");
                }
                break;
            case 4:
                System.out.println("Has elegido salir del programa.");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}

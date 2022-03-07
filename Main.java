
/**
 *
 * @author inmar
 */

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.InputMismatchException;
import java.util.Vector;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);// scanner
        StorageFactory fabricS = new StorageFactory();
        Vector<String> info = new Vector<String>();// almacenara la informacion del archivo
        Vector<String> Postfixe = new Vector<String>();
        Controladora control = new Controladora();
        SiCalcu calculator = SiCalcu.getInstance();

        String postfix = "";

        boolean run = false;
        try {
            System.out.println("Por favor,ingresa la ruta del archivo");
            String archiv = entrada.nextLine();// guarda la ruta del archivo
            FileReader Datos = new FileReader(archiv);// lee el archivo
            BufferedReader Lector = new BufferedReader(Datos);
            String x = "";
            while (x != null) {
                x = Lector.readLine();// se lee linea por linea
                if (x == null) {
                    Lector.close();// para al no encontrar informacion
                    break;
                }

                info.add(x);// agrega al vector info

            }

            run = true;

        } catch (Exception e) {
            System.out.println("Ruta incorrecta");// capta la excepcion
        }
        if (run) {

            for (int i = 0; i < info.size(); i++) {// recorre el vector y evaluar cada expresion

                postfix = control.infixToPostfix(info.get(i));
                Postfixe.add(postfix);

            }

            // eleccion del tipo de almacenamiento a usar
            System.out.println("Ingrese que clase de implementacion \n de Stack o Lista a Usar ");
            System.out.println("1. Stack");
            System.out.println("2. Listas");
            boolean Menu = true;

            // Clase de implementacion
            Storage store = null;
            while (Menu) {
                try {
                    switch (entrada.nextInt()) {
                        case 1:// Stack
                            boolean submenu = true;
                            while (submenu) {
                                System.out.println("Indique el tipo de stack");
                                System.out.println("1. ArrayList");
                                System.out.println("2. Simple linedk List");
                                System.out.println("3. Double linked List");

                                try {
                                    switch (entrada.nextInt()) {

                                        case 1:// Stack Simple
                                            IStack stack = fabricS.createInstance(1);
                                            for (int i = 0; i < Postfixe.size(); i++) {
                                                System.out.println("Operacion a realizar");
                                                System.out.println(info.get(i));
                                                System.out.println("En PostFix");
                                                System.out.println(Postfixe.get(i));
                                                System.out.println("Resultado: ");
                                                System.out.println(Evaluacion(Postfixe.get(i), stack));
                                            }
                                            submenu = false;
                                            break;
                                        case 2:
                                            IStack stack1 = fabricS.createInstance(2);
                                            for (int i = 0; i < Postfixe.size(); i++) {
                                                System.out.println("Operacion a realizar");
                                                System.out.println(info.get(i));
                                                System.out.println("En PostFix");
                                                System.out.println(Postfixe.get(i));
                                                System.out.println("Resultado: ");
                                                System.out.println(Evaluacion(Postfixe.get(i), stack1));
                                            }

                                            submenu = false;
                                            break;
                                        case 3:
                                            IStack stack2 = fabricS.createInstance(3);
                                            for (int i = 0; i < Postfixe.size(); i++) {
                                                System.out.println("Operacion a realizar");
                                                System.out.println(info.get(i));
                                                System.out.println("En PostFix");
                                                System.out.println(Postfixe.get(i));
                                                System.out.println("Resultado: ");
                                                System.out.println(Evaluacion(Postfixe.get(i), stack2));
                                            }
                                            submenu = false;
                                            break;

                                    }
                                } catch (InputMismatchException a) {
                                    System.out.println("Entrada Invalida");
                                }
                            }
                            Menu = false;
                            break;
                        case 2:
                            boolean submenuu = true;
                            while (submenuu) {
                                System.out.println("Ingrese el tipo de lista");
                                System.out.println("1. Simple linedk List");
                                System.out.println("2. Double linked List");
                                try {
                                    switch (entrada.nextInt()) {
                                        case 1:// linked simple
                                            IList stack1 = fabricS.createList(1);
                                            for (int i = 0; i < Postfixe.size(); i++) {
                                                System.out.println("Operacion a realizar");
                                                System.out.println(info.get(i));
                                                System.out.println("En PostFix");
                                                System.out.println(Postfixe.get(i));
                                                System.out.println("Resultado: ");
                                                System.out.println(EvaluacionList(Postfixe.get(i), stack1, calculator));
                                            }
                                            submenuu = false;
                                            break;
                                        case 2:// linked doble
                                            IList stack2 = fabricS.createList(2);
                                            for (int i = 0; i < Postfixe.size(); i++) {
                                                System.out.println("Operacion a realizar");
                                                System.out.println(info.get(i));
                                                System.out.println("En PostFix");
                                                System.out.println(Postfixe.get(i));
                                                System.out.println("Resultado: ");
                                                System.out.println(EvaluacionList(Postfixe.get(i), stack2, calculator));
                                            }
                                            submenuu = false;
                                            break;
                                    }
                                } catch (InputMismatchException a) {
                                    System.out.println("Entrada Invalida");
                                }
                            }
                            Menu = false;
                            break;

                    }

                } catch (InputMismatchException ms) {
                    System.out.println("Entrada invalida");
                } /*catch (Exception e) {
                    System.out.println("error inesperado");
                }
*/

            }

        }

    }

    

    public static String Evaluacion(String expresion, IStack<Integer> stack) {
        String fl = "";
        boolean condicion = true;
        int a, b, s = 0;

        String[] datos;
        datos = expresion.split("");

        for (int i = 0; i < datos.length; i++) {
            if (datos[i].equals("+") || datos[i].equals("-") || datos[i].equals("*") || datos[i].equals("/")) {
                if (stack.count() >= 2) {
                    b = stack.pull();
                    a = stack.pull();
                    if (datos[i].equals("+")) {
                        s = a + b;
                    } else if (datos[i].equals("-")) {
                        s = a - b;
                    } else if (datos[i].equals("*")) {
                        s = a * b;
                    } else if (datos[i].equals("/")) {
                        s = a / b;
                    }

                    stack.push(s);
                } else {
                    condicion = false;

                }
            }

            else {
                stack.push(Integer.parseInt(datos[i]));
            }

        }
        if (condicion == true) {
            fl = Integer.toString(stack.pull());
        } else if (condicion == false) {
            fl = "Error";
        }

        return fl;
    }
    public static String EvaluacionList(String expresion, IList<Integer> stack, SiCalcu c) {
        String fl = "";
        boolean condicion = true;
        int a, b, s = 0;

        String[] datos;
        datos = expresion.split("");

        for (int i = 0; i < datos.length; i++) {
            if (datos[i].equals("+") || datos[i].equals("-") || datos[i].equals("*") || datos[i].equals("/")) {
                if (stack.Count() >= 2) {
                    b = stack.DeleteAtStart();
                    a = stack.DeleteAtStart();
                    if (datos[i].equals("+")) {
                        s = c.add(a, b);
                    } else if (datos[i].equals("-")) {
                        s = c.quit(a, b);
                    } else if (datos[i].equals("*")) {
                        s = c.multi(a, b);
                    } else if (datos[i].equals("/")) {
                        s = c.div(a, b);
                    }

                    stack.InsertAtStart(s);
                } else {
                    condicion = false;

                }
            }

            else {
                stack.InsertAtStart(Integer.parseInt(datos[i]));
            }

        }
        if (condicion == true) {
            fl = Integer.toString(stack.DeleteAtStart());
        } else if (condicion == false) {
            fl = "Error";
        }

        return fl;
    }

}
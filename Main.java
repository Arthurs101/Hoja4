/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        Scanner entrada = new Scanner(System.in);//scanner
        StorageFactory fabricS = new StorageFactory();
        Vector<String> info = new Vector<String>();//almacenara la informacion del archivo
        Controladora control = new Controladora();
        SiCalcu calculator = SiCalcu.getInstance();
        boolean run = false;
        try {
            System.out.println("Por favor,ingresa la ruta del archivo");
            String archiv = entrada.nextLine();//guarda la ruta del archivo
            FileReader Datos = new FileReader(archiv);//lee el archivo
            BufferedReader Lector = new BufferedReader(Datos);
            String x = "";
            while (x != null) {
                x = Lector.readLine();//se lee linea por linea
                if (x == null) {
                    Lector.close();//para al no encontrar informacion
                    break;
                }
                info.add(x);//agrega al vector info
                
            }
         run = true;   


        } catch (Exception e) {
            System.out.println("Ruta incorrecta");//capta la excepcion
        }
        if(run){
         
                    //eleccion del tipo de almacenamiento a usar
        System.out.println("Ingrese que clase de implementacion \n de Stack o Lista a Usar ");
        System.out.println("1. Stack");
        System.out.println("2. Listas");
        boolean Menu = true;
        
        //Clase de implementacion
        Storage store = null;
        while(Menu){
        try{
            switch(entrada.nextInt()){
                case 1 ->{//Stack
                    boolean submenu = true;
                    while(submenu){
                        System.out.println("Indique el tipo de stack");
                        System.out.println("1. ArrayList");
                        System.out.println("2. Simple linedk List");
                        System.out.println("3. Double linked List");
                        try{
                            switch(entrada.nextInt()){
                                case 1 -> {//Stack Simple
                                    store = fabricS.createInstance(3);
                                    submenu = false;
                                }
                                case 2 -> {//stack linked simple
                                     store = fabricS.createInstance(4);
                                     submenu = false;
                                }
                                case 3 -> {//stack linked double
                                     store = fabricS.createInstance(5);
                                     submenu = false;
                                }
                            }
                        }catch(InputMismatchException a){ System.out.println("Entrada Invalida");}
                    }
                    Menu = false;
                }case 2 -> {
                    boolean submenu = true;
                    while(submenu){
                        System.out.println("Ingrese el tipo de lista");
                        System.out.println("1. Simple linedk List");
                        System.out.println("2. Double linked List");
                        try{
                            switch(entrada.nextInt()){
                                case 1 -> {//linked simple
                                    store = fabricS.createInstance(1);
                                    submenu = false;
                                }
                                case 2 -> {//linked doble
                                     store = fabricS.createInstance(2);
                                     submenu = false;
                                }
                            }
                        }catch(InputMismatchException a){System.out.println("Entrada Invalida");}
                    }
                    Menu = false;
                }
            
            }
            
        }catch(InputMismatchException ms){System.out.println("Entrada invalida");}
        catch(Exception e ){System.out.println("error inesperado");}
        
        }
        //realizar evaluacion de la expresion seg[un clase de implementacion
        if(store.Type().equals(DoubleList.class)){
            for (int i = 0; i < info.size(); i++) {//recorre el vector y evaluar cada expresion
                System.out.println("Operacion a realizar");
                System.out.println(info.get(i));
                System.out.println("En expresion postfix");
                String postfix = control.infixToPostfix(info.get(i));
                System.out.println("Resultado" + DoubleEvaluation(postfix, (DoubleList) store, calculator));
                
                
            }
        
        }
        
        }
        
        
        

    }
    
    private static int DoubleEvaluation(String operation , DoubleList data, SiCalcu calculator){
       String[] expresion = operation.split(" ");
        for (int z = 0; z < expresion.length; z++) {//agregar todo a la doublelinked list
            if(z == 0){ 
                data.InsertAtStart(expresion[z]);
            } else {
                data.InsertAtEnd(expresion[z]);
            }
        }
        //evaluar expresiones 
        //hallar operadores y realizar la operacion hasta quedarse con un solo valor
        int result = 0;
        while(data.Count() != 1){
            int operatorIndex = -1;//estado prohibido es decir no se hallo un operador
            for (int i = 0; i < data.Count(); i++) {
                DoubleNode temp = (DoubleNode) data.Get(i);
                if(temp.getValue().getClass().equals(String.class)){
                    operatorIndex = i;
                    break;
                }
            }
            if (operatorIndex == -1){//en caso de ser estado prohibido
                System.out.println("Error No hay operadores");
                return -1;
            }else{
            String signo = (String) ((DoubleNode) data.Delete(operatorIndex)).getValue();
            int operando1 = (int) ((DoubleNode) data.Delete(operatorIndex -1)).getValue();
            int operando2 = (int) ((DoubleNode) data.Delete(operatorIndex -2)).getValue();
            result = Operation(signo, operando1, operando2, calculator);
            data.Insert(result, operatorIndex -2 );
            }
        }
        return result;
    }
    
    private static int Operation(String signo, int a, int b, SiCalcu calculator ){
        switch(signo){
            case "+" ->{
                return calculator.add(a, b);
            }
            case "-" ->{
                return calculator.quit(a, b);
            }
            case "*" ->{
                return calculator.multi(a, b);
            }
            case "/" ->{
                return calculator.div(a, b);
            }
        }
        return 0;
    }
    
}

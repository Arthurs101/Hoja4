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
import java.util.Vector;
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//scanner

        try {
            System.out.println("Por favor,ingresa la ruta del archivo");
            String archiv = entrada.nextLine();//guarda la ruta del archivo
            FileReader Datos = new FileReader(archiv);//lee el archivo
            BufferedReader Lector = new BufferedReader(Datos);
            Vector<String> info = new Vector<String>();//almacenara la informacion del archivo
            String x = "";
            while (x != null) {
                x = Lector.readLine();//se lee linea por linea
                if (x == null) {
                    Lector.close();//para al no encontrar informacion
                    break;
                }
                info.add(x);//agrega al vector info
            }

        } catch (Exception e) {
            System.out.println("Ruta incorrecta");//capta la excepcion
        }

        for (int i = 0; i < info.size(); i++) {//recorre el vector
            int Total = Calculadora.Evaluate(info.get(i));//devuelve un entero que almacena en la variable total
        
       
    }

}

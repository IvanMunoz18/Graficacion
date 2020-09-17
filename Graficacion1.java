package graficacion1;

import javax.swing.*;

public class Graficacion1 {

    public static void main(String[] args) {

        int suma = 0;
        int promedio = 0;
        String salida = null;
       int Numeros[] = new int[10 ];//Se declara el arreglo donde se almacenaran los numeros aleatorios
        String[] filas = new String[100];
        for (int i = 0; i < 10; i++) { 
            Numeros[i] = (int) (Math.random() * 100 + 0);//Aqui se generan los numeros aleatorios en el rango 0-100
            suma += Numeros[i];// se almacenan todos los numeros en el arreglo
        }
        System.out.println("Esta es la suma de los numeros:"+suma);
        promedio = ((suma) / (10));//Se genera el promedio de los numeros
        System.out.println("Este es el promedio de los numeros:"+promedio);
        for (int h = 0; h < Numeros.length; h++) {//ciclo para imprimir los numeros
            System.out.print(Numeros[h]);
            for (int k = 0; k < Numeros[h]; k++) {//ciclo para imprimir la grafica
                salida = "=";
                filas[k] = salida;
                System.out.print(filas[k].toString());//impresion de cada una de las filas
                if (k == promedio - 1) {
                    System.out.print("¡");
                }
            }
            System.out.println(h);
        }
    }
}

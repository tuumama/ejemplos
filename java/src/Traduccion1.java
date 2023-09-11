import java.util.*;
import java.io.*;

public class Traduccion1 {
  public static void main(String[] args) {
    String nombre;
    Scanner teclado =new Scanner(System.in);
    System.out.println("Introduzca nombre:");
    nombre = teclado.nextLine();
    String fileName = "Archivo3.txt";
    String encoding = "UTF-8";
    try{
    PrintWriter writer = new PrintWriter(fileName, encoding);
    writer.println("Nombre:" + nombre);
    writer.println("Alumno:");
    writer.println("Juan Perez");
    System.out.println("Prueba");
    writer.close();
    }
    catch (IOException e){
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}
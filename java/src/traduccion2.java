import java.io.*;

public class traduccion2 {
  public static void main(String[] args) {
    String fileName = "Archivo2.txt";
    String encoding = "UTF-8";
    try{
    PrintWriter writer = new PrintWriter(fileName, encoding);
    writer.println("Alumno:");
    writer.println("Juan Perez");
    writer.close();
    }
    catch (IOException e){
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}
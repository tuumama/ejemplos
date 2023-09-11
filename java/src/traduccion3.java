import java.io.*;
import java.util.*;
import java.nio.file.*;
import java.nio.charset.*;

public class traduccion3 {
  public static void main(String[] args) {
    String fileName = "archivo.txt";
    try{
    List<String> lines = Arrays.asList("Alumno:", "Maria Sanchez");
    Path file = Paths.get(fileName);
    Files.write(file, lines, StandardCharsets.UTF_8);
    }
    catch (IOException e){
      System.out.println("Error.");
      e.printStackTrace();
    }
  }
}
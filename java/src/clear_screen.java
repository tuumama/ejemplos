public class clear_screen
{  
public static void main(String[] args)  
{  
System.out.print("\033[H\033[2J");  
System.out.flush();  
}  
}  

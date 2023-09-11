import java.util.*;
public class Practicaj {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    double importe=0;
    do{
        try{
            System.out.print("Introduzca cantidad: ");
            importe=sc.nextDouble();
        }catch(Exception e){
            System.out.println("Incorrecto.");
            sc.nextLine();
        }
    }
    while(importe<=0);
    calcular(importe);
    }
public static void calcular(double importe)
{
    double [] monedas={500, 200, 100, 50, 20, 10, 5, 2, 1, 0.5};
    double [] devolver={0,0,0,0,0,0,0,0,0,0,0}; // se agrega un elemento para la moneda de 0.5
    for(int i=0;i<monedas.length;i++)
    {
    if(importe>=monedas[i])
    {
        if (monedas[i] == 0.5) {
    // Tratamiento especial para la moneda de 0.5
            int cantidad = (int) Math.round(importe/monedas[i]);
            devolver[i] = cantidad;
            importe = importe - (cantidad * monedas[i]);
        } else {
            devolver[i]=Math.floor(importe/monedas[i]);
            importe=importe-(devolver[i]*monedas[i]);
         }
    }
    }
        for(int i=0;i<monedas.length;i++)
        {
            if(devolver[i]>0)
            {
            if(monedas[i]>2)
            {
                System.out.println(devolver[i]+" billete(s) de: "+monedas[i]+" Pesos");
            }else if (monedas[i] == 0.5) {
                System.out.println(devolver[i]+" moneda(s) de: "+monedas[i]+" Pesos");
            } else {
                System.out.println(devolver[i]+" moneda(s) de: "+monedas[i]+" Pesos");
            }   
            }
        }
}
}
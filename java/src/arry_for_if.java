import javax.swing.*;

public class arry_for_if {
    public static void main(String[] args) {
        ImageIcon icon= new ImageIcon("spo.png");
        int b;
    do{

    
        String[]op={"JOJI", "BAD BUNNY", "CHALINO"};
        int opt= JOptionPane.showOptionDialog(null, "Selecciona un artista ", "Artistas", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, op, op[0]);
        String[] joji={"A", "GLIMPSE OF US", "SLOW DANCING IN THE DARK", "YEAH RIGHT"};
        String[] bb={"A", "ME PORTO BONITO", "TITI ME PREGUNTO", "EFECTO"};
        String[] chal={"A", "ALMA ENAMORADA", "NIEVES DE ENERO", "BARAJA DE ORO"};
        for(int a=1;a < joji.length;a++){
        
        if(opt==0){
            JOptionPane.showMessageDialog(null, "Top "+ a + "-" + joji[a], "SPOTIFY", JOptionPane.PLAIN_MESSAGE, icon);
            
        }else if(opt==1){
            JOptionPane.showMessageDialog(null, "Top "+ a + "-" + bb[a], "SPOTIFY", JOptionPane.PLAIN_MESSAGE, icon);

        }else{
            JOptionPane.showMessageDialog(null, "Top "+ a + "-" + chal[a], "SPOTIFY", JOptionPane.PLAIN_MESSAGE, icon);
        }
    }
    String[]idk={"SI", "NO"};
    b=JOptionPane.showOptionDialog(null, "¿Deseas seleccionar otro artista?", "", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, icon, idk, idk[0]);
}while(b==0);
        

        }
        
        
    }


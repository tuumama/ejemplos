class rrr extends JButton {
    private int numero;

    public Memoria (int num){
        numero = num;

        setSize(80,80);
        setFont(new Font("Arial",Font.BOLD,34));
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void mostrarNumero() {
        setText(numero + "");
    }

    public void noMostrarNumero() {
        setText("");
    }
}
FRAME

public class PA_17130062_Frame_04 extends javax.swing.JFrame implements ActionListener {

    private Memoria memorama[] = new Memoria[20];
    private boolean primera = false;
    private boolean segunda = false;
    private JButton jbtn[] = new JButton[2];
    private int intentos;
    private JFileChooser jfch = new JFileChooser();

    public PA_17130062_Frame_04() {
        initComponents();
        inciar();
    }

    public int[] mezclar(int bar[]) {
        int m = bar.length - 1;
        for (int r = m; r > 1; r--) {
            int alea = (int) Math.floor(r * Math.random());
            int temp = bar[r];
            bar[r] = bar[alea];
            bar[alea] = temp;
        }
        return (bar);
    }

    public void inciar() {
        Random azar = new Random();
        int x = 30, y = 50;

        int arre[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        mezclar(arre);

        for (int r = 0; r < memorama.length; r++) {
            memorama[r] = new Memoria(arre[r]);

            memorama[r].setLocation(x, y);

            x += 100;
            if ((r + 1) % 5 == 0) {
                y += 100;
                x = 30;
            }

            memorama[r].addActionListener(this);
            add(memorama[r]);

        }

        setSize(550, 550);

        intentos = 0;

        jLabIntento.setText(intentos + "");
    }
    @Override
    public void actionPerformed(ActionEvent ae) {

        Memoria btn1 = (Memoria) ae.getSource();
        Memoria btn2 = (Memoria) ae.getSource();

        if (!primera) {
            btn1.mostrarNumero();
            jbtn[0] = btn1;
            primera = true;
            segunda = false;
        } else {
            btn1.mostrarNumero();
            jbtn[1] = btn1;
            segunda = true;
        }

        int x1 = 0, x2 = 0, cont=0;//Variables para saber en que posicion estan los 2 números iguales
        int valor1 = Integer.parseInt(btn1.getActionCommand());
        int valor2 = 0;

        for (int r = 0; r < memorama.length; r++) {        

            if ( valor1 == memorama[r].getNumero() ) {
                if (cont == 0) {
                    x1 = r;
                    cont++;
                }


                x2 = r;
            }

        }


        for (int r = 0; r < memorama.length; r++) {
             if (primera && segunda) {
                if (memorama[r].getNumero() != memorama[x2].getNumero() ) {
                    jbtn[0].setEnabled(false);
                    jbtn[1].setEnabled(false);
                } 
                else{
                    jbtn[0].setEnabled(true);
                    jbtn[1].setEnabled(true);

                    jbtn[0].setText("");
                    jbtn[1].setText("");
                }
                primera = false;
            }
        }



        intentos++;
        jLabIntento.setText(intentos + " ");
        jLabprueba.setText(btn1.getActionCommand()+"        " + memorama[x1].getNumero()+"|x1="+x1+
                                              "     "+memorama[x2].getNumero()+"|x2="+x2);

    }
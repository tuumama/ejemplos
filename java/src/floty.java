import javax.swing.*;

public class floty {
    public static void main(String[] args) {
        float[] op = new float[4];

        op[0] = 1.3f;
        op[1] = 1.5f;
        op[2] = 1.9f;
        op[3] = 1.8f;

        for (int a = 0; a < op.length; a++) {
            //System.out.println("El numero es:" + op[a]);
            JOptionPane.showMessageDialog(null, "Top "+ a + "-" + op[a], "SPOTIFY", JOptionPane.PLAIN_MESSAGE);
        //}

    }
}
}

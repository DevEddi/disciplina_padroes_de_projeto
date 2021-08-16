package ocp.resolution;

import java.util.Locale;

public class QualoSeuIMC {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);

        Dados dados = new Dados ("MascIMC");
        dados.setAltura(1.75);
        dados.setPeso(78);
        dados.calcIMC();



    }
}

package ocp.problem;

import java.util.Locale;

public class QualoSeuIMC {
    public static void main (String[] args) {
        Locale.setDefault(Locale.US);
        MascIMC masculino = new MascIMC();
        masculino.setAltura(1.89);
        masculino.setPeso(90);
        masculino.setSexo("Masculino");
        masculino.setIdade(25);

        System.out.println("Altura: " + masculino.getAltura() + " Peso: " +masculino.getPeso()+ " Idade: " + masculino.getIdade() +" Sexo: " +masculino.getSexo());
        System.out.println("IMC: " + masculino.calcIMCmasc() + " "+ masculino.verificaIMC() );



    }
}

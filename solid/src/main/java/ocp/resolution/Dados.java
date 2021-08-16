package ocp.resolution;

public class Dados {
    private double peso;
    private double altura;
    private TipoIndividuo tipoIndividuo;

    public Dados(String sexualidade){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("Ocp.refatorado." + sexualidade);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            this.tipoIndividuo = null;
        }
        if (!(objeto instanceof TipoIndividuo)) {
            this.tipoIndividuo = null;
        }
        this.tipoIndividuo = (TipoIndividuo) objeto;
    }
    public void calcIMC(){
        this.tipoIndividuo.calcIMC(peso, altura);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

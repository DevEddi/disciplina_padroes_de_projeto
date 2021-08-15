package ocp.problem;

public class MascIMC {
    private String sexo;
    private int idade;
    private double altura;
    private double peso;

    public MascIMC(String sexo, int idade, double altura, double peso) {
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public MascIMC() {

    }

    public double calcIMCmasc(){
        return  peso / (altura * altura);
    }
    public String verificaIMC() {
        if (calcIMCmasc() < 16) {
            return "Magreza Grave";
        } else if (calcIMCmasc() < 18) {
            return "Magreza leve";
        }else if(calcIMCmasc() < 25 ) {
            return "Saudavel";
        }else if(calcIMCmasc() < 30 ) {
            return "Sobre Peso";
        }else{
            return "Obesidade";
        }
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}

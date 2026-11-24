package exercicio;

public class AlunosMatriculados {
    private String nome;
    private int matricula;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    // é uma boa pratica utilizar os setters para definir o valor
    // dos atributos ao inves de altera-los diretamente

    public AlunosMatriculados(String nome, int matricula, double notaProva1, double notaProva2,  double notaTrabalho) {
        this.setNome(nome);
        this.setMatricula(matricula);
        this.setNotaProva1(notaProva1);
        this.setNotaProva2(notaProva2);
        this.setNotaTrabalho(notaTrabalho);
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getNotaProva1() {
        return notaProva1;
    }

    public void setNotaProva1(double notaProva1) {
        this.notaProva1 = notaProva1;
    }

    public double getNotaProva2() {
        return notaProva2;
    }

    public void setNotaProva2(double notaProva2) {
        this.notaProva2 = notaProva2;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    // Metodos

    public double media(){
        double pesoProva = 2.5;
        double pesoTrabalho = 2.0;
        double peso1 = this.notaProva1 * pesoProva;
        double peso2 = this.notaProva2 * pesoProva;
        double peso3 = this.notaTrabalho * pesoTrabalho;

        return (peso1 + peso2 + peso3) / ((pesoProva * 2) + pesoTrabalho);
    }

    public double mediaFinal(){
        double mediaNecessaria = 6;
        double resultado = mediaNecessaria - this.media();

        return (resultado <= 0) ? 0 : resultado;
    }

}
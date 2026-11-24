package exercicio;

public class Main {
    public static void main(String[] args) {

        // Alunos matriculados

        AlunosMatriculados alunosMatriculados = new AlunosMatriculados("João Neiger", 201, 5, 10, 5);
        System.out.println(alunosMatriculados.media());
        System.out.println(alunosMatriculados.mediaFinal());

    }
}
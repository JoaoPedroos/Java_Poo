public class Main{
    public static void main(String[] args){

        Aluno aluno1 = new Aluno("Joao");

        aluno1.setNota1(11.00);

        aluno1.setNota1(5.00);
        aluno1.setNota2(5.00);

        System.out.println("Aluno: " + aluno1.getNome());
        System.out.println("Notas: " + "A1= " + aluno1.getNota1() + " || A2= " + aluno1.getNota2());
        System.out.println("Média: " + aluno1.calcularMedia());

    }
}
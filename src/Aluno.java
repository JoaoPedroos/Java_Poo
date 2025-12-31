public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void setNota1(Double nota){
        if(nota >= 0 && nota <= 10){
            this.nota1 = nota;
        }
        else{
            System.out.println("Erro: Nota " + nota + " é inválida ou excendente.");
        }
    }

    public void setNota2(Double nota){
        if(nota >= 0 && nota <= 10){
            this.nota2 = nota;
        }
        else{
            System.out.println("Erro: Nota " + nota + " é inválida ou excendente.");
        }
    }

    public Double calcularMedia(){
        return (nota1 + nota2) / 2;
    }

    public String getNome(){
        return nome;
    }

    public Double getNota1(){
        return nota1;
    }

    public Double getNota2(){
        return nota2;
    }

}

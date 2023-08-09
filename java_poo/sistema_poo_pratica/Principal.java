package sistema_poo_pratica;

public class Principal {

    public static void main(String[] args) {

        AlunoEnsinoMedio alunoEnsinoMedio1 = new AlunoEnsinoMedio();
        AlunoEnsinoFundamental alunoEnsinoFundamental1 = new AlunoEnsinoFundamental();
        Professor professor1 = new Professor();

        alunoEnsinoMedio1.setNome("Maria");
        alunoEnsinoMedio1.setTeste(7);
        alunoEnsinoMedio1.setProva(10);
        
        System.out.println("Aluno do Ensino Médio: ");
        System.out.println("Nome: " + alunoEnsinoMedio1.getNome());
        System.out.println("Média: " + alunoEnsinoMedio1.getMedia() +"\n");

        alunoEnsinoFundamental1.setNome("Matheus");
        alunoEnsinoFundamental1.setTeste(9);
        alunoEnsinoFundamental1.setProva(10);
        
        System.out.println("Aluno do Ensino Médio: ");
        System.out.println("Nome: " + alunoEnsinoFundamental1.getNome());
        System.out.println("Média: " + alunoEnsinoFundamental1.getMedia() +"\n");

        professor1.setNome("Carlos");
        professor1.setSalario(1500);

        System.out.println("Professor: ");
        System.out.println("Nome: " + professor1.getNome());
        System.out.println("Desconto do INSS: " + professor1.getInss());
        System.out.println("Salario Líquido: " + professor1.getSalarioLiquido());

    }
}

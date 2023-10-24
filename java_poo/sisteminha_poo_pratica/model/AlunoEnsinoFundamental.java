package sistema_poo_pratica;

public class AlunoEnsinoFundamental extends Aluno {

    public double getMedia() {
        return (getTeste() + getProva())/2;
    }   
	
}

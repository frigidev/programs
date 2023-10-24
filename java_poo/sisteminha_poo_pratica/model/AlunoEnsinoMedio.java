package sistema_poo_pratica;

public class AlunoEnsinoMedio extends Aluno {

    public double getMedia() {
        return (getTeste() + getProva()*2) / 3;
    }
    
}

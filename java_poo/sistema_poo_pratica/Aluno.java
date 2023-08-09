package sistema_poo_pratica;

public abstract class Aluno extends Pessoa implements Media {

	private double prova, teste;
	
    protected void setProva(double prova) {
        this.prova = prova;
    }

    protected void setTeste(double teste) {
        this.teste = teste;
    }

    protected double getProva() {
        return this.prova;
    }

    protected double getTeste() {
        return this.teste;
    }
    
}

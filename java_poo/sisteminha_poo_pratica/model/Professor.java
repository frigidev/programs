package sistema_poo_pratica;

public class Professor extends Pessoa {
    
    private double salario;

    protected void setSalario(double salario) {    	
    		this.salario = salario;
    }
    	
    protected double getInss() {
        return salario * 0.11;
    }

    protected double getSalarioLiquido() {
        return salario - getInss();
    }
    
}

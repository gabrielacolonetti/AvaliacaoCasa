import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Casa {
	String cor;
	List<Porta> portas = new ArrayList<Porta>();
	
	public List<Porta> getPortas() {
		return portas;
	}

	public void setPortas(List<Porta> portas) {
		this.portas = portas;
	}

	public Casa(){
		portas = new ArrayList<Porta>();
	}
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void quantasPortasEstaoAbertas(){
		int i=0;
		
		for (Porta porta : portas) {
			if(porta.getAberta()){
				i+=i;
			}
		}
		JOptionPane.showMessageDialog(null,i + " portas estão abertas");

	}
	
	public void pinta(String cor){
		this.cor = cor;
		JOptionPane.showMessageDialog(null,"A casa foi pintada da cor "+ cor);
	}

	public void adicionaPorta(Porta p){
		this.portas.add(p);
	}
}


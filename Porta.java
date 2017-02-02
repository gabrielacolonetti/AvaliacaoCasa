import javax.swing.JOptionPane;

public class Porta {
	boolean aberta;
	String cor;
	int altura;
	int largura;

	public Porta(){
		aberta = false;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public int getLargura() {
		return largura;
	}
	public void setLargura(int largura) {
		this.largura = largura;
	}

	public boolean getAberta(){
		return aberta;
	}
	public boolean isAberta() {
		if(aberta){
			JOptionPane.showMessageDialog(null,"A porta está aberta");
		}else{
			JOptionPane.showMessageDialog(null,"A porta não está aberta");
		}
		return aberta;
	}
	
	public void setAberta(boolean aberta) {
		this.aberta = aberta;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	public void abre(){
		aberta = true;
		JOptionPane.showMessageDialog(null,"A porta está aberta");

	}

	public void fecha(){
		aberta = false;
		JOptionPane.showMessageDialog(null,"A porta está fechada");

	}
	
	

	public void pinta(String cor){
		this.cor = cor;
		JOptionPane.showMessageDialog(null,"A porta foi pintada da cor "+ cor);
	}


}

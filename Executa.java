import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Porta porta = new Porta();
		Casa casa = new Casa();

		porta.fecha();
		
		String cor = JOptionPane.showInputDialog("Que cor deseja pintar sua porta?");
		porta.pinta(cor);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura da porta"));
		porta.setAltura(altura);
		int largura = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura da porta"));
		porta.setLargura(largura);
		
		porta.isAberta();
		

		String corCasa = JOptionPane.showInputDialog("Que cor deseja pintar sua casa?");
		casa.pinta(corCasa);
		JOptionPane.showMessageDialog(null,"Criando três portas para sua casa");

		Porta p1 = new Porta();
		Porta p2 = new Porta();
		Porta p3 = new Porta();
		
		p1.abre();
		p2.fecha();
		p3.abre();
		
		casa.adicionaPorta(p1);
		casa.adicionaPorta(p2);
		casa.adicionaPorta(p3);
		
		
		casa.quantasPortasEstaoAbertas();
	}

}

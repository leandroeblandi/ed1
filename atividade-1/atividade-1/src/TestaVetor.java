import javax.swing.JOptionPane;

public class TestaVetor {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("joao", 70);
		Aluno a2 = new Aluno("Maria", 85);
		Aluno a3 = new Aluno("Julia", 90);
		Aluno a4 = new Aluno("Leandro", 95);
		Aluno a5 = new Aluno("Leonardo", 95);
		Aluno a6 = new Aluno("Fabiano", 95);
		Aluno a7 = new Aluno("Fabiano", 95);

		Vetor lista = new Vetor();
		
		//Testes 
		//Testa a insercao no inicio da lista
		lista.inserir(a1);
		lista.inserir(a2);
		lista.inserir(a3);
		lista.inserir(a4);
		lista.inserir(a5);
		lista.inserir(a6);
		lista.inserir(a7);
		JOptionPane.showMessageDialog(null, lista);

		/*
		//verificar se um aluno está na lista
		Aluno procura = new Aluno("Maria", 85);

		if (lista.contem(procura)){
			JOptionPane.showMessageDialog(null, "O aluno está na lista!");
		}

		//Obter o aluno numa determinada posicao
		procura = lista.obtem(2);
		JOptionPane.showMessageDialog(null, procura);

		//Inserir novo aluno na posicao 2
		Aluno a5 = new Aluno("Carlos",99);
		lista.inserir(a5,2);

		JOptionPane.showMessageDialog(null, lista);

		//Remover da posicao 1
		lista.remover(1);

		JOptionPane.showMessageDialog(null, lista);
		*/
	}

}
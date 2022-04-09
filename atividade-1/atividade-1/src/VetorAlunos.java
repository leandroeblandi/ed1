public class VetorAlunos {
	private Aluno[] alunos = new Aluno[5];
	private int totalDeAlunos = 0;
	
	
	void inserir (Aluno aluno) {
		//verifica se precisa de mais espaço
		this.getEspaco();
		
		//percorrer a lista até encontrar uma posição livre
		for (int i=0; i < this.alunos.length; i++) {
			//a posicao está livre?
			if (this.alunos[i]==null) {
				this.alunos[i] = aluno;
				this.totalDeAlunos++;
				break;
			}
		}
		
	}
	
	void inserir(Aluno aluno, int posicao) {

		//verifica se precisa de mais espaço
		this.getEspaco();

		if (!this.posicaoValida(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}

		//desloca os elementos para a direita
		for (int i = this.totalDeAlunos-1 ; i >= posicao; i--) {
			this.alunos[i+1] = this.alunos[i];
		}

		this.alunos[posicao] = aluno;
		this.totalDeAlunos++;
		
	}

	private boolean posicaoValida(int posicao){
		return posicao >=0 && posicao <= this.totalDeAlunos;
	}
	
	Aluno obtem(int posicao) {
	//acessar e devolver o aluno da posicao X (posicao que estou passando por parametro)
		if(!this.posicaoOcupada(posicao)){
			throw new IllegalArgumentException("Posição inválida");
		}
		return this.alunos[posicao];
	}

	private boolean posicaoOcupada(int posicao){
		return posicao >=0 && posicao < this.totalDeAlunos;
	}

	void remover(int posicao) {
		if ( !(posicao < this.alunos.length && posicao >=0) ) {
			throw new IllegalArgumentException("Posição inválida");
		}

		for (int i = posicao; i < this.totalDeAlunos-1 ; i++) {
			this.alunos[i] = this.alunos[i+1];
		}

		this.totalDeAlunos--;
	}
	
	boolean contem(Aluno aluno){
		for (int i = 0; i < alunos.length; i++) {
			if (aluno == this.alunos[i]) {
				return true;
			}
		}
		return false;
	}
	
	int tamanho() {
		return this.totalDeAlunos;
	}
	
	public String toString() {
		if (this.totalDeAlunos == 0) {
			return "[]";
		}
		
		StringBuilder saida = new StringBuilder();
		
		saida.append("[");
		
		for (int p=0; p<this.totalDeAlunos-1; p++) {
			saida.append(this.alunos[p]);
			saida.append(", ");
		}
		
		saida.append(this.alunos[this.totalDeAlunos-1]);
		saida.append("]");
			
		return saida.toString();
	}

	//Aula de 26/03
	private void getEspaco(){
		//verifica se o total de alunos é igual ao tamanho do vetor
		if (this.totalDeAlunos == this.alunos.length){
			//criamos um novo array para guardar novas inserções
			Aluno[] novoArray = new Aluno[this.alunos.length + 2];

			//percorremos o array atual e transferimos os valores do array atual para o novo
			for (int i = 0; i < this.alunos.length; i++) {
				novoArray[i] = this.alunos[i];
			}
			//o array atual perde o lugar para o novo array
			this.alunos = novoArray;
		}
	}
}
import java.util.Objects;

public class Aluno {
	
	private String nome;
	private float nota;

	public Aluno(String nome, int nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getNota() {
		return nota;
	}
	
	public void setNota(int nota) {
		this.nota = nota;
	}
	
	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, nota);
	}

	// @Override
	// public boolean equals(Object obj) {
	// 	if (this == obj)
	// 		return true;
	// 	if (obj == null)
	// 		return false;
	// 	if (getClass() != obj.getClass())
	// 		return false;
	// 	Aluno other = (Aluno) obj;
	// 	return Objects.equals(nome, other.nome) && nota == other.nota;
	// }

	public boolean equals(Object o){
		Aluno outro = (Aluno) o;
	   return this.nome.equals(outro.nome);
	}

	public boolean contem(Object o) {
		if(equals(o)){
			return true;
		} 
		return false;
	}
}
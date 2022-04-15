public class Teste {
    public static void main(String[] args) {
        Vetor v1 = new Vetor();
    
        //criar novo objeto
        Aluno a1 = new Aluno("Priscilla", 10);
        //inserir novo objeto
        v1.inserir(a1);
        //mostrar objetos
        v1.toString();
    }
}
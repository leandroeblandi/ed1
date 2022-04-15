public class App {
    public static void main(String[] args)  {
        Vetor lista = new Vetor();
        Aluno aluno = new Aluno("Nome teste", 10);

        //Inserir aluno
        lista.inserir(aluno);
        lista.toString();

        // //Obter aluno        
        // lista.obtem(0);
        
        // //remover por posicão
        // lista.remover(1);
        
        // //remover por ocorrência
        // Aluno remove = new Aluno("Nome teste", 10);
        // lista.remover(remove);
        
        // //remover todos        
        // lista.remover();
        
        // //verificar o índice
        // lista.indexOf(aluno);
        
        // //contém
        // lista.contem(aluno);
        
        // //mostra todos os itens
        // lista.toString();

    }
}
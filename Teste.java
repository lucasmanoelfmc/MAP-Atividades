import classes.Aluno;
import classes.Disciplina;
import classes.Professor;
import classes.RDM;
import classes.ControleAcad;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class Teste {

    private ControleAcad ca1;
    private Disciplina disciplina1;
    private Aluno aluno1;
    private Professor professor1;
    private Disciplina disciplina2;
    private Aluno aluno2;
    private Professor professor2;
    
    @BeforeEach
    void setUp() throws Exception{

        //SUAP -> Redes de Computadores e Estruturas de Dados

        ca1 = new ControleAcad("SUAP");

        disciplina1 = new Disciplina("Redes de Computadores");
        ca1.adicionarDisciplina(disciplina1);

        disciplina2 = new Disciplina("Estrutura de Dados");
        ca1.adicionarDisciplina(disciplina2);

        //Redes de Computadores -> Lucas (Aluno) e Mateus (Professor)

        aluno1 = new Aluno("Lucas", 111);
        disciplina1.adicionarAluno(aluno1);
        
        professor1 = new Professor("Mateus", 1111);
        disciplina1.adicionarProfessor(professor1);

        //Estrutura de Dados -> Joao (Aluno) e Carlos (Professor)

        aluno2 = new Aluno("Joao", 222);
        disciplina2.adicionarAluno(aluno2);
        
        professor2 = new Professor("Carlos", 2222);
        disciplina2.adicionarProfessor(professor2);

    }

    @Test //Testes verdadeiros
    public void testeControleAcad(){
        //Controle Academico1
        Assertions.assertEquals(ca1.getNome(), "SUAP");
    }

    @Test //Testes verdadeiros
    public void testeDisciplinas(){
        //Disciplina1
        Assertions.assertEquals(disciplina1.getNome(), "Redes de Computadores");
        //Disciplina2
        Assertions.assertEquals(disciplina2.getNome(), "Estrutura de Dados");
    }

    @Test //Testes verdadeiros
    public void testeAlunos(){ 
        //Aluno1
        Assertions.assertEquals(aluno1.getNome(), "Lucas");
        Assertions.assertEquals(aluno1.getMatricula(), 111);
        //Aluno2
        Assertions.assertEquals(aluno2.getNome(), "Joao");
        Assertions.assertEquals(aluno2.getMatricula(), 222);
    }

    @Test //Testes verdadeiros
    public void testeProfessores(){ 
        //Professor1
        Assertions.assertEquals(professor1.getNome(), "Mateus");
        Assertions.assertEquals(professor1.getMatricula(), 1111);
        //Professor2
        Assertions.assertEquals(professor2.getNome(), "Carlos");
        Assertions.assertEquals(professor2.getMatricula(), 2222);
    }
    
    @Test //Testes falsos
    public void teste5(){
        Assertions.assertEquals(professor1.getNome(), disciplina1.getProfessores());
    }
    
}

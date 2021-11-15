import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Empresa {

    public static void main(String[] args) {

        ArrayList<Estagiario> estagiarios = new ArrayList<>();
        ArrayList<Mentor> mentores = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        Map <Estagiario, Curso> mapaCursoEstagiario = new HashMap();
        Map <Mentor, Curso> mapaCursoMentor = new HashMap();
        Set <String> RAEstagiarios = new HashSet();


        //Adicionar alunos
        Estagiario a1 = new Estagiario("Victor", "0001");
        Estagiario a2 = new Estagiario("Stephanie", "0002");
        Estagiario a3 = new Estagiario("Zaion", "0003");
        Estagiario a4 = new Estagiario("Joice", "0004");

        estagiarios.add(a1);
        estagiarios.add(a2);
        estagiarios.add(a3);
        estagiarios.add(a4);

        //Adicionar Professores
        Mentor p1 = new Mentor("Mineda", "id-001", "Backend developer");
        Mentor p2 = new Mentor("Adriana", "id-002", "Backend developer");

        mentores.add(p1);
        mentores.add(p2);

        //Adicionar Cursos
        Curso c1 = new Curso("Banco de Dados", "Sala-02", "T.I");
        Curso c2 = new Curso("Engenharia de Software", "Sala-Virtual(Teams)", "T.I");

        cursos.add(c1);
        cursos.add(c2);

        mapaCursoEstagiario.put(a1, c1);
        mapaCursoEstagiario.put(a2, c1);
        mapaCursoEstagiario.put(a3, c2);
        mapaCursoEstagiario.put(a4, c2);

        mapaCursoMentor.put(p1, c2);
        mapaCursoMentor.put(p2, c1);

        System.out.println(mapaCursoMentor);
        System.out.println(mapaCursoEstagiario);

        Estagiario est = a1;
        Curso curso =(Curso)mapaCursoEstagiario.get(est);
        System.out.println(est.toString()+ " | " + curso.toString());

        Mentor ment = p1;
        Curso cur = (Curso)mapaCursoMentor.get(ment);
        System.out.println(ment.toString()+ " | " + cur.toString());
    }
}

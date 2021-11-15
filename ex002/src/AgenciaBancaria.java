import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaBancaria {
    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Map <String, Conta> mapaContas = new HashMap();
        Set <String> CPFClientes = new HashSet();

        //Adicionar Pessoa
        Pessoa p1 = new Pessoa("059.751.888-55", "Gabriel");
        Pessoa p2 = new Pessoa("555.222.333-58", "Luciana");
        Pessoa p3 = new Pessoa("026.598.514-78", "Lucas");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        //Adicionar contas
        Conta c1 = new Conta(101, 200.0, p1.getNome());
        Conta c2 = new Conta(202, 200.0, p2.getNome());
        Conta c3 = new Conta(303, 200.0, p3.getNome());

        contas.add(c1);
        contas.add(c2);
        contas.add(c3);


        for (Pessoa pessoa : pessoas) {
            CPFClientes.add(pessoa.getCpf());
        }


        //Relacionando CPF à conta
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            Conta conta = contas.get(i);
            mapaContas.put(pessoa.getCpf(), conta);

        }


        System.out.println(CPFClientes);

        //Retorna os dados do Cliente através do CPF
        String cpf = "059.751.888-55";
        Conta conta =(Conta)mapaContas.get(cpf);
        System.out.println("CPF: " + cpf + ", " + conta.toString());
    }

}

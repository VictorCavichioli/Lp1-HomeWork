import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AgenciaViagens {
    public static void main(String[] args) {
        ArrayList<Lugar> destinos = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Map <String, Lugar> mapaViagem = new HashMap();
        Set <String> CPFClientes = new HashSet();

        //Adicionar Clientes
        Pessoa p1 = new Pessoa("155.777.132-40", "Gabriel");
        Pessoa p2 = new Pessoa("400.289.224-45", "Luciana");
        Pessoa p3 = new Pessoa("123.456.789-77", "Lucas");

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        Lugar d1 = new Lugar("Praia Domingas Dias", "Caraguatatuba", "Praia");
        Lugar d2 = new Lugar("Parque da cidade", "São José", "Parque da Cidade");
        Lugar d3 = new Lugar("Pavilhão", "Centro da juventude", "Pista de skate em SJC");

        destinos.add(d1);
        destinos.add(d2);
        destinos.add(d3);

        for (Pessoa pessoa : pessoas) {
            CPFClientes.add(pessoa.getCpf());
        }
        for (int i = 0; i < pessoas.size(); i++) {
            Pessoa pessoa = pessoas.get(i);
            Lugar lugar  = destinos.get(i);
            mapaViagem.put(pessoa.getCpf(), lugar);

        }

        System.out.println(CPFClientes);

        //Retorna os dados do Cliente através do CPF
        String cpf = "155.777.132-40";
        Lugar lugar =(Lugar)mapaViagem.get(cpf);
        System.out.println("CPF: " + cpf + " | " + lugar.toString());

    }
}

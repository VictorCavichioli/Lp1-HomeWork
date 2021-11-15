import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Concessionaria{

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        ArrayList<Carro> concessionaria = new ArrayList<Carro>();

        HashMap lst_carros = new HashMap();

        Carro car;

        int qtd;
        System.out.println("Informe a quantidade que irá ser cadastrada:");
        qtd = t.nextInt();

        for (int i=1;i<=qtd;i++)
        {
            car = new Carro();
            System.out.println("Insira os dados do carro: " + i);
            System.out.println("Modelo: ");
            car.setModelo(t.next());
            System.out.println("Placa: ");
            car.setPlaca(t.next());
            System.out.println("Preço: ");
            car.setPreco((double) t.nextFloat());
            concessionaria.add(car);
            lst_carros.put(car.getPlaca(), car);

        }

        for (int i=0;i<concessionaria.size();i++)
        {
            car=(Carro)concessionaria.get(i);
            System.out.println(
                    " | " +
                    "Modelo: " + car.getModelo() +
                    " | " +
                    "Placa: " + car.getPlaca());

        }
        for (int i=0;i<concessionaria.size();i++)
        {
            car=(Carro)concessionaria.get(i);
            System.out.println("Placa: " + car.getPlaca() + ": " +
                    car.getPreco());

        }

        System.out.println("Consulte os dados do carro pela placa: ");
        String plc = t.next();
        car = (Carro)lst_carros.get(plc);
        System.out.println(" | "+ car.getModelo()+" | " + car.getPreco());

    }

}
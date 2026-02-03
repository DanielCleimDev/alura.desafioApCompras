import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;

        System.out.println("Digite o valor do limite: ");
        Cartao cartao = new Cartao(Double.parseDouble(scanner.nextLine()));

        List<Compra> compras = new ArrayList<>();

        while (menu){
            System.out.println("Informe a Descrição da compra: ");
            String descricao = scanner.nextLine();
            System.out.println("Informe o Valor: ");
            double valor = Double.parseDouble(scanner.nextLine());

            if(cartao.compra(valor)){
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Descrição: " + descricao + " Valor: " + valor);
                Compra compra = new Compra(descricao, valor);
                compras.add(compra);
            }else{
                System.out.println("Compra não realizada");
                System.out.println("Limite disponível: " + cartao.getLimite());

            }

            System.out.println("Deseja realizar outra compra?");
            System.out.println("Digite S para sim ou N para não: ");
            String opcao = scanner.nextLine();
            if (Objects.equals(opcao, "N")){
                menu = false;
            }
        }

        System.out.println(compras);
        System.out.println("Limite Atual: " + cartao.getLimite());
        scanner.close();
    }

}
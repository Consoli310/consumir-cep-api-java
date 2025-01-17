package Program;

import Entity.Endereco;
import Services.EnderecoService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu cep:");
        String cep = sc.nextLine();

        Endereco endereco = new Endereco();
        EnderecoService service = new EnderecoService();

        endereco = service.getEndereco(cep);

        System.out.println(endereco.toString());
    }
}

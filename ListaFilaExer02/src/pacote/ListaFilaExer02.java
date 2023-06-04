package pacote;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ListaFilaExer02 {

	public static void main(String[] args) {
//		02 - Implemente um programa que contemple uma fila de contatos para um callcenter. 
//As opções do programa devem ser:
//		Inserir Contato: Deve solicitar ao usuário os dados e incluir o contato na fila;
//		Próximo Contato: Deverá pegar o Contato do Início da Fila, removê-lo e mostrar os seus dados na tela para o usuário efetuar o contato com o cliente.
//		Sair.

		Scanner numeroContato = new Scanner(System.in);
		Scanner nomeContato = new Scanner(System.in);
		Scanner opcaoUsuario = new Scanner(System.in);
		Queue<String> objetoFilaContato =  new LinkedList<String>(); 
			if(objetoFilaContato.isEmpty()) {
			System.out.println("Sua fila está vazia!");
		}else {
			System.out.println("Fila cheia!");
		}
		int qtd=0;
		do {
			System.out.print("Usuário escolha a opção"
					+ "\n(1) Inserir Contato"
					+ "\n(2) Próximo Contato"
					+ "\n(3) Sair"
					+ "\n(4) Sair");

			int operacao = opcaoUsuario.nextInt();
			switch(operacao) {
			//adicionar
			case 1:
			//recebe Dados para do contato e os adiciona a fila
				String nomeContatoRecebido = recebeDadosContato(nomeContato, numeroContato);
			    objetoFilaContato.add(nomeContatoRecebido);
				System.out.println("Contato adicionado!");;
			   System.out.println("Sua fila é:");
				Iterator<String>objetoInterator1 = objetoFilaContato.iterator();
				while(objetoInterator1.hasNext()) {
					System.out.println(objetoInterator1.next());
				}
				break;
			case 2:					
//		//próximo contato
		//pega o primeiro contato e o salva
		//exclui o primeiro contato da lista e mostra para o usuário o contato que foi excluído.		
		String contatoguardado = objetoFilaContato.peek();
		objetoFilaContato.remove();
		System.out.println("Primerio contato da lista removido");
		System.out.println("O Primeiro contato da lista era: " + contatoguardado);
		break;
			case 3:
//				//sair
				qtd = 10;	
 break;
			default:
				System.out.println("Operação inválida!!!!");
			}

		}while(qtd<5);
		opcaoUsuario.close();
	System.out.println("Saiu do menu!");
	}
	public static String recebeDadosContato(Scanner nomeContato, Scanner numeroContato){
		System.out.println("Usuário qual o nome do aluno?");
		String nomeRecebido= nomeContato.nextLine();
		System.out.println("Usuário qual numero do contato?");
		int numeroRecebido = numeroContato.nextInt();
		String dadosRecebidos = "Nome do contato: " + nomeRecebido+ "|Número do contato: " + numeroRecebido;
		return dadosRecebidos;
	}
		
	}
	


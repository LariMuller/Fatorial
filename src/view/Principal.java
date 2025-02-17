package view;

import javax.swing.JOptionPane;

import controller.FatorialController;

/* 
3. Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
	recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
	O código deve trazer como comentários:
	A condição de parada
	Como escrever a função para o termo n em função do termo anterior
*/

public class Principal {
	public static void main(String[] args) {
		FatorialController fat = new FatorialController();
		int num = 0;
		do{
		 num = Integer.parseInt(JOptionPane.showInputDialog("Insira um número para fatoriar: (Deve ser entre 1 e 12)"));
		 if (num < 1 || num > 12) {
			 JOptionPane.showMessageDialog(null, "Número inválido");
		 }
		} while(num < 1 || num > 12);
		JOptionPane.showMessageDialog(null, "O fatorial de " + num + " é igual a " + fat.getFat(num));
	}
}

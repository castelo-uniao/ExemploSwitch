package exemploswitch;
import javax.swing.JOptionPane;
/*
 * Switch permite a execu��o de comandos conforme uma express�o, em uma estrutura de decis�es m�ltiplas.
 * Um comando switch pode substituir if/else.
 * Um exemplo de aplica��o switch � na exibi��o de menus
 * 
 * Formato:
 * switch (express�o) {
 * 		case constante1: comando;
 * 		break;
 * }
 */
public class ExemploSwitch {
	public static void main(String[] args) {
		String letra = JOptionPane.showInputDialog("Informe uma letra. Ex.: a");
		String mensagem = "Voc� informou a letra " + letra;
		JOptionPane.showMessageDialog(null, mensagem);
		
		String mensagem1 = "Linguagem Assembly";
		String mensagem2 = "Linguagem Basic";
		String mensagem3 = "Linguagem C++";
		String mensagem4 = "Linguagem Java";
		String mensagem5 = "Linguagem Pascal";
		String mensagem6 = "Linguagem Desconhecida";
		
		switch(letra) {
			case "a":
			case "A": JOptionPane.showMessageDialog(null, mensagem1);
				break;
			case "b":
			case "B": JOptionPane.showMessageDialog(null, mensagem2);
				break;
			case "c":
			case "C": JOptionPane.showMessageDialog(null, mensagem3);
				break;
			case "j":
			case "J": JOptionPane.showMessageDialog(null, mensagem4);
				break;
			case "p":
			case "P": JOptionPane.showMessageDialog(null, mensagem5);
				break;
			default: JOptionPane.showMessageDialog(null, mensagem6);
		}
	}
}

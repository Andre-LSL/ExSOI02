package view;
import javax.swing.JOptionPane;
import controller.DistoController;

public class classeMain {
    public static void main (String [] args) {
        DistoController metodos = new DistoController();
        String[] opcoes = {"Ver informações Linux", "Sair"};

        int cd = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, null);
        while (cd != 1) {
            switch (cd) {
                case 0:
                    metodos.exibeRegistro();
                    break;
                default:
                    break;
            }
        }
    }
}

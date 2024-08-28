package view;
import controller.RedesController;
import javax.swing.JOptionPane;
    public class ClasseMain {
        public static void main (String [] args ) {
            RedesController mController = new RedesController();
            int opcao = 0;
            while (opcao != 9) {
                opcao = Integer.parseInt(JOptionPane.showInputDialog("Menu \n" 
                                        + "1 - Configuração do IP \n"
                                        + "2 - Chamada Ping \n" 
                                        + "9 - Sair"));
                switch (opcao) {
                    case 1:
                        mController.ip();
                        break;
                    case 2:
                        mController.ping();
                    break;
                    default:
                        break;
                }
            }
        }
}

package view;
import javax.swing.JOptionPane;

import controller.KillController;

public class ClasseMain {
    public static void main (String [] args) {
        KillController m = new KillController();
        int cd = 0;
        String idProcesso = "";
        while(cd != 9) {
            cd = Integer.parseInt(JOptionPane.showInputDialog("Menu \n" + "1 - Listar processos \n" 
                                                            + "2 - Encerrar processo por nome \n" 
                                                            + "3 - Encerrar processos por PID \n"
                                                            + "9 - Sair" ));
            switch (cd) {
                case 1:
                m.listaProcessos();
                    break;
                case 2:
                idProcesso = JOptionPane.showInputDialog("Digite o nome do processo que deseja encerrar.");
                m.encerrarNome(idProcesso);
                break;
                case 3:
                idProcesso = JOptionPane.showInputDialog("Digite o PID do processo que deseja encerrar.");
                m.encerrarPID(idProcesso);
                break;
                default:
                    break;
            }
        }
    }
}

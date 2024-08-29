package controller;
import java.io.*;

import javax.swing.JOptionPane;

public class DistoController {
    public DistoController() {
        super();
    }

    private String so() {
        return System.getProperty("os.name");
    }

    public void exibeRegistro () {
        String SO = so(), cd = "";

        if (SO.contains("Windows")) {
            JOptionPane.showMessageDialog(null, "Sistema Windows, encerrando programa. Execute no SO Linux.");
            System.exit(0);
        }  else if (SO.contains("Linux")) {
            cd = "cat /etc/os-release";
        }
            String[] comandoArr = cd.split(" ");
        	try {
			Process processo = Runtime.getRuntime().exec(comandoArr);
			InputStream fluxo = processo.getInputStream();
			InputStreamReader leitor = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leitor);
			
			String linha = buffer.readLine();
			while(linha != null) {
				System.out.println(linha.trim());
				linha = buffer.readLine();
			}
        } catch (Exception e) {

        }
    } 
}

package controller;

public class RedesController {

    public RedesController() {
        super();
    }

    private String os() {
        return System.getProperty("os.name");
    }

    public void ip() {
        String SO = os();
        String cd = "";
        if (SO == "Windows") {
            cd = "ipconfig";
        } else if (SO == "Linux") {
            cd = "ifconfig";
        }
        String[] procDados = 
        try {
            Runtime.getRuntime().exec();
        } catch (Exception e) {
            
        }
    }


}

package unipe.aula.com.josiasandroidestagio_01;

public class ControllerPerfil {

    private static ControllerPerfil instance = null;
    private String value;

    private ControllerPerfil(){

    }

    public static ControllerPerfil getInstance(){
        if(instance == null){
            instance = new ControllerPerfil();
        }
        return instance;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}

package unipe.aula.com.josiasandroidestagio_01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by João Marcus on 15/03/2017.
 */

public class Contatos {

    public static List<Contato> getListaAtual(){
        List<String> contatoNomeList = new ArrayList<>();
        contatoNomeList.add("EU");
        contatoNomeList.add("ODEIO");
        contatoNomeList.add("JAVA");
        contatoNomeList.add("JAVA É UMA");
        contatoNomeList.add("BOSTA");
        contatoNomeList.add("URSINHOSCARINHOSOS");

        List<String> contatoTelList = new ArrayList<>();
        contatoTelList.add("66666666");
        contatoTelList.add("66666666-1");
        contatoTelList.add("66666666-2");
        contatoTelList.add("66666666-3");
        contatoTelList.add("66666666-4");
        contatoTelList.add("66666666-5");

        List<Contato> listContacts = new ArrayList<>();

        for(int i = 0; i < contatoNomeList.size() && i < contatoTelList.size(); i++){
            Contato c = new Contato();
            c.setNome(contatoNomeList.get(i));
            c.setTelefone(contatoTelList.get(i));
            listContacts.add(c);
        }
        return listContacts;
    }
}

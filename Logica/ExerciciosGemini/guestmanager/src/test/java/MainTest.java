import java.util.ArrayList;

import com.vitorotto.GuestController;
import com.vitorotto.GuestModel;
import com.vitorotto.GuestView;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<GuestModel> lista01 = new ArrayList<>();

        GuestController repository = new GuestController(lista01);
        GuestView view = new GuestView(null, repository);

        System.out.println("Adicionando Teste na lista e exibindo ela");
        repository.addGuest(new GuestModel("Teste", 12));
        view.showGuestsListView();

        System.out.println("\nAdicionando Teste 2 na lista e exibindo ela");
        repository.addGuest(new GuestModel(("Teste 2"), 10));
        view.showGuestsListView();

        System.out.println("\nRemovendo convidado Teste e exibindo a lista");
        repository.removeGuestByName("Teste");
        view.showGuestsListView();

        System.out.println("\nPesquisando convidado pela posição");
        GuestModel user0 = repository.findGuestByName("Teste 2");
        System.out.println(user0.toString());

        System.out.println("\nVerificando existencia de convidado Teste 2 e Juliana");
        System.out.println(repository.existingGuest("Teste 2"));
        System.out.println(repository.existingGuest("Juliana"));
    }
}

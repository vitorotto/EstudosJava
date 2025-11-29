import java.util.ArrayList;

import com.vitorotto.controllers.GuestController;
import com.vitorotto.models.GuestModel;
import com.vitorotto.views.GuestView;

public class MainTest {
    public static void main(String[] args) {
        ArrayList<GuestModel> lista01 = new ArrayList<>();

        GuestController controller = new GuestController(lista01);
        GuestView view = new GuestView(null, controller);

        System.out.println("Adicionando Teste na lista e exibindo ela");
        controller.addGuest("Teste", 12);
        view.showGuestsListView();

        System.out.println("\nAdicionando Teste 2 na lista e exibindo ela");
        controller.addGuest("Teste 2", 10);
        view.showGuestsListView();

        System.out.println("\nRemovendo convidado Teste e exibindo a lista");
        controller.removeGuestByName("Teste");
        view.showGuestsListView();

        System.out.println("\nPesquisando convidado pela posição");
        GuestModel user0 = controller.findGuestByName("Teste 2");
        System.out.println(user0.toString());

        System.out.println("\nVerificando existencia de convidado Teste 2 e Juliana");
        System.out.println(controller.existingGuest("Teste 2"));
        System.out.println(controller.existingGuest("Juliana"));
    }
}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Controller {

    @Autowired
    private Service ProduitsProxy;

    @RequestMapping("/")
    public String accueil(Model model){

        List<Product> produits =  ProduitsProxy.listeDesProduits();

        model.addAttribute("produits", produits);

        return "Accueil";
    }

}
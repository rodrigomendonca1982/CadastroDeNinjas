package mb.cmatfn.epsd.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MissoesController {

    @GetMapping("/exibirmissoes")
    public String ExibirMissao(){
        return  "Missoes Ninja";


    }
}

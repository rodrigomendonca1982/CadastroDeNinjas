package mb.cmatfn.epsd.CadastroDeNinjas.Missoes;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    //GET -- Mandar uma requisicao para MOSTRAR as missoes
    @GetMapping("/listar")
    public String listarMissao(){
        return "Missoes listadas com sucesso";
    }

    //POST -- Mandar uma requisicao para CRIAR as missoes
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso";

    }
    //PUT -- Mandar uma requisicao para ALTERAR as missoes
    @PutMapping("/alterar")
    public String alterarMissao(){
        return "Missao alterada com sucesso";
    }
    //DELETE -- Mandar uma requisicao para DELETAR as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso";
    }
}

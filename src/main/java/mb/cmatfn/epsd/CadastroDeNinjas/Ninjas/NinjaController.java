package mb.cmatfn.epsd.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }



    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Esta é a minha primeira mensagem nessa rota";

    }

    // Adicionar Ninja
    @PostMapping("/criar")
    public String criarNinja() {
        return "Ninja Criada com sucesso";
    }

    // Mostrar todos os Ninja
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas() {
        return ninjaService.listarNinjas();
    }

    // Ninja por ID
    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjasPorID(@PathVariable Long id) {
        return ninjaService.listarNinjasPorId(id);
    }


    // Alterar dados dos Ninja  por ID
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Ninja Deletado por ID";
    }
}
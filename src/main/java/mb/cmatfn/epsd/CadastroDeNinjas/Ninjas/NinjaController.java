package mb.cmatfn.epsd.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/ninjas")
public class NinjaController {

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
    @PostMapping("/listar")
    public String mostrarTodosOsNinjas() {
        return "Mostrar Ninja";
    }

    // Ninja por ID
    @PostMapping("/listarID")
    public String mostrarTodosOsNinjasPorID() {
        return "Mostrar Ninjas por ID";
    }


    // Alterar dados dos Ninja  por ID
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Alterar Ninja por ID";
    }

    // Deletar Ninja
    @DeleteMapping Mapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Ninja Deletado por ID";
    }
}
package mb.cmatfn.epsd.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//Entity ele transforma uma classe em uma entidade do BD
//JPA = Java Persistence API

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor //lombok cria
@AllArgsConstructor // lomobk cria
@Data // lombok cria so get and setter

public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;

    @Column(unique = true)
    private String email;


    private int idade;

    //@ManyToOne: Recupera as Missoes: Muitas missoes para um Ninja
    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;


}

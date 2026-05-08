package mb.cmatfn.epsd.CadastroDeNinjas.Ninjas;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mb.cmatfn.epsd.CadastroDeNinjas.Missoes.MissoesModel;

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
    @Column(name = "id")
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    //@ManyToOne: Recupera as Missoes: Muitas missoes para um Ninja
git    @ManyToOne
    @JoinColumn(name = "missoes_id") // Foreing Key ou chave estrangeira
    private MissoesModel missoes;


}

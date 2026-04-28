package mb.cmatfn.epsd.CadastroDeNinjas.Missoes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mb.cmatfn.epsd.CadastroDeNinjas.Ninjas.NinjaModel;

@Entity
@Table(name = "tb_missoes")

//LOMBOK
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    private String nome;

    private String dificuldade;

    // @OneToMany : Recupera uma lista de Ninjas: Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    private NinjaModel ninja;

}

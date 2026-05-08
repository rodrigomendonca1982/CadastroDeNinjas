package mb.cmatfn.epsd.CadastroDeNinjas.Ninjas;

import mb.cmatfn.epsd.CadastroDeNinjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel,Long> {
}

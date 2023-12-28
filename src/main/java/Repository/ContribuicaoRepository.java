
package Repository;



import Model.Contribuicao;
import Model.Fiel;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContribuicaoRepository extends JpaRepository<Contribuicao, Long> {
    List<Contribuicao> findByFiel(Fiel fiel);
}

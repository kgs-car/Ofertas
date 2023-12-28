
package Service;

import Model.Contribuicao;
import Repository.ContribuicaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContribuicaoService {
    @Autowired
    private ContribuicaoRepository contribuicaoRepository;

    public List<Contribuicao> listarContribuicoes() {
        return contribuicaoRepository.findAll();
    }
    // outras operações relacionadas a contribuições
}
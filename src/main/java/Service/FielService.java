package Service;

import Model.Fiel; 
import Repository.FielRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class FielService {
    @Autowired
    private FielRepository fieisRepository;

    public List<Fiel> listarFieis() {
        return fieisRepository.findAll();
    }
    public void salvar(Fiel joao){
        fieisRepository.save(joao);
    }
}





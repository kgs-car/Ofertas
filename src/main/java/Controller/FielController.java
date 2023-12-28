
package Controller;

import Model.Fiel;
import Service.FielService;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// MembroController.java
@Controller
@RequestMapping("/fieis")
public class FielController {
    @Autowired
    private FielService FielService;

    @GetMapping
    public String listarFieis(Model model) {
        model.addAttribute("fieis", FielService.listarFieis());
        return "fieis_listar";
        
    }
    @PostMapping
    public String inserir(int cpf, String nome, String endereco, int datadenascimento, Model model){
        Fiel joao = new Fiel(nome, endereco, datadenascimento, cpf);
        FielService.salvar(joao);
        model.addAttribute("fieis", FielService.listarFieis());
        return "fieis_listar";
    }
}




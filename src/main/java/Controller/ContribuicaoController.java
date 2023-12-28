
package Controller;

import org.springframework.ui.Model;
import Service.ContribuicaoService;
import Service.FielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


// ContribuicaoController.java
@Controller
@RequestMapping("/contribuicoes")
public class ContribuicaoController {
    @Autowired
    private ContribuicaoService contribuicaoService;
    @Autowired
    private FielService fielService;

    @GetMapping
    public String listarContribuicoes(Model model) {
        model.addAttribute("contribuicoes", contribuicaoService.listarContribuicoes());
        model.addAttribute("membros", fielService.listarFieis());
        return "contribuicoes_listar";
    }
    // outras operações relacionadas a contribuições
}

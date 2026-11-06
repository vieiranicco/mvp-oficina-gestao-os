package com.oficina.gestao_os.controller;

import org.springframework.ui.Model;
import java.util.List;
import com.oficina.gestao_os.model.OrdemServico;
import com.oficina.gestao_os.model.Veiculo;
import com.oficina.gestao_os.repository.OrdemServicoRepository;
import com.oficina.gestao_os.repository.VeiculoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

@Controller
public class OrdemServicoController {

    private final VeiculoRepository veiculoRepository;
    private final OrdemServicoRepository osRepository;

    public OrdemServicoController(VeiculoRepository veiculoRepository, OrdemServicoRepository osRepository) {
        this.veiculoRepository = veiculoRepository;
        this.osRepository = osRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        // Busca todas as ordens de serviço no banco de dados
        List<OrdemServico> ordens = osRepository.findAll();

        // Envia essa lista para a tela HTML com o nome "ordens"
        model.addAttribute("ordens", ordens);

        return "index";
    }

    @GetMapping("/nova-os")
    public String novaOsForm() {
        return "nova-os";
    }

    @PostMapping("/nova-os")
    public String salvarOs(@RequestParam String matricula,
                           @RequestParam String marcaModelo,
                           @RequestParam String clienteReferencia,
                           @RequestParam String descricao,
                           @RequestParam BigDecimal valorTotal) {

        Veiculo veiculo = veiculoRepository.findByMatricula(matricula).orElseGet(() -> {
            Veiculo novo = new Veiculo();
            novo.setMatricula(matricula);
            novo.setMarcaModelo(marcaModelo);
            novo.setClienteReferencia(clienteReferencia);
            return veiculoRepository.save(novo);
        });

        OrdemServico os = new OrdemServico();
        os.setVeiculo(veiculo);
        os.setDescricao(descricao);
        os.setValorTotal(valorTotal);
        osRepository.save(os);

        return "redirect:/";
    }
}
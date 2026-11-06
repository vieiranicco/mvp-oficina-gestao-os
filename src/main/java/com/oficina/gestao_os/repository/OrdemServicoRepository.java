package com.oficina.gestao_os.repository;

import com.oficina.gestao_os.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface OrdemServicoRepository extends JpaRepository<OrdemServico, Long> {
    List<OrdemServico> findByVeiculoIdOrderByDataRegistoDesc(Long veiculoId);
}
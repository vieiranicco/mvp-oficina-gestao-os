package com.oficina.gestao_os.repository;

import com.oficina.gestao_os.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface VeiculoRepository extends JpaRepository<Veiculo, Long> {
    Optional<Veiculo> findByMatricula(String matricula);
}
package com.oficina.gestao_os.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class OrdemServicoControllerTest {

    @Autowired
    private OrdemServicoController controller;

    @Test
    void deveCarregarControllerComSucesso() {
        assertNotNull(controller, "O controller da aplicação deve ser carregado pelo Spring com sucesso!");
    }
}
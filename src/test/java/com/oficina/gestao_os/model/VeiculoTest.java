package com.oficina.gestao_os.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VeiculoTest {

    @Test
    void deveCriarVeiculoComDadosValidos() {
        // Arrange
        Veiculo veiculo = new Veiculo();
        veiculo.setMatricula("ABC-1234");
        veiculo.setMarcaModelo("Ford Mondeo");
        veiculo.setClienteReferencia("Sr. João");

        // Act & Assert
        assertNotNull(veiculo);
        assertEquals("ABC-1234", veiculo.getMatricula());
        assertEquals("Ford Mondeo", veiculo.getMarcaModelo());
        assertEquals("Sr. João", veiculo.getClienteReferencia());
    }
}
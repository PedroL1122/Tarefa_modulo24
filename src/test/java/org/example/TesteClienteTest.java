package org.example;

import org.example.service.TesteCliente;
import org.junit.Assert;
import org.junit.Test;

public class TesteClienteTest {
    @Test
    public void testeClasseCliente() {

        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rod");
        cli.adicionarNome("Bella");

        Assert.assertEquals("Rod", cli.getNome());
    }
}

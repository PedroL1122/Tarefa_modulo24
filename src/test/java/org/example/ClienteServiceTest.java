package org.example;

import org.example.dao.ClienteDao;
import org.example.dao.ClienteDaoMock;
import org.example.dao.ContratoDao;
import org.example.dao.IContratoDao;
import org.example.mocks.ContratoDaoMock;
import org.example.service.ClienteService;
import org.example.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTeste() {
        IClienteDAO mockDAO = (IClienteDAO) new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest() {
        IClienteDAO mockDAO = new IClienteDAO() {
            @Override
            public String salvar() {
                return null;
            }
        };
        ClienteService service = new ClienteService(mockDAO);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}


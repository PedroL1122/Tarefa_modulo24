package org.example;
import org.example.dao.IContratoDao;
import org.example.dao.ContratoDao;

import org.example.service.ContratoService;
import org.example.service.IContratoService;
import org.junit.Assert;
import org.junit.Test;

public class ContratoServiceTest {

    @Test
    public void salvarTest(){
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarComBancoDeDadosTest(){
        IContratoDao dao = new ContratoDao();
        IContratoService service = new ContratoService();
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }
}

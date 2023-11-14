package org.example.service;

import org.example.dao.IClienteDAO;

public class ClienteService {

   private IClienteDAO clienteDao;


   public ClienteService(IClienteDAO clienteDao){
       this.clienteDao = clienteDao;
    }
    public String salvar(){
       return "Sucesso";
    }
}

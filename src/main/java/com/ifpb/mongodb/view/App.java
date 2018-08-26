package com.ifpb.mongodb.view;

import com.ifpb.mongodb.dao.PessoaDao;
import com.ifpb.mongodb.dao.VendaDao;
import com.ifpb.mongodb.model.ItemVenda;
import com.ifpb.mongodb.model.Pessoa;
import com.ifpb.mongodb.model.Produto;
import com.ifpb.mongodb.model.Venda;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        VendaDao daoVenda = new VendaDao();

        
        
//        db.venda.createIndex({codigo: 1})
        //      PessoaDao daoPessoa = new PessoaDao();
//
        //      daoPessoa.salvar(new Pessoa("222.222.222-02", "Maria", 19));
//
//      System.out.println(daoPessoa.listar());
//
//        System.out.println(dao.buscarPorCpf("XXX"));
//
//        dao.atualizar(new Pessoa("111.111.111-01",
//                "João Paulo", 22));

        
        /*
            Produto produto1 = new Produto(1, "Teclado", 30);
            Produto produto2 = new Produto(2, "Mouse", 20);
            Produto produto3 = new Produto(3, "monitor", 800);
            Produto produto4 = new Produto(4, "cpu", 1000);

            ItemVenda item1 = new ItemVenda(produto1, 1);
            ItemVenda item2 = new ItemVenda(produto2, 2);
            ItemVenda item3 = new ItemVenda(produto3, 2);
            ItemVenda item4 = new ItemVenda(produto4, 1);

            List<ItemVenda> itens = new ArrayList<>();
            itens.add(item1);
            itens.add(item2);
            itens.add(item3);
            itens.add(item4);

            Venda venda = new Venda(3, itens, LocalDateTime.now());
            daoVenda.salvar(venda);

            daoVenda.deletaCod(2);        
        */
        
        /*
            System.out.println(daoVenda.buscarCod(1));
            Produto produto4 = new Produto(4, "cpu", 1000);
            ItemVenda item4 = new ItemVenda(produto4, 1);
            daoVenda.inserirItemCod(1, item4);
            System.out.println(daoVenda.buscarCod(1));
        */
        

    }

}

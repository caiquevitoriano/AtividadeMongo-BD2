package com.ifpb.mongodb.dao;

import com.ifpb.mongodb.database.MongoConnectionPojo;
import com.ifpb.mongodb.model.Venda;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;


import java.util.ArrayList;
import java.util.List;

public class VendaDao {

    private MongoCollection collection;

    public VendaDao(){
        collection = new MongoConnectionPojo()
                .getCollection("Venda", Venda.class);
    }

    public void salvar(Venda venda){
        collection.insertOne(venda);
    }

    public List<Venda> listar(){
        MongoCursor cursor = collection.find().iterator();

        List<Venda> vendas = new ArrayList<>();

        while (cursor.hasNext()){
            vendas.add((Venda) cursor.next());
        }

        return vendas;
    }
    
     public Venda buscarCod(int cod) {
        Venda venda = (Venda) collection.find( eq("codigo", cod)).first(); 
        if(venda != null) {
            return venda;
        }else {
            return null;
        }
        
    }
     
    public boolean deletaCod(int cod){
        DeleteResult deleteOne = collection.deleteOne(eq ("codigo",codigo));
        return deleteOne.getDeletedCount() > 0;
    }

    


}

package com.ifpb.mongodb.dao;

import com.ifpb.mongodb.database.MongoConnectionPojo;
import com.ifpb.mongodb.model.ItemVenda;
import com.ifpb.mongodb.model.Venda;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.push;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
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
     
    public boolean deletarCod(int cod){        
        DeleteResult deleteOne = collection.deleteOne(eq ("codigo",cod));
        
        return deleteOne.getDeletedCount() > 0;
        
    }
    
    public boolean inserirItemCod(int cod, ItemVenda item){
        UpdateResult result = collection.updateOne(eq("codigo", cod), push("itens", item));        
                
        return result.getModifiedCount() > 0;
        
    }
    
}

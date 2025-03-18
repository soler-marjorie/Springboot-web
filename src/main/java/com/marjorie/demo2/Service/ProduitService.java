package com.marjorie.demo2.Service;

import com.marjorie.demo2.Model.Produit;
import com.marjorie.demo2.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProduitService {

    @Autowired
    private ProduitRepository produitRepository;

    public Iterable<Produit> getAllProduit(){
        return ProduitRepository.findAll();
    }

    //Méthode qui retourne un Livre par son id
    public Optional<Produit> getById(int id){
        return produitRepository.findById(id);
    }

}

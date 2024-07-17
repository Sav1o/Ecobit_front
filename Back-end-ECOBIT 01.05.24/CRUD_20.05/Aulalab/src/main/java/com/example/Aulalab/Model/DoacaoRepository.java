package com.example.Aulalab.Model;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoacaoRepository extends MongoRepository <Doacao, String> {

    //Doacao findById(int id);
}

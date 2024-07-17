package com.example.Aulalab.Service;

import com.example.Aulalab.Model.Doacao;
import com.example.Aulalab.Model.doacaoDTO;
import java.util.Optional;
import java.util.List;

public interface IDoacaoService {

    public Optional<Doacao> cadastrarDoa(doacaoDTO doacao);
    public Optional<Doacao> consultarPorId(String id);
    public List<Doacao> consultarDoacao();
    public doacaoDTO atualizaDoa(String id, doacaoDTO doacao);
    public void excluir(String id);

}
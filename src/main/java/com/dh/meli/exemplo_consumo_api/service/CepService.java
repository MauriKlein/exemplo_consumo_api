package com.dh.meli.exemplo_consumo_api.service;

import com.dh.meli.exemplo_consumo_api.dto.CepDto;
import com.dh.meli.exemplo_consumo_api.entity.Cep;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    public Cep encontrarEndereco(String cep){
        return new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", Cep.class).getBody();
    }



}

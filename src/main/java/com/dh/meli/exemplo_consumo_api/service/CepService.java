package com.dh.meli.exemplo_consumo_api.service;

import com.dh.meli.exemplo_consumo_api.dto.CepDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CepService {

    public CepDto encontrarEndereco(String cep){
        return new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", CepDto.class).getBody();
    }


}

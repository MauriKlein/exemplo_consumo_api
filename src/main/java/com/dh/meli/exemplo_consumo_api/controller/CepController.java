package com.dh.meli.exemplo_consumo_api.controller;

import com.dh.meli.exemplo_consumo_api.dto.CepDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("cep")
public class CepController {

    @GetMapping("consultaCep/{cep}")
    public ResponseEntity<CepDto> retornaEndereco(@PathVariable String cep){
        CepDto cepDto = new RestTemplate().getForEntity("https://viacep.com.br/ws/"+cep+"/json/", CepDto.class).getBody();

        return new ResponseEntity(cepDto, HttpStatus.OK);
    }

}

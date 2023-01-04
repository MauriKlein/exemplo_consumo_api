package com.dh.meli.exemplo_consumo_api.controller;

import com.dh.meli.exemplo_consumo_api.dto.CepDto;
import com.dh.meli.exemplo_consumo_api.entity.Cep;
import com.dh.meli.exemplo_consumo_api.service.CepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("cep")
public class CepController {

    @Autowired
    private CepService cepService;

    @GetMapping("consultaCep/{cep}")
    public ResponseEntity<CepDto> retornaEndereco(@PathVariable String cep){
        return new ResponseEntity(CepDto.convertToCepDto(cepService.encontrarEndereco(cep)), HttpStatus.OK);
    }

    @PostMapping("salvar")
    public CepDto salvarCep(@RequestBody CepDto cepDto){
        return cepDto;
    }

}

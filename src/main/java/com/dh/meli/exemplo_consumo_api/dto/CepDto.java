package com.dh.meli.exemplo_consumo_api.dto;

import com.dh.meli.exemplo_consumo_api.entity.Cep;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CepDto implements Serializable {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;

    public static CepDto convertToCepDto(Cep cep) {
        return CepDto.builder()
                .cep(cep.getCep())
                .logradouro(cep.getLogradouro())
                .complemento(cep.getComplemento())
                .bairro(cep.getBairro())
                .localidade(cep.getLocalidade())
                .uf(cep.getUf())
                .build();
    }

    public static Cep convertToCep(CepDto cepDto) {
        return Cep.builder()
                .cep(cepDto.getCep())
                .logradouro(cepDto.getLogradouro())
                .complemento(cepDto.getComplemento())
                .bairro(cepDto.getComplemento())
                .localidade(cepDto.getLocalidade())
                .uf(cepDto.getUf())
                .build();
    }
}

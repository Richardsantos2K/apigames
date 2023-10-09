package com.bootcampsantander.apigames.controllers;

/*
 * O controller vai ser a porta de entrada do nosso Back-end
 * ele ira disponibilizar nossa API
 * quem implementa a API é o controlador
 *
 * ou seja
 *
 * o front-end chama o back-end
 *
 * o controlador ira expor um end point(função) para o mundo exeterno
 *
 * o controller ira chamar o serviço, que por sua vez chamara o repository que por fim chamara o Banco de dados
 * */

import com.bootcampsantander.apigames.dto.GameDTO;
import com.bootcampsantander.apigames.dto.GameMinDTO;

import com.bootcampsantander.apigames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //dizendo que esta classe é um controlador

// o (value = "/games") é a configuração que fizemos para o caminho da nossa API
@RequestMapping (value = "/games") //vamos mapear o recurso agora
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){ //Para que o Id case com o Id que eu mandar na requisição colocamos uma anotation em frente ao parametro @PathVariable
        GameDTO result = gameService.findById(id);
        return result;

    }

    @GetMapping // como queremos que ele retorne algo do banco de dados ou seja um and point para buscar os objetos o metodo HTTP que usaremos é o GET
    public List<GameMinDTO> findAll(){

        List<GameMinDTO> result = gameService.findAll();
        return result;

    }


}
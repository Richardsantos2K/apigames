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


import com.bootcampsantander.apigames.dto.GameListDTO;
import com.bootcampsantander.apigames.dto.GameMinDTO;
import com.bootcampsantander.apigames.services.GameListService;
import com.bootcampsantander.apigames.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //dizendo que esta classe é um controlador
// o (value = "/lists") é a configuração que fizemos para o caminho da nossa API
@RequestMapping (value = "/lists") //vamos mapear o recurso agora
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;


    @GetMapping // como queremos que ele retorne algo do banco de dados ou seja um and point para buscar os objetos o metodo HTTP que usaremos é o GET
    public List<GameListDTO> findAll(){

        List<GameListDTO> result = gameListService.findAll();
        return result;

    }


    @GetMapping(value = "/{listId}/games") // como queremos que ele retorne algo do banco de dados ou seja um and point para buscar os objetos o metodo HTTP que usaremos é o GET
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }



}
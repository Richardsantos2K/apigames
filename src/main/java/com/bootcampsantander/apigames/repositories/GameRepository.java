package com.bootcampsantander.apigames.repositories;

import com.bootcampsantander.apigames.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

    //repository: OBJETO RESPONSAVEL POR FAZER CONSULTAS NO BANCO DE DADOS

    //Game repository ira fazer o acesso aos dados

    /*usaremos o repository da Jpa do Spring, OBS: DENTRO DO <"">,
    COLOCAMOS O TIPO DA ENTIDADE QUE É "Game" e
    depois o tipo do Id da entidade que é Long COMO ESTA NA CLASSE GAME NA PASTA entities.

    só com isto teremos um componete que ira fazer consulta com o banco,
    ira inserir dados no banco, atualizar, deletar e etc, que são as operações basicas
    que ja vem dentro do JpaRepository do spring boot.
    */

    public interface GameRepository extends JpaRepository <Game, Long>{



    }

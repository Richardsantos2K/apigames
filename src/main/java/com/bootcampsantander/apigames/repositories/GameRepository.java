package com.bootcampsantander.apigames.repositories;

import com.bootcampsantander.apigames.entities.Game;
import com.bootcampsantander.apigames.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

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

        @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
		List<GameMinProjection> searchByList(Long listId);

    }

package com.bootcampsantander.apigames.entities;


import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

// classe auxiliar para representar uma chave primaria multipla com mais de um atributo

@Embeddable // ira representar dois campos na tabela do nosso modelo relacional, estamos encapsulando dois atributos em uma classe só
public class BelongingPK { //primary Key

    @ManyToOne// muitos para um: ira fazer o mapeamento do objetos relacionais representando o nosso diagrama de classes muitos para um
    @JoinColumn(name = "game_id")// criara uma coluna
    private Game game;

    @ManyToOne// muitos para um
    @JoinColumn(name = "list_id")
    private GameList list;




    public BelongingPK(){
    }

    public BelongingPK(Game game, GameList list) {
        this.game = game;
        this.list = list;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public GameList getList() {
        return list;
    }

    public void setList(GameList list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BelongingPK that = (BelongingPK) o;
        return game.equals(that.game) && list.equals(that.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(game, list);
    }
}
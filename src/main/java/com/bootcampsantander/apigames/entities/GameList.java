package com.bootcampsantander.apigames.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_game_list")
public class GameList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//a anotação @GeneratedValue com a estratégia GenerationType.IDENTITY é usada para gerar automaticamente os valores do campo "ID" com base na estratégia de identidade do banco de dados.
    private Long Id;
    private String name;

    public GameList(){
    }

    public GameList(Long id, String name) {
        this.Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameList gameList = (GameList) o;
        return Id.equals(gameList.Id) && Objects.equals(name, gameList.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id);
    }
}
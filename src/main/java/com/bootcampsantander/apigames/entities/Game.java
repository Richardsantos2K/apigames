package com.bootcampsantander.apigames.entities;

import jakarta.persistence.*;


import java.util.Objects;

@Entity// configura a classe java para que ela se transforme em uma tabela de um banco de dados relacional
@Table(name = "tb_game")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //define a estratégia de geração automática de valores para a chave primária de uma entidade no JPA. private Long id é um campo privado que geralmente armazena a chave primária da entidade.
    private Long id;


    private String title;

    @Column(name = "game_year")//customizando o nome da coluna no banco
    private Integer year;


    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;

    @Column(columnDefinition = "TEXT")// Pelo texto ser acima de 255 caracteres devemos fazer isso para que a JPA aceite nossa descrição dos jogos, estamos definindo eles como tipo testo dentro do nosso Banco de dados

    private String shortDescription;

    @Column(columnDefinition = "TEXT")
    private String longDescription;


    public Game(){

    }

    public Game(Long id, String title, Integer year, String genre, String platforms,
                Double score, String imgUrl, String shortDescription, String longDescription){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Game game = (Game) o;
        return Objects.equals(id, game.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
package com.bootcampsantander.apigames.dto;


import com.bootcampsantander.apigames.entities.Game;
import org.springframework.beans.BeanUtils;

public class GameDTO {

    //Estamos a fazer o GameDTO por padronização

    //e estamos a evitar os problemas de padronização siclicas em objetos


    //o DTO Não é mapeado com o banco, pois é uma classe independente

    //colocamos apenas os dados que nos interessa

    private Long id;
    private String title;
    private Integer year;
    private String genre;
    private String platforms;
    private Double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {
    }

    public GameDTO(Game entity) { //geraremos um GameDTO copiando os dados da Entidade do banco de dados,
        // ou seja, instanciamos o GameDTO apartir de um objeto game, copiando os dados do Game para o DTO

        BeanUtils.copyProperties(entity, this); /* comando do framework que utiliza todos os atributos da classe Game
        e usa dentro do construtor facilitando a digitação*/
    }


    // precisaremos de getters e setters neste DTO, para obter com GET e alterar com SET


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
}


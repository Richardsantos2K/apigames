package com.bootcampsantander.apigames.dto;


import com.bootcampsantander.apigames.entities.Game;

public class GameMinDTO {


    //o DTO Não é mapeado com o banco pois é uma classe independente

    //colocamos apenas os dados que nos interessa

    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){

    }

    public GameMinDTO(Game entity) { //geraremos um GameMinDTO copiando os dados da Entidade do banco de dados
                                     // ou seja instanciamos o GameMinDTO apartir de um objeto game, copiando os dados do Game para o DTO


        id = entity.getId();// pegamos o id da indentidade salvamos ele no id do DTO

        //fazemos com o resto

        title = entity.getTitle(); //como n temos ambiguidade podemos tirar o this
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }


    // só precisaremos de getters no DTO

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    //



}

package com.bootcampsantander.apigames.dto;

import com.bootcampsantander.apigames.entities.GameList;
import org.springframework.beans.BeanUtils;

public class GameListDTO {

    private long id;
    private String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

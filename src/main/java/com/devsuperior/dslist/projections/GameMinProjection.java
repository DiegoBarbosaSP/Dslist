package com.devsuperior.dslist.projections;

import lombok.Getter;


public interface GameMinProjection {

    long getId();
    String getTitle();
    Integer getGameYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();


}

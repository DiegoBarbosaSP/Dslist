package com.devsuperior.dslist.projections;

import lombok.Getter;


public interface GameMinProjection {

    long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();


}

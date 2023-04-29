package com.crud.youha2.repository.v2;

import lombok.Data;

@Data
public class MovieUpdateDto {
    private String movieCd;
    private String movieNm;//영화명(한글)
    private String movieNmEn;//영화명(영문)
    private String showTm;//재생시간
    private String openDt;//개봉일
    private String typeNm;//영화유형
    private String nationNm;//제작국가명
    private String genreNm;//장르
    private String directorNm;//감독명
    private String peopleNm; //출연배우

    public MovieUpdateDto() {
    }

    public MovieUpdateDto(String movieCd, String movieNm, String movieNmEn, String showTm, String openDt, String typeNm, String nationNm, String genreNm, String directorNm, String peopleNm) {
        this.movieCd=movieCd;
        this.movieNm = movieNm;
        this.movieNmEn = movieNmEn;
        this.showTm = showTm;
        this.openDt = openDt;
        this.typeNm = typeNm;
        this.nationNm = nationNm;
        this.genreNm = genreNm;
        this.directorNm=directorNm;
        this.peopleNm = peopleNm;
    }
}


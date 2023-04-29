package com.crud.youha2.domain;


import lombok.Data;

@Data
public class MovieVO {
    private Integer movieId;
    private String movieCd;//영화코드
    private String movieNm;//영화명(한글)
    private String movieNmEn;//영화명(영문)
    private String showTm;//재생시간
    private String openDt;//개봉일
    private String typeNm;//영화유형
    private String nationNm;//제작국가명
    private String genreNm;//장르
    private String directorNm;//감독명
    private String peopleNm; //출연배우

    public MovieVO() {
    }

    public MovieVO(Integer movieId,String movieCd, String movieNm, String movieNmEn, String showTm, String openDt, String typeNm, String nationNm, String genreNm, String peopleNm) {
        this.movieId = movieId;
        this.movieCd = movieCd;
        this.movieNm = movieNm;
        this.movieNmEn = movieNmEn;
        this.showTm = showTm;
        this.openDt = openDt;
        this.typeNm = typeNm;
        this.nationNm = nationNm;
        this.genreNm = genreNm;
        this.peopleNm = peopleNm;
    }


}

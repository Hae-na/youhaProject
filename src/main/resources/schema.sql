drop table if exists movie cascade;
drop sequence if exists movie_seq;
create table movie
(
    movieId integer,
    movieCd varchar(70),
    movieNm varchar(50),
    movieNmEn varchar(50),
    showTm  varchar(110),
    openDt  varchar(110),
    typeNm varchar(50),
    nationNm varchar(60),
    genreNm varchar(60),
    directorNm varchar(60),
    peopleNm varchar(500)
);
create sequence movie_seq start with 1 increment by 1 no cache;
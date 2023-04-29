package com.crud.youha2.repository.mybatis;
import com.crud.youha2.domain.MovieVO;
import com.crud.youha2.repository.v2.MovieUpdateDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper
public interface MovieMapper {

    int register(MovieVO movie);
    void update(int movieId, MovieUpdateDto updateParam);
    List<MovieVO> movieList();
    Optional<MovieVO> findById(int movieId);
    int remove(int movieId);
}

package com.crud.youha2.service;
import com.crud.youha2.domain.MovieVO;
import com.crud.youha2.repository.v2.MovieUpdateDto;
import java.util.List;
import java.util.Optional;

public interface MovieRepository {
    int register(MovieVO movie);
    void update(int movieId, MovieUpdateDto updateParam);
    List<MovieVO> movieList();
    Optional<MovieVO> findById(int movieId);
    int remove(int movieId);
}

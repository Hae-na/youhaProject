package com.crud.youha2.repository.mybatis;

import com.crud.youha2.domain.MovieVO;
import com.crud.youha2.repository.v2.MovieUpdateDto;
import com.crud.youha2.service.MovieRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Slf4j
@Repository
@RequiredArgsConstructor
public class MyBatisMovieRepository implements MovieRepository {
    private final MovieMapper movieMapper;

    @Override
    public int register(MovieVO movie) {
        return movieMapper.register(movie);
    }

    @Override
    public void update(int movieId, MovieUpdateDto updateParam) {
        movieMapper.update(movieId,updateParam);
    }

    @Override
    public List<MovieVO> movieList() {
        return movieMapper.movieList();
    }

    @Override
    public Optional<MovieVO> findById(int movieId) {
        return movieMapper.findById(movieId);
    }

    @Override
    public int remove(int movieId) {
        return movieMapper.remove(movieId);
    }
}

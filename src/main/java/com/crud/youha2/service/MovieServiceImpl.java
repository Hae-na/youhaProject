package com.crud.youha2.service;


import com.crud.youha2.domain.MovieVO;
import com.crud.youha2.repository.v2.MovieUpdateDto;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {
    @Resource
    private MovieRepository movieRepository;
    @Override
    public int register(MovieVO movie) {
       return movieRepository.register(movie);
    }

    @Override
    public List<MovieVO> movieList() {
        return movieRepository.movieList();
    }

    @Override
    public void update(int movieId, MovieUpdateDto updateParam) {
        movieRepository.update(movieId,updateParam);
    }

    @Override
    public Optional<MovieVO> findById(int movieId) {
        return movieRepository.findById(movieId);
    }

    @Override
    public int remove(int movieId) {
        return movieRepository.remove(movieId);
    }
}

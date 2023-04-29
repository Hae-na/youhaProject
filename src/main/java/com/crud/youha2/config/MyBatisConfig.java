package com.crud.youha2.config;
import com.crud.youha2.repository.mybatis.MovieMapper;
import com.crud.youha2.repository.mybatis.MyBatisMovieRepository;
import com.crud.youha2.service.MovieRepository;
import com.crud.youha2.service.MovieService;
import com.crud.youha2.service.MovieServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class MyBatisConfig {
    private final MovieMapper movieMapper;
    @Bean
    public MovieService movieService(){
        return new MovieServiceImpl();
    }

    @Bean
    public MovieRepository movieRepository(){
        return new MyBatisMovieRepository(movieMapper);
    }

}


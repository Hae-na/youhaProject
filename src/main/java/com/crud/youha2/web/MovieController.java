package com.crud.youha2.web;


import com.crud.youha2.domain.MovieVO;
import com.crud.youha2.repository.v2.MovieUpdateDto;
import com.crud.youha2.service.MovieService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/api/v1/movies")
@RequiredArgsConstructor
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public String movies(Model m){
        List<MovieVO> movieArr = movieService.movieList();
        m.addAttribute("movieArr",movieArr);
        return "items";
    }


    @GetMapping("/{movieId}")
    public String movie(@PathVariable int movieId, Model m){
        MovieVO movie=movieService.findById(movieId).get();
        m.addAttribute("movie",movie);
        return "item";
    }

    @GetMapping("/{movieId}/delete")
    public String movieDelete(@PathVariable int movieId){
        int n=movieService.remove(movieId);
        return "redirect:/api/v1/movies";
    }

    @GetMapping("/add")
    public String addForm(){
        return "addForm";
    }

    @PostMapping("/add")
    public String save(@ModelAttribute MovieVO movie,RedirectAttributes redirectAttributes){
        int n=movieService.register(movie);
        redirectAttributes.addAttribute("movieId",movie.getMovieId());
        //redirectAttributes.addAttribute("status",true);
        return "redirect:/api/v1/movies/{movieId}";
    }


    @GetMapping("/{movieId}/edit")
    public String editForm(@PathVariable int movieId, Model model) {
        MovieVO movieVO=movieService.findById(movieId).get();
        model.addAttribute("movieVO", movieVO);
        return "editForm";
    }
    @PostMapping("/{movieId}/edit")
    public String edit(@PathVariable int movieId, @ModelAttribute MovieUpdateDto updateParam){
        movieService.update(movieId,updateParam);
        return "redirect:/api/v1/movies/{movieId}";
    }

}

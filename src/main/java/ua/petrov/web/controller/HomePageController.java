package ua.petrov.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.petrov.core.model.Movie;
import ua.petrov.core.model.Series;
import ua.petrov.core.model.User;
import ua.petrov.service.movie.MovieService;
import ua.petrov.service.series.SeriesService;
import ua.petrov.service.user.UserService;
import ua.petrov.web.constants.Page;

import java.util.List;

@Controller
public class HomePageController {

    @Autowired
    private MovieService movieService;

    @Autowired
    private SeriesService seriesService;

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/index.html", method = RequestMethod.GET)
    public String homePage() {
        return Page.INDEX;
    }

    @RequestMapping(value = "/movie", method = RequestMethod.GET)
    public String listMovies(ModelMap model) {
        List<Movie> movies = movieService.getAll();
        model.addAttribute("movies", movies);
        return Page.MOVIES;
    }

    @RequestMapping(value = "/series", method = RequestMethod.GET)
    public String listSeries(ModelMap model) {
        List<Series> series = seriesService.getAll();
        model.addAttribute("series", series);
        return Page.SERIES;
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String listUser(ModelMap model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return Page.USERS;
    }
}

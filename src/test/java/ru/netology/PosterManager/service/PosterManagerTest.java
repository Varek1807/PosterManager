package ru.netology.PosterManager.service;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PosterManagerTest {
    @Test
    public void filmPosterTest() {
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");
        manager.addNewFilm("Film6");
        manager.addNewFilm("Film7");
        manager.addNewFilm("Film8");
        manager.addNewFilm("Film9");
        String[] actual = manager.filmPoster();
        String[] expected = {"Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitTest() {
        PosterManager manager = new PosterManager(12);
        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");
        manager.addNewFilm("Film6");
        manager.addNewFilm("Film7");
        manager.addNewFilm("Film8");
        manager.addNewFilm("Film9");
        String[] actual = manager.limitFilms(3);
        String[] expected = {"Film9", "Film8", "Film7"};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void limitWithoutParameterTest() {
        PosterManager manager = new PosterManager();
        manager.addNewFilm("Film1");
        manager.addNewFilm("Film2");
        manager.addNewFilm("Film3");
        manager.addNewFilm("Film4");
        manager.addNewFilm("Film5");
        manager.addNewFilm("Film6");
        manager.addNewFilm("Film7");
        manager.addNewFilm("Film8");
        manager.addNewFilm("Film9");
        manager.addNewFilm("Film10");
        String[] actual = manager.limitFilms(10);
        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        assertArrayEquals(expected, actual);
    }

}

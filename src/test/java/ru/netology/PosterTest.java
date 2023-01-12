package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterTest {
    @Test
    public void checkingAddingMovies() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Фильм 1");
        manager.addPoster("Фильм 2");
        manager.addPoster("Фильм 3");
        manager.addPoster("Фильм 4");
        manager.addPoster("Фильм 5");

        String[] expected = {"Фильм 1", "Фильм 2", "Фильм 3", "Фильм 4","Фильм 5"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void addAnyNumberOfMovies() {
        PosterManager manager = new PosterManager();
        manager.addPoster("Фильм 1");
        manager.addPoster("Фильм 2");
        manager.addPoster("Фильм 3");
        manager.addPoster("Фильм 4");
        manager.addPoster("Фильм 5");
        manager.addPoster("Фильм 6");
        manager.addPoster("Фильм 7");
        manager.addPoster("Фильм 8");
        manager.addPoster("Фильм 9");
        manager.addPoster("Фильм 10");
        manager.addPoster("Фильм 11");
        manager.addPoster("Фильм 12");
        manager.addPoster("Фильм 13");
        manager.addPoster("Фильм 14");
        manager.addPoster("Фильм 15");

        String[] expected = {"Фильм 1", "Фильм 2",  "Фильм 3", "Фильм 4", "Фильм 5", "Фильм 6","Фильм 7", "Фильм 8","Фильм 9", "Фильм 10", "Фильм 11", "Фильм 12", "Фильм 13", "Фильм 14", "Фильм 15"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void showInReverseOrderAddingMovies() { //показать в обратном порядке меньше лимита
        PosterManager manager = new PosterManager(10);
        manager.addPoster("Фильм 1");
        manager.addPoster("Фильм 2");
        manager.addPoster("Фильм 3");
        manager.addPoster("Фильм 4");
        manager.addPoster("Фильм 5");
        manager.addPoster("Фильм 6");
        manager.addPoster("Фильм 7");
        manager.addPoster("Фильм 8");
        manager.addPoster("Фильм 9");


        String[] expected = {"Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6","Фильм 5", "Фильм 4","Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void showTheLastTenMovies() { //показать последние десять фильмов в обратном порядке равный лимиту
        PosterManager manager = new PosterManager(10);
        manager.addPoster("Фильм 1");
        manager.addPoster("Фильм 2");
        manager.addPoster("Фильм 3");
        manager.addPoster("Фильм 4");
        manager.addPoster("Фильм 5");
        manager.addPoster("Фильм 6");
        manager.addPoster("Фильм 7");
        manager.addPoster("Фильм 8");
        manager.addPoster("Фильм 9");
        manager.addPoster("Фильм 10");


        String[] expected = {"Фильм 10",  "Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6","Фильм 5", "Фильм 4","Фильм 3", "Фильм 2", "Фильм 1"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void showRecentMovies() { //показать последние фильмы
        PosterManager manager = new PosterManager(10);

        manager.addPoster("Фильм 2");
        manager.addPoster("Фильм 3");
        manager.addPoster("Фильм 4");
        manager.addPoster("Фильм 5");
        manager.addPoster("Фильм 6");
        manager.addPoster("Фильм 7");
        manager.addPoster("Фильм 8");
        manager.addPoster("Фильм 9");
        manager.addPoster("Фильм 10");
        manager.addPoster("Фильм 11");

        String[] expected = {"Фильм 11","Фильм 10",  "Фильм 9", "Фильм 8", "Фильм 7", "Фильм 6","Фильм 5", "Фильм 4","Фильм 3", "Фильм 2"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

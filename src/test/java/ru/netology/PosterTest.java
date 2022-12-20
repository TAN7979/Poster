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
   
}

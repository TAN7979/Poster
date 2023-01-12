package ru.netology;

public class PosterManager {
    private String[] posters = new String[0]; //пустой массив
    private int maxPosters; // переменная мах кол-во

    public PosterManager(){ //  менеджер с кол-вом 10 фильмов
        this.maxPosters = 10;
    }
    public PosterManager(int maxPosters){ // менеджер с переменной maxPosters

        this.maxPosters = maxPosters;
    }


    public void addPoster(String poster) { //Добавления нового фильма
        String tmp[] = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];

        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;

    }

    public String[] findAll() { // добавления по порядку
        return posters;

    }

    public String[] findLast() { // метод показать в обратном порядке
        int resultLength;
        if (posters.length < maxPosters) { // текущее кол-во меньше 10
            resultLength = posters.length; // resultLength = текущему кол-ву
        } else {
            resultLength = maxPosters; //resultLength = 10
        }
        String[] tmp = new String[resultLength];// массив ограничен resultLength
        for (int i = 0; i < tmp.length; i++) {// в массив попадает только 10 фильмов, т.е от 1 до 10
            tmp[i] = posters[tmp.length - 1 - i];// показать в обратном порядке, т.е. с 10 по 1

        }
        return tmp;// вернуть фильмы
    }


}

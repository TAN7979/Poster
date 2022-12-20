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
        String tpm[] = new String[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tpm[i] = posters[i];

        }
        tpm[tpm.length - 1] = poster;
        posters = tpm;

    }

    public String[] findAll() { // добавления по порядку
        return posters;

    }

    public String[] findLast() { // показать в обратном порядке
        int resultLength;
        if (posters.length < maxPosters) {
            resultLength = posters.length;
        } else {
            resultLength = maxPosters;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = posters[tmp.length - 1 - i];

        }
        return tmp;
    }


}

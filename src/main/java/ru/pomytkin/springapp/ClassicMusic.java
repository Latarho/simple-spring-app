package ru.pomytkin.springapp;

public class ClassicMusic implements Music{
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
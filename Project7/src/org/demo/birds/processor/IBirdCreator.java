package org.demo.birds.processor;

import org.demo.birds.entities.Bird;

import java.util.Scanner;

public interface IBirdCreator {
    /**
     * Создать объект типа Bird на основании введенных пользователем данных
     *
     * - запрашиваем у пользователя Please, enter bird name
     *             - читаем введенное значение
     *             - запрашиваем у пользователя Please, enter bird living area
     *             - читаем введенное значение
     *             - запрашиваем у пользователя Please, enter bird size
     *             - читаем введенное значение
     *             - вызываем соответствующий метод BirdStore.
     *
     * @param userInputReader объект Scanner который будет использоваться для чтения комманд.
     *
     * @return объект типа Bird
     */
    Bird createBird(Scanner userInputReader);
}

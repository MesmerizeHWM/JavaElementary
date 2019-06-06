package org.demo.birds.processor;

import java.util.Scanner;

public interface IUserCommandProcessor {
    /**
     * Выполняет комманлу пользователя
     *
     * 1) если введена комманда a:
     *       - запрашиваем у пользователя Please, enter bird name
     *       - читаем введенное значение
     *       - запрашиваем у пользователя Please, enter bird living area
     *       - читаем введенное значение
     *       - запрашиваем у пользователя Please, enter bird size
     *       - читаем введенное значение
     *       - вызываем соответствующий метод BirdStore.
     *
     *   2) если введена комманда s:
     *       - запрашиваем у пользователя Please, enter bird name to search
     *       - читаем введенное значение
     *       - находим объект с такми именем BirdStore, печатаем Find bird : ....
     *
     *   3) если введена комманда l:
     *       - запрашиваем у пользователя Please, enter bird living area to search
     *       - читаем введенное значение
     *       - находим объекты с такми living area в BirdStore, печатаем Find bird : ....
     *
     *   4) если комманда неизвестна - выводим Unknown command.
     *
     *
     * @param command команда которую ввел пользователь
     * @param userInputReader объект Scanner который будет использоватеься для чтения дополнительных параметров.
     */
    void processUserCommand(String command, Scanner userInputReader);

}

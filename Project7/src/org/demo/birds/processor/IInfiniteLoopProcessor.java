package org.demo.birds.processor;

public interface IInfiniteLoopProcessor {
    /**
     * 1) В бесконечном цикле просим пользователя ввести комманду:
     *
     * Please, enter command:
     *      a - add new Bird
     *      s - search bird by name
     *      l - search bird by living area
     *      exit - terminate application
     * 2) пользователь вводит комманду.
     *
     */
    void processInLoop();
}

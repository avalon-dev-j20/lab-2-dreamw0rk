package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;
//import ru.avalon.java.j20.labs.models.UTF8Control;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Задание №5
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение локализованных ресурсов".
 */
public class Task5 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        /*
         * TODO(Студент): Выполнить задание №5
         *
         * 1. Реализовать метод read.
         *
         * 2. Прочитать ресурсы с использованием локализации по умолчанию.
         *
         * 3. Прочитать ресурсы с использованием локализации, отличной от той,
         *    которая задана по умолчанию.
         *
         * 4. С использованием отладчика сравнить полученные ресурсы и
         *    проверить корректность работы программы.
         */

        String path = "resources.strings.titles";
        Locale locale = new Locale("ru");
        ResourceBundle rb = read(path);

        String file = rb.getString("menu.file");

        ResourceBundle rb1 = read(path, locale);
        String file1 = rb1.getString("menu.file");

        System.out.println("\nTask 5 Progress: \nReading EN ......... " + file + "\nReading RU ......... " + file1);
    }

    /**
     * Выполняет чтение локализованных ресурсов с использованием
     * локализации по умолчанию.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path) {
        return ResourceBundle.getBundle(path);
    }

    /**
     * Выполняет чтение локализованных ресурсов.
     *
     * @param path путь к файлу ресурсов
     * @return новый экземпляр типа {@link ResourceBundle}
     */
    private ResourceBundle read(String path, Locale locale) {
        return ResourceBundle.getBundle(path, locale);
    }
}

package ru.avalon.java.j20.labs.tasks;

import ru.avalon.java.j20.labs.Task;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import static java.lang.Thread.currentThread;

/**
 * Задание №4
 *
 * <p>Тема: "Потоковый ввод-вывод. Чтение файлов конфигурации".
 */
public class Task4 implements Task {

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() throws IOException {
        Properties properties = read();

        System.out.println("\nTask 4 Progress: \nReading properties ......... done.");
        System.out.println(properties.getProperty("db.sql.server.url"));


        /*
         * TODO(Студент): Выполнить задание №4
         *
         * 1. Реализовать метод read.
         *
         * 2. С использованием отладчика проверить корректность работы программы.
         */
    }

    /**
     * Выполняет чтение файла конфигураций описанного
     * параметром {@code path}.
     *
     * @return новый экземпляр типа {@link Properties}
     */
    private Properties read() throws IOException {
        Properties properties = new Properties();
        ClassLoader loader = currentThread().getContextClassLoader();
        try (InputStream stream = loader.getSystemResourceAsStream("resources/database.properties")) {
            properties.load(stream);
        }
        return properties;
    }
}

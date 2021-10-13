package com.startjava.lesson_2_3_4.game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Creator Dmitrii Titov
 * Date 13.10.2021 Version 1.0.3
 */
public class GuessNumberTest {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("У каждого игрока по 10 попыток!" + "\n");
        System.out.print("Введите имя первого игрока: " + "\n");
        Player playerOne = new Player(reader.readLine());
        System.out.print("Введите имя второго игрока: " + "\n");
        Player playerTwo = new Player(reader.readLine());
        GuessNumber game = new GuessNumber(playerOne, playerTwo);
        String answer = " ";

        game.start();

        while (!"no".equals(answer)) {
//            do {
//                System.out.print("\n" + "Хотите продолжить игру? [yes/no]:");
//                answer = reader.readLine();
//            } while (!"no".equals(answer) && !"yes".equals(answer));
            System.out.print("\n" + "Хотите продолжить игру? [yes/no]:");
            answer = reader.readLine();
            if ("yes".equals(answer)){
                game.start();
            }
        }
    }
}
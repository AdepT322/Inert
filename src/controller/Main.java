package controller;

import help.FileHelper;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // TODO Искать все .exe файлы - чушь
        // TODO Нужно найти все установленные программы, потом искать пути к ним
        // TODO Запустить powershell скрипт, который это сделает
        // TODO Отфильтровать полученные программы
        // TODO Есть класс для открытия ассоцириованных программ, на всякий случай
        List<List<String>> names = FileHelper.refineNames(FileHelper.loadUnrefinedNames());
        for (List<String> listStr:
             names) {
            for (String name:
                 listStr) {
                System.out.print(name);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
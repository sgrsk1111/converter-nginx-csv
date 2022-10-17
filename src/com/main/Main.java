package src.com.main;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

// + сначала проложить путь к файлу который нужно взять
// + далее добавить возможно проверку - блок трай кетч
//прописать код который будет обрабатывать файл
//прописать код который будет создать новый файл в другую папку
//протестировать
//решить вопрос, как файлы для конвертации могут быть добавлены
public class Main {
    public static void main(String[] args) {

        //   /home/tatiana/Desktop/convert-nginx-csv/src/nginxtest/nginx.log
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file path");
        String pathToFile = scanner.nextLine();
        System.out.println("Enter the new file path");
        String pathToNewFile = scanner.nextLine();
        File test = new File(pathToFile);

        try {

            InputStreamReader fileInputStream = new InputStreamReader(new FileInputStream(test));
            BufferedReader bufferedReader = new BufferedReader(fileInputStream);

            File newFile = new File(pathToNewFile);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}


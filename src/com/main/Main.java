package src.com.main;


import java.io.File;


public class Main {
    public static void main(String[] args) {

        File test = new File("/home/tatiana/Desktop/convert-nginx-csv/src/ngnixtest/nginx.log");

        try {
            boolean fileInDirectory = test.isFile();
            if (fileInDirectory == false)
                System.out.println("File not found");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}

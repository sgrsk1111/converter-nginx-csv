package src.com.main;


import java.io.*;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        File test = new File("/home/tatiana/Desktop/converter-nginx-csv/src/com/nginxtest/nginx.log");
        File newFile = new File("/home/tatiana/Desktop/converter-nginx-csv/src/com/result");

        BufferedReader buff;

        try {

            buff = new BufferedReader(new FileReader(test));

            String line;
            while ((line = buff.readLine()) != null){

                String [] headers = line.split("\\|");
                StringBuilder newB = new StringBuilder();

                for(String header : headers) {
                    newB.append(header.split("=")[1].trim());
                    newB.append("|");
                    System.out.println(header);
                }

            }

            if ((line = buff.readLine()) == null) buff.close();
            /*
            newFile.mkdir();
            newFile.createNewFile();
             */

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    }






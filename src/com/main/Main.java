package src.com.main;


import java.io.*;


public class Main {
    public static void main(String[] args) {

        File test = new File("/home/tatiana/Desktop/converter-nginx-csv/src/com/nginxtest/nginx.log");
        File newFile = new File("/home/tatiana/Desktop/converter-nginx-csv/src/com/result/result.csv");

        BufferedReader buff;
        BufferedWriter buffWr;

        try {

            newFile.createNewFile();

            buff = new BufferedReader(new FileReader(test));
            buffWr = new BufferedWriter(new FileWriter(newFile));

            String line = "";
            String info;

            if ((line = buff.readLine()) != null){

                String [] headers = line.split("\\s");
                StringBuilder newB = new StringBuilder("");

                for(String header : headers) {
                    newB.append(header.split("=")[0].trim().replaceAll("\\s",""));
                    newB.append("|");
                }
                info = newB.toString();

                while ((line = buff.readLine()) != null){
                    buffWr.write(info);
                    buffWr.newLine();
                }
            }

            if ((line = buff.readLine()) == null) {
                buff.close();
                buffWr.close();
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    }






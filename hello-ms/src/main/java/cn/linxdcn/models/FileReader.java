package cn.linxdcn.models;

import org.springframework.stereotype.Component;

import java.io.*;

/**
 * Created by linxiaodong on 18/02/2018.
 */
@Component
public class FileReader {
    private static final String USER_HOME = System.getProperty("user.home");
    private static final String TMP_PATH = USER_HOME + "/tmp";
    private static final String FILE_NAME = "test.txt";

    public void write(String text) {
        try {
            FileWriter fw = new FileWriter(TMP_PATH + "/" + FILE_NAME, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String read() {
        File file = new File(TMP_PATH + "/" + FILE_NAME);
        BufferedReader br = null;
        String res = null;
        try {
            br = new BufferedReader(new java.io.FileReader(file));
            res = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

//    public static void main(String[] args) {
//        System.out.println(USER_HOME);
//    }
}

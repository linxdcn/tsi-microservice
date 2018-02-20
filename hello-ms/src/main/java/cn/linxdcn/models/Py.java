package cn.linxdcn.models;

import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Created by linxiaodong on 18/02/2018.
 */
@Component
public class Py {
    private static final String ROOT = "/tmp/tsi";
    private static final String PY_DIR = "py";

    private String getFile(String name) {
        ClassLoader cl = getClass().getClassLoader();
        return cl.getResource(name).getFile();
    }

    public String run(String name) {
        copy(name);

        String path = ROOT + "/" + PY_DIR + "/" + name;

        StringBuilder sb = new StringBuilder();
        String s = null;
        try {
            Process p = Runtime.getRuntime().exec("python " + path);
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((s = input.readLine()) != null) {
                sb.append(s);
                sb.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    private void copy(String name) {
        File file = new File(ROOT + "/" + PY_DIR + "/" + name);
        if (file.exists()) return;
        else {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            InputStream is = getClass().getClassLoader().getResourceAsStream(PY_DIR + "/" + name);
            InputStreamReader sr = new InputStreamReader(is, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(sr);

            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);

            for (String line; (line = br.readLine()) != null;) {
                bw.write(line);
                bw.write("\n");
            }

            br.close();
            sr.close();
            is.close();
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

//    public static void main(String args[]) {
//        Py py = new Py();
//        System.out.println(py.run("py/test.py"));
//    }
}

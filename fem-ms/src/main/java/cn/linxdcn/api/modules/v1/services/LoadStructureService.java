package cn.linxdcn.api.modules.v1.services;

import cn.linxdcn.api.modules.v1.DTO.LoadStructureInputDTO;
import cn.linxdcn.api.modules.v1.DTO.LoadStructureOutputDTO;
import org.springframework.stereotype.Component;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class LoadStructureService {
    private String ansysPath = "E:\\software\\Anasys\\ANSYS Inc\\v145\\ansys\\bin\\winx64\\ANSYS145.exe";
    private String resultDir = "D:\\SLConvergenceAnalysis";

    private String resFolder = "tmp";
    private String folder = "txt";
    private String inputFile = "input.txt";
    private String outputFile = "output.txt";

    public LoadStructureOutputDTO calc(LoadStructureInputDTO inputDTO) {
        SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        resFolder = df.format(new Date());

        writeFile(inputDTO);
        callAnsys();
        return loadResult();
    }

    private void writeFile(LoadStructureInputDTO inputDTO) {
        String text = "";

        try {
            InputStream stream = this.getClass().getResourceAsStream("/" + folder + "/" + inputFile);
            byte[] buffer = new byte[stream.available()];
            stream.read(buffer);
            text = new String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }

        text = text.replaceAll("\\$radius\\$", String.valueOf(inputDTO.getRadius()));
        text = text.replaceAll("\\$thickness\\$", String.valueOf(inputDTO.getThickness()));
        text = text.replaceAll("\\$width\\$", String.valueOf(inputDTO.getWidth()));
        text = text.replaceAll("\\$density\\$", String.valueOf(inputDTO.getDensity()));
        text = text.replaceAll("\\$moe\\$", String.valueOf(inputDTO.getMoe()));
        text = text.replaceAll("\\$mu\\$", String.valueOf(inputDTO.getMu()));
        text = text.replaceAll("\\$kground\\$", String.valueOf(inputDTO.getKground()));
        text = text.replaceAll("\\$kjoint\\$", String.valueOf(inputDTO.getKjoint()));
        text = text.replaceAll("\\$loadv\\$", String.valueOf(inputDTO.getLoadv()));
        text = text.replaceAll("\\$loadh1\\$", String.valueOf(inputDTO.getLoadh1()));
        text = text.replaceAll("\\$loadh2\\$", String.valueOf(inputDTO.getLoadh2()));

        File file = new File(resultDir + "/" + resFolder + "/" + inputFile);
        if (!file.exists()) {
            try {
                file.getParentFile().mkdirs();
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(file, false);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(text);
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void callAnsys() {
        String inputFilePath = new File(resultDir + "/" + resFolder + "/" + inputFile).getPath();
        String outputFilePath = new File(resultDir + "/" + resFolder + "/" + outputFile).getPath();
        String command = ansysPath;
        command += " -b -p ansysds -i " + inputFilePath + " -o " + outputFilePath;
        Process p = null;
        ProcessBuilder pb = new ProcessBuilder(ansysPath,
                "-b", "-p", "ansysds", "-i", inputFilePath, "-o", outputFilePath);
        pb.directory(new File(resultDir + "/" + resFolder));
        try {
            p = pb.start();
            p.waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private LoadStructureOutputDTO loadResult() {
        LoadStructureOutputDTO outputDTO = new LoadStructureOutputDTO();

        File file = new File(resultDir + "\\result.txt");
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tmp = null;
            while ((tmp = reader.readLine()) != null) {
                tmp = tmp.replaceAll("\\s+", " ");
                tmp = tmp.trim();
                String[] vals = tmp.split(" ");
                LoadStructureOutputDTO.LoadStructureItem item = outputDTO.new LoadStructureItem();
                item.setX(Double.valueOf(vals[0]));
                item.setY(Double.valueOf(vals[1]));
                item.setZ(Double.valueOf(vals[2]));
                item.setMoment(Double.valueOf(vals[3]));
                item.setAxial(Double.valueOf(vals[4]));
                item.setShear(Double.valueOf(vals[5]));
                outputDTO.getResults().add(item);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e2) {

                }
            }
        }
        return outputDTO;
    }
}

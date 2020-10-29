package smitems.util;

import smitems.SMItems;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LogToFile {
    public void logToFile(String message) {
        SMItems plugin = SMItems.getInstance();
        try {
            File dataFolder = plugin.getDataFolder();
            if (!dataFolder.exists()) {
                dataFolder.mkdir();
            }

            File saveTo = new File(dataFolder, "data.txt");
            if (!saveTo.exists()) {
                saveTo.createNewFile();
            }


            FileWriter fw = new FileWriter(saveTo, true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println(message);

            pw.flush();

            pw.close();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }
}

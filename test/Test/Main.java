package Test;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void convertTextToTable(String text, JTable table) {
        String[] columnNames = {"Data", "Type", "Config", "Wordlist", "Date", "RUT", "PASS", "Incluye"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        String[] lines = text.split("\n");

        for (String line : lines) {
            Matcher matcher = Pattern.compile("Data = (.*?)\\s*\\|\\s*Type = (.*?)\\s*\\|\\s*Config = (.*?)\\s*\\|\\s*Wordlist = (.*?)(?:\\s*\\|\\s*Proxy = )?\\s*\\|\\s*Date = (.*?)\\s*\\|\\s*CapturedData = RUTPASS = (.*?):(.*?)\\s*\\|\\s*Incluye = \\((.*?)\\)").matcher(line);
            if (matcher.find()) {
                String data = matcher.group(1).trim();
                String type = matcher.group(2).trim();
                String config = matcher.group(3).trim();
                String wordlist = matcher.group(4).trim();
                String date = matcher.group(5).trim();
                String rut = matcher.group(6).trim();
                String pass = matcher.group(7).trim();
                String incluye = matcher.group(8).trim();

                model.addRow(new String[]{data, type, config, wordlist, date, rut, pass, incluye});
            }
        }

        table.setModel(model);
//        JOptionPane.showMessageDialog(null, new JScrollPane(table), "Table View", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        String text = "Data = ahead@astroramji.com:Sagar | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 5048406-8:VTR5048 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
                + "Data = ahmad.mamdouh@ofacade.com:Facade | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 4465328-1:VTR4465 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
                + "Data = xstivix@web.de:haloreachS1 | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 8469024-4:VTR8469 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
                + "Data = s111025@mjjh.ntct.edu.tw:B0981016 | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 9915769-0:VTR9915 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
                + "Data = sphere@mub.biglobe.ne.jp:azzh3xbf | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 7151910-4:VTR7151 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n"
                + "Data = sandra.joerg@freenet.de:Schweden11 | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 17520534-9:VTR1752 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)\n" +
        "Data = vorobioryrg@websitebooty.com:qj1skt18sQ | Type = SUCCESS | Config = VTR GEN | Wordlist = MIX (7) | Proxy =  | Date = sábado, 20 de abril de 2024 | CapturedData = RUTPASS = 6824183-9:VTR6824 | Incluye = (Max, Prime Video, Universal+ Estándar, RiiviMega Go, Cindie, Edye, Atresplayer)";

        JTable table = new JTable();
        convertTextToTable(text, table);
    }
}

package JSON;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

import static com.sm.utils.Encriptador.*;

public class ConexionSQL {

    private static HikariDataSource dataSource;

    static {
        Properties properties = new Properties();
        try {
            InputStream input = ConexionSQL.class.getClassLoader().getResourceAsStream("com/sm/dao/config.properties");
            if (input == null) {
                throw new IOException("Sorry, unable to find config.properties");
            }

            properties.load(input);

            String clave = "Nunca3791*#";
            String url = desencriptar(properties.getProperty("db.url"), clave);
            String user = desencriptar(properties.getProperty("db.user"), clave);
            String password = desencriptar(properties.getProperty("db.password"), clave);

            HikariConfig config = new HikariConfig();
            config.setJdbcUrl(url);
            config.setUsername(user);
            config.setPassword(password);
            config.setMaximumPoolSize(10);
            config.setMinimumIdle(5);
            config.setIdleTimeout(30000);
            config.setConnectionTimeout(10000);
            config.setLeakDetectionThreshold(60000);
            config.addDataSourceProperty("cachePrepStmts", "true");
            config.addDataSourceProperty("prepStmtCacheSize", "250");
            config.addDataSourceProperty("prepStmtCacheSqlLimit", "2048");

            dataSource = new HikariDataSource(config);
        } catch (IOException | SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public static Connection getConnection() throws SQLException {
        if (dataSource == null) {
            throw new SQLException("DataSource not initialized");
        }
        return dataSource.getConnection();
    }

    public static void closeDataSource() {
        if (dataSource != null) {
            dataSource.close();
        }
    }

    public static void main(String[] args) {
        try (Connection con = ConexionSQL.getConnection()) {
            if (con != null) {
                System.out.println("CONEXION EXITOSA");
            } else {
                System.out.println("NO HUBO CONEXION");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}

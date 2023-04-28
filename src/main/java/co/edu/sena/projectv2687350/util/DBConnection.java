package co.edu.sena.projectv2687350.util;

import java.sql.SQLException;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:8080/my_app?serverTimezone=America/Bogota";

    private static final String USER  = "my_app_user";

    private static final String PASS = "my_app_password";

    private static BasicDataSource pool;

    public static BasicDataSource getInstance() throws SQLException {
        if (pool == null) {

            pool = new BasicDataSource();
            pool.setUrl(URL);
            pool.SetUsername(USER);
            pool.SetPassword(PASS);

            pool.setInitilSize(3);
            pool.setMinIdle(3);
            pool.setMaxIdle(8);
            pool.setMaxTotal(8);
        }
        return pool;
    }

    public static Connection getConnection() throws SQLException {
        return getInstance().getConnection();
    }
}

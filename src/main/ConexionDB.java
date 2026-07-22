package main;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL    = "jdbc:sqlserver://localhost\\DESKTOP-15S3QIL\\SQLEXPRESS:1433;database=fitcimm";
private static final String USUARIO = "IntelJ";
private static final String CLAVE   = "123456";

static {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (ClassNotFoundException e) {
        throw new RuntimeException("Driver MySQL no encontrado", e);
    }
}

public static Connection getConexion() throws SQLException {
    return DriverManager.getConnection(URL, USUARIO, CLAVE);
}
}
package common.handlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class HandlerConexao {
    public Connection getConnection() {
	try {
            Connection outboundConnection = DriverManager.getConnection(this._URL, this._USER,this._PASSWORD);

            return outboundConnection;
	} catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private final String _URL = "jdbc:mysql://localhost:3306/hamburgueriaPOO2?useSSL=false";
    private final String _USER = "root";
    private final String _PASSWORD = "root";
}


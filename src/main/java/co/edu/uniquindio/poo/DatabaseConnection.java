package co.edu.uniquindio.poo;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {}

    // Método estático para obtener la instancia única de DatabaseConnection
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Método para conectar a la base de datos
    public void connect(DatabaseConfiguration config) {
        System.out.println("Conectando a la base de datos...");
    }

    // Método para desconectar de la base de datos
    public void disconnect() {
        System.out.println("Desconectando de la base de datos...");
    }
}


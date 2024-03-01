package co.edu.uniquindio.poo;

public class App {
        public static void main(String[] args) {
            //Creacion del injetos utilizando el builder de databaseconfigurations
            DatabaseConfiguration config = DatabaseConfiguration.Builder()
                                        .setUsername("usuario")
                                        .setPassword("contraseña")
                                        .setHost("localhost")
                                        .setCharset(Charset.UTF_8)
                                        .setTimeout(30)
                                        .setSslCertificates(true)
                                        .setPort(3306)
                                        .setDatabaseName("mi_basededatos")
                                        .build();
    
            // Se obtiene la instancia única de DatabaseConnection
            DatabaseConnection connection = DatabaseConnection.getInstance();
    
            // Conectamos a la base de datos utilizando la configuración proporcionada
            connection.connect(config);
    
            // Desconectamos de la base de datos
            connection.disconnect();
        }
    }
    

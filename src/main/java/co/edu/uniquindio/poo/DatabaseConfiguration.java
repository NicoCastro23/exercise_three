package co.edu.uniquindio.poo;

public class DatabaseConfiguration {
        private String username;
        private String password;
        private String host;
        private Charset charset;
        private int timeout;
        private boolean sslCertificates;
        private int port;
        private String databaseName;
    
        // Constructor privado para evitar instanciación directa
        private DatabaseConfiguration() {}

        // Getters and setters 
        public String getUsername() {
            return username;
        }
    
        public String getPassword() {
            return password;
        }
    
        public String getHost() {
            return host;
        }
    
        public Charset getCharset() {
            return charset;
        }
    
        public int getTimeout() {
            return timeout;
        }
    
        public boolean getSslCertificates() {
            return sslCertificates;
        }
    
        public int getPort() {
            return port;
        }
    
        public String getDatabaseName() {
            return databaseName;
        }

        public static BuilderDataBase Builder(){
            return new BuilderDataBase();
            
        }

        // Clase Builder para construir la configuración de la base de datos de manera personalizada.
        public static class BuilderDataBase {
            private DatabaseConfiguration config = new DatabaseConfiguration();
    
            public BuilderDataBase setUsername(String username) {
                config.username = username;
                return this;
            }
    
            public BuilderDataBase setPassword(String password) {
                config.password = password;
                return this;
            }
    
            public BuilderDataBase setHost(String host) {
                config.host = host;
                return this;
            }
    
            public BuilderDataBase setCharset(Charset charset) {
                config.charset = charset;
                return this;
            }
    
            public BuilderDataBase setTimeout(int timeout) {
                config.timeout = timeout;
                return this;
            }
    
            public BuilderDataBase setSslCertificates(boolean sslCertificates) {
                config.sslCertificates = sslCertificates;
                return this;
            }
    
            public BuilderDataBase setPort(int port) {
                config.port = port;
                return this;
            }
    
            public BuilderDataBase setDatabaseName(String databaseName) {
                config.databaseName = databaseName;
                return this;
            }
    
            // Método para construir la configuración
            public DatabaseConfiguration build() {
                return config;
            }
     }
 }
    


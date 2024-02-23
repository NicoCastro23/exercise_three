package co.edu.uniquindio.poo;

public class DatabaseConfig {
        private String username;
        private String password;
        private String host;
        private String charset;
        private int timeout;
        private String sslCertificates;
        private int port;
        private String databaseName;
    
        // Constructor privado para evitar instanciación directa
        private DatabaseConfig() {}
    
        public String getUsername() {
            return username;
        }
    
        public String getPassword() {
            return password;
        }
    
        public String getHost() {
            return host;
        }
    
        public String getCharset() {
            return charset;
        }
    
        public int getTimeout() {
            return timeout;
        }
    
        public String getSslCertificates() {
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
            private DatabaseConfig config = new DatabaseConfig();
    
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
    
            public BuilderDataBase setCharset(String charset) {
                config.charset = charset;
                return this;
            }
    
            public BuilderDataBase setTimeout(int timeout) {
                config.timeout = timeout;
                return this;
            }
    
            public BuilderDataBase setSslCertificates(String sslCertificates) {
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
            public DatabaseConfig build() {
                return config;
            }
     }
 }
    


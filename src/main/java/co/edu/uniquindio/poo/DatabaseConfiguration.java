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
        private DatabaseConfiguration(String username, String password, String host) {
            this.username = username;
            this.password = password;
            this.host = host;
        }

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

        public static BuilderDataBase Builder(String username, String password, String host){
            return new BuilderDataBase(username, password, host);
            
        }

        // Clase Builder para construir la configuración de la base de datos de manera personalizada.
            public static class BuilderDataBase {

            private DatabaseConfiguration config;

            // Constructor del Builder que toma los atributos obligatorios
            private BuilderDataBase(String username, String password, String host) {
            config = new DatabaseConfiguration(username, password, host);
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

        @Override
        public String toString() {
            return "DatabaseConfiguration [username=" + username + ", password=" + password + ", host=" + host +", charset=" + charset + ", timeout=" + timeout + ", sslCertificates="
                    + sslCertificates + ", port=" + port + ", databaseName=" + databaseName + "]";
        }
     
 }
    


import groovy.sql.Sql
import org.codehaus.groovy.ant.Groovy

import java.sql.Connection

public class DatabaseConnectionManager {

    def localhost_address = InetAddress.getLocalHost().getHostAddress()

    private Map db = [
            url:"jdbc:mysql://$localhost_address:9906/test_db",
            user:"root",
            password:"my_secret_pw_shh",
            driver:"com.mysql.jdbc.Driver"
    ]

    public DatabaseConnectionManager(){

    }



     public Sql connect(){

         return groovy.sql.Sql.newInstance(db.url, db.user, db.password, db.driver)
    }



}

import groovy.sql.Sql



class SqlQueries{


    def selectAllFromCars(){
        DatabaseConnectionManager connectionManager = new DatabaseConnectionManager()

       def newConnection = connectionManager.connect()

        StringBuffer sb = new StringBuffer()

        try{
            newConnection.eachRow("select * from Cars"){
                sb << "${it}"
                sb << (System.getProperty("line.separator"))
            }
            return sb.toString()
        }
        finally {
            newConnection.close()
        }

    }

    public SqlQueries(){

    }
}










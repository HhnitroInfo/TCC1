package javaapplication2;

import java.sql.*;

/**
 *
 * @author felip
 */
public class BD {
       public static Connection connection  = null;    
       public static Statement statement  = null;   
       public static ResultSet resultSet  = null;   
       public static final String DRIVER  = "com.mysql.jdbc.Driver";   
       public static final String URL = "jdbc:mysql://localhost:3306/easytextil";   
       
       //método que faz conexão com o banco de dados
       //retorna true se houver sucesso, ou false em caso negativo
       
       public static boolean getConnection(){
           try {
               Class.forName(DRIVER);
               connection = DriverManager.getConnection(URL, "root", "&reCH1m");
               statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, 
                           ResultSet.CONCUR_UPDATABLE);
               System.out.println("Conectou");
               return true;
           }catch (ClassNotFoundException erro){
                   erro.printStackTrace();
                   return false;
           } catch (SQLException erro) {
                   erro.printStackTrace();
                   return false;
           }
       }
       
       // fecha ResultSet, Statement e Connection
       
       public static void close(){
           closeResultSet();
           closeStatement();
           closeConnection();
       }
       
       private static void closeConnection(){
            try {
                  connection.close();
                  System.out.println("Desconectou");
            } catch (SQLException erro){
                erro.printStackTrace();
            }
       }
       
       private static void closeStatement(){
            try {
                statement.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
       }
       
       public static void closeResultSet(){
            try {
                resultSet.close();
            } catch (Exception e){
                e.printStackTrace();
            }
       }
       
       //carrega o resultSet com o resultado do script SQL
       
       public static void setResultSet(String sql){
            try {
                resultSet = statement.executeQuery(sql);
            } catch (SQLException erro){
                erro.printStackTrace();
            }
       }
       
       //executa um script SQL de atualização
       //retorna um valor inteiro contendo a quantidade de linhas afetadas
       
       public static int runSQL(String sql){
            int quant = 0;
            try {
                 quant = statement.executeUpdate(sql);
            } catch (SQLException erro) {
                erro.printStackTrace();
            }
            return quant;
       }
       
       
        public static boolean executeSQL(String sql){
            boolean quant = false;
            try {
                 quant = statement.execute(sql);
            } catch (SQLException erro) {
                erro.printStackTrace();
            }
            return quant;
       }
}




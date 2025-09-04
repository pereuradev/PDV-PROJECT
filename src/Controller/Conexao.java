package Controller
        ;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;


/**
 *
 * @author Norberto
 */
public class Conexao {
    
    public static Connection con = null;
 
        public static void Conectar() {
            String servidor = "localhost:3307/";
            String user = "root";
            String pass = "usbw";
            String banco = "pdv";
            
            System.out.println("Conectando ao banco...");

            try {
             Class.forName("com.mysql.cj.jdbc.Driver");
             con =  DriverManager.getConnection(
                     "jdbc:mysql://"+servidor + banco,
                     user,
                     pass
             );
             
             System.out.println("Conectado.");
            } catch (ClassNotFoundException ex) {
                 System.out.println("Classe não encontrada, adicione o driver nas bibliotecas.");

         } catch(SQLException erro ) {
             System.out.println("Ocorreu um erro no programa, entre em contato com o desenvolvedor e passe o seguinte erro: " + erro );
         throw new RuntimeException(erro);
         }
   }
       
   public static void Desconectar(){
        try {
            con.close();
            con = null;
            System.out.println("conexao fechada");
        } catch (SQLException ex) {
            System.out.println("Erro ao fechar a conexão "+ ex);
        }
   }
}

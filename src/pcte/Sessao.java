/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pcte;

/**
 *
 * @author Pietro
 */
public class Sessao {
    private static int codFuncionario;
    private static String nomeFuncionario;

    public static void setCodFuncionario(int codFun) {
        codFuncionario = codFun;
    }

    public static int getCodFuncionario() {
        return codFuncionario;
    }

    public static void setNomeFuncionario(String nome) {
        nomeFuncionario = nome;
    }

    public static String getNomeFuncionario() {
        return nomeFuncionario;
    }
}

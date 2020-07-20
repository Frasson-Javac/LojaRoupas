/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vinic
 */
public class Arquivo {

    public void gravar_no_arquivo(File file, String nome_empresa, String cnpj, String telefone, String Email, String Endereco) {

        try {
            FileWriter fw = new FileWriter(file, true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nome_empresa + ";" + cnpj + ";" + telefone + ";" + Email + ";" + Endereco);
            pw.close();
            fw.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        }

    }

    public void recuperardados() {

    }

}

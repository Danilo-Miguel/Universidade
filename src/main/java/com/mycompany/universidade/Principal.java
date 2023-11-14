package com.mycompany.universidade;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws SQLException {
        int ra_aluno;
        int id_aluno;
        int telefone_aluno;
        String nome_aluno; 
        Aluno aluno =  new Aluno();

        String menu = "1-Cadastrar\n 2-Atualizar\n 3-Apagar\n 4-Listar\n 0-sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1:
                    ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ra"));
                    telefone_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone"));
                    nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                    aluno.setRa_aluno(ra_aluno);
                    aluno.setTelefone_aluno(telefone_aluno);
                    aluno.setNome_aluno(nome_aluno);
                    aluno.inserir();
                    break;
                case 2:
                    ra_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ra"));
                    telefone_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone"));
                    nome_aluno = JOptionPane.showInputDialog("Digite seu nome");
                    id_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Aluno"));

                    aluno.setRa_aluno(ra_aluno);
                    aluno.setTelefone_aluno(telefone_aluno);
                    aluno.setNome_aluno(nome_aluno);
                    aluno.setId_aluno(id_aluno);
                    aluno.atualizar();
                    break;
                case 3:
                    id_aluno = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do Aluno"));
                    aluno.setId_aluno(id_aluno);
                    aluno.apagar();
                    break;
                case 4:
                    aluno.listar();
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida");
            }
        } while (opcao != 0);
    }

}

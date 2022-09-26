package br.com.senai.cronometro;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuSistema implements ActionListener {
	JLabel jlab;
	public MenuSistema () {
		JFrame jfrm = new JFrame ("JEduk - Gerenciamento de atividades");
		jfrm.setLayout(new FlowLayout());
		jfrm.setSize(300,300);
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jlab = new JLabel();
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmAtividade = new JMenu("Atividade");
		
		JMenuItem jmiInserir = new JMenuItem("Inserir");
		JMenuItem jmiPesquisar = new JMenuItem("Pesquisar");
		JMenuItem jmiAtualizar = new JMenuItem("Atualizar");
		JMenuItem jmiDeletar = new JMenuItem("Deletar");
		
		jmAtividade.add(jmiInserir);
		jmAtividade.add(jmiPesquisar);
		jmAtividade.add(jmiAtualizar);
		jmAtividade.add(jmiDeletar);
		
		jmb.add(jmAtividade);
		
		jfrm.add(jmb);
		jfrm.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	//JMenuBar -- um objeto uqe contém um menu de nivel superior
		//JMenu -- menu padrão é composta por diversos JMenusItems
		//JMenuItem -- um objeto que preencher os menus
	
}

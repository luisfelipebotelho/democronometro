package br.com.senai.cronometro;

import java.awt.*; //Gerenciadores de layout
import java.awt.event.*; //Acesso aos eventos (ouvintes)
import javax.swing.*;//Componentes virtuais
import java.util.*;//Calendar - vai ser usada para obter a hora atual do sistema

/**
 * 
 * @author Luís Felipe B. Silva
 * @category Desktop Development
 * @param parametro
 * @return algum item
 *
 */

public class Cronometro implements ActionListener {

	JLabel jlab;
	long start; // contem a hora inicial em milissegundos

	// Criando os dois botões.
	JButton btnStart = new JButton("Start");
	JButton btnStop = new JButton("Stop");

	public Cronometro() {

		// criar um container JFrame
		// um componente que pode receber outro componente
		JFrame jfrm = new JFrame("JEduk");

		// Instanciando o JLable.
		jlab = new JLabel("Pressione start para iniciar o tempo");

		// Adicionar ouvinte de ação
		btnStart.addActionListener(this);
		btnStop.addActionListener(this);

		// Especificar o FlowLayout como gerenciador de layout...
		jfrm.setLayout(new FlowLayout());

		// Adicionar os componentes dentro do container.
		jfrm.add(btnStart);
		jfrm.add(btnStop);
		jfrm.add(jlab);

		// Fornecer um tamanho inicial para o quadro (frame).
		jfrm.setSize(230, 90);
		jfrm.setVisible(true);

		// Encerrar quando o usuário fechar o app...
		jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		// Item A - Obter a hora atual do sistema
		Calendar cal = Calendar.getInstance();

		// Item B - Armazenar a hora inicial
		if (e.getActionCommand().equals("Start")) {
			start = cal.getTimeInMillis();
			jlab.setText("Cronômetro está em execução");
		} else {
			// Item C - Calcular o tempo decorrido
			jlab.setText("O tempo decorrido foi: " + (double) (cal.getTimeInMillis() - start) / 1000);
		}
		
		

	}

}

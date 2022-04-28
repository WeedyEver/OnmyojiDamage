package damage;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
public class Output extends JDialog {
	private static final long serialVersionUID = -3787132912369770220L;
	private JPanel contentPane;
	private JScrollPane jsp;
	public Output() {
		setResizable(false);
		setTitle("\u8BA1\u7B97\u7ED3\u679C");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 395, 271);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("\u8BA1\u7B97\u7ED3\u679C");
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 20));
		lblNewLabel.setBounds(147, 0, 95, 25);
		contentPane.add(lblNewLabel);
		JTextArea text = new JTextArea();
		text.setLineWrap(true);
		text.setFont(new Font("等线", Font.PLAIN, 16));
		text.setEditable(false);
		text.setBounds(1, 1, 392, 220);
		text.setText(Head.output_text);	
		jsp = new JScrollPane(text);
		jsp.setBounds(13, 29, 352, 158);
		contentPane.add(jsp);
		JButton btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("等线", Font.PLAIN, 14));
		btnNewButton.setBounds(144, 197, 101, 32);
		contentPane.add(btnNewButton);
	}
}
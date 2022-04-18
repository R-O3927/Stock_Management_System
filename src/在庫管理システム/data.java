package 在庫管理システム;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class data extends JFrame {
//継承

	public static void main(String[] args) {

		String[] thingStrings = { "本", "IT資産", "その他" };
		JFrame frame = new JFrame("Input Dialog Example");
		String returnValue = (String) JOptionPane.showInputDialog(frame, "見たいジャンルを選択して下さい", "在庫管理システム",
				JOptionPane.QUESTION_MESSAGE, null, thingStrings, thingStrings[0]);
		String thing = returnValue;

		int id = 0;

		if (thing == "本") {
			id = 1;
		}

		else if (thing == "IT資産") {
			id = 2;
		}

		else if(thing =="その他"){
			id = 3;
		}
		
		else {
			
		}

		data f = new data();
		// data fのインスタンス作成

		f.setTitle("在庫管理システム");
		// ウィンドウ自体の題名を設定

		Container c = f.getContentPane();
		// ウィンドウの表示領域の取得

		JPanel p = new JPanel();
		// パネルのインスタンスの作成

		JLabel l = new JLabel("Welcome to our System!!");
		// ウィンドウに出力させる文章を設定

		l.setFont(new Font("Arial", Font.PLAIN, 30));

		p.add(l);
		// ラベルをパネルに配置

		if (id == 1) {
			JLabel l2 = new JLabel("Book Data");
			l2.setFont(new Font("Arial", Font.PLAIN, 30));
			p.add(l2);
		}

		else if (id == 2) {
			JLabel l3 = new JLabel("IT Data");
			l3.setFont(new Font("Arial", Font.PLAIN, 30));
			p.add(l3);
		}

		else if(id == 3){
			JLabel l4 = new JLabel("Other Data");
			l4.setFont(new Font("Arial", Font.PLAIN, 30));
			p.add(l4);
		}
		
		else {
			
		}

		c.add(p, BorderLayout.CENTER);
		// パネルをウィンドウの表示領域に配置

		f.setVisible(true);
		// ウィンドウを表示

		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ウィンドウの「閉じる」ボタンを押した時の動作

		f.setSize(500, 800);
		// ウィンドウのサイズを設定

	}

}

package 在庫管理システム;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import 在庫管理システム.SceneMgr1.eScene;

public class data extends JFrame {
//継承
	
	protected enum Update {
		Update_Open, Update_Book, Update_IT, Update_Other
	};
	// Update 列挙型

	protected enum Draw {
		Draw_Open, Draw_Book, Draw_IT, Draw_Other
	};
	// Draw 列挙型

	public static void main(String[] args) {

		
		
		String[] thingStrings= {
				"本","IT資産","その他"};
				JFrame frame = new JFrame("Input Dialog Example");
				String returnValue =(String) JOptionPane.showInputDialog(frame,
				"見たいジャンルを選択して下さい","在庫管理システム",
				JOptionPane.QUESTION_MESSAGE,null,thingStrings,thingStrings[0]);
				String thing=returnValue;
				
				
		int count = 0;

		Update Update_type = Update.Update_Open;
		// Updateの初期設定

		eScene Scene_type = eScene.eScene_Open;
		// eSceneの初期設定

		Draw Draw_type = Draw.Draw_Open;
		// Drawの初期設定

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
		// 出力させる文章のフォント設定
		
		if(thing.equals("本"))
			Update_type=Update.Update_Book;
		    JLabel l2 = new JLabel("Book Data");
		    
            
	    if(thing.equals("IT資産"))
		    Update_type=Update.Update_IT;
		    JLabel l3 = new JLabel("IT Data");
		
		if(thing.equals("その他"))
			Update_type=Update.Update_Other;
		    JLabel l4 = new JLabel("Other Data");
		
		
		
		
		p.add(l);
		// ラベルをパネルに配置

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

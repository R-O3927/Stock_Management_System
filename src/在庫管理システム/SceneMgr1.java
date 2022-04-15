package 在庫管理システム;

import javax.swing.JFrame;

import 在庫管理システム.data.Draw;
import 在庫管理システム.data.Update;

public class SceneMgr1 extends JFrame {
//継承

	protected enum eScene {

		eScene_Open, eScene_Book, eScene_IT, eScene_Other,
	}
	// eScene 列挙型 ここのセミコロンでエラーを出す

	public static void main(String[] args) {

		Update Update_type = Update.Update_Open;

		int count = 0;

		if (count == 0) {
			// countによる分岐

			Draw Draw_type = Draw.Draw_Open;
			// Drawの更新

			eScene Scene_type = eScene.eScene_Open;
			// Sceneの更新

			System.out.println("在庫管理システム　トップ画面");
		}

		else if (count == 1) {

			Update_type = Update.Update_Book;

			Draw Draw_type = Draw.Draw_Book;

			eScene Scene_type = eScene.eScene_Book;

			System.out.println("在庫管理システム　本データベース");
		}

		else if (count == 2) {

			Update_type = Update.Update_IT;

			Draw Draw_type = Draw.Draw_IT;

			eScene Scene_type = eScene.eScene_IT;

			System.out.println("在庫管理システム　IT資産データベース");
		}

		else {

			Update_type = Update.Update_Other;

			Draw Draw_type = Draw.Draw_Other;

			eScene Scene_type = eScene.eScene_Other;

			System.out.println("在庫管理システム　その他データベース");
		}

	}

}
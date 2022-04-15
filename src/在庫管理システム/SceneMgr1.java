package 在庫管理システム;

import javax.swing.JFrame;

import 在庫管理システム.data.Update;
import 在庫管理システム.data.Draw;

public class SceneMgr1 extends JFrame {
//継承
		
	protected enum eScene {
		
		eScene_Open,
		eScece_Book,
		eScene_IT,
		eScene_Other
		
	};
	//eScene 列挙型　ここのセミコロンでエラーを出す
	
	
	if(Update_type == "Update_Open") {
		
		Draw Draw_type = Draw.Draw_Open;
		//Drawの更新
		
		eScene Scene_type = eScene.eScene_Open;
		//Sceneの更新
		
		System.out.println("在庫管理システム　トップ画面");
	}
	
	else if(Update_type == "Update_Book") {
		Draw Draw_type = Draw.Draw_Book;
		
		eScene Scene_type = eScene.eScene_Book;
		//ここの「eScene_Book」もエラーを出す
		
		System.out.println("在庫管理システム　本データベース");
	}
	
	else if(Update_type == "Update_IT") {
		Draw Draw_type = Draw.Draw_IT;
		
		eScene Scene_type = eScene.eScene_IT;
		
		System.out.println("在庫管理システム　IT資産データベース");
	}

	else {
		Draw Draw_type = Draw.Draw_Other;
		
		eScene Scene_type = eScene.eScene_Other;
		
		System.out.println("在庫管理システム　その他データベース");
	}
	
}

}
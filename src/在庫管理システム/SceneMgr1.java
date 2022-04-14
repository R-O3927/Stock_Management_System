package 在庫管理システム;

public class SceneMgr1 implements Update {
	
	protected enum eScene {
		eScene_Open,
		eScene_Book,
		eScene_IT
	};
	
	eScene Scene_type = eScene.eScene_Open;
	
public void Open_Update() {
	eScene Scene_type = eScene.eScene_Open;
	System.out.println("在庫管理システム　トップ画面");
}
public void Book_Update() {
	eScene Scene_type = eScene.eScene_Book;
	System.out.println("在庫管理システム　本データベース");
}
public void IT_Update() {
	eScene Scene_type = eScene.eScene_IT;
	System.out.println("在庫管理システム　IT資産データベース");
}

public void Open_Draw() {
	
}

public void Book_Draw() {
	
}

public void IT_Draw() {
	
}

}
	
	

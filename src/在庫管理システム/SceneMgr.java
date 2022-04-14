package 在庫管理システム;

public enum SceneMgr {
eScene_Open,
eScene_Book,
eScene_IT,
Scene;

void SceneMgr_Update() {
	switch(Scene) {
	case eScene_Open:
		Open_Update();
		break;
	case eScene_Book:
		BooK_Update();
		break;
	case eScene_IT:
		IT_Update();
		break;
	}
	
void SceneMgr_Draw() {
	switch(Scene) {
	case eScene_Open:
		Open_Draw();
		break;
	case eScene_Book:
		Book_Draw();
		break;
	case eScene_IT:
		IT_Draw();
		break;
	}
}
void SceneMgr_ChangeScene(eScene NextScene) {
	Scene = NextScene;
}
}


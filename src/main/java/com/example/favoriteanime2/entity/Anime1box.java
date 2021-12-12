package com.example.favoriteanime2.entity;

public class Anime1box {
	

	//アニメタイトルNo
	private int titleNo;
	//アニメタイトル
	private String title;
	//メモ
	private String memo;
	
	// コンストラクタ（初期化メソッド）↓↓はクラスからインスタンスを作る時に初めに呼ばれる初期化メソッド
	public Anime1box(int titleNo, String title, String memo) { 
		//持っているフィールドに気づいてもらう、渡されたらそれぞれのフィールドにsetするように
		this.titleNo = titleNo;
		this.title = title;
		this.memo = memo;
	}
	
	
	
	//ソースからprivateのgetter,setterの生産メソッドを作成していく
	//それぞれのフィールドにアクセスするためのget～、set～メソッドを作ってくれる
	public int getTitleNo() {
		return titleNo;
	}
	public void setTitleNo(int titleNo) {
		this.titleNo = titleNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	
	
	
	
	
}

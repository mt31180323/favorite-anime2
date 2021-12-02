package com.example.favoriteanime2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// Ctrl+Shift+o=import文を生成・整理


//　アニメ画面を制御するコントローラー
//　3.画面からのリクエストを受ける、ブラウザからのリクエストを返すメソッドを作る


@Controller //AnimeControllerをspringDIに登録する
public class AnimeController {
	

	@RequestMapping("/list")
	
	// 2．どういうリクエストを受けた時かのアノテーション。"/URL"書く
	// "/list"というブラウザURLからアクセスされたときにlistという処理をやってねという意味
	
	public String list() {	//list処理名
		
		
		return"list";	// 1．メソッドを用意してリクエストを受けた時にlistという画面を返します
	}
	
	
	
	
	
	

}

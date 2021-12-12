package com.example.favoriteanime2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// Ctrl+Shift+o=import文を生成・整理

import com.example.favoriteanime2.entity.Anime1box;
import com.example.favoriteanime2.service.AnimeService;


//　アニメ画面を制御するコントローラー
//　3.画面からのリクエストを受ける、ブラウザからのリクエストを返すメソッドを作る


@Controller //AnimeControllerをspringDIに登録する
public class AnimeController {	// AnimeControllerはクラス名
	
		@Autowired 
		AnimeService Service; //後半>>　Serviceを使ってMapperに検索メソッドを呼んで情報を取って返してもらう
	
	@RequestMapping("/list")
	// 2．どういうリクエストを受けた時かのアノテーション。"/URL"書く
	// "/list"というブラウザURLからアクセスされたときにlistという処理をやってねという意味
	
	
	public String list(Model model) {	//list処理名
		
		// 情報を渡せるようにする・DBから情報を渡すという想定
		// ↓Anime1boxクラスという一件の情報の入れ物>entityパッケージを作りその中へAnime1boxというクラスを作成
		// List<Anime1box> animes = new ArrayList <Anime1box>();
		

		
//		Anime1box tensura = new Anime1box();
//		tensura.setTitleNo(1);
//		tensura.setTitle("てんすら"); 
		// 1つずつ書くのが大変なので<Anime1box>へコンストラクタを準備すると、引数のように簡潔に書けるようになる
//		Anime1box tensura = new Anime1box(1, "転すら", "すらいむ");
//		Anime1box kimetsu = new Anime1box(2, "鬼滅の刃", "きめつ");
		// ↓↓リストがあって、そこに転スラと鬼滅の情報を追加したといことを書いた　animesは情報リストの名前
//		animes.add(tensura);
//		animes.add(kimetsu);
		
		
		//newArraylist からではなくDBから情報をとれるようになったので　service.getAnimeListへ変更した
		List<Anime1box> animes = Service.getAnimelist(); //検索する
		
		//まとめ：Controllerにリクエストが来たらServiceクラスを使ってgetAnimeListで検索する
		//まとめ：getAnimeListはMapperを使ってselectAllメソッドを呼び出す
		//まとめ：selectAllはxmlの中にあるSQLを使ってDBから情報を取り出す
		//まとめ：それをControllerから画面に渡している
		
		// model（↑26行目クラス追加+import文も忘れず追加）というのを使って情報をAttribute(セット)		
		model.addAttribute("animes",animes);	//セットした情報をタイムリーフ（htmlファイル）へ渡す
		
		return"list";	// 1．メソッドを用意してリクエストを受けた時にlistという画面を返します
	}
	
	
	
	
	
	

}

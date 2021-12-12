package com.example.favoriteanime2.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import com.example.favoriteanime2.entity.Anime1box;

@Mapper //これはMapperと教える+import文追加すること
public interface AnimeMapper {	//AnimeMapperと名付けた

	//MapperとはMyBatisの機能を使うもの、interface-仕様・名前だけを定義する、処理書けない、インターフェイスという概念
	//このメソッド（ここではselectAll）を使ったら実行できるようにMappingする
	
	//DBにアクセスするためのメソッドを用意する
	public List<Anime1box> selectAll();
	
	//src/main/resourcesにmapperフォルダ作る　そこにMapperと同じ名前のxmlファイルを作る
	//インターフェイスのメソッド(selectAll)を実行するとAnimeMapper.xmlに書かれたSQLをDBへ発行・実行してくれる
	
	//Mybatis　AnimeMapper.xmlに書く
	
}

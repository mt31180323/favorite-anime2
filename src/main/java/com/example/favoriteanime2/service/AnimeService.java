package com.example.favoriteanime2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.favoriteanime2.entity.Anime1box;
import com.example.favoriteanime2.mapper.AnimeMapper;

@Service //serviceという役割です　DIに登録
public class AnimeService {

	//それぞれのレイヤーやマッパーに繋げるためのAutowired
	@Autowired
	AnimeMapper mapper; 
	
	//serviceレイヤーからanimeMapperを呼んでSQLを実行して結果を返してもらう
		//更にserviceのメソッド(getAnimelist)もコントローラーから呼び出すようにする　controllerへAutowired書く
	public List<Anime1box> getAnimelist() {
		return mapper.selectAll();
	}
	
}

package com.in28minutes.learn_spring_framwork;

import com.in28minutes.learn_spring_framwork.game.GameRunner;
import com.in28minutes.learn_spring_framwork.game.PacmanGame;
//제발 오타좀.. 신경쓰기.. var를 ver로 써놓고 선언 안된다고 찡찡대지 말고 하..
public class AppGamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		//var game = new SuperConterGame();
		var game = new PacmanGame(); //1. 객체 생성
		
		var gameRunner = new GameRunner(game); //2. 동시 종속성을 연결하는 객체 생성
		gameRunner.run();//의존성을 연결한다는것: 이 클래스는 게임을 실행할 수 있어야만 함
		// 실행하려면 게임이 필요해서 일반적으로 게임의존성이라고 할 수 있음, 애랑 연결된게 마리오 슈퍼콘솔 이런거니까
		// 코드가 쉬워보이지만 이면에서는 많은 일들이 일어나고 있음, 부모 자식관의 로직을 살펴보는게 중요한듯

	}

}

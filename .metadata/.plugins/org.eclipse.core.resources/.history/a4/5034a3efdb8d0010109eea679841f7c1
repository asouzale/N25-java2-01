package br.com.senaisp.bauru.classes;

import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.media.AudioClip;

public class Duke extends Group {
	private Image dukeImage;
	private Image luvaImage;
	private AudioClip som;
	//Images views
	private ImageView dukeImgVw;
	private ImageView luvaImgVw;
	//constructor
	public Duke() {
		//carregando as imagens
		dukeImage = new Image(getClass().getResource("Images/Duke.png").toString());
		luvaImage = new Image(getClass().getResource("Images/Glove.png").toString());
		//criando as inages views
		dukeImgVw = new ImageView(dukeImage);
		luvaImgVw = new ImageView(luvaImage);
		//arregando o som
		som = new AudioClip(getClass().getResource("Audios/Note5.wav").toString());
		//dimensionanod e posicionando os itens
		dukeImgVw.setFitWidth(50);
		dukeImgVw.setPreserveRatio(true); //manter proporção da img
		dukeImgVw.setY(10);
		//luva
		luvaImgVw.setFitWidth(40);
		luvaImgVw.setPreserveRatio(true);
		luvaImgVw.setX(17);
		//adc os itens no group
		getChildren().addAll(dukeImgVw,luvaImgVw);
		//criando eventos para o duke
		criacaoEventos();
		
	}
	private void criacaoEventos() {
		setOnMouseClicked((me)-> {som.play(); });
		//metodo para arrastar e soltar
		setOnMouseDragged((me) -> {double largura = this.getBoundsInLocal().getWidth() /2; //a conta é para posicionar o mouse no meui do personagem
		                           double altura = this.getBoundsInLocal().getHeight() /2;
		                           //posicionando o personagem na scena
		                           setLayoutX(me.getSceneX()-largura);
		                           setLayoutY(me.getSceneY()-altura);
				
		});
	}

}

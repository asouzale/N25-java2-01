package br.com.senaisp.bauru;


import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Effect;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.shape.StrokeLineJoin;
import javafx.scene.shape.StrokeType;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class JavaFXExercicio01 extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		//Criando o no Root
		Group noRoot = new Group();
		//criando os componentes da tela
		criarComponentes(noRoot);
		
		//criando a cena
		Scene cena = new Scene(noRoot, 400,400,Color.WHITE);
		primaryStage.setTitle("Itens JavaFX");
		primaryStage.setScene(cena);
		primaryStage.show();

	}
	private void criarComponentes(Group noRoot) {
		//Componentes do nó root
		HBox cmp01 = new HBox();
		Rectangle cmp02 = new Rectangle(100,100,Color.BLUE);
		Text cmp03 = new Text("Dorm 6:\n200");
		Image img = new Image(getClass().getResource("images/Duke.png")
				.toString());
		ImageView cmp04 = new ImageView(img);
		//Redimensionar a imagem
		cmp04.setFitWidth(100); //Deixando com 100px de largura
		//Ajuste para não distorcer a imagem
		cmp04.setPreserveRatio(true);
		//Criando os 3 botões
		Button btn01 = new Button("Say 'Hello World'");
		Button btn02 = new Button("222");
		Button btn03 = new Button("33333");
		//Amarrando os componentes
		noRoot.getChildren().addAll(cmp01,cmp02,cmp03,cmp04);
		cmp01.getChildren().addAll(btn01,btn02,btn03);		
		//ajustando posição
		cmp01.setLayoutY(300);
		cmp01.setPrefWidth(400);
		//ajustando a imagem
		cmp04.setLayoutX(290);
		cmp04.setLayoutY(10);
		//ajustando o texto
		//https://docs.oracle.com/javafx/2/text/jfxpub-text.html
		cmp03.setLayoutX(100);
		cmp03.setLayoutY(200);
		cmp03.setFont(Font.font("Verdana", FontWeight.BOLD,30));
		cmp03.setFill(Color.RED);
		cmp03.setTextAlignment(TextAlignment.CENTER); //alinhando centralizado
		//colocando contorno
		cmp03.setStroke(Color.BLACK);
		cmp03.setStrokeWidth(5); //espessuta do contorno
		cmp03.setStrokeType(StrokeType.OUTSIDE); //contorno por fora
		cmp03.setStrokeLineCap(StrokeLineCap.ROUND); //cantos arredondados
		cmp03.setStrokeLineJoin(StrokeLineJoin.ROUND); //junções arrendondadas
		//criando efeito de sombra
		DropShadow ds = new DropShadow();
		ds.setColor(Color.BLACK);
		//APLICANDO O EFEITO NO TEEXTO
		cmp03.setEffect(ds);
		//ajustando o retanglo
		cmp02.setLayoutX(10);
		cmp02.setLayoutY(10);
		cmp02.setStroke(Color.ORANGE);
		cmp02.setStrokeWidth(10);
		//ajustando botoes para se ajustar ao hbox
		HBox.setHgrow(btn01, Priority.ALWAYS);
		HBox.setHgrow(btn02, Priority.ALWAYS);
		HBox.setHgrow(btn03, Priority.ALWAYS);
		
		btn01.setMaxWidth(Double.MAX_VALUE);
		btn02.setMaxWidth(Double.MAX_VALUE);
		btn03.setMaxWidth(Double.MAX_VALUE);
		
	}
	public static void main(String[] args) {
		launch(args);

   }
}

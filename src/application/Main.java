package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Text msg = new Text("Bienvenue � Java FX");
			//Button btn = new Button("Cliquer ici");  // cr�er un composant
			//Button btn2 = new Button("Bye"); 
			
			//StackPane root = new StackPane(); // Un cr�e un gestionnaire de layout(disposition)
			//VBox root = new VBox();
			//root.getChildren().addAll(btn,msg,btn2); 
			//root.getChildren().add(btn); // associer � ce gestionnaire le btn
			
			Text titre = new Text("Formulaire d'inscription");
			
			HBox textNom_textFNom = new HBox();
			Text nom = new Text("Nom:");
			TextField txtFNom = new TextField();
			textNom_textFNom.getChildren().addAll(nom,txtFNom);

			HBox textPrenom_textFprenom = new HBox();
			Text prenom = new Text("Pr�nom:");
			TextField txtFPrenom = new TextField();
			textPrenom_textFprenom.getChildren().addAll(prenom,txtFPrenom);
			
			Button btn = new Button("Ajouter");
			
			VBox root = new VBox();
			root.getChildren().addAll(titre,textNom_textFNom,textPrenom_textFprenom,btn);
			
			Scene scene = new Scene(root,300,300); // on cr�e une sc�ne de dim 400 * 400 ayant comme gestionnaire de disposition root
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene); // th�atre
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

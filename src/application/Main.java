package application;
	
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			//Text msg = new Text("Bienvenue à Java FX");
			//Button btn = new Button("Cliquer ici");  // créer un composant
			//Button btn2 = new Button("Bye"); 
			
			//StackPane root = new StackPane(); // Un crée un gestionnaire de layout(disposition)
			//VBox root = new VBox();
			//root.getChildren().addAll(btn,msg,btn2); 
			//root.getChildren().add(btn); // associer à ce gestionnaire le btn
			
			Label titre = new Label("Formulaire d'inscription");
			
			HBox textNom_textFNom = new HBox();
			
			Text nom = new Text("Nom:");
			HBox.setMargin(nom, new Insets(10,0,10,10)); 
			TextField txtFNom = new TextField();
			HBox.setMargin(txtFNom, new Insets(10,0,10,45)); 
			textNom_textFNom.getChildren().addAll(nom,txtFNom);

			HBox textPrenom_textFprenom = new HBox();
			Text prenom = new Text("Prénom:");
			HBox.setMargin(prenom, new Insets(10,0,10,10)); 
			TextField txtFPrenom = new TextField();
			HBox.setMargin(txtFPrenom, new Insets(10,0,10,30)); 
			textPrenom_textFprenom.getChildren().addAll(prenom,txtFPrenom);
			
			Button btn = new Button("Ajouter");
			
			
			VBox root = new VBox();
			VBox.setMargin(btn, new Insets(10,0,10,120));
			VBox.setMargin(titre, new Insets(10,0,10,120));
			
			root.getChildren().addAll(titre,textNom_textFNom,textPrenom_textFprenom,btn);
			
			Scene scene = new Scene(root,300,300); // on crée une scène de dim 400 * 400 ayant comme gestionnaire de disposition root
			
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			
			primaryStage.setScene(scene); // théatre
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}

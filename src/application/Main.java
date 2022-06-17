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
			//Text msg = new Text("Bienvenue à Java FX");
			//Button btn = new Button("Cliquer ici");  // créer un composant
			//Button btn2 = new Button("Bye"); 
			
			//StackPane root = new StackPane(); // Un crée un gestionnaire de layout(disposition)
			//VBox root = new VBox();
			//root.getChildren().addAll(btn,msg,btn2); 
			//root.getChildren().add(btn); // associer à ce gestionnaire le btn
			
			HBox root = new HBox();
			Text titre = new Text("Votre nom : ");
			TextField txtFNom = new TextField();
			root.getChildren().addAll(titre,txtFNom);
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

import bootstrap.ArgumentsFilterServiceImpl;
import bootstrap.CommandInitializer;
import bootstrap.CommandServiceImpl;
import bootstrap.KeyBoardInputServiceImpl;
import controller.MainController;

public class NotepadApplication {

	public static void main(String[] args) {
		MainController mainController = new MainController(
				new CommandInitializer(),
				new CommandServiceImpl(),
				new ArgumentsFilterServiceImpl(),
				new KeyBoardInputServiceImpl());
		mainController.run();
	}

}

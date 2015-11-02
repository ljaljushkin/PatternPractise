import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) throws CloneNotSupportedException {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Paint v 2.0");

        ConsolePainter consolePainter = new ConsolePainter();
        final GUIPainter guiPainter = new GUIPainter();
        final FigureCollection collection = new FigureCollection();

        Group root = new Group();

        GridPane gridPane = new GridPane();
        gridPane.setPrefSize(640, 480);
        gridPane.setMinSize(640, 480);
        gridPane.setMaxSize(640, 480);
        ColumnConstraints column1 = new ColumnConstraints();
        column1.setPercentWidth(80);
        ColumnConstraints column2 = new ColumnConstraints();
        column2.setPercentWidth(10);
        ColumnConstraints column3 = new ColumnConstraints();
        column3.setPercentWidth(10);
        gridPane.getColumnConstraints().addAll(column1, column2, column3);

        Canvas canvas = guiPainter.getCanvas();
        final TextArea scaleX = new TextArea("1");
        final TextArea scaleY = new TextArea("1");
        final TextArea alpha = new TextArea("1");
        Button acceptScale = new Button("Accept Scale");
        Button acceptAlpha = new Button("Accept Alpha");

        gridPane.add(canvas, 0, 0);
        gridPane.setVgap(5);
        gridPane.setRowSpan(canvas, 4);
        gridPane.add(scaleX, 1, 0);
        gridPane.add(scaleY, 2, 0);
        gridPane.add(acceptScale, 1, 1);
        gridPane.setColumnSpan(acceptScale, 2);
        gridPane.add(alpha, 1, 2);
        gridPane.setColumnSpan(alpha, 2);
        gridPane.add(acceptAlpha, 1, 3);
        gridPane.setColumnSpan(acceptAlpha, 2);
        gridPane.setValignment(acceptAlpha, VPos.TOP);
        //gridPane.setGridLinesVisible(true);


        root.getChildren().add(gridPane);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

        acceptScale.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double x = Double.parseDouble(scaleX.getText());
                double y = Double.parseDouble(scaleY.getText());
                System.out.println("SCALE : " + x + ":" + y);
                guiPainter.changeScale(x, y, collection);
            }
        });

        acceptAlpha.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double doubleAlpha = Double.parseDouble(alpha.getText());
                System.out.println("ALPHA : " + doubleAlpha);
                guiPainter.changeAlpha(doubleAlpha, collection);
            }
        });

        Rectangle rectangle_prototype = new Rectangle();
        Ellipse ellipse_prototype = new Ellipse();
        Rectangle new_rectangle;
        Ellipse new_ellipse;

        for (int i = 20; i < 30; i++) {
            new_rectangle = rectangle_prototype.clone();
            new_rectangle.init(i * 4, i * 5, i * 7, i * 4);

            new_ellipse = ellipse_prototype.clone();
            new_ellipse.init(i * 3, i * 2, i * 9, i * 6);

            collection.addFigure(new_rectangle);
            collection.addFigure(new_ellipse);
        }

        for (AbstractFigure figure : collection.getFigureList()) {
            figure.draw(guiPainter);
            figure.draw(consolePainter);
        }

    }
}
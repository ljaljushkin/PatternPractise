package weak_bridge;


import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.VPos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import weak_bridge.drawer.console.ConsoleDrawer;
import weak_bridge.drawer.javafx.JavaFXDrawer;
import weak_bridge.shape.*;

public class Main extends Application {

    Button acceptScale;
    Button acceptAlpha;

    TextArea scaleX;
    TextArea scaleY;
    TextArea alpha;

    private GraphicsContext graphicsContext;
    private Canvas canvas;

    public static void main(String[] args) throws CloneNotSupportedException {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        createAndShowGui(stage);

        ShapeCollection shapeCollection = new ShapeCollection();

        ConsoleDrawer consoleDrawer = new ConsoleDrawer();
        JavaFXDrawer javaFXDrawer = new JavaFXDrawer(canvas, graphicsContext);

        setListeners(javaFXDrawer, shapeCollection);

        Rectangle rectangle_prototype = new Rectangle();
        Circle circle_prototype = new Circle();
        Triangle triangle_prototype = new Triangle();
        CompositeShape compositeShape_prototype = new CompositeShape();

        Rectangle r1 = (Rectangle) rectangle_prototype.clone();
        r1.initialize(300, 200, 100, 100);
        shapeCollection.add(r1);

        Rectangle r2 = (Rectangle) rectangle_prototype.clone();
        r2.initialize(150, 100, 10, 100);
        shapeCollection.add(r2);

        Circle c1 = (Circle) circle_prototype.clone();
        c1.initialize(50, 200, 300);
//        shapeCollection.add(c1);

        Triangle t1 = (Triangle) triangle_prototype.clone();
        t1.initialize(200, 100, 10, 10, 100, 100);
//        shapeCollection.add(t1);

        CompositeShape cs1 = (CompositeShape) compositeShape_prototype.clone();
        cs1.add(c1);
        cs1.add(t1);
        shapeCollection.add(cs1);

        for (Shape shape : shapeCollection.getShapes()) {
            shape.draw(consoleDrawer);
            shape.draw(javaFXDrawer);
        }
    }

    private void setListeners(final JavaFXDrawer javaFXDrawer, final ShapeCollection shapeCollection) {

        acceptScale.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double x = Double.parseDouble(scaleX.getText());
                double y = Double.parseDouble(scaleY.getText());
                System.out.println("Changed SCALE : " + x + ":" + y);
                javaFXDrawer.changeScale(x, y);
                shapeCollection.redraw(javaFXDrawer);
            }
        });

        acceptAlpha.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                double doubleAlpha = Double.parseDouble(alpha.getText());
                System.out.println("changed ALPHA : " + doubleAlpha);
                javaFXDrawer.changeAlpha(doubleAlpha);
                shapeCollection.redraw(javaFXDrawer);
            }
        });
    }

    private void createAndShowGui(Stage primaryStage) {
        canvas = new Canvas(512, 400);
        graphicsContext = canvas.getGraphicsContext2D();

        primaryStage.setTitle("JavaFX Drawer");

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

        scaleX = new TextArea("1.1");
        scaleY = new TextArea("0.8");
        alpha = new TextArea("0.5");
        acceptScale = new Button("Change Scale");
        acceptAlpha = new Button("Change Alpha");

        GridPane.setRowSpan(canvas, 4);
        GridPane.setColumnSpan(acceptScale, 2);
        GridPane.setColumnSpan(alpha, 2);

        GridPane.setColumnSpan(acceptAlpha, 2);
        GridPane.setValignment(acceptAlpha, VPos.TOP);

        gridPane.add(canvas, 0, 0);
        gridPane.setVgap(5);
        gridPane.add(scaleX, 1, 0);
        gridPane.add(scaleY, 2, 0);
        gridPane.add(acceptScale, 1, 1);
        gridPane.add(alpha, 1, 2);
        gridPane.add(acceptAlpha, 1, 3);

        root.getChildren().add(gridPane);

        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}


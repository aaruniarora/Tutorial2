import Shapes.Rect;
import Shapes.Square;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Drawing extends Canvas {
    // A private field called f of AWT class Frame..
    private Frame f;

    private Circle c;
    private Rect r;
    private Square s;
    private Point p, p2, p3;
    private Color col, col2, col3;

    ArrayList<Shape> shapes=new ArrayList<>();



    // The constructor
    public Drawing(){
        System.out.println(shapes.size());
        setupFrame();
        setupCanvas();
        /*
        for (int circ=1; circ < 5; circ++){
            Point p1=new Point(circ*100,circ*100);
            Color col1=new Color(circ*5,circ*10,circ*7);
            Circle c=new Circle(p1,col1,circ*100);
            shapes.add(c);
        }

        for (int r=1; r < 3; r++){
            Point p2=new Point(r*200,r*200);
            Color col2=new Color(r*3,r*5,r*7);
            Rect re=new Rect(p2,col2,r*50,r*100);
            shapes.add(re);
        }

        for (int s=1; s < 7; s++){
            Point p3=new Point(s*200,s*200);
            Color col3=new Color(s*6,s*4,s*2);
            Square sq=new Square(p3,col3,s*50);
            shapes.add(sq);
        }

        */
        p = new Point(100,100); //check!! jframe positioning --> absolute and relative positions
        p2 = new Point(200,200);
        p3 = new Point(100,100);

        col = new Color(0x992266); // The RGB number comprises three bytes: red, green and blue
        col2 = new Color(0x092060);
        col3 = new Color(0x006214);

        c = new Circle(p,col,200);
        r = new Rect(p2,col2,400,100);
        s = new Square(p3,col3,100);
        shapes.add(c);

    }

    private void setupCanvas() {
        setBackground(Color.BLACK); 	// Sets the Canvas background
        setSize(400, 400);		// Sets the Canvas size to be the same as the frame
    }

    private void setupFrame() {
        f = new Frame("My window"); 	// Instantiates the Frame
        f.add(this);			// Adds the Canvas (ie this object) to the Frame
        f.setLayout(null);		// Stops the frame from trying to layout contents
        f.setSize(400, 400);		// Sets the dimensions of the frame
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {	// Closes the program if close window clicked
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public void paint(Graphics g){
        c.draw(g);
        //re.draw(g);
        //sq.draw(g);
    }
}
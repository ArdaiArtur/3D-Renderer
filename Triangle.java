import javax.swing.text.AttributeSet.ColorAttribute;

public class Triangle {
    
        Vertex v1;
        Vertex v2;
        Vertex v3;
        ColorAttribute color;
        Triangle(Vertex v1, Vertex v2, Vertex v3, ColorAttribute color) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
            this.color = color;
        }
}

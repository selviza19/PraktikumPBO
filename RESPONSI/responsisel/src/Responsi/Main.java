
package Responsi;

public class Main {

    public static void main(String[] args) {
        ViewMovie view = new ViewMovie();
        ModelMovie model = new ModelMovie();
        ControllerMovie controller = new ControllerMovie (model, view);
        
    }    
}

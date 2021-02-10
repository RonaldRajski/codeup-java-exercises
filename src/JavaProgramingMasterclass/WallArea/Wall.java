package JavaProgramingMasterclass.WallArea;

public class Wall {

    private double width;
    private double height;


//Constructor 1
    public Wall() {
        this.width = width;
        this.height = height;
    }


//Constructor 2
    public Wall(double width, double height) {
        if(width > 0 && height > 0){
            this.width = width;
            this.height =  height;
        }
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }

        if (height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

//getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }


//    Setters
    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }

    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }
        else{
            this.height = height;
        }

    }

    public double getArea(){
        return this.width * this.height;
    }
}

package Movies;

import util.Input;



public class Movie {
//    Create a class named Movie. X
//    private fields for name and category,

    private String name;
    private String category;

    public Movie(String name, String category){
        this.name = name;
        this.category = category;
    }

    //    Create methods to access these properties and change them (getters and setters).
    public String getMovie(){
        return this.name + " " + this.category;
    }

    public String setName(String name){
        name = this.name;
        return name;
    }

    public String setCategory(String category){
        category = this.category;
        return category;
    }

    public String setMovie(String name, String Category){
        name = this.name;
        category = this.category;
        return name + " " + category;
    }
}

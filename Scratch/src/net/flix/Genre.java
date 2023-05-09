package net.flix;

enum Genre {
    //These are the 8 named Genre objects (instances)
    //each of these calls the ctor below, passing a display string
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy"),
    HORROR("Horror"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama");

    //everything below here is regular class definition stuff, ie fields, constuctors, methods
    private final String display;

    //constuctors- implicitly private, only called from inside (8 times above)
    Genre(String display) {
        System.out.println("Genre ctor called");
        this.display = display;
    }

    //accessor methods- read-only access to display properties. only getters
    public String getDisplay() {
        return display;
    }

    public String toString(){
        return getDisplay(); //generally better to call you own getters
    }
}
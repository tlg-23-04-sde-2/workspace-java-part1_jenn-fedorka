package net.flix;

class Movie {
    //instance variables
    private String title;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;

    //constructor methods
    public Movie() {
        //no-op
    }

    public Movie(String title) {
        setTitle(title);
    }

    public Movie(String title, Genre genre) {
        this(title);
        setGenre(genre);
    }

    public Movie(String title, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(title, genre); //delegate to construct above for title
        setReleaseYear(releaseYear);  //delegate to its setter for any validation/conversion
        setRevenue(revenue); //delegate to its setter for any validation/conversion
        setRating(rating);
    }

    //business methods - pause(), play(), stop(), rewind(), fastForward()


    //accessor (get/set) methods - these provide "controlled access" to objects fields

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public Double getRevenue() {
        return revenue;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    //description
    public String toString() {
        return String.format("Movie: Title = %S. Release Year = %S, Revenue = $%,.2f, Rating = %S, Genre = %S",
                getTitle(), getReleaseYear(), getRevenue(), getRating(), getGenre());


//        return "Movie: Title=" + getTitle() + ", Release Year = " + getReleaseYear() +
//                ", Revenue= " + getRevenue() + ", Rating " + getRating() + ", Genre = " + getGenre();
    }
}
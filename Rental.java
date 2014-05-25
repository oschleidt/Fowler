class Rental {
    private Movie movie;
    private int daysRented;
    public Rental(Movie newmovie, int newdaysRented) {
        movie = newmovie;
        daysRented = newdaysRented;
    }
    public int getDaysRented() {
        return daysRented;
    }
    public Movie getMovie() {
        return movie;
    }
    
    
    int getFrequentRenterPoints() {
    	return _movie.getFrequentRenterPoints(_daysRented);
    }
    
    double getCharge() {
    	return _movie.getCharge(_daysRented); 
    }

}
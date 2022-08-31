
public class movietickett{
    int movieId;
    int noofSeats;
    double costperTickets;
    public movietickett(){

    }
    public int getMovieId() {
        return movieId;
    }
    public void setMovieID(int movieId){
        this.movieId = movieId;
    }
    public int getnofoseat(){
        return noofSeats; 
    }
    public void setnoofseats(int seats){
        this.noofSeats = seats;
    }
    public double getcostperticket(){
        return costperTickets;
    }
    public void setcostperticket(double cost){
        this.costperTickets = cost;
    }

    public double calculateamount(){

    }
  
}
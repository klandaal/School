package Assignment4;
//The movie class will describe a movie.

public class Movie
{
    String movieTitle;
    int year;
    int length;
    Production prodCompany;

    public Movie()
    {
        movieTitle = "?";
        year = 0;
        length = 0;
        prodCompany = new Production();
    }

    //getter for movie title
    public String getMovieTitle()
    {
        return movieTitle;
    }

    //getter for year of the movie
    public int getYear()
    {
        return year;
    }

    //getter for movie length
    public int getLength()
    {
        return length;
    }

    //getter for the production company
    public Production getProdCompany()
    {
        return prodCompany;
    }

    //setter for the movie title
    public void setMovieTitle(String someTitle)
    {
        movieTitle = someTitle;
    }

    //setter for the year of the movie
    public void setYear(int someYear)
    {
        year = someYear;
    }

    //setter for the length of the movie
    public void setLength(int someLength)
    {
        length = someLength;
    }

    //setter for the production company
    public void setProdCompany(String someName, String someCity, String someState)
    {
        prodCompany.setCompanyName(someName);
        prodCompany.setLocationCity(someCity);
        prodCompany.setLocationState(someState);
    }

    public String toString()
    {
        String result = "";
        result += "\nMovie Title:\t\t" + movieTitle + "\n" +
                "Movie Length:\t\t"+ length + "\n" +
                "Movie Year:\t\t" + year + "\n" +
                "Movie Production:\t" + prodCompany + "\n\n";
        return result;
    }
}
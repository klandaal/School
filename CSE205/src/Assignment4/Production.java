package Assignment4;
// The Production class will describe the information of a
// production company.

public class Production
{
    String companyName;
    String locationCity;
    String locationState;

    //default constructor
    public Production()
    {
        companyName = "?";
        locationCity = "?";
        locationState = "?";
    }

    //getter for company name
    public String getCompanyName()
    {
        return companyName;
    }

    //getter for city name
    public String getLocationCity()
    {
        return locationCity;
    }

    //getter for state name
    public String getLocationState()
    {
        return locationState;
    }

    //setter for company name
    public void setCompanyName(String someName)
    {
        companyName = someName;
    }

    //setter for city name
    public void setLocationCity(String someCity)
    {
        locationCity = someCity;
    }

    //setter for state name
    public void setLocationState(String someState)
    {
        locationState = someState;
    }

    //creates a string of all the information
    public String toString()
    {
        String result = "";
        result += companyName + " at " + locationCity +
                "," + locationState;
        return result;
    }
}
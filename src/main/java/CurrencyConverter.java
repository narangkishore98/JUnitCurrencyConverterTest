public class CurrencyConverter
{
    private String currencies[] = {
            "CAD",
            "ERU",
            "JOD",
            "INR"
    };

    private double conversionRate[] = {
            0.74,
            1.11,
            1.41,
            0.013
    };

    //Checks if Currency is available in array or not. returns true if available, false otherwise.
    public int currencyAvailable(String currency)
    {
        for(int i=0;i<currencies.length;i++)
        {
            if(currencies[i].equalsIgnoreCase(currency))
            {
                return i;
            }
        }
        return -1;
    }

    public double convert(String from, String to, double amount)
    {
        double returner = 0.0;
        if(currencyAvailable(from)!=-1 && currencyAvailable(to)!=-1)
        {
            //converting from to USD
            returner = conversionRate[currencyAvailable(from)] * amount;
            //returner is in USD now.
            //returner to be converted in to currency.
            returner = returner / conversionRate[currencyAvailable(to)];
            return returner;
        }
        return 0.0;
    }

}

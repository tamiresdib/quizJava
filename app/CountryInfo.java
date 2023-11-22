public class CountryInfo {
    private String countryName;

    public CountryInfo(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}

public class CountryModel {
    public static List<CountryInfo> getMockedCountryList() {
        List<CountryInfo> countries = new ArrayList<>();
        countries.add(new CountryInfo("Indonésia"));
        countries.add(new CountryInfo("Austrália"));
        countries.add(new CountryInfo("Nova Zelândia"));
        countries.add(new CountryInfo("Cazaquistão"));
        return countries;
    }
}
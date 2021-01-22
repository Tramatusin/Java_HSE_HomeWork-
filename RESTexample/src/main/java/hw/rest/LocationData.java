package hw.rest;

public class LocationData {
    private final Double width;
    private final Double longitude;
    private final String country;
    private final String region;
    private final String city;

    public LocationData(String country,String region,String city,Double width,Double longitude) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.width = width;
        this.longitude = longitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Double getWidth() {
        return width;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getStructureDetails() {
        return "Страна: " + getCountry() + "\n" +
                "Область: " + getRegion() + "\n" +
                "Город: " + getCity() + "\n" +
                "Широта: " + getWidth() + "\n" +
                "Долгота: " + getLongitude();
    }
}

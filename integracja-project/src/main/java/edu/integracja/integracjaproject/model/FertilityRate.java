package edu.integracja.integracjaproject.model;

public class FertilityRate {

    private int id;
    private Integer year;
    private Double rate;

    public FertilityRate(int id, Integer year, Double rate) {
        this.id = id;
        this.year = year;
        this.rate = rate;
    }

    public FertilityRate() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "FertilityRate{" +
                "id=" + id +
                ", year=" + year +
                ", rate=" + rate +
                '}';
    }
}


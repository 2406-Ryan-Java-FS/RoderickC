package com.revature.Model;

import java.util.Objects;

public class Entry {

    private int paint_id;
    private int posted_by;
    private String brand;
    private String paint_name;
    private double price;
    private String size;

    public Entry(){
    }

    public Entry(String brand, String paint_name, double price, String size) {
//        this.paint_id = paint_id;
        this.brand = brand;
        this.paint_name = paint_name;
        this.price = price;
        this.size = size;
    }

    public Entry(int paint_id, String brand, String paint_name, double price, String size) {
        this.posted_by = posted_by;
        this.paint_id = paint_id;
        this.brand = brand;
        this.paint_name = paint_name;
        this.price = price;
        this.size = size;
    }

    public int getPaint_id() {
        return paint_id;
    }

    public void setEntry_id(int paint_id) {
        this.paint_id = paint_id;
    }

    public int getPosted_by() {
        return posted_by;
    }

    public void setPosted_by(int posted_by) {
        this.posted_by = posted_by;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPaint_name() {
        return paint_name;
    }

    public void setPaint_name(String paint_name) {
        this.paint_name = paint_name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return paint_id == entry.paint_id && posted_by == entry.posted_by && Double.compare(price, entry.price) == 0 && Objects.equals(brand, entry.brand) && Objects.equals(paint_name, entry.paint_name) && Objects.equals(size, entry.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(paint_id, posted_by, brand, paint_name, price, size);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "paint_id=" + paint_id +
                ", posted_by=" + posted_by +
                ", brand='" + brand + '\'' +
                ", paint_name='" + paint_name + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
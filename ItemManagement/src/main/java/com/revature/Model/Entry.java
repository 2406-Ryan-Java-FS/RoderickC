package com.revature.Model;

import java.util.Objects;

public class Entry {

    private int entry_id;
    private int posted_by;
    private String brand;
    private String paint_name;
    private double price;
//    private String size;
    private long time_posted_epoch;

    public Entry() {

    }

    //getters and setters to publicly access var

    // for setting
    public Entry(int posted_by,
                 String brand,
                 String paint_name,
                 double price
//                 String size
    ) {
        this.posted_by = posted_by;
        this.brand = brand;
        this.paint_name = paint_name;
        this.price = price;
//        this.size = size;
    }

    // for getting
    public Entry(int entry_id,
                 int posted_by,
                 String brand,
                 String paint_name,
                 double price
//                 String size
                 ) {
        this.entry_id = entry_id;
        this.posted_by = posted_by;
        this.brand = brand;
        this.paint_name = paint_name;
        this.price = price;
//        this.size = size;
    }

    public int getEntry_id() {
        return entry_id;
    }

    public void setEntry_id(int entry_id) {
        this.entry_id = entry_id;
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

    public long getTime_posted_epoch() {
        return time_posted_epoch;
    }

    public void setTime_posted_epoch(long time_posted_epoch) {
        this.time_posted_epoch = time_posted_epoch;
    }

    // for test cases
    /*@Override
    public boolean equals(Object o) {
    }

    public String toString() {
    }
    */

    @Override
    public String toString() {
        return "Entry{" +
                "entry_id=" + entry_id +
                ", posted_by=" + posted_by +
                ", brand='" + brand + '\'' +
                ", paint_name='" + paint_name + '\'' +
                ", price=" + price +
                ", time_posted_epoch=" + time_posted_epoch +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return entry_id == entry.entry_id && posted_by == entry.posted_by && Double.compare(price, entry.price) == 0 && time_posted_epoch == entry.time_posted_epoch && Objects.equals(brand, entry.brand) && Objects.equals(paint_name, entry.paint_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entry_id, posted_by, brand, paint_name, price, time_posted_epoch);
    }
}
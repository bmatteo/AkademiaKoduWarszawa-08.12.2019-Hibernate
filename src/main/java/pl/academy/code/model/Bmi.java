package pl.academy.code.model;

import javax.persistence.*;

@Entity(name = "tbmi")
public class Bmi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int weight;
    private int height;
    @Enumerated(EnumType.STRING)
    @Column(length = 10)
    private Sex sex;
    private double bmi;

    public Bmi() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    @Override
    public String toString() {
        return "Bmi{" +
                "id=" + id +
                ", weight=" + weight +
                ", height=" + height +
                ", sex=" + sex +
                ", bmi=" + bmi +
                '}';
    }
}

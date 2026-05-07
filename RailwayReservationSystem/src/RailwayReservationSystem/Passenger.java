package RailwayReservationSystem;

public class Passenger {

    int id;
    String name;
    int age;
    String gender;
    String trainName;
    String source;
    String destination;
    String berth;

    public Passenger(int id, String name, int age,
                     String gender, String trainName,
                     String source, String destination,
                     String berth) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.berth = berth;
    }
}
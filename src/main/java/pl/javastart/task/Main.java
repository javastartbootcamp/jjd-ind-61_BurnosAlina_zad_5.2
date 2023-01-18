package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room room = new Room(15, 25.5, true, 21);
        System.out.println("Metraz pokoju: " + room.getSquareMeters() + "\nAktualna Temperatura: " +
                room.getTemperature() + "\nZamontowana klimatyzacja: " + room.isAirConditioner() +
                "\nTemperatura graniczna: " + room.getLimitTemperature());

        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
        room.lowerTemperature();
        System.out.println("Aktualna temperatura: " + room.getTemperature());
    }
}

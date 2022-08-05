package fifth;

public class FifthExercise {
    public static void main(String[] args) {
        House dom1 = new House(1, 30, 20);
        House dom5 = new House(5, 560, 400);
        House[] housesMoscow = {dom1, dom5};

        Park parkGorky = new Park("Парк Горького", 20000, 1000);
        Park sadBauman = new Park("Сад Баумана", 500, 100);
        Park[] parksLenin = {parkGorky};
        Park[] parksBasmannaya = {sadBauman};

        Street moscowLenin = new Street("Lenina", 5000, 2000, 10,
                true, housesMoscow, parksLenin);
        moscowLenin.addHouse(1, 20, 30);
        System.out.println(moscowLenin.calcHousesArea());
        System.out.println(moscowLenin.calcParksArea());


        Street moscowBasmannaya = new Street("Basmannaya", 3000, 500, 7,
                false, housesMoscow, parksBasmannaya);

        Street[] moscowStreet = {moscowLenin, moscowBasmannaya};

        City moscow = new City("Moscow", 12000000, 2511, moscowStreet);
        moscow.addStreet("Проектируемый проез №2456", 456,567,34,
                false,null,null);
        System.out.println(moscow.calcHousesNumber());


        House dom2 = new House(2);
        House dom6 = new House(6);
        House[] housesNoBurg = {dom2, dom6};

        Park parkEmptiness = new Park();
        Park[] parksNoBurg = {parkEmptiness};

        Street lost = new Street("Lost", housesNoBurg, parksNoBurg);
        Street empty = new Street("Empty", null, null);
        System.out.println(empty.calcHousesArea());
        empty.addHouse(1, 20, 30);


        Street[] noBurgStreet = {lost, empty};

        City noBurg = new City("NoBurg", 0, 0, noBurgStreet);


    }
}

package fourteenth;

import fifth.House;

import java.util.Iterator;
import java.util.List;

public class TreeDemo {
    public static void main(String[] args) {

        BinaryDictionary<String, House> demoTree = new BinaryDictionary<>();
        House dom1 = new House(1, 30, 20);
        House dom5 = new House(5, 560, 400);
        House dom6 = new House(6, 3, 2770);
        House dom7 = new House(7, 60, 8400);

        demoTree.put("Первый", dom1);
        demoTree.put("Второй", dom5);
        demoTree.put("Второй", dom6);
        demoTree.put("Пятый", dom7);
        demoTree.put("ПятыйЕ", dom7);
        System.out.println(demoTree.get("Пятый").getNumber());
        System.out.println(demoTree.get("Пятыйll"));

        Iterator<House> myIterator = demoTree.iterator();
        do {
            House temp = myIterator.next();
            System.out.println(temp.getNumber());
            System.out.println(temp.hashCode());
        } while (!myIterator.hasNext());

        ValueFilter<House> myFilter = (v) -> {
            if (v.hashCode() > 500000000) {
                return true;
            }
            return false;
        };

        List<House> filtredList = demoTree.filter(myFilter);
        for (int i = 0; i < filtredList.size(); i++) {
            System.out.println(filtredList.get(i).getNumber());
        }

    }
}

import java.util.ArrayList;
import java.util.List;

public class BSPractice {
    public static void main(String[] args) {
        List<Integer> items = new ArrayList<>();
        items.add(5);
        items.add(7);

        items.add(9);

        items.add(22);

        items.add(22);

        items.add(50);


        insert(items, 15);
        insert(items, 51);
        insert(items, 51);
        insert(items, 22);
        insert(items, 23);
        insert(items, -3);
        insert(items, -3);

        System.out.println(items);
        
    }

    public static void insert(List<Integer> items, int toInsert) {
        int low = 0;
        int high = items.size(); // Don't need to do a minus one

        int mid;

        while (low < high) {
            mid = low + (high - low) / 2;

            int midItem = items.get(mid);

            if(midItem == toInsert) {
                items.add(mid, toInsert);
                return;
            } else if (toInsert < midItem) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        items.add(low, toInsert);
    }
}
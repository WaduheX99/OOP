import javax.xml.transform.Source;

public class SortingDemo {
    public static void main(String[] args) {
        Sorting mine = new Sorting(5);
        System.out.println("Array sebelum Quick Sort : ");
        mine.tampil();
        mine.quick.sortQuick(mine.array, mine.start, mine.end);
        System.out.println("\nArray setelah Quick Sort : ");
        mine.tampil();
        System.out.println("\n===================");
        System.out.println("Array sebelum Merge Sort :");
        mine.tampil();
        mine.merge.sortMerge(mine.array, mine.start, mine.end);
        System.out.println("\nArray setelah Merge Sort : ");
        mine.tampil();
        System.out.println("\n===================");
        mine.reset();
        mine.bubble.sortBubble();
        mine.reset();
        mine.sortInsertion();
        mine.reset();
        mine.selection.sortSelection();
        mine.reset();
    }
}

import java.util.ArrayList;

public class SearchAlgorithms {


    // Bubble Sort
    public static void sortBooks(ArrayList<Book> books) {

        for (int i = 0; i < books.size() - 1; i++) {

            for (int j = 0; j < books.size() - i - 1; j++) {

                if (books.get(j).title.compareToIgnoreCase(
                        books.get(j + 1).title) > 0) {

                    Book temp = books.get(j);

                    books.set(j, books.get(j + 1));

                    books.set(j + 1, temp);
                }
            }
        }
    }


    // Binary Search
    public static Book binarySearch(ArrayList<Book> books, String title) {

        int low = 0;
        int high = books.size() - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            String currentTitle = books.get(mid).title;

            int result = currentTitle.compareToIgnoreCase(title);

            if (result == 0) {

                return books.get(mid);
            }

            if (result < 0) {

                low = mid + 1;

            } else {

                high = mid - 1;
            }
        }

        return null;
    }
}

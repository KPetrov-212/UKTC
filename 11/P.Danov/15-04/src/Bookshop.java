import java.util.ArrayList;
import java.util.List;

public class Bookshop {
    private List<Releases> avReleases = new ArrayList<>();
    private List<Releases> soldReleases = new ArrayList<>();

    public Bookshop() {
        // Initialize the bookshop with some releases
        avReleases.add(new Books("978-3-16-148410-0", "Book Title 1", "19.99", 10));
        avReleases.add(new Magazines("1234-5678", "Magazine Title 1", "5.99", 20));
    }
    public void sellRelease(String id) {
        for (Releases release : avReleases) {
            if (release.getId().equals(id)) {
                soldReleases.add(release);
                avReleases.remove(release);
                break;
            }
        }
    }
    public void printReleaseByAuthor(String author) {
        for (Releases release : avReleases) {
            if (release.getAuthors().contains(author)) {
                System.out.println("Title: " + release.getTitle() + ", Price: " + release.getPrice() + ", Quantity: " + release.getQuantity());
            }
        }
    }
    public void printReleaseByName(String name) throws noSuchTitleException {
        if (name == null || name.isEmpty()) {
            throw new noSuchTitleException("Title cannot be null or empty");
        }
        for (Releases release : avReleases) {
            if (release.getTitle().equalsIgnoreCase(name)) {
                System.out.println("Title: " + release.getTitle() + ", Price: " + release.getPrice() + ", Quantity: " + release.getQuantity());
                return;
            }
        }
        for (Releases release : soldReleases) {
            if (release.getTitle().equalsIgnoreCase(name)) {
                System.out.println("Found in sold releases:");
                System.out.println("Title: " + release.getTitle() + ", Price: " + release.getPrice() + ", Quantity: " + release.getQuantity());
                return;
            }
        }
        throw new noSuchTitleException("No release found with the title: " + name);
    }

    public void printIncomeFromAvailableReleases() {
        double totalIncome = 0.0;
        for (Releases release : avReleases) {
            totalIncome += Double.parseDouble(release.getPrice()) * release.getQuantity();
        }
        System.out.println("Total income from available releases: " + totalIncome);
    }


}

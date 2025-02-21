import java.util.ArrayList;

class Films {
    private ArrayList<Film> filmList;
    private static final int MAX_FILMS = 5;

    public Films() {
        filmList = new ArrayList<>();
    }

    public void addFilm(Film film) {
        for (Film f : filmList) {
            if (f.getUniqueId() == film.getUniqueId()) {
                System.out.println("This film already exists.");
                return;
            }
        }
        if (filmList.size() < MAX_FILMS) {
            filmList.add(film);
        } else {
            System.out.println("Film list is full!");
        }
    }

    public void printFilmsByProducer(String producer) {
        for (Film f : filmList) {
            if (producer.isEmpty() || f.getProducer().equalsIgnoreCase(producer)) {
                f.printFilmInfo();
            }
        }
    }

    public void printHighestBudgetFilm() {
        if (filmList.isEmpty()) {
            System.out.println("No films available.");
            return;
        }
        Film highestBudgetFilm = filmList.get(0);
        for (Film f : filmList) {
            if (f.getBudget() > highestBudgetFilm.getBudget()) {
                highestBudgetFilm = f;
            }
        }
        System.out.println("Film with highest budget:");
        highestBudgetFilm.printFilmInfo();
    }

    public double getAverageBudget(String producer) {
        if (filmList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        int count = 0;
        for (Film f : filmList) {
            if (producer.isEmpty() || f.getProducer().equalsIgnoreCase(producer)) {
                sum += f.getBudget();
                count++;
            }
        }
        return count > 0 ? sum / count : 0;
    }
}

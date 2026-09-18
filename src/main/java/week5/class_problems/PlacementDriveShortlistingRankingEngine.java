import java.util.Arrays;

public class PlacementDriveShortlistingRankingEngine
        implements Comparable<PlacementDriveShortlistingRankingEngine> {

    private String name;
    private double cgpa;
    private int codingScore;

    public PlacementDriveShortlistingRankingEngine(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    double getCompositeScore() {
        return cgpa * 10 + codingScore;
    }

    @Override
    public int compareTo(PlacementDriveShortlistingRankingEngine other) {
        return Double.compare(other.getCompositeScore(), this.getCompositeScore());
    }

    static String shortlistAndRank(
            PlacementDriveShortlistingRankingEngine[] candidates) {

        PlacementDriveShortlistingRankingEngine[] shortlisted =
                new PlacementDriveShortlistingRankingEngine[candidates.length];

        int count = 0;

        for (int i = 0; i < candidates.length; i++) {

            if (isEligible(candidates[i].cgpa) ||
                isEligible(candidates[i].cgpa, candidates[i].codingScore)) {

                shortlisted[count] = candidates[i];
                count++;
            }
        }

        PlacementDriveShortlistingRankingEngine[] finalList =
                Arrays.copyOf(shortlisted, count);

        Arrays.sort(finalList);

        String result = "";

        for (int i = 0; i < finalList.length; i++) {

            result = result + (i + 1) + ". "
                    + finalList[i].name + " ("
                    + finalList[i].getCompositeScore() + ")";

            if (i < finalList.length - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        PlacementDriveShortlistingRankingEngine[] candidates = {

            new PlacementDriveShortlistingRankingEngine("Aisha", 8.2, 40),
            new PlacementDriveShortlistingRankingEngine("Rohit", 6.8, 65),
            new PlacementDriveShortlistingRankingEngine("Meena", 6.0, 90),
            new PlacementDriveShortlistingRankingEngine("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
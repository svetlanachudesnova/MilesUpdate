public class BonusMilesService {
    public int calculate(int cost) {
        int rubPerMile = 20;
        int miles = cost / rubPerMile;
        return miles;
    }
}

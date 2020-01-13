package visitorpattern;

import java.util.ArrayList;
import java.util.List;

public class VisitorPattern {

    public static void main(String[] args) {
        VisitorPattern visitorPattern = new VisitorPattern();
        visitorPattern.run();
    }

    public void run() {
        Planet mars = new Planet.Mars();
        Planet saturn = new Planet.Saturn();
        Planet mercury = new Planet.Mercury();

        Explorer lifeExplorer = new Explorer.LifeExplorer();
        Explorer landscapeExplorer = new Explorer.LandscapeExplorer();

        List<Planet> planets = new ArrayList<>();
        planets.add(mars);
        planets.add(saturn);
        planets.add(mercury);

        for (Planet p : planets) {
            p.accept(lifeExplorer);
            p.accept(landscapeExplorer);
        }

    }
}
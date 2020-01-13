package visitorpattern;

public interface Explorer {

    void visit(Planet.Mercury mercury);

    void visit(Planet.Mars mars);

    void visit(Planet.Saturn saturn);

    default void visit(Planet planet) {
        System.out.println("Landed on an unknown planet...");
    }

    public static class LifeExplorer implements Explorer {
        @Override
        public void visit(Planet.Mercury mercury) {
            System.out.println("Deploying tools specific to Mercury... exploring life");
        }

        @Override
        public void visit(Planet.Mars mars) {
            System.out.println("Deploying tools specific to Mars... exploring life");
        }

        @Override
        public void visit(Planet.Saturn saturn) {
            System.out.println("Deploying tools specific to Saturn... exploring life");
        }
    }

    public static class LandscapeExplorer implements Explorer {
        @Override
        public void visit(Planet.Mercury mercury) {
            System.out.println("Adjusting camera to Mercury atmosphere... taking picture of Mercury");
        }

        @Override
        public void visit(Planet.Mars mars) {
            System.out.println("Adjusting camera to Mars atmosphere ... taking picture of Mars");
        }

        @Override
        public void visit(Planet.Saturn saturn) {
            System.out.println("Adjusting camera to Saturn atmosphere ... taking picture of Saturn");
        }
    }
}


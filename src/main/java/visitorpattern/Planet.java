package visitorpattern;

public interface Planet {
    void accept(Explorer explorer);

    public static class Mercury implements Planet {
        @Override
        public void accept(Explorer explorer) {
            explorer.visit(this);
        }
    }

    public static class Mars implements Planet {
        @Override
        public void accept(Explorer explorer) {
            explorer.visit(this);
        }
    }

    public static class Saturn implements Planet {
        @Override
        public void accept(Explorer explorer) {
            explorer.visit(this);
        }
    }
}
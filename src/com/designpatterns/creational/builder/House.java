package com.designpatterns.creational.builder;

public class House {
    private String foundation;
    private String walls;
    private String roof;
    private boolean hasGarage;
    private boolean hasGarden;
    private boolean hasPool;

    // Private constructor to enforce use of Builder
    private House(HouseBuilder builder) {
        this.foundation = builder.foundation;
        this.walls = builder.walls;
        this.roof = builder.roof;
        this.hasGarage = builder.hasGarage;
        this.hasGarden = builder.hasGarden;
        this.hasPool = builder.hasPool;
    }

    public static class HouseBuilder {
        private String foundation;
        private String walls;
        private String roof;
        private boolean hasGarage;
        private boolean hasGarden;
        private boolean hasPool;

        public HouseBuilder buildFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }

        public HouseBuilder buildWalls(String walls) {
            this.walls = walls;
            return this;
        }

        public HouseBuilder buildRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public HouseBuilder addGarage() {
            this.hasGarage = true;
            return this;
        }

        public HouseBuilder addGarden() {
            this.hasGarden = true;
            return this;
        }

        public HouseBuilder addPool() {
            this.hasPool = true;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}

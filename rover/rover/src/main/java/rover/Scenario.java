package rover;

/**
 * Created by dominic on 26/11/16.
 */
public enum Scenario {
  SCENARIO_0(20, 1, 10, 1.0, 5000, 1, false),
  SCENARIO_1(40, 5, 5, 1.0, 5000, 1, false),
  SCENARIO_2(80, 10, 5, 1.0, 1000, 3, false),
  SCENARIO_3(100, 10, 1, 1.0, 1000, 3, false),
  SCENARIO_4(200, 15, 1, 1.0, 500, 10, false),
  SCENARIO_5(500, 30, 2, 1.0, 1000, 5, true),
  SCENARIO_6(100, 10, 1, 0.5, 1000, 5, false),
  SCENARIO_7(250, 25, 5, 0.25, 1000, 10, false),
  SCENARIO_8(750, 5, 15, 0.5, 2000, 10, false),
  SCENARIO_9(750, 50, 2, 0.5, 2000, 5, true);

  private int size;
  private int resourcePiles;
  private int resourcePileSize;
  private double resourceTypSplit;
  private int energy;
  private int roverCount;
  private boolean competitive;

  Scenario(int size, int resourcePiles, int resourcePileSize, double resourceTypSplit, int energy, int roverCount, boolean competitive) {
    this.size = size;
    this.resourcePiles = resourcePiles;
    this.resourcePileSize = resourcePileSize;
    this.resourceTypSplit = resourceTypSplit;
    this.energy = energy;
    this.roverCount = roverCount;
    this.competitive = competitive;
  }

  public int getSize() {
    return size;
  }

  public int getResourcePiles() {
    return resourcePiles;
  }

  public int getResourcePileSize() {
    return resourcePileSize;
  }

  public double getResourceTypSplit() {
    return resourceTypSplit;
  }

  public int getEnergy() {
    return energy;
  }

  public int getRoverCount() {
    return roverCount;
  }

  public boolean isCompetitive() {
    return competitive;
  }
}

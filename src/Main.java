public class Main {
    public static void main(String[] args) {

        Part tireDunlop = new Part("Dunlop", 80);
        Part tireConti = new Part("Conti", 100);
        Part tireMichelin = new Part("Michelin", 90);
        Part tirePirelli = new Part("Pirelli", 70);
        Part tireTojo = new Part("Tojo", 60);

        Container tireContainer = new Container("Tire Container for Singapur");
        tireContainer.addShipment(tireDunlop);
        tireContainer.addShipment(tireConti);
        tireContainer.addShipment(tireMichelin);
        tireContainer.addShipment(tirePirelli);
        tireContainer.addShipment(tireTojo);

        Part renaultEngine = new Part("Renault Super Master X", 2348);
        Part ferrrariEngine = new Part("Ferrari TQ", 98763);

        Container engineContainer = new Container("Engine Container for Singapur");
        engineContainer.addShipment(renaultEngine);
        engineContainer.addShipment(ferrrariEngine);

        Part hammer = new Part("Hammer", 10);
        Part screwdriver = new Part("Screwdriver", 20);
        Part screws = new Part("Screws", 100);

        Container toolContainer = new Container("Tool Container for Singapur");
        toolContainer.addShipment(hammer);
        toolContainer.addShipment(screws);
        toolContainer.addShipment(screwdriver);

        Container singapurRaceContainer = new Container("Singapur Race Container");
        singapurRaceContainer.addShipment(tireContainer);
        singapurRaceContainer.addShipment(engineContainer);
        singapurRaceContainer.addShipment(toolContainer);

        Part assecoiresPart = new Part("Team Assecoires", 2000);
        singapurRaceContainer.addShipment(assecoiresPart);

        singapurRaceContainer.print();

    }
}
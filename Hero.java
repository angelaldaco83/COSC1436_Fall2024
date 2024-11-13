public class Hero 
    {
        private String name;
        private int powerLevel;
        private Affiliation affiliation;

        //This is a constructer for the heroes attributes
        public Hero(String name, int powerLevel, Affiliation affiliation) 
            {
            this.name = name;
            this.powerLevel = powerLevel;
            this.affiliation = affiliation;
            }

        //This is a getter method
        public String getName() 
            {
                return name;
            }

        public int getPowerLevel() 
            {
                return powerLevel;
            }

        public Affiliation getAffiliation() 
            {
                return affiliation;
            }

        //This will go to the string as in the hero string
        @Override
        public String toString() 
            {
                return name + " | Power: " + powerLevel + " | Affiliation: " + affiliation;
            }
}
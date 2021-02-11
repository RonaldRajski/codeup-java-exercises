package KalypsoStudyJavaFundamentals;




    //TODO: 3. Create an Animal class. It should have private instance properties for a name and species, and public getters and setters for both.
    public class Animal {
        public static void main(String[] args) {

//            Animal tiger = new Animal();
//            tiger.name = "Tiger";



//            Animal cat = new Animal();
//            cat.setName("Vishnu");
//            cat.setSpecies("Felis catus");
//            cat.roar();
//
//            Animal rat = new Animal();
//            rat.setName("Sophie");
//            rat.setSpecies("Ratus");
//
//            ArrayList<Animal> animals = new ArrayList<>();
//            animals.add(cat);
//            animals.add(rat);
//
//            Animal.catRemoval(animals);
//            // Display how many animals we have in the list
//            System.out.println("Number of animals in the list: " + animals.size());
//            for (int i = 0; i < animals.size(); i++) {
//                System.out.println(animals.get(i).getSpecies());








        }

        //Private instances
        private String name;
        private String species;

        //Getters
        public String getName() {
            return this.name;
        }
        public String getSpecies() {
            return this.species;
        }

        //Setters
        public void setName(String name) {
            this.name = name;
        }
        public void setSpecies(String species) {
            this.species = species;
        }

        //TODO: 4. Within your Animal class, define an instance method named roar. It should accept no arguments and return a string like "I am $NAME, hear me roar!" where $NAME is replaced with the value of the name property for that object.
        public String roar() {
            return "I am " + getName() + ", hear me roar!";


        }

//       TODO 5: Within your Assessment class create a public static method named removeCats. It should accept a list of animal objects and return a list of animal objects where any animal object with a species of "Felis catus" is removed.




        }






public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    Herbivores gazel = new Herbivores("Газель",10,"Пастбища",70,"Трава");
    Herbivores giraffe = new Herbivores("Жираф",15,"Суша",25,"Трава,Сено");
    Herbivores horse = new Herbivores("Лошадь",15,"Пастбища",45,"Трава,Сено");
    Predators hyena = new Predators("Гиена",15,"Степь",40,"Мясо");
    Predators tiger = new Predators("Тигр",20,"Саванна,Лес",60,"Мясо");
    Predators bear = new Predators("Медведь",20,"Лес,Арктические льды",35,"Мясо,Рыба");
    Amphibians frog = new Amphibians("Лягушка",5,"Пруд");
    Amphibians snake = new Amphibians("Уж",3,"Река,Болото");
    Flightless peacock = new Flightless("Павлин",4,"Луг","По земле");
    Flightless penguin = new Flightless("Пингвин",5,"Арктика","По земле");
    Flightless dodoBird = new Flightless("Додо",6,"Тропики","По земле");
    Flying gull = new Flying("Чайка",5,"Море","Полет");
    Flying albatross = new Flying("Альбатрос",4,"Море","Полет");
    Flying falcon = new Flying("Сокол",8,"Воздух","Полет");

    gazel.printInfo();
    gazel.toEat();
    gazel.toGo();
    }
}
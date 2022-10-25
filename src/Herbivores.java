public class Herbivores extends Mammals{
    private String typeOfFood;

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        if(typeOfFood!=null || typeOfFood.isEmpty() || typeOfFood.isBlank()){
            this.typeOfFood=typeOfFood;
        }else {
            this.typeOfFood="Тип пищи не указан";
        }

    }

    public Herbivores(String name, int age, String livingEnvironment, int moveSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, moveSpeed);
        this.typeOfFood = typeOfFood;
        if(typeOfFood!=null || typeOfFood.isEmpty() || typeOfFood.isBlank()){
            this.typeOfFood=typeOfFood;
        }else {
            this.typeOfFood="Тип пищи не указан";
        }
    }

    public void toGraze(){
        System.out.println("Пасусь на лугу");
    }

    @Override
    public void toGo() {
        System.out.println("Перемешаюсь по лугам , пастбищам и лесам");
    }


    @Override
    public void toEat() {
        System.out.println("Питаюсь травой");
    }
}

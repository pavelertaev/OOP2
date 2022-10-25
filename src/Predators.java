public class Predators extends Mammals {
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

    public Predators(String name, int age, String livingEnvironment, int moveSpeed, String typeOfFood) {
        super(name, age, livingEnvironment, moveSpeed);
        this.typeOfFood = typeOfFood;
        if(typeOfFood!=null || typeOfFood.isEmpty() || typeOfFood.isBlank()){
            this.typeOfFood=typeOfFood;
        }else {
            this.typeOfFood="Тип пищи не указан";
        }
    }
    public void toHunt(){
        System.out.println("Охочусь на травоядных животных");
    }

    @Override
    public void toGo() {
        System.out.println("Перемещась по суше");
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь мясом");
    }
}

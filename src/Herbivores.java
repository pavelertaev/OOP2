import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
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
    public void printInfo(){
        System.out.println("Кличка- " + getName() + ".Возраст- " + getAge() + ".Среда обитания- "
                + getLivingEnvironment() + ".Тип перемещения- " + getMoveSpeed() + ".Тип пищи- " + getTypeOfFood());
    }
}

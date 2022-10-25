import java.util.Objects;

public class Flightless extends Birds{
    private String movementType;

    public String getMovementType() {
        return movementType;
    }

    public void setMovementType(String movementType) {
        if(movementType!=null || movementType.isBlank() || movementType.isEmpty()){
            this.movementType=movementType;
        }else{
            this.movementType="Тип перемещения не указан";
        }

    }

    public Flightless(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
        if(movementType!=null || movementType.isBlank() || movementType.isEmpty()){
            this.movementType=movementType;
        }else{
            this.movementType="Тип перемещения не указан";
        }
    }
    public void toWalk(){
        System.out.println("Не летаю, гуляю по земле");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless that = (Flightless) o;
        return movementType.equals(that.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    @Override
    public void toGo() {
        System.out.println("перемещаюсь по земле");
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь рыбой или насекомыми");
    }
    public void printInfo(){
        System.out.println("Кличка- " + getName() + ".Возраст- " + getAge() + ".Среда обитания- "
                + getLivingEnvironment() + ".Тип перемещения- " + getMovementType());
    }
}

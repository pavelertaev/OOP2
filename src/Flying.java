import java.util.Objects;

public class Flying extends Birds{
    private String movementType;

    public String getMovementType() {
        return movementType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return movementType.equals(flying.movementType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), movementType);
    }

    public void setMovementType(String movementType) {
        if(movementType!=null || movementType.isBlank() || movementType.isEmpty()){
            this.movementType=movementType;
        }else{
            this.movementType="Тип перемещения не указан";
        }

    }


    public Flying(String name, int age, String livingEnvironment, String movementType) {
        super(name, age, livingEnvironment);
        this.movementType = movementType;
        if(movementType!=null || movementType.isBlank() || movementType.isEmpty()){
            this.movementType=movementType;
        }else{
            this.movementType="Тип перемещения не указан";
        }
    }
    public void toFly(){
        System.out.println("Летаю в воздухе или гуляю по земле");
    }


    @Override
    public void toGo() {
        System.out.println("Летаю");
    }



    @Override
    public void toEat() {
        System.out.println("Питаюсь рыбой или мелкими животными");
    }
}


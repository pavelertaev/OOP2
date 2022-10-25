import java.util.Objects;

public class Mammals extends Animals{
    private String livingEnvironment;
    private int moveSpeed;

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment!=null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment=livingEnvironment;
        }else{
            this.livingEnvironment="Среда проживания не указана";
        }

    }

    public void setMoveSpeed(int moveSpeed) {
        if(moveSpeed>=0||moveSpeed!='0'){
            this.moveSpeed=moveSpeed;
        }else {
            this.moveSpeed = 0;
        }
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return moveSpeed == mammals.moveSpeed && Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, moveSpeed);
    }

    public Mammals(String name, int age, String livingEnvironment, int moveSpeed) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if(livingEnvironment!=null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment=livingEnvironment;
        }else{
            this.livingEnvironment="Среда проживания не указана";
        }
        this.moveSpeed = moveSpeed;
        if(moveSpeed>=0){
            this.moveSpeed=moveSpeed;
        }else{
            this.moveSpeed=0;
        }


    }
    public void toWalk(){
        System.out.println("Иду гулять");
    }

    @Override
    public void toGo() {
        System.out.println("Перемешяюсь по суше");
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь травой или мясом");
    }
}

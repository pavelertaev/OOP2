import java.util.Objects;

public class Amphibians extends Animals{
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if(livingEnvironment!=null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment=livingEnvironment;
        }else{
            this.livingEnvironment="Среда проживания не указана";
        }

    }

    public Amphibians(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if(livingEnvironment!=null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment=livingEnvironment;
        }else{
            this.livingEnvironment="Среда проживания не указана";
        }

    }
    public void toHunt(){
        System.out.println("Охочусь на насекомых или мелких животных");
    }

    @Override
    public void toGo() {
        System.out.println("Перемещаюсь по воде или суше");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return livingEnvironment.equals(that.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь насекомыми или мелкими животными");
    }
    public void printInfo(){
        System.out.println("Кличка- " + getName() + ".Возраст- " + getAge() + ".Среда обитания- "
                + getLivingEnvironment());
    }
}

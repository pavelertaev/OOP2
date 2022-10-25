import java.util.Objects;

public abstract  class Animals {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        if(name!=null || name.isEmpty() || name.isBlank()){
            this.name=name;
        }else {
            this.name="Кличка не указана";
        }
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Ошибка! Возраст не может быть отрицательным числом!");
        }

    }

    public Animals(String name, int age) {
        this.name = name;
        if (name != null || name.isEmpty() || name.isBlank()) {
            this.name = name;
        } else {
            this.name = "Кличка не указана";
        }
        this.age = age;
        if (age < 0 || age == '0') {
            this.age = age;
        }
    }
    public void toSleep(){
            System.out.println("Ложусь спать");
        }
    public abstract void toGo();
    public abstract void toEat();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return age == animals.age && name.equals(animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}



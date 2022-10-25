public class Birds extends Animals{
    private String livingEnvironment;

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        if (livingEnvironment != null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()) {
            this.livingEnvironment = livingEnvironment;
        } else {
            this.livingEnvironment = "Среда проживания не указана";
        }
    }


    public Birds(String name, int age, String livingEnvironment) {
        super(name, age);
        this.livingEnvironment = livingEnvironment;
        if(livingEnvironment!=null || livingEnvironment.isBlank() || livingEnvironment.isEmpty()){
            this.livingEnvironment=livingEnvironment;
        }else{
            this.livingEnvironment="Среда проживания не указана";
        }
    }


    public void toHunt(){
        System.out.println("Охочусь в воде или воздухе");
    }

    @Override
    public void toGo() {
        System.out.println("Летаю по небу либо плаваю в воде и перемещаюсь по суше");
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь насекомыми , рыбой или мелкими животными");
    }
}

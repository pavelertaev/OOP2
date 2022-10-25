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
    public void toGo() {
        System.out.println("перемещаюсь по земле");
    }

    @Override
    public void toEat() {
        System.out.println("Питаюсь рыбой или насекомыми");
    }
}

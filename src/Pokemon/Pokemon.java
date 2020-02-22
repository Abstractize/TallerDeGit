package Pokemon;

public abstract class Pokemon {
    private String name;
    private int HP = 100;
    private Type type;

    public void Attack(Pokemon pokemon){
        pokemon.Attacked(10);
    }
    public void Growl(){
        System.out.println(name);
    }
    public void Attacked(int dmg){
        HP -= dmg;
    }
    //Getter and Setters
    int getHp(){
      return HP;
    }
    public String getName(){
        return name;
    }
    public Type getType(){
        return type;
    }
    public void setHp(int hp){
        this.HP = hp;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setType(Type type){
        this.type = type;
    }
}

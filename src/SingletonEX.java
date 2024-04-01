public class SingletonEX {
    private String name;
    private static SingletonEX instance;

    private SingletonEX() {
    }
public static SingletonEX getInstance(String name){
        if(instance == null){
            synchronized ((SingletonEX.class)){
                if( instance == null){
                    instance = new SingletonEX(name);
                }
            }
        }
        return instance;
}
    @Override
    public String toString() {
        return "SingletonEX{" +
                "name='" + name + '\'' +
                '}';
    }

    private SingletonEX(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

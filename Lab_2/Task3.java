public class Task3 {
    int age;
    Task3(){
        age = 3;
    }

    //метод модификации, который что-то возвращает
    boolean setAge(int age){
        if(this.age == age){
            return true;
        }else {
            this.age = age;
            return false;
        }
    }

    //мб модификация выходного потока, но метод доступа с void
    void printAge(){
        System.out.println(this.age);
    }
}

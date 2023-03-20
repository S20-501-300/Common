
/**
 * Класс описывает точку
 * @author Dimakpa
 * @version 1.1
 */
public class Point6 {
    /**
     * Координата на оси абсцисс
     */
    private double x;

    /**
     * Координата на оси ординат
     */
    private double y;

    /**
    Создает точку с данными координатами
    @param x Координата оси абсцисс
     @param y Координата оси ординат
     */
    public Point6(double x, double y){
        this.x = x;
        this.y = y;
    }

    /**
     Создает точку в начале координат
     */
    public Point6(){
        this.x = 0;
        this.y = 0;
    }

    /**
     * @return Возвращает координату Х */
    double getX(){ return this.x;}
    /**
     * @return Возвращает координату Y */
    double getY(){ return this.y;}

    /**
     * Сдвигает точку на заданное расстояние
     * @рагаш координаты x и y
     * */
    void translate(int x, int y){
        this.x+=x;
        this.y+=y;
    }

    /**
     * Изменяет масштаб координат точки
     * @рагаш коэфициент изменения
     * */
    void scale(double factor){
        this.x*=factor;
        this.y*=factor;
    }
    public static void main(String[] args) {
        Point6 p = new Point6(3, 4);
        p.translate(1,3);
        p.scale(0.5);
        System.out.println( p.getX());
        System.out.println( p.getY());
    }
}
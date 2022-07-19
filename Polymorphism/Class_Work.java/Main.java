public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Square(5, "красный");
        figures[1] = new Circle(2, "синий");
        figures[2] = new Circle(5, "красный");


        for (Figure tmpFigure : figures) {

            System.out.printf("Тип фигуры: %s, Цвет фигуры : %s, Площадь фигуры: %.2f, a Периметр: %.2f\n",
                    tmpFigure.getArea(),
                    tmpFigure.getColor(),
                    tmpFigure.getPerimetr());

        }
    }
}

class Main {
    public static void main(String[] args) {
        double myNumber = 0.234456789;
        float firstvalue = 0f;
        float secondvalue = 0f;
        float notNumberfloat = float.NaN;
        double notNumberdouble = double.NaN;
        char myChar = "Моя строка".charAt(4);
        char myChar = '%';
        char resultChar = (char)(myChar =4560);
        System.out.println("Искомый сифвол" + myChar);
        System.out.printf("Наше округленное число:%.4f",myNumber);
        System.out.println(myNumber);
        System.out.println(firstvalue/secondvalue);
    }
}


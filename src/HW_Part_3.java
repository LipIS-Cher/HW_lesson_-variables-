public class HW_Part_3 {
    public static void main(String[] args) {
        // zadanie 1
        var boxerWeight1 = 78.2;
        var boxerWeight2 = 82.7;
        System.out.println(boxerWeight1 + boxerWeight2);
        System.out.println(boxerWeight2 - boxerWeight1);

        System.out.println(" ");
        // zadanie 2
        System.out.println(boxerWeight2 - boxerWeight1);
        System.out.println(boxerWeight2 % boxerWeight1);

        // zadanie 3
        var allTime = 640;
        var timeworkOnePerson = 8;
        System.out.println("Всего работников в компании – " + allTime / timeworkOnePerson + " человек");
        var plusWorkers = (allTime / timeworkOnePerson) + 94;
        var newTimework = allTime / plusWorkers;
        System.out.println("Если в компании работает " + plusWorkers + " человек, то всего " + newTimework + " часов работы может быть поделено между сотрудниками");
    }
}

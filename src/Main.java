public class Main {
    public static void main(String[] args) {
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var totalBoxerWeight = boxer1Weight + boxer2Weight;
        var weightDifference = boxer2Weight - boxer1Weight;
        System.out.println("Общий вес боксеров " + totalBoxerWeight + " кг.");
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");
        weightDifference = boxer2Weight % boxer1Weight;
        System.out.println("Разница в весе боксеров " + weightDifference + " кг.");
        var hoursWork = 640;
        var staffTime = 8;
        var numberOfStaff = hoursWork / staffTime;
        System.out.println("Всего работников в компании – " + numberOfStaff + " человек");
        numberOfStaff += 94;
        hoursWork = numberOfStaff * staffTime;
        System.out.println("Если в компании работает " + numberOfStaff + " человек, то всего " + hoursWork + " часов работы может быть поделено между сотрудниками");
    }
}